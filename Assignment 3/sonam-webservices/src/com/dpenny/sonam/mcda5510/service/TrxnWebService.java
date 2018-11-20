package com.dpenny.sonam.mcda5510.service;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Timestamp;
import java.util.Collection;

import com.dpenny.mcda5510.connect.ConnectionFactory;
import com.dpenny.mcda5510.connect.MySQLJDBCConnection;
import com.dpenny.mcda5510.dao.MySQLAccess;
import com.dpenny.mcda5510.entity.Transaction;
import com.mysql.cj.MysqlConnection;

public class TrxnWebService {
	MySQLAccess dao = null;
	Transaction trx = null;
	Connection conn = null;

	public String createTransaction(int ID, String nameOnCard, String cardNumber, String cardType, double unitPrice,
			int quantity, double totalPrice, String expDate) {
		dao = new MySQLAccess();
		trx = new Transaction();
		conn = dao.setupConnection();

		trx.setID(ID);
		trx.setNameOnCard(nameOnCard);
		trx.setCardNumber(cardNumber);
		trx.setCardType(cardType);
		trx.setUnitPrice(unitPrice);
		trx.setQuantity(quantity);
		trx.setTotalPrice(totalPrice);
		trx.setExpDate(expDate);
		return dao.createTransaction(conn, trx);

	}

	public String updateTransaction(int ID, String nameOnCard, String cardNumber, String cardType, int unitPrice,
			int quantity, int totalPrice, String expDate) {
		dao = new MySQLAccess();
		trx = new Transaction();
		conn = dao.setupConnection();

		trx.setID(ID);
		trx.setNameOnCard(nameOnCard);
		trx.setCardNumber(cardNumber);
		trx.setCardType(cardType);
		trx.setUnitPrice(unitPrice);
		trx.setQuantity(quantity);
		trx.setTotalPrice(totalPrice);
		trx.setExpDate(expDate);
		return dao.updateTransaction(conn, trx);

	}

	public String getTransaction(int trxnID) {
		dao = new MySQLAccess();
		conn = dao.setupConnection();
		
		return dao.getTransactions(conn,trxnID);
	}

	public String removeTransaction(int id) {
		dao = new MySQLAccess();
		// trx = new Transaction();
		conn = dao.setupConnection();

		return dao.removeTransaction(conn, id);
	}

	public Collection<Transaction> getAllTransactions(int Id) {

		dao = new MySQLAccess();
		// trx = new Transaction();
		conn = dao.setupConnection();

		return dao.getAllTransactions(conn);
	}

}