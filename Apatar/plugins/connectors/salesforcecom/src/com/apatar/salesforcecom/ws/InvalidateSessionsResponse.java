/**
 * InvalidateSessionsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.apatar.salesforcecom.ws;

public class InvalidateSessionsResponse  implements java.io.Serializable {
    private com.apatar.salesforcecom.ws.InvalidateSessionsResult[] result;

    public InvalidateSessionsResponse() {
    }

    public InvalidateSessionsResponse(
           com.apatar.salesforcecom.ws.InvalidateSessionsResult[] result) {
           this.result = result;
    }


    /**
     * Gets the result value for this InvalidateSessionsResponse.
     * 
     * @return result
     */
    public com.apatar.salesforcecom.ws.InvalidateSessionsResult[] getResult() {
        return result;
    }


    /**
     * Sets the result value for this InvalidateSessionsResponse.
     * 
     * @param result
     */
    public void setResult(com.apatar.salesforcecom.ws.InvalidateSessionsResult[] result) {
        this.result = result;
    }

    public com.apatar.salesforcecom.ws.InvalidateSessionsResult getResult(int i) {
        return this.result[i];
    }

    public void setResult(int i, com.apatar.salesforcecom.ws.InvalidateSessionsResult _value) {
        this.result[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InvalidateSessionsResponse)) return false;
        InvalidateSessionsResponse other = (InvalidateSessionsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.result==null && other.getResult()==null) || 
             (this.result!=null &&
              java.util.Arrays.equals(this.result, other.getResult())));
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
        if (getResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResult(), i);
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
        new org.apache.axis.description.TypeDesc(InvalidateSessionsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">invalidateSessionsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "result"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "InvalidateSessionsResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
