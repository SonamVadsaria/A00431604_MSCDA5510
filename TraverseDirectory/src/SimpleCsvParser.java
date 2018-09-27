import java.io.*;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SimpleCsvParser 
{
	static int validrecords=0,skippedrows=0 ;

	public void CSVParser(String filename,CSVPrinter csvPrinter,String date) throws Exception
	{
		BufferedReader in;
		try {
			in = new BufferedReader(new FileReader(filename));
			Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(in);

			for (CSVRecord record : records)
			{
				try
				{
					//To avoid Array out of bound Exception
					if(record.size()==10)
					{

						String FirstName = record.get(0);
						String LastName = record.get(1);
						String StreetNumber = record.get(2);
						String Street	= record.get(3);
						String City= record.get(4);
						String Province= record.get(5);
						String PostalCode = record.get(6);
						String Country = record.get(7);
						String PhoneNumber = record.get(8);
						String emailAddress = record.get(9);
						
						if(validrecords==0)//print header once
                        {
							validrecords++;
                            csvPrinter.printRecord("date",FirstName,LastName,StreetNumber,Street,City,Province,PostalCode,Country,PhoneNumber,emailAddress);//logic to merge into one csv file
                        }

						//if records are not empty print in CSV File
						if (!FirstName.isEmpty() && !LastName.isEmpty() && !PostalCode.isEmpty() && !emailAddress.isEmpty() && !Street.isEmpty() && !City.isEmpty() && !Province.isEmpty())
						{
							if(!FirstName.equals("First Name"))//if record is not header than print in CSV File
							{
								validrecords++;
								csvPrinter.printRecord(date,FirstName,LastName,StreetNumber,Street,City,Province,PostalCode,Country,PhoneNumber,emailAddress);
							}
							else
								continue;
						}
						else //records are empty skip the record
						{
							skippedrows++;
							continue;
						}
					}
					else //records are empty skip the record
					{
						skippedrows++;
						continue;
					}
				}
				catch(Exception e)
				{
					Logger.getLogger("Main").log(Level.SEVERE, "Exception thrown: "+e.getMessage(),e);
				}
			}
			in.close();
		}
		catch(Exception e)
		{
			Logger.getLogger("Main").log(Level.SEVERE, "Exception thrown: "+e.getMessage(),e);
		}
	}
}
