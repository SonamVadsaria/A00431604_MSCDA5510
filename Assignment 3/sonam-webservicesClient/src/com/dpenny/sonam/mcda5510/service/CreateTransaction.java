/**
 * CreateTransaction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dpenny.sonam.mcda5510.service;

public class CreateTransaction  implements java.io.Serializable {
    private int ID;

    private java.lang.String nameOnCard;

    private java.lang.String cardNumber;

    private java.lang.String cardType;

    private double unitPrice;

    private int quantity;

    private double totalPrice;

    private java.lang.String expDate;

    public CreateTransaction() {
    }

    public CreateTransaction(
           int ID,
           java.lang.String nameOnCard,
           java.lang.String cardNumber,
           java.lang.String cardType,
           double unitPrice,
           int quantity,
           double totalPrice,
           java.lang.String expDate) {
           this.ID = ID;
           this.nameOnCard = nameOnCard;
           this.cardNumber = cardNumber;
           this.cardType = cardType;
           this.unitPrice = unitPrice;
           this.quantity = quantity;
           this.totalPrice = totalPrice;
           this.expDate = expDate;
    }


    /**
     * Gets the ID value for this CreateTransaction.
     * 
     * @return ID
     */
    public int getID() {
        return ID;
    }


    /**
     * Sets the ID value for this CreateTransaction.
     * 
     * @param ID
     */
    public void setID(int ID) {
        this.ID = ID;
    }


    /**
     * Gets the nameOnCard value for this CreateTransaction.
     * 
     * @return nameOnCard
     */
    public java.lang.String getNameOnCard() {
        return nameOnCard;
    }


    /**
     * Sets the nameOnCard value for this CreateTransaction.
     * 
     * @param nameOnCard
     */
    public void setNameOnCard(java.lang.String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }


    /**
     * Gets the cardNumber value for this CreateTransaction.
     * 
     * @return cardNumber
     */
    public java.lang.String getCardNumber() {
        return cardNumber;
    }


    /**
     * Sets the cardNumber value for this CreateTransaction.
     * 
     * @param cardNumber
     */
    public void setCardNumber(java.lang.String cardNumber) {
        this.cardNumber = cardNumber;
    }


    /**
     * Gets the cardType value for this CreateTransaction.
     * 
     * @return cardType
     */
    public java.lang.String getCardType() {
        return cardType;
    }


    /**
     * Sets the cardType value for this CreateTransaction.
     * 
     * @param cardType
     */
    public void setCardType(java.lang.String cardType) {
        this.cardType = cardType;
    }


    /**
     * Gets the unitPrice value for this CreateTransaction.
     * 
     * @return unitPrice
     */
    public double getUnitPrice() {
        return unitPrice;
    }


    /**
     * Sets the unitPrice value for this CreateTransaction.
     * 
     * @param unitPrice
     */
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }


    /**
     * Gets the quantity value for this CreateTransaction.
     * 
     * @return quantity
     */
    public int getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this CreateTransaction.
     * 
     * @param quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the totalPrice value for this CreateTransaction.
     * 
     * @return totalPrice
     */
    public double getTotalPrice() {
        return totalPrice;
    }


    /**
     * Sets the totalPrice value for this CreateTransaction.
     * 
     * @param totalPrice
     */
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }


    /**
     * Gets the expDate value for this CreateTransaction.
     * 
     * @return expDate
     */
    public java.lang.String getExpDate() {
        return expDate;
    }


    /**
     * Sets the expDate value for this CreateTransaction.
     * 
     * @param expDate
     */
    public void setExpDate(java.lang.String expDate) {
        this.expDate = expDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateTransaction)) return false;
        CreateTransaction other = (CreateTransaction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.ID == other.getID() &&
            ((this.nameOnCard==null && other.getNameOnCard()==null) || 
             (this.nameOnCard!=null &&
              this.nameOnCard.equals(other.getNameOnCard()))) &&
            ((this.cardNumber==null && other.getCardNumber()==null) || 
             (this.cardNumber!=null &&
              this.cardNumber.equals(other.getCardNumber()))) &&
            ((this.cardType==null && other.getCardType()==null) || 
             (this.cardType!=null &&
              this.cardType.equals(other.getCardType()))) &&
            this.unitPrice == other.getUnitPrice() &&
            this.quantity == other.getQuantity() &&
            this.totalPrice == other.getTotalPrice() &&
            ((this.expDate==null && other.getExpDate()==null) || 
             (this.expDate!=null &&
              this.expDate.equals(other.getExpDate())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getID();
        if (getNameOnCard() != null) {
            _hashCode += getNameOnCard().hashCode();
        }
        if (getCardNumber() != null) {
            _hashCode += getCardNumber().hashCode();
        }
        if (getCardType() != null) {
            _hashCode += getCardType().hashCode();
        }
        _hashCode += new Double(getUnitPrice()).hashCode();
        _hashCode += getQuantity();
        _hashCode += new Double(getTotalPrice()).hashCode();
        if (getExpDate() != null) {
            _hashCode += getExpDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateTransaction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.mcda5510.sonam.dpenny.com", ">createTransaction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.mcda5510.sonam.dpenny.com", "ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameOnCard");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.mcda5510.sonam.dpenny.com", "nameOnCard"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.mcda5510.sonam.dpenny.com", "cardNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.mcda5510.sonam.dpenny.com", "cardType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.mcda5510.sonam.dpenny.com", "unitPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.mcda5510.sonam.dpenny.com", "quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.mcda5510.sonam.dpenny.com", "totalPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.mcda5510.sonam.dpenny.com", "expDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
