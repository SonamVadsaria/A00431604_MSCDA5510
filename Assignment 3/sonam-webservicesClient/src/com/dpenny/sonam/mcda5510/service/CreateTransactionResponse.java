/**
 * CreateTransactionResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dpenny.sonam.mcda5510.service;

public class CreateTransactionResponse  implements java.io.Serializable {
    private java.lang.String createTransactionReturn;

    public CreateTransactionResponse() {
    }

    public CreateTransactionResponse(
           java.lang.String createTransactionReturn) {
           this.createTransactionReturn = createTransactionReturn;
    }


    /**
     * Gets the createTransactionReturn value for this CreateTransactionResponse.
     * 
     * @return createTransactionReturn
     */
    public java.lang.String getCreateTransactionReturn() {
        return createTransactionReturn;
    }


    /**
     * Sets the createTransactionReturn value for this CreateTransactionResponse.
     * 
     * @param createTransactionReturn
     */
    public void setCreateTransactionReturn(java.lang.String createTransactionReturn) {
        this.createTransactionReturn = createTransactionReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateTransactionResponse)) return false;
        CreateTransactionResponse other = (CreateTransactionResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.createTransactionReturn==null && other.getCreateTransactionReturn()==null) || 
             (this.createTransactionReturn!=null &&
              this.createTransactionReturn.equals(other.getCreateTransactionReturn())));
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
        if (getCreateTransactionReturn() != null) {
            _hashCode += getCreateTransactionReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateTransactionResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.mcda5510.sonam.dpenny.com", ">createTransactionResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createTransactionReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.mcda5510.sonam.dpenny.com", "createTransactionReturn"));
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
