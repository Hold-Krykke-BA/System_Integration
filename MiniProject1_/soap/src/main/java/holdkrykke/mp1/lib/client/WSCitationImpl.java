/**
 * WSCitationImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package holdkrykke.mp1.lib.client;

public interface WSCitationImpl extends java.rmi.Remote {
    public holdkrykke.mp1.lib.client.ResponseWrapper searchPublications(java.lang.String queryString, java.lang.String resultType, java.lang.String cursorMark, java.lang.String pageSize, java.lang.String sort, java.lang.String synonym, java.lang.String email) throws java.rmi.RemoteException, holdkrykke.mp1.lib.client.QueryException;
    public holdkrykke.mp1.lib.client.ResponseWrapper profilePublications(java.lang.String queryString, java.lang.String profileType, java.lang.String synonym, java.lang.String email) throws java.rmi.RemoteException, holdkrykke.mp1.lib.client.QueryException;
    public holdkrykke.mp1.lib.client.ResponseWrapper getLabsLinks(java.lang.String id, java.lang.String source, java.lang.String providerId, java.lang.Integer offSet, java.lang.String pageSize, java.lang.String email) throws java.rmi.RemoteException, holdkrykke.mp1.lib.client.QueryException;
    public holdkrykke.mp1.lib.client.ResponseWrapper getDataLinks(java.lang.String id, java.lang.String source, java.lang.String category, java.lang.String obtainedBy, java.lang.String fromDate, java.lang.String tags, java.lang.String sectionLimit, java.lang.String email) throws java.rmi.RemoteException, holdkrykke.mp1.lib.client.QueryException;
    public holdkrykke.mp1.lib.client.ResponseWrapper getCitations(java.lang.String id, java.lang.String source, java.lang.Integer offSet, java.lang.String pageSize, java.lang.String email) throws java.rmi.RemoteException, holdkrykke.mp1.lib.client.QueryException;
    public holdkrykke.mp1.lib.client.ResponseWrapper getReferences(java.lang.String id, java.lang.String source, java.lang.Integer offSet, java.lang.String pageSize, java.lang.String email) throws java.rmi.RemoteException, holdkrykke.mp1.lib.client.QueryException;
    public holdkrykke.mp1.lib.client.ResponseWrapper getDatabaseLinks(java.lang.String id, java.lang.String source, java.lang.String database, java.lang.Integer offSet, java.lang.String pageSize, java.lang.String email) throws java.rmi.RemoteException, holdkrykke.mp1.lib.client.QueryException;
    public holdkrykke.mp1.lib.client.Result getSupplementaryFiles(java.lang.String id, java.lang.String source, java.lang.String inlineImages, java.lang.String email) throws java.rmi.RemoteException, holdkrykke.mp1.lib.client.QueryException;
    public holdkrykke.mp1.lib.client.Result getFulltextXML(java.lang.String id, java.lang.String source, java.lang.String email) throws java.rmi.RemoteException, holdkrykke.mp1.lib.client.QueryException;
    public holdkrykke.mp1.lib.client.Result getBookXML(java.lang.String id, java.lang.String source, java.lang.String email) throws java.rmi.RemoteException, holdkrykke.mp1.lib.client.QueryException;
    public holdkrykke.mp1.lib.client.ResponseWrapper listSearchFields(java.lang.String email) throws java.rmi.RemoteException, holdkrykke.mp1.lib.client.QueryException;
}
