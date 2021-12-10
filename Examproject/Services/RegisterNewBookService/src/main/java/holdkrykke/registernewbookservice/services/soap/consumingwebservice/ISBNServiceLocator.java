/**
 * ISBNServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package holdkrykke.registernewbookservice.services.soap.consumingwebservice;

public class ISBNServiceLocator extends org.apache.axis.client.Service implements holdkrykke.registernewbookservice.services.soap.consumingwebservice.ISBNService {

/**
 * DataFlex Web Service to validate ISBN numbers.
 */

    public ISBNServiceLocator() {
    }


    public ISBNServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ISBNServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ISBNServiceSoap
    private java.lang.String ISBNServiceSoap_address = "https://webservices.daehosting.com/services/ISBNService.wso";

    public java.lang.String getISBNServiceSoapAddress() {
        return ISBNServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ISBNServiceSoapWSDDServiceName = "ISBNServiceSoap";

    public java.lang.String getISBNServiceSoapWSDDServiceName() {
        return ISBNServiceSoapWSDDServiceName;
    }

    public void setISBNServiceSoapWSDDServiceName(java.lang.String name) {
        ISBNServiceSoapWSDDServiceName = name;
    }

    public holdkrykke.registernewbookservice.services.soap.consumingwebservice.ISBNServiceSoapType getISBNServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ISBNServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getISBNServiceSoap(endpoint);
    }

    public holdkrykke.registernewbookservice.services.soap.consumingwebservice.ISBNServiceSoapType getISBNServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            holdkrykke.registernewbookservice.services.soap.consumingwebservice.ISBNServiceSoapBindingStub _stub = new holdkrykke.registernewbookservice.services.soap.consumingwebservice.ISBNServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getISBNServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setISBNServiceSoapEndpointAddress(java.lang.String address) {
        ISBNServiceSoap_address = address;
    }


    // Use to get a proxy class for ISBNServiceSoap12
    private java.lang.String ISBNServiceSoap12_address = "https://webservices.daehosting.com/services/ISBNService.wso";

    public java.lang.String getISBNServiceSoap12Address() {
        return ISBNServiceSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ISBNServiceSoap12WSDDServiceName = "ISBNServiceSoap12";

    public java.lang.String getISBNServiceSoap12WSDDServiceName() {
        return ISBNServiceSoap12WSDDServiceName;
    }

    public void setISBNServiceSoap12WSDDServiceName(java.lang.String name) {
        ISBNServiceSoap12WSDDServiceName = name;
    }

    public holdkrykke.registernewbookservice.services.soap.consumingwebservice.ISBNServiceSoapType getISBNServiceSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ISBNServiceSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getISBNServiceSoap12(endpoint);
    }

    public holdkrykke.registernewbookservice.services.soap.consumingwebservice.ISBNServiceSoapType getISBNServiceSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            holdkrykke.registernewbookservice.services.soap.consumingwebservice.ISBNServiceSoapBinding12Stub _stub = new holdkrykke.registernewbookservice.services.soap.consumingwebservice.ISBNServiceSoapBinding12Stub(portAddress, this);
            _stub.setPortName(getISBNServiceSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setISBNServiceSoap12EndpointAddress(java.lang.String address) {
        ISBNServiceSoap12_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (holdkrykke.registernewbookservice.services.soap.consumingwebservice.ISBNServiceSoapType.class.isAssignableFrom(serviceEndpointInterface)) {
                holdkrykke.registernewbookservice.services.soap.consumingwebservice.ISBNServiceSoapBindingStub _stub = new holdkrykke.registernewbookservice.services.soap.consumingwebservice.ISBNServiceSoapBindingStub(new java.net.URL(ISBNServiceSoap_address), this);
                _stub.setPortName(getISBNServiceSoapWSDDServiceName());
                return _stub;
            }
            if (holdkrykke.registernewbookservice.services.soap.consumingwebservice.ISBNServiceSoapType.class.isAssignableFrom(serviceEndpointInterface)) {
                holdkrykke.registernewbookservice.services.soap.consumingwebservice.ISBNServiceSoapBinding12Stub _stub = new holdkrykke.registernewbookservice.services.soap.consumingwebservice.ISBNServiceSoapBinding12Stub(new java.net.URL(ISBNServiceSoap12_address), this);
                _stub.setPortName(getISBNServiceSoap12WSDDServiceName());
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
        if ("ISBNServiceSoap".equals(inputPortName)) {
            return getISBNServiceSoap();
        }
        else if ("ISBNServiceSoap12".equals(inputPortName)) {
            return getISBNServiceSoap12();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservices.daehosting.com/ISBN", "ISBNService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservices.daehosting.com/ISBN", "ISBNServiceSoap"));
            ports.add(new javax.xml.namespace.QName("http://webservices.daehosting.com/ISBN", "ISBNServiceSoap12"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ISBNServiceSoap".equals(portName)) {
            setISBNServiceSoapEndpointAddress(address);
        }
        else 
if ("ISBNServiceSoap12".equals(portName)) {
            setISBNServiceSoap12EndpointAddress(address);
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
