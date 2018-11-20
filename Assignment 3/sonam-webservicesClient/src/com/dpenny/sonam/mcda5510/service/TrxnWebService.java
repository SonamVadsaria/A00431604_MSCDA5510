/**
 * TrxnWebService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dpenny.sonam.mcda5510.service;

public interface TrxnWebService extends java.rmi.Remote {
    public java.lang.String getTransaction(int trxnID) throws java.rmi.RemoteException;
    public java.lang.String createTransaction(int ID, java.lang.String nameOnCard, java.lang.String cardNumber, java.lang.String cardType, double unitPrice, int quantity, double totalPrice, java.lang.String expDate) throws java.rmi.RemoteException;
    public java.lang.String updateTransaction(int ID, java.lang.String nameOnCard, java.lang.String cardNumber, java.lang.String cardType, int unitPrice, int quantity, int totalPrice, java.lang.String expDate) throws java.rmi.RemoteException;
    public java.lang.String removeTransaction(int id) throws java.rmi.RemoteException;
    public java.lang.Object[] getAllTransactions(int id) throws java.rmi.RemoteException;
}
