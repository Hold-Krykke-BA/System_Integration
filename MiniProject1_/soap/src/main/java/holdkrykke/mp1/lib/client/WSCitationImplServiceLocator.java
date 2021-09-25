/**
 * WSCitationImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package holdkrykke.mp1.lib.client;

public class WSCitationImplServiceLocator extends org.apache.axis.client.Service implements holdkrykke.mp1.lib.client.WSCitationImplService {

    public WSCitationImplServiceLocator() {
    }


    public WSCitationImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WSCitationImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WSCitationImplPort
    private java.lang.String WSCitationImplPort_address = "https://www.ebi.ac.uk:443/europepmc/webservices/soap";

    public java.lang.String getWSCitationImplPortAddress() {
        return WSCitationImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WSCitationImplPortWSDDServiceName = "WSCitationImplPort";

    public java.lang.String getWSCitationImplPortWSDDServiceName() {
        return WSCitationImplPortWSDDServiceName;
    }

    public void setWSCitationImplPortWSDDServiceName(java.lang.String name) {
        WSCitationImplPortWSDDServiceName = name;
    }

    public holdkrykke.mp1.lib.client.WSCitationImpl getWSCitationImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WSCitationImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWSCitationImplPort(endpoint);
    }

    public holdkrykke.mp1.lib.client.WSCitationImpl getWSCitationImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            holdkrykke.mp1.lib.client.WSCitationImplPortBindingStub _stub = new holdkrykke.mp1.lib.client.WSCitationImplPortBindingStub(portAddress, this);
            _stub.setPortName(getWSCitationImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWSCitationImplPortEndpointAddress(java.lang.String address) {
        WSCitationImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (holdkrykke.mp1.lib.client.WSCitationImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                holdkrykke.mp1.lib.client.WSCitationImplPortBindingStub _stub = new holdkrykke.mp1.lib.client.WSCitationImplPortBindingStub(new java.net.URL(WSCitationImplPort_address), this);
                _stub.setPortName(getWSCitationImplPortWSDDServiceName());
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
        if ("WSCitationImplPort".equals(inputPortName)) {
            return getWSCitationImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "WSCitationImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "WSCitationImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WSCitationImplPort".equals(portName)) {
            setWSCitationImplPortEndpointAddress(address);
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
