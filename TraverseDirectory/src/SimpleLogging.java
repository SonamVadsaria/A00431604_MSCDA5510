import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.io.*;

public class SimpleLogging extends DirWalker
{
	public static void main(String[] args) throws Exception
	{

		Handler consoleHandler = null;

		Handler fileHandler = null;
		Formatter simpleFormatter = null;

		Logger logger = Logger.getLogger("Main");

		final long startTime = System.currentTimeMillis();
		// Creating consoleHandler and fileHandler
		consoleHandler = new ConsoleHandler();
		try 
		{
			fileHandler = new FileHandler("../logs/LoggingOutput.log");
		} 
		catch (SecurityException | IOException e) 
		{
			// TODO Auto-generated catch block
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
			logger.log(Level.INFO,"Traversing Directories");

			//final long startTime = System.currentTimeMillis();

			//Calling DirWalker main function to traverse the directories 
			DirWalker fw = new DirWalker();
			
			File outputfile=new File("/home/student_2018_fall/s_vadsaria/TraverseDirectory/Output/Mergedfile.csv");
			//File  outputfile=new File("C:\\Users\\Sonam\\eclipse-workspace\\TraverseDirectory\\Output\\Mergedfile.csv");//uncomment for windows
			PrintWriter pw = new PrintWriter(new FileOutputStream(outputfile));

			//fw.walk("C:\\Users\\Sonam\\eclipse-workspace\\TraverseDirectory\\Sample Data\\Sample Data\\",outputfile,pw);//uncomment for windows

			fw.walk("/home/student_2018_fall/s_vadsaria/TraverseDirectory/SampleData/SampleData/",outputfile,pw);

			final long endTime = System.currentTimeMillis();

			logger.log(Level.INFO,"Valid Records:::::::"+validrecords);
			logger.log(Level.INFO,"Skipped Records:::::"+skippedrows);
			logger.log(Level.INFO,"Total execution time for traversing:::::" + (endTime - startTime) +" ms");
		}
		catch(Exception e)
		{
			logger.log(Level.SEVERE, "Exception thrown: "+e.getMessage(), e);
		}
			pw.flush();
			pw.close();
	}
}
