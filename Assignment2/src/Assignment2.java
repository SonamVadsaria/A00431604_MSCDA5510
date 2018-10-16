import java.io.IOException;
import java.sql.Connection;
import java.util.Collection;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Assignment2 {

	public static void main(String[] args) {
		Handler consoleHandler = null;

		Handler fileHandler = null;
		Formatter simpleFormatter = null;

		Logger logger = Logger.getLogger("Main");

		// Creating consoleHandler and fileHandler
		consoleHandler = new ConsoleHandler();
		try 
		{
			fileHandler = new FileHandler("logs/LoggingOutput.log");
		} 
		catch (SecurityException | IOException e) 
		{
			e.printStackTrace();
		}
		// Assigning handlers to LOGGER object
		logger.addHandler(consoleHandler);
		logger.addHandler(fileHandler);
		// Setting levels to handlers and LOGGER
		consoleHandler.setLevel(Level.ALL);
		fileHandler.setLevel(Level.FINE);
		logger.setLevel(Level.ALL);

		simpleFormatter = new SimpleFormatter();

		// Setting formatter to the handler
		fileHandler.setFormatter(simpleFormatter);

		logger.config("Configuration done.");

		try
		{
			MySQLAccess dao = new MySQLAccess();
			Scanner scan =new Scanner(System.in);
			//	String message="";
			System.out.println("Enter user name");
			String Username= scan.next();
			System.out.println("Enter user password");
			String password= scan.next();

			Connection connection = dao.setupConnection(Username,password);

			try {
				while(true)
				{
					System.out.println("Press 1 for Adding Transaction Record");
					System.out.println("Enter 2 for Updating Transaction Record");
					System.out.println("Enter 3 for Deleting Transaction Record");
					System.out.println("Enter 4 to View a Specific Record");
					System.out.println("Enter 5 to View all Records");
					System.out.println("Enter 6 to exit");
					int i=scan.nextInt();
					Transaction trxn = new Transaction();
					Validation v = new Validation();

					if(i == 1 || i ==2 )
					{
						System.out.println("Enter Id: ");
						int id = v.checkInteger(scan.next(),scan);
						trxn.setID(id);
						System.out.println("Enter NameOnCard: ");
						trxn.setNameOnCard(v.checkString(scan.next(),scan));
						System.out.println("Enter Credit CardNumber: ");
						String CardDetails[]=v.checkCardNumber(scan.next(),scan);
						String CardNumber=CardDetails[0];
						String CardType= CardDetails[1];
						trxn.setCardNumber(CardNumber);
						trxn.setCardType(CardType);
						System.out.println("Enter UnitPrice: ");
						trxn.setUnitPrice(v.checkDouble(scan.next(),scan));
						System.out.println("Enter Quantity: ");
						trxn.setQuantity(v.checkInteger(scan.next(),scan));
						Double TotalPrice=trxn.getUnitPrice()*trxn.getQuantity();
						trxn.setTotalPrice(TotalPrice);
						System.out.println("Enter ExpDate in MM/YYYY format: ");
						trxn.setExpDate(v.checkExpiryDate(scan));
					}

					switch(i)
					{
					case 1: Boolean create = dao.createTransaction(connection,trxn);
					if(create)
						logger.log(Level.INFO,"Transaction Record inserted successfully!");
					break;
					case 2: Boolean update = dao.updateTransaction(connection,trxn);
					if(update)
						logger.log(Level.INFO,"Transaction Record updated successfully!");
					break;
					case 3: Boolean remove =dao.removeTransaction(connection,v);
					if(remove)
						logger.log(Level.INFO,"Transaction Record deleted successfully!");
					break;
					case 4: Collection<Transaction> trxns2 = dao.getTransaction(connection,v);
					for (Transaction trxn1:trxns2 )
					{
						logger.log(Level.INFO,trxn1.toString());
					}
					break;
					case 5:	Collection<Transaction> trxns = dao.getAllTransactions(connection);
					for (Transaction trxn1:trxns)
					{
						logger.log(Level.INFO,trxn1.toString());
					}
					break;
					case 6:return;
					default: break;
					}
				}
			} 
			catch (Exception e) 
			{
				logger.log(Level.SEVERE, "Exception thrown: "+e.getMessage(), e);
			}
			finally 
			{
				if (connection != null) 
				{
					connection.close();
				}		
				if (scan != null) 
				{
					scan.close();
				}
			}
		}
		catch(Exception e)
		{
			if(e.getMessage().indexOf("Public Key Retrieval")>-1) 
			{
				logger.log(Level.SEVERE,"User Name or Password is incorrect");

			}
			else
				logger.log(Level.SEVERE, "Exception thrown: "+e.getMessage(), e);
		}
	}
}
