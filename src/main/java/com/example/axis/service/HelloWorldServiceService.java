/**
 * HelloWorldServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example.axis.service;

public interface HelloWorldServiceService extends javax.xml.rpc.Service {
    public String getHelloWorldServiceAddress();

    public HelloWorldService_PortType getHelloWorldService() throws javax.xml.rpc.ServiceException;

    public HelloWorldService_PortType getHelloWorldService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
