package com.dpenny.mcda5510.entity;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

public class Transaction {

	private int ID;

	private String nameOnCard;

	private String cardNumber;
	
	private String cardType;

	private double unitPrice;

	private int quantity;

	private double totalPrice;

	private String expDate;

	private Date createdOn;

	private String createdBy;

	/**
	 * @return the iD
	 */
	public int getID() {
		return ID;
	}

	/**
	 * @param iD the iD to set
	 */
	public void setID(int iD) {
		ID = iD;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	/**
	 * @return the cardType
	 */
	public String getCardType() {
		return cardType;
	}

	/**
	 * @param cardType the cardType to set
	 */
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getNameOnCard() {
		return nameOnCard;
	}
	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}	


	/**
	 * @return the unitPrice
	 */
	public double getUnitPrice() {
		return unitPrice;
	}

	/**
	 * @param unitPrice the unitPrice to set
	 */
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the totalPrice
	 */
	public double getTotalPrice() {
		return totalPrice;
	}

	/**
	 * @param totalPrice the totalPrice to set
	 */
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	/**
	 * @return the expDate
	 */
	public String getExpDate() {
		return expDate;
	}

	/**
	 * @param expDate the expDate to set
	 */
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	/**
	 * @return the createdOn
	 */
	public Date getCreatedOn() {
		return createdOn;
	}

	/**
	 * @param createdOn the createdOn to set
	 */
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	/**
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return createdBy;
	}

	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String toString(){

		String results = new String();

		results = "[ID :" + ID + " NameOnCard: " + nameOnCard + ",CardNumber: " + cardNumber+ ",CardType: " + cardType+", UnitPrice: " + unitPrice+ ", Quantity: " + quantity + " , TotalPrice : " + totalPrice+ ", ExpDate:" + expDate + " , CreatedOn: " + createdOn+ ", CreatedBy: " +createdBy +"]";

		return results;

	}


}