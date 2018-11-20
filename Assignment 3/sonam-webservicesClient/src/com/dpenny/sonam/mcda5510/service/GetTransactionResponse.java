/**
 * GetTransactionResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dpenny.sonam.mcda5510.service;

public class GetTransactionResponse  implements java.io.Serializable {
    private java.lang.String getTransactionReturn;

    public GetTransactionResponse() {
    }

    public GetTransactionResponse(
           java.lang.String getTransactionReturn) {
           this.getTransactionReturn = getTransactionReturn;
    }


    /**
     * Gets the getTransactionReturn value for this GetTransactionResponse.
     * 
     * @return getTransactionReturn
     */
    public java.lang.String getGetTransactionReturn() {
        return getTransactionReturn;
    }


    /**
     * Sets the getTransactionReturn value for this GetTransactionResponse.
     * 
     * @param getTransactionReturn
     */
    public void setGetTransactionReturn(java.lang.String getTransactionReturn) {
        this.getTransactionReturn = getTransactionReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTransactionResponse)) return false;
        GetTransactionResponse other = (GetTransactionResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getTransactionReturn==null && other.getGetTransactionReturn()==null) || 
             (this.getTransactionReturn!=null &&
              this.getTransactionReturn.equals(other.getGetTransactionReturn())));
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
        if (getGetTransactionReturn() != null) {
            _hashCode += getGetTransactionReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetTransactionResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.mcda5510.sonam.dpenny.com", ">getTransactionResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getTransactionReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.mcda5510.sonam.dpenny.com", "getTransactionReturn"));
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
