package com.dpenny.sonam.mcda5510.service;

public class TrxnWebServiceProxy implements com.dpenny.sonam.mcda5510.service.TrxnWebService {
  private String _endpoint = null;
  private com.dpenny.sonam.mcda5510.service.TrxnWebService trxnWebService = null;
  
  public TrxnWebServiceProxy() {
    _initTrxnWebServiceProxy();
  }
  
  public TrxnWebServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initTrxnWebServiceProxy();
  }
  
  private void _initTrxnWebServiceProxy() {
    try {
      trxnWebService = (new com.dpenny.sonam.mcda5510.service.TrxnWebServiceServiceLocator()).getTrxnWebService();
      if (trxnWebService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)trxnWebService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)trxnWebService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (trxnWebService != null)
      ((javax.xml.rpc.Stub)trxnWebService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.dpenny.sonam.mcda5510.service.TrxnWebService getTrxnWebService() {
    if (trxnWebService == null)
      _initTrxnWebServiceProxy();
    return trxnWebService;
  }
  
  public java.lang.String getTransaction(int trxnID) throws java.rmi.RemoteException{
    if (trxnWebService == null)
      _initTrxnWebServiceProxy();
    return trxnWebService.getTransaction(trxnID);
  }
  
  public java.lang.String createTransaction(int ID, java.lang.String nameOnCard, java.lang.String cardNumber, java.lang.String cardType, double unitPrice, int quantity, double totalPrice, java.lang.String expDate) throws java.rmi.RemoteException{
    if (trxnWebService == null)
      _initTrxnWebServiceProxy();
    return trxnWebService.createTransaction(ID, nameOnCard, cardNumber, cardType, unitPrice, quantity, totalPrice, expDate);
  }
  
  public java.lang.String updateTransaction(int ID, java.lang.String nameOnCard, java.lang.String cardNumber, java.lang.String cardType, int unitPrice, int quantity, int totalPrice, java.lang.String expDate) throws java.rmi.RemoteException{
    if (trxnWebService == null)
      _initTrxnWebServiceProxy();
    return trxnWebService.updateTransaction(ID, nameOnCard, cardNumber, cardType, unitPrice, quantity, totalPrice, expDate);
  }
  
  public java.lang.String removeTransaction(int id) throws java.rmi.RemoteException{
    if (trxnWebService == null)
      _initTrxnWebServiceProxy();
    return trxnWebService.removeTransaction(id);
  }
  
  public java.lang.Object[] getAllTransactions(int id) throws java.rmi.RemoteException{
    if (trxnWebService == null)
      _initTrxnWebServiceProxy();
    return trxnWebService.getAllTransactions(id);
  }
  
  
}