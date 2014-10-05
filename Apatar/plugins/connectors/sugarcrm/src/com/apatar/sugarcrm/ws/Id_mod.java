/*
_______________________
Apatar Open Source Data Integration
Copyright (C) 2005-2007, Apatar, Inc.
info@apatar.com
195 Meadow St., 2nd Floor
Chicopee, MA 01013

��� This program is free software; you can redistribute it and/or modify
��� it under the terms of the GNU General Public License as published by
��� the Free Software Foundation; either version 2 of the License, or
��� (at your option) any later version.

��� This program is distributed in the hope that it will be useful,
��� but WITHOUT ANY WARRANTY; without even the implied warranty of
��� MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.� See the
��� GNU General Public License for more details.

��� You should have received a copy of the GNU General Public License along
��� with this program; if not, write to the Free Software Foundation, Inc.,
��� 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
________________________

*/

/**
 * Id_mod.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.apatar.sugarcrm.ws;

@SuppressWarnings("serial")
public class Id_mod  implements java.io.Serializable {
    private java.lang.String id;
    private java.lang.String date_modified;
    private int deleted;

    public Id_mod() {
    }

    public Id_mod(
           java.lang.String id,
           java.lang.String date_modified,
           int deleted) {
           this.id = id;
           this.date_modified = date_modified;
           this.deleted = deleted;
    }


    /**
     * Gets the id value for this Id_mod.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this Id_mod.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the date_modified value for this Id_mod.
     * 
     * @return date_modified
     */
    public java.lang.String getDate_modified() {
        return date_modified;
    }


    /**
     * Sets the date_modified value for this Id_mod.
     * 
     * @param date_modified
     */
    public void setDate_modified(java.lang.String date_modified) {
        this.date_modified = date_modified;
    }


    /**
     * Gets the deleted value for this Id_mod.
     * 
     * @return deleted
     */
    public int getDeleted() {
        return deleted;
    }


    /**
     * Sets the deleted value for this Id_mod.
     * 
     * @param deleted
     */
    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Id_mod)) return false;
        Id_mod other = (Id_mod) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.date_modified==null && other.getDate_modified()==null) || 
             (this.date_modified!=null &&
              this.date_modified.equals(other.getDate_modified()))) &&
            this.deleted == other.getDeleted();
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getDate_modified() != null) {
            _hashCode += getDate_modified().hashCode();
        }
        _hashCode += getDeleted();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Id_mod.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sugarcrm.com/sugarcrm", "id_mod"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_modified");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date_modified"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleted");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deleted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
