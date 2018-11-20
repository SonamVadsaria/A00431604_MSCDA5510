/**
 * GetAllTransactionsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dpenny.sonam.mcda5510.service;

public class GetAllTransactionsResponse  implements java.io.Serializable {
    private java.lang.Object[] getAllTransactionsReturn;

    public GetAllTransactionsResponse() {
    }

    public GetAllTransactionsResponse(
           java.lang.Object[] getAllTransactionsReturn) {
           this.getAllTransactionsReturn = getAllTransactionsReturn;
    }


    /**
     * Gets the getAllTransactionsReturn value for this GetAllTransactionsResponse.
     * 
     * @return getAllTransactionsReturn
     */
    public java.lang.Object[] getGetAllTransactionsReturn() {
        return getAllTransactionsReturn;
    }


    /**
     * Sets the getAllTransactionsReturn value for this GetAllTransactionsResponse.
     * 
     * @param getAllTransactionsReturn
     */
    public void setGetAllTransactionsReturn(java.lang.Object[] getAllTransactionsReturn) {
        this.getAllTransactionsReturn = getAllTransactionsReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAllTransactionsResponse)) return false;
        GetAllTransactionsResponse other = (GetAllTransactionsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getAllTransactionsReturn==null && other.getGetAllTransactionsReturn()==null) || 
             (this.getAllTransactionsReturn!=null &&
              java.util.Arrays.equals(this.getAllTransactionsReturn, other.getGetAllTransactionsReturn())));
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
        if (getGetAllTransactionsReturn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetAllTransactionsReturn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetAllTransactionsReturn(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAllTransactionsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.mcda5510.sonam.dpenny.com", ">getAllTransactionsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAllTransactionsReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://service.mcda5510.sonam.dpenny.com", "getAllTransactionsReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://service.mcda5510.sonam.dpenny.com", "item"));
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
