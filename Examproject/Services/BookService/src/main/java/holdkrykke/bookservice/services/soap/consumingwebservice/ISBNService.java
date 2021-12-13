/**
 * ISBNService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package holdkrykke.bookservice.services.soap.consumingwebservice;

public interface ISBNService extends javax.xml.rpc.Service {

/**
 * DataFlex Web Service to validate ISBN numbers.
 */
    public java.lang.String getISBNServiceSoapAddress();

    public holdkrykke.bookservice.services.soap.consumingwebservice.ISBNServiceSoapType getISBNServiceSoap() throws javax.xml.rpc.ServiceException;

    public holdkrykke.bookservice.services.soap.consumingwebservice.ISBNServiceSoapType getISBNServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getISBNServiceSoap12Address();

    public holdkrykke.bookservice.services.soap.consumingwebservice.ISBNServiceSoapType getISBNServiceSoap12() throws javax.xml.rpc.ServiceException;

    public holdkrykke.bookservice.services.soap.consumingwebservice.ISBNServiceSoapType getISBNServiceSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
