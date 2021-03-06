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
 * SugarsoapLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.apatar.sugarcrm.ws;

public class SugarsoapLocator extends org.apache.axis.client.Service implements com.apatar.sugarcrm.ws.Sugarsoap {
	private static final long serialVersionUID = 1L;

    public SugarsoapLocator() {
    }


    public SugarsoapLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SugarsoapLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for sugarsoapPort
    private java.lang.String sugarsoapPort_address = "http://localhost/sugarcrm/soap.php";

    public java.lang.String getsugarsoapPortAddress() {
        return sugarsoapPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String sugarsoapPortWSDDServiceName = "sugarsoapPort";

    public java.lang.String getsugarsoapPortWSDDServiceName() {
        return sugarsoapPortWSDDServiceName;
    }

    public void setsugarsoapPortWSDDServiceName(java.lang.String name) {
        sugarsoapPortWSDDServiceName = name;
    }

    public com.apatar.sugarcrm.ws.SugarsoapPortType getsugarsoapPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(sugarsoapPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getsugarsoapPort(endpoint);
    }

    public com.apatar.sugarcrm.ws.SugarsoapPortType getsugarsoapPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.apatar.sugarcrm.ws.SugarsoapBindingStub _stub = new com.apatar.sugarcrm.ws.SugarsoapBindingStub(portAddress, this);
            _stub.setPortName(getsugarsoapPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setsugarsoapPortEndpointAddress(java.lang.String address) {
        sugarsoapPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.apatar.sugarcrm.ws.SugarsoapPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.apatar.sugarcrm.ws.SugarsoapBindingStub _stub = new com.apatar.sugarcrm.ws.SugarsoapBindingStub(new java.net.URL(sugarsoapPort_address), this);
                _stub.setPortName(getsugarsoapPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("sugarsoapPort".equals(inputPortName)) {
            return getsugarsoapPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.sugarcrm.com/sugarcrm", "sugarsoap");
    }

    private java.util.HashSet ports = null;

    @SuppressWarnings("unchecked")
	public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.sugarcrm.com/sugarcrm", "sugarsoapPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("sugarsoapPort".equals(portName)) {
            setsugarsoapPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
