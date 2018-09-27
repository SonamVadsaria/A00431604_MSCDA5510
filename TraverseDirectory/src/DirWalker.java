import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVFormat;

	public class DirWalker extends SimpleCsvParser 
	{

	static Boolean outputexist = false;
		public void walk( String path, File outputfile,PrintWriter pw ) throws Exception 
		{
			File root = new File( path );
			File[] list = root.listFiles();

			if (list == null) return;
	

			CSVPrinter csvPrinter= new CSVPrinter(pw,CSVFormat.DEFAULT);

			SimpleCsvParser cp = new SimpleCsvParser();

			try
			{
				for (File f : list) 
				{
					if (f.isDirectory()) 
					{
						walk(f.getAbsolutePath(),outputfile,pw);
					}
					else 
					{
						String filename=f.getParent().toString();
						//String date=filename.substring(filename.lastIndexOf("/")-7);//uncomment for windows
						String date=filename.substring(filename.lastIndexOf("/")-7);
	//					date=date.replace("\\", "/");//uncomment for windows
						if(date.startsWith("/"))
						{
							date=date.replaceFirst("/", "");
						}

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

		}
	}

