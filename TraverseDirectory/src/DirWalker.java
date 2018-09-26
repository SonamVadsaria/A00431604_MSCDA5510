import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVFormat;

public class DirWalker extends SimpleCsvParser 
{
	public void walk( String path ) throws Exception 
	{
		File root = new File( path );
		File[] list = root.listFiles();

		if (list == null) return;

		File  outputfile=new File("C:\\\\Users\\\\Sonam\\\\eclipse-workspace\\\\TraverseDirectory\\\\Output\\Mergedfile.csv");
		try 
		{
			if(outputfile.exists())
			{
				outputfile.delete();
			}
		}
		catch(Exception e)
		{
			Logger.getLogger("Main").log(Level.SEVERE, "Exception thrown: "+e.getMessage(),e);
		}

		PrintWriter pw = new PrintWriter(new FileOutputStream(outputfile, true /* for appending CSV files in one file*/)); 

		CSVPrinter csvPrinter= new CSVPrinter(pw,CSVFormat.DEFAULT);

		SimpleCsvParser cp = new SimpleCsvParser();

		try
		{
			for (File f : list) 
			{
				if (f.isDirectory()) 
				{
					walk(f.getAbsolutePath());
				}
				else 
				{
					String filename=f.getParent().toString();
					String date=filename.substring(filename.lastIndexOf("\\")-7);
					date=date.replace("\\", "/");
					if(date.startsWith("/"))
					{
						date=date.replaceFirst("/", "");
					}

//					System.out.println("File Name"+filename);
//					System.out.println("File date"+date);
					//Calling CSV Parser to read and merge CSV files
					if(f.getAbsolutePath().endsWith(".csv"))
					{
						cp.CSVParser(f.getAbsolutePath(),csvPrinter,date);
					}
				}
			}

		}
		catch(Exception e)
		{
			Logger.getLogger("Main").log(Level.SEVERE, "Exception thrown: "+e.getMessage(),e);
		}
		finally
		{
			csvPrinter.close();
			pw.close();
		}
	}
}

