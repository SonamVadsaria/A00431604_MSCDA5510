
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MySQLAccess {

	Scanner scan = new Scanner(System.in);

	public Connection setupConnection(String Username,String password) throws Exception 
	{
		Connection connection = null;
		try 
		{
			// This will load the MySQL driver, each DB has its own driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Setup the connection with the DB
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Transaction?" 
					+ "user="+Username
					+ "&password="+password
					+ "&useSSL=false" 
					+ "&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"); 
			
			if(connection != null)
			Logger.getLogger("Main").log(Level.INFO,"Database connected successfully!!!");
		} 
		catch (Exception e) 
		{
			Logger.getLogger("Main").log(Level.SEVERE, "Exception thrown: "+e.getMessage(),e);
		}
		return connection;
	}

	public Collection<Transaction> getAllTransactions(Connection connection) 
	{
		Statement statement = null;
		ResultSet resultSet = null;
		Collection<Transaction> results = null;
		try {
			Logger.getLogger("Main").log(Level.INFO,"Viewing all Records!");

			statement = connection.createStatement();
			// Statements allow to issue SQL queries to the database
			resultSet = statement.executeQuery("select * from transaction");
			// Result set get the result of the SQL query
			results = createTrxns(resultSet);

			if (resultSet != null) 
			{
				resultSet.close();
			}

			if (statement != null) 
			{
				statement.close();
			}

		} 
		catch (Exception e) 
		{
			Logger.getLogger("Main").log(Level.SEVERE, "Exception thrown: "+e.getMessage(),e);
		} 
		finally 
		{
			statement = null;
			resultSet = null;
		}
		return results;
	}

	private Collection<Transaction> createTrxns(ResultSet resultSet) throws SQLException 
	{
		Collection<Transaction> results = new ArrayList<Transaction>();
		// ResultSet is initially before the first data set
		while (resultSet.next()) 
		{
			Transaction trxn = new Transaction();
			trxn.setID(resultSet.getInt("ID")); 
			trxn.setNameOnCard(resultSet.getString("NameOnCard"));
			trxn.setCardNumber(resultSet.getString("CardNumber"));
			trxn.setCardType(resultSet.getString("CardType"));
			trxn.setExpDate(resultSet.getString("ExpDate")); 
			trxn.setUnitPrice(resultSet.getDouble("UnitPrice")); 
			trxn.setQuantity(resultSet.getInt("Quantity")); 
			trxn.setTotalPrice(resultSet.getDouble("TotalPrice")); 
			trxn.setCreatedOn(resultSet.getDate("CreatedOn")); 
			trxn.setCreatedBy(resultSet.getString("CreatedBy"));
			results.add(trxn);
		}
		return results;
	}

	public boolean createTransaction(Connection connection, Transaction trxn) 
	{
		PreparedStatement preparedStatement = null;
		boolean results = true;
		try {
			Logger.getLogger("Main").log(Level.INFO,"Inserting Record");

			String insertTableSQL = "insert into transaction"
					+ "(ID, NameOnCard, CardNumber,CardType, UnitPrice,Quantity,TotalPrice,ExpDate,CreatedOn,CreatedBy) VALUES"
					+ "(?,?,?,?,?,?,?,?,?,?)";
			// Statements allow to insert SQL queries to the database
			preparedStatement = connection.prepareStatement(insertTableSQL);

			preparedStatement.setInt(1,trxn.getID()); 
			preparedStatement.setString(2,trxn.getNameOnCard());			
			preparedStatement.setString(3,trxn.getCardNumber());
			preparedStatement.setString(4,trxn.getCardType());
			preparedStatement.setDouble(5,trxn.getUnitPrice()); 		
			preparedStatement.setInt(6,trxn.getQuantity()); 			
			preparedStatement.setDouble(7,trxn.getTotalPrice()); 
			preparedStatement.setString(8,trxn.getExpDate()); 
			trxn.setCreatedOn(getCurrentTimeStamp());
			preparedStatement.setTimestamp(9,(Timestamp) trxn.getCreatedOn()); 
			trxn.setCreatedBy(System.getProperty("user.name"));
			preparedStatement.setString(10,trxn.getCreatedBy());

			preparedStatement.executeUpdate();

			if (preparedStatement != null) 
			{
				preparedStatement.close();
			}

		} 
		catch (Exception e) 
		{
			if(e.getMessage().indexOf("Duplicate entry")>-1) {
				Logger.getLogger("Main").log(Level.INFO,"ID exists in DB please use update records!");
				results = false;
			}
			else 
			{
				Logger.getLogger("Main").log(Level.SEVERE, "Exception thrown: "+e.getMessage(),e);
				results = false;
			}
		} 
		finally
		{
			preparedStatement = null;
		}
		return results;

	}


	public boolean updateTransaction(Connection connection, Transaction trxn) {
		PreparedStatement preparedStatement = null;
		boolean results = true;
		try {
			Logger.getLogger("Main").log(Level.INFO,"Updating Record");

			String updateTableSQL = "update transaction set NameOnCard=?,CardNumber =?,CardType=?,UnitPrice=?,Quantity=?,TotalPrice=?,"
					+"ExpDate=?,CreatedOn=?,CreatedBy=? where ID=?";
			// Statements allow to update SQL queries to the database
			preparedStatement = connection.prepareStatement(updateTableSQL);


			preparedStatement.setString(1,trxn.getNameOnCard());			
			preparedStatement.setString(2,trxn.getCardNumber());
			preparedStatement.setString(3,trxn.getCardType());
			preparedStatement.setDouble(4,trxn.getUnitPrice()); 		
			preparedStatement.setInt(5,trxn.getQuantity()); 			
			preparedStatement.setDouble(6,trxn.getTotalPrice()); 
			preparedStatement.setString(7,trxn.getExpDate()); 
			trxn.setCreatedOn(getCurrentTimeStamp());
			preparedStatement.setTimestamp(8,(Timestamp) trxn.getCreatedOn()); 
			trxn.setCreatedBy(System.getProperty("user.name"));
			preparedStatement.setString(9,trxn.getCreatedBy());
			preparedStatement.setInt(10,trxn.getID()); 

			int rowsupdated=preparedStatement.executeUpdate();

			if (rowsupdated <= 0)
			{
				results = false;
				Logger.getLogger("Main").log(Level.INFO,"ID does not exist in DB please create record!");
			}
			
			if (preparedStatement != null) {
				preparedStatement.close();
			}

		} 
		catch (Exception e) 
		{
				Logger.getLogger("Main").log(Level.SEVERE, "Exception thrown: "+e.getMessage(),e);
				results = false;
		} 
		finally 
		{
			preparedStatement = null;
		}
		return results;
	}

	public boolean removeTransaction(Connection connection, Validation v) {
		PreparedStatement preparedStatement = null;
		boolean results = true;
		try 
		{
			Logger.getLogger("Main").log(Level.INFO,"Deleting Record");

			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Id: ");
			int ID=v.checkInteger(scan.next(),scan);

			String removeTableSQL = "delete from transaction where ID=?";

			// Statements allow to delete SQL queries to the database
			preparedStatement = connection.prepareStatement(removeTableSQL);
			preparedStatement.setInt(1,ID); 

			int rowsdeleted=preparedStatement.executeUpdate();
			
			if (rowsdeleted <= 0)
			{
				results = false;
				Logger.getLogger("Main").log(Level.INFO,"ID does not exist in DB to be deleted!");
			}

			if (preparedStatement != null) {
				preparedStatement.close();
			}

		} 
		catch (Exception e) 
		{
				Logger.getLogger("Main").log(Level.SEVERE, "Exception thrown: "+e.getMessage(),e);
				results = false;
		} 
		finally 
		{
			preparedStatement = null;
		}
		return results;
	}

	public Collection<Transaction> getTransaction(Connection connection,Validation v) {
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		Collection<Transaction> results = null;
		try {
			Logger.getLogger("Main").log(Level.INFO,"Viewing Specific Record");

			Scanner scan = new Scanner(System.in);

			System.out.println("Enter Id: ");
			int ID=v.checkInteger(scan.next(),scan);

			// Statements allow to issue SQL queries to the database

			String selectTableSQL = ("select * from transaction where ID = ?");

			preparedStatement = connection.prepareStatement(selectTableSQL);	

			preparedStatement.setInt(1,ID);

			// Result set get the result of the SQL query

			resultSet = preparedStatement.executeQuery();

			results = createTrxns(resultSet);

			if (resultSet != null) {
				resultSet.close();
			}

			if (preparedStatement != null) {
				preparedStatement.close();
			}

		} 
		catch (Exception e) 
		{
			Logger.getLogger("Main").log(Level.SEVERE, "Exception thrown: "+e.getMessage(),e);
		} 
		finally 
		{
			preparedStatement = null;
			resultSet = null;
		}
		return results;
	}


	private static java.sql.Timestamp getCurrentTimeStamp() 
	{
		java.util.Date today = new java.util.Date();
		return new java.sql.Timestamp(today.getTime());
	}
}
