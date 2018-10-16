import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

	public int checkInteger(String val,Scanner sc) 
	{
		int number;
		try 
		{
			number = Integer.parseInt(val);
		}
		catch (NumberFormatException e) 
		{
			System.out.println("Please enter Integer only!");
			while (!sc.hasNextInt()) 
			{
				System.out.println("Please enter Integer only!");
				sc.next();
			}
			number = sc.nextInt();
		} 
		return number;
	}

	public double checkDouble(String val,Scanner sc) 
	{
		double number;
		try 
		{
			number = Double.parseDouble(val);
		}
		catch (NumberFormatException e) 
		{
			System.out.println("Please enter Double only!");
			while (!sc.hasNextDouble()) 
			{
				System.out.println("Please enter Double only!");
				sc.next();
			}
			number = sc.nextDouble();
		} 
		return number;
	}

	public String checkString(String val,Scanner sc) 
	{
		String value=val;
		while(true)
		{
			Pattern pattern = Pattern.compile("[^A-Za-z0-9 //]");
			Matcher matcher = pattern.matcher(value);
			boolean hasSpecialChars = matcher.find();

			if(hasSpecialChars)
			{
				System.out.println("Characters ;:! @ # $ % ^ * + ? < > not allowed. Please enter String only!");
				value = sc.next();	
			}
			else break;
		}
		return value;
	}

	public String[] checkCreditCard(String CardNo,Scanner sc) 
	{
		String CardType="";
		String CardNumber = CardNo;

		if (CardNumber.startsWith("51") || CardNumber.startsWith("52") || CardNumber.startsWith("53") || CardNumber.startsWith("54") ||CardNumber.startsWith("55"))
		{
			CardType= "Master Card";
		}
		else if (CardNumber.startsWith("4")) 
		{
			CardType= "Visa";
		}
		else if ((CardNumber.startsWith("34") || CardNumber.startsWith("37"))) 
		{
			CardType= "American Express";
			if((CardNumber.length()!= 15))
			{
				System.out.println("Please enter American Express Credit Card with 15 digits only!:");
				while(sc.next().length()!=15)
				{
					System.out.println("Enter Credit Card Number with 15 digits:");
					CardNumber = sc.next();
					while(true)
					{
						boolean b=CardNumber.matches("[0-9]+");
						if(!b)
						{
							System.out.println("Enter Credit Card Number with 15 digits :");

							while(sc.next().length()!=16)
							{
								System.out.println("Enter Credit Card Number with 15 digits:");
								CardNumber = sc.next();
							}
						}
						else break;
					} 	
				}
			}
		}
		else 		
			System.out.println("Invalid Card Type");

		String carddetails[] = new String[2];
		carddetails[0]=CardType;
		carddetails[1]=CardNumber;
		return carddetails;
	}

	public String[] checkCardNumber(String CardNumber,Scanner sc) 
	{
		String CardNum=CardNumber;
		if(CardNumber.length()==16)
		{
			while(true)
			{
				boolean a=CardNumber.matches("[0-9]+");
				if(!a)
				{
					System.out.println("Enter Credit Card Number with 16 digits :");
					while(sc.next().length()!=16)
					{
						System.out.println("Enter Credit Card Number with 16 digits:");
						CardNum = sc.next();
					}
				}
				else break;
			}
		}
		else
		{	
			System.out.println("Enter Credit Card Number with 16 digits :");
			while(sc.next().length()!=16)
			{
				System.out.println("Enter Credit Card Number with 16 digits:");
				CardNum = sc.next();
				while(true)
				{
					boolean b=CardNum.matches("[0-9]+");
					if(!b)
					{
						System.out.println("Enter Credit Card Number with 16 digits :");
						while(sc.next().length()!=16)
						{
							System.out.println("Enter Credit Card Number with 16 digits:");
							CardNum = sc.next();
						}
					}
					else break;
				} 	
			}

		}
		String Result[]= checkCreditCard(CardNum,sc);
		String arr[] = new String[2];
		if(Result[0].length()==15)
			arr[0]=Result[1];
		else
			arr[0] = CardNum;
		arr[1] = Result[0];
		return arr;
	}

	public String checkExpiryDate(Scanner sc)
	{
		String date= "";
		String expirydate = "";
		String s[]=new String[2];
		try 
		{
			expirydate=checkString(sc.next(),sc);
			s=expirydate.split("/");

			int month=Integer.parseInt(s[0]);
			int year=Integer.parseInt(s[1]);
			while(true)
			{
				if(!(month >= 1 && month <=12 && year >=2016 && year <= 2031) )
				{
					System.out.println("Re-enter Expiry Date in MM/YYYY format");
					date=sc.next();

					expirydate=checkString(date,sc);
					s=expirydate.split("/");
					month=Integer.parseInt(s[0]);
					year=Integer.parseInt(s[1]);

				}
				else break;
			}
		} 
		catch (Exception e) 
		{
			System.out.println("Invalid Expiry Date!Please re-enter Expiry Date in MM/YYYY format");
			checkExpiryDate(sc);
		}
		return expirydate;
	}
}



