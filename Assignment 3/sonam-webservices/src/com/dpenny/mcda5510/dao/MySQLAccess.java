package com.dpenny.mcda5510.dao;

/**
 * Original source code from 
 * http://www.vogella.com/tutorials/MySQLJava/article.html
 * 
**/

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import com.dpenny.mcda5510.entity.Transaction;
import com.dpenny.mcda5510.Assignment2;
import com.dpenny.mcda5510.connect.MySQLJDBCConnection;

import org.apache.log4j.Logger;

public class MySQLAccess {
	final static Logger logger = Logger.getLogger(MySQLAccess.class);

	public Connection setupConnection() {
		Connection connection = null;
		try {
			// This will load the MySQL driver, each DB has its own driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Setup the connection with the DB
			connection = DriverManager.getConnection(
					"jdbc:mysql://dev.cs.smu.ca:3306/s_vadsaria?user=s_vadsaria&password=A00431604&useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&sql_mode='ALLOW_INVALID_DATES'"); // timezone

			if (connection != null)
				logger.info("Database connected successfully!!!");
		} catch (Exception e) {
			logger.info("Exception thrown: " + e.getMessage(), e);
		}
		return connection;
	}

	public String createTransaction(Connection connection, Transaction trxn) {
		PreparedStatement preparedStatement = null;
		boolean results = true;
		try {
			logger.info("Inserting Record");

			String insertTableSQL = "insert into transaction"
					+ "(ID, NameOnCard, CardNumber,CardType, UnitPrice,Quantity,TotalPrice,ExpDate,CreatedOn,CreatedBy) VALUES"
					+ "(?,?,?,?,?,?,?,?,?,?)";
			// Statements allow to insert SQL queries to the database
			preparedStatement = connection.prepareStatement(insertTableSQL);

			preparedStatement.setInt(1, trxn.getID());
			preparedStatement.setString(2, trxn.getNameOnCard());
			preparedStatement.setString(3, trxn.getCardNumber());
			preparedStatement.setString(4, trxn.getCardType());
			preparedStatement.setDouble(5, trxn.getUnitPrice());
			preparedStatement.setInt(6, trxn.getQuantity());
			preparedStatement.setDouble(7, trxn.getTotalPrice());
			preparedStatement.setString(8, trxn.getExpDate());
//			trxn.setCreatedOn(getCurrentTimeStamp());
			preparedStatement.setTimestamp(9, getCurrentTimeStamp());
			trxn.setCreatedBy(System.getProperty("user.name"));
			preparedStatement.setString(10, trxn.getCreatedBy());

			preparedStatement.executeUpdate();

			if (preparedStatement != null) {
				preparedStatement.close();
			}

		} catch (Exception e) {
			if (e.getMessage().indexOf("Duplicate entry") > -1) {
				logger.info("ID exists in DB please use update records!");
				results = false;
			} else {
				logger.info("Exception thrown: " + e.getMessage(), e);
				results = false;
			}
		} finally {
			preparedStatement = null;
		}
		if (results)
			return "Record inserted scuessfully";
		else
			return "Record not inserted scuessfully";

	}

	public String updateTransaction(Connection connection, Transaction trxn) {
		PreparedStatement preparedStatement = null;
		boolean results = true;
		try {
			logger.info("Updating Record");

			String updateTableSQL = "update transaction set NameOnCard=?,CardNumber =?,CardType=?,UnitPrice=?,Quantity=?,TotalPrice=?,"
					+ "ExpDate=?,CreatedOn=?,CreatedBy=? where ID=?";
			// Statements allow to update SQL queries to the database
			preparedStatement = connection.prepareStatement(updateTableSQL);

			preparedStatement.setString(1, trxn.getNameOnCard());
			preparedStatement.setString(2, trxn.getCardNumber());
			preparedStatement.setString(3, trxn.getCardType());
			preparedStatement.setDouble(4, trxn.getUnitPrice());
			preparedStatement.setInt(5, trxn.getQuantity());
			preparedStatement.setDouble(6, trxn.getTotalPrice());
			preparedStatement.setString(7, trxn.getExpDate());
//			trxn.setCreatedOn(getCurrentTimeStamp());
			preparedStatement.setTimestamp(8, getCurrentTimeStamp());
			trxn.setCreatedBy(System.getProperty("user.name"));
			preparedStatement.setString(9, trxn.getCreatedBy());
			preparedStatement.setInt(10, trxn.getID());

			int rowsupdated = preparedStatement.executeUpdate();

			if (rowsupdated <= 0) {
				results = false;
				logger.info("ID does not exist in DB please create record!");
			}

			if (preparedStatement != null) {
				preparedStatement.close();
			}

		} catch (Exception e) {
			logger.info("Exception thrown: " + e.getMessage(), e);
			results = false;
		} finally {
			preparedStatement = null;
		}
		if (results)
			return "Record updated scuessfully";
		else
			return "Record not updated scuessfully";
	}

	public String removeTransaction(Connection connection, int ID) {
		PreparedStatement preparedStatement = null;
		boolean results = true;
		try {
			logger.info("Deleting Record");

			String removeTableSQL = "delete from transaction where ID=?";

			// Statements allow to delete SQL queries to the database
			preparedStatement = connection.prepareStatement(removeTableSQL);
			preparedStatement.setInt(1, ID);

			int rowsdeleted = preparedStatement.executeUpdate();

			if (rowsdeleted <= 0) {
				results = false;
				logger.info("ID does not exist in DB to be deleted!");
			}

			if (preparedStatement != null) {
				preparedStatement.close();
			}

		} catch (Exception e) {
			logger.info("Exception thrown: " + e.getMessage(), e);
			results = false;
		} finally {
			preparedStatement = null;
		}
		if (results)
			return "Record deleted scuessfully";
		else
			return "Record not deleted scuessfully";
	}

	private static java.sql.Timestamp getCurrentTimeStamp() {
		java.util.Date today = new java.util.Date();
		return new java.sql.Timestamp(today.getTime());
	}

	public Collection<Transaction> getAllTransactions(Connection connection) {
		Statement statement = null;
		ResultSet resultSet = null;
		Collection<Transaction> results = null;
		try {
			logger.info("Viewing all Records!");

			statement = connection.createStatement();
			// Statements allow to issue SQL queries to the database
			resultSet = statement.executeQuery("select * from transaction");
			// Result set get the result of the SQL query
//			results = createTrxns(resultSet);

			if (resultSet != null) {
				resultSet.close();
			}

			if (statement != null) {
				statement.close();
			}

		} catch (Exception e) {
			logger.info("Exception thrown: " + e.getMessage(), e);
		} finally {
			statement = null;
			resultSet = null;
		}
		return results;
	}

	private Transaction createTrxns(ResultSet resultSet) throws SQLException {
		Transaction trxn = new Transaction();
		// ResultSet is initially before the first data set
		while (resultSet.next()) {

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
		}
		return trxn;
	}

	public String getTransactions(Connection connection, int Id) {
		Statement statement = null;
		ResultSet resultSet = null;
		Transaction results = null;
		try {
			logger.info("Viewing all Records!");

			statement = connection.createStatement();
			// Statements allow to issue SQL queries to the database
			resultSet = statement.executeQuery("select * from transaction where ID =" + Id);
			// Result set get the result of the SQL query
			results = createTrxns(resultSet);

			if (resultSet != null) {
				resultSet.close();
			}

			if (statement != null) {
				statement.close();
			}

		} catch (Exception e) {
			logger.info("Exception thrown: " + e.getMessage(), e);
		} finally {
			statement = null;
			resultSet = null;
		}
		if (results != null && results.getID() > 0)
			return results.toString();
		else
			return "No Record exists";
	}
}
