import java.util.logging.Level;
import java.util.logging.Logger;

public class SimpleLogging extends DirWalker
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("java.util.logging.config.file",
				"./logging.properties");
		try
		{
			Logger.getLogger("Main").log(Level.INFO,"Traversing Directories");

			final long startTime = System.currentTimeMillis();

			//Calling DirWalker main function to traverse the directories 
			DirWalker fw = new DirWalker();
			fw.walk("C:\\Users\\Sonam\\eclipse-workspace\\TraverseDirectory\\Sample Data\\Sample Data\\");

			final long endTime = System.currentTimeMillis();

			Logger.getLogger("Main").log(Level.INFO,"Valid Records:::::::"+validrecords);
			Logger.getLogger("Main").log(Level.INFO,"Skipped Records:::::"+skippedrows);
			Logger.getLogger("Main").log(Level.INFO,"Total execution time for traversing:::::" + (endTime - startTime) +" ms");
		}
		catch(Exception e)
		{
			Logger.getLogger("Main").log(Level.SEVERE, "Exception thrown: "+e.getMessage(), e);
		}
	}
}
