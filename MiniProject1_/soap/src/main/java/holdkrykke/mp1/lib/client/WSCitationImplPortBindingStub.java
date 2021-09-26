/**
 * WSCitationImplPortBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package holdkrykke.mp1.lib.client;

public class WSCitationImplPortBindingStub extends org.apache.axis.client.Stub implements holdkrykke.mp1.lib.client.WSCitationImpl {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[11];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchPublications");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "queryString"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "resultType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cursorMark"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pageSize"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sort"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "synonym"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "email"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "responseWrapper"));
        oper.setReturnClass(holdkrykke.mp1.lib.client.ResponseWrapper.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "QueryException"),
                      "holdkrykke.mp1.lib.client.QueryException",
                      new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "QueryException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("profilePublications");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "queryString"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profileType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "synonym"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "email"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "responseWrapper"));
        oper.setReturnClass(holdkrykke.mp1.lib.client.ResponseWrapper.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "QueryException"),
                      "holdkrykke.mp1.lib.client.QueryException",
                      new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "QueryException"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLabsLinks");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "source"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "providerId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "offSet"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pageSize"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "email"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "responseWrapper"));
        oper.setReturnClass(holdkrykke.mp1.lib.client.ResponseWrapper.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "QueryException"),
                      "holdkrykke.mp1.lib.client.QueryException",
                      new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "QueryException"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDataLinks");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "source"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "category"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "obtainedBy"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "tags"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sectionLimit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "email"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "responseWrapper"));
        oper.setReturnClass(holdkrykke.mp1.lib.client.ResponseWrapper.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "QueryException"),
                      "holdkrykke.mp1.lib.client.QueryException",
                      new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "QueryException"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCitations");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "source"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "offSet"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pageSize"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "email"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "responseWrapper"));
        oper.setReturnClass(holdkrykke.mp1.lib.client.ResponseWrapper.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "QueryException"),
                      "holdkrykke.mp1.lib.client.QueryException",
                      new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "QueryException"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getReferences");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "source"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "offSet"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pageSize"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "email"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "responseWrapper"));
        oper.setReturnClass(holdkrykke.mp1.lib.client.ResponseWrapper.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "QueryException"),
                      "holdkrykke.mp1.lib.client.QueryException",
                      new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "QueryException"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDatabaseLinks");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "source"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "database"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "offSet"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pageSize"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "email"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "responseWrapper"));
        oper.setReturnClass(holdkrykke.mp1.lib.client.ResponseWrapper.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "QueryException"),
                      "holdkrykke.mp1.lib.client.QueryException",
                      new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "QueryException"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSupplementaryFiles");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "source"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "inlineImages"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "email"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "result"));
        oper.setReturnClass(holdkrykke.mp1.lib.client.Result.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "QueryException"),
                      "holdkrykke.mp1.lib.client.QueryException",
                      new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "QueryException"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getFulltextXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "source"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "email"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "result"));
        oper.setReturnClass(holdkrykke.mp1.lib.client.Result.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "QueryException"),
                      "holdkrykke.mp1.lib.client.QueryException",
                      new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "QueryException"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getBookXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "source"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "email"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "result"));
        oper.setReturnClass(holdkrykke.mp1.lib.client.Result.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "QueryException"),
                      "holdkrykke.mp1.lib.client.QueryException",
                      new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "QueryException"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("listSearchFields");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "email"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "responseWrapper"));
        oper.setReturnClass(holdkrykke.mp1.lib.client.ResponseWrapper.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "QueryException"),
                      "holdkrykke.mp1.lib.client.QueryException",
                      new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "QueryException"), 
                      true
                     ));
        _operations[10] = oper;

    }

    public WSCitationImplPortBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public WSCitationImplPortBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public WSCitationImplPortBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.1");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "authorAffiliation");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.AuthorAffiliation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "authorAffiliationDetailsList");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.AuthorAffiliation[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "authorAffiliation");
            qName2 = new javax.xml.namespace.QName("", "authorAffiliation");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "authorId");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.AuthorId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "authorIdsList");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.AuthorId[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "authorId");
            qName2 = new javax.xml.namespace.QName("", "authorId");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "authors");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.Authors.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "authorsList");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.Authors[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "authors");
            qName2 = new javax.xml.namespace.QName("", "author");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "bookOrReportDetails");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.BookOrReportDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "chemicalInfo");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.ChemicalInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "chemicalList");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.ChemicalInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "chemicalInfo");
            qName2 = new javax.xml.namespace.QName("", "chemical");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "CitationData");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.CitationData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "citationList");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.CitationData[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "CitationData");
            qName2 = new javax.xml.namespace.QName("", "citation");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "commentCorrection");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.CommentCorrection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "commentCorrectionList");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.CommentCorrection[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "commentCorrection");
            qName2 = new javax.xml.namespace.QName("", "commentCorrection");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "crossReferencesList");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "dbName");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "dataLinksTagsList");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "dataLinkstag");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "dbCountList");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.DbCounts[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "dbCounts");
            qName2 = new javax.xml.namespace.QName("", "db");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "dbCounts");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.DbCounts.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "dbCrossReference");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.DbCrossReference.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "dbCrossReferenceInfo");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.DbCrossReferenceInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "dbCrossReferenceList");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.DbCrossReference[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "dbCrossReference");
            qName2 = new javax.xml.namespace.QName("", "dbCrossReference");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "extComment");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.ExtComment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "extCommentBean");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.ExtComment[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "extComment");
            qName2 = new javax.xml.namespace.QName("", "extComment");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "fullTextIdList");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "fullTextId");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "fullTextImage");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.FullTextImage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "fullTextImageList");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.FullTextImage[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "fullTextImage");
            qName2 = new javax.xml.namespace.QName("", "fullTextImage");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "fullTextURLInfo");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.FullTextURLInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "fullTextUrlList");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.FullTextURLInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "fullTextURLInfo");
            qName2 = new javax.xml.namespace.QName("", "fullTextUrl");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "fullTextXML");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.FullTextXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "getBookXML");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.GetBookXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "getBookXMLResponse");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.GetBookXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "getCitations");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.GetCitations.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "getCitationsResponse");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.GetCitationsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "getDatabaseLinks");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.GetDatabaseLinks.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "getDatabaseLinksResponse");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.GetDatabaseLinksResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "getDataLinks");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.GetDataLinks.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "getDataLinksResponse");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.GetDataLinksResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "getFulltextXML");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.GetFulltextXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "getFulltextXMLResponse");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.GetFulltextXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "getLabsLinks");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.GetLabsLinks.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "getLabsLinksResponse");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.GetLabsLinksResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "getReferences");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.GetReferences.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "getReferencesResponse");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.GetReferencesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "getSupplementaryFiles");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.GetSupplementaryFiles.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "getSupplementaryFilesResponse");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.GetSupplementaryFilesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "grantInfo");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.GrantInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "grantsList");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.GrantInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "grantInfo");
            qName2 = new javax.xml.namespace.QName("", "grant");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "investigatorList");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.Authors[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "authors");
            qName2 = new javax.xml.namespace.QName("", "investigator");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "journal");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.Journal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "journalInfo");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.JournalInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "keywordList");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "keyword");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "labsLinks");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.LabsLinks.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "labsProvider");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.LabsProvider.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "labsProviderCountList");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.LabsProviderCounts[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "labsProviderCounts");
            qName2 = new javax.xml.namespace.QName("", "provider");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "labsProviderCounts");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.LabsProviderCounts.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "labsProviders");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.LabsProvider[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "labsProvider");
            qName2 = new javax.xml.namespace.QName("", "provider");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "listSearchFields");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.ListSearchFields.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "listSearchFieldsResponse");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.ListSearchFieldsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "meshHeadingInfo");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.MeshHeadingInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "meshHeadingsList");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.MeshHeadingInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "meshHeadingInfo");
            qName2 = new javax.xml.namespace.QName("", "meshHeading");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "meshQualifierInfo");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.MeshQualifierInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "meshQualifierList");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.MeshQualifierInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "meshQualifierInfo");
            qName2 = new javax.xml.namespace.QName("", "meshQualifier");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "minedAltName");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "altName");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "minedDbIDs");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "dbId");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "minedSummary");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.MinedSummary.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "minedTerms");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.MinedTerms.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "minedTermsList");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.MinedTerms[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "minedTerms");
            qName2 = new javax.xml.namespace.QName("", "semanticType");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "patentApplication");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.PatentApplication.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "patentClassifierInfo");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.PatentClassifierInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "patentClassifierList");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.PatentClassifierInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "patentClassifierInfo");
            qName2 = new javax.xml.namespace.QName("", "classifier");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "patentDetailsInfo");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.PatentDetailsInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "patentFamilyData");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.PatentFamilyData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "patentFamilyList");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.PatentFamilyData[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "patentFamilyData");
            qName2 = new javax.xml.namespace.QName("", "family");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "patentPriorityData");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.PatentPriorityData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "patentPriorityList");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.PatentPriorityData[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "patentPriorityData");
            qName2 = new javax.xml.namespace.QName("", "priority");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "profile");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.Profile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "profileListBean");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.ProfileListBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "profilePublications");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.ProfilePublications.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "profilePublicationsResponse");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.ProfilePublicationsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "pubTypeList");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "pubType");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "QueryException");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.QueryException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "referenceInfo");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.ReferenceInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "referencesList");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.ReferenceInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "referenceInfo");
            qName2 = new javax.xml.namespace.QName("", "reference");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "request");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "responseWrapper");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.ResponseWrapper.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "result");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.Result.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "resultList");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.Result[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "result");
            qName2 = new javax.xml.namespace.QName("", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "searchPublications");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.SearchPublications.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "searchPublicationsResponse");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.SearchPublicationsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "SearchTerm");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.SearchTerm.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "searchTerms");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.SearchTerm[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "SearchTerm");
            qName2 = new javax.xml.namespace.QName("", "searchTerms");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "semanticCounts");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.SemanticCounts.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "semanticTypeCounts");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.SemanticCounts[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "semanticCounts");
            qName2 = new javax.xml.namespace.QName("", "semanticType");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "subSet");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.SubSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "subSetList");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.SubSet[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "subSet");
            qName2 = new javax.xml.namespace.QName("", "subset");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "tmAccessionTypeList");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "accessionType");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "version");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.Version.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "versionList");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.Version[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "version");
            qName2 = new javax.xml.namespace.QName("", "version");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws-i.org/profiles/basic/1.1/xsd", "swaRef");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.types.URI.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.scholix.org", "dataLinkedElement");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.DataLinkedElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.scholix.org", "dataLinkIdentifier");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.DataLinkIdentifier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.scholix.org", "dataLinkObjectType");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.DataLinkObjectType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.scholix.org", "Link");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.Link.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.scholix.org", "Linklist");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.Link[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.scholix.org", "Link");
            qName2 = new javax.xml.namespace.QName("", "Link");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.scholix.org", "linkProvider");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.LinkProvider.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.scholix.org", "RelationshipType");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.RelationshipType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.europepmc.org/data", ">Category>Tags");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("https://www.europepmc.org/data", "Tag");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://www.europepmc.org/data", ">Section>Tags");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("https://www.europepmc.org/data", "Tag");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://www.europepmc.org/data", "Category");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.Category.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.europepmc.org/data", "dataLinks");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.Category[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://www.europepmc.org/data", "Category");
            qName2 = new javax.xml.namespace.QName("https://www.europepmc.org/data", "Category");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://www.europepmc.org/data", "objectPublisher");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.ObjectPublisher.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.europepmc.org/data", "Section");
            cachedSerQNames.add(qName);
            cls = holdkrykke.mp1.lib.client.Section.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public holdkrykke.mp1.lib.client.ResponseWrapper searchPublications(java.lang.String queryString, java.lang.String resultType, java.lang.String cursorMark, java.lang.String pageSize, java.lang.String sort, java.lang.String synonym, java.lang.String email) throws java.rmi.RemoteException, holdkrykke.mp1.lib.client.QueryException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "searchPublications"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {queryString, resultType, cursorMark, pageSize, sort, synonym, email});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (holdkrykke.mp1.lib.client.ResponseWrapper) _resp;
            } catch (java.lang.Exception _exception) {
                return (holdkrykke.mp1.lib.client.ResponseWrapper) org.apache.axis.utils.JavaUtils.convert(_resp, holdkrykke.mp1.lib.client.ResponseWrapper.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof holdkrykke.mp1.lib.client.QueryException) {
              throw (holdkrykke.mp1.lib.client.QueryException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public holdkrykke.mp1.lib.client.ResponseWrapper profilePublications(java.lang.String queryString, java.lang.String profileType, java.lang.String synonym, java.lang.String email) throws java.rmi.RemoteException, holdkrykke.mp1.lib.client.QueryException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "profilePublications"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {queryString, profileType, synonym, email});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (holdkrykke.mp1.lib.client.ResponseWrapper) _resp;
            } catch (java.lang.Exception _exception) {
                return (holdkrykke.mp1.lib.client.ResponseWrapper) org.apache.axis.utils.JavaUtils.convert(_resp, holdkrykke.mp1.lib.client.ResponseWrapper.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof holdkrykke.mp1.lib.client.QueryException) {
              throw (holdkrykke.mp1.lib.client.QueryException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public holdkrykke.mp1.lib.client.ResponseWrapper getLabsLinks(java.lang.String id, java.lang.String source, java.lang.String providerId, java.lang.Integer offSet, java.lang.String pageSize, java.lang.String email) throws java.rmi.RemoteException, holdkrykke.mp1.lib.client.QueryException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "getLabsLinks"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {id, source, providerId, offSet, pageSize, email});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (holdkrykke.mp1.lib.client.ResponseWrapper) _resp;
            } catch (java.lang.Exception _exception) {
                return (holdkrykke.mp1.lib.client.ResponseWrapper) org.apache.axis.utils.JavaUtils.convert(_resp, holdkrykke.mp1.lib.client.ResponseWrapper.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof holdkrykke.mp1.lib.client.QueryException) {
              throw (holdkrykke.mp1.lib.client.QueryException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public holdkrykke.mp1.lib.client.ResponseWrapper getDataLinks(java.lang.String id, java.lang.String source, java.lang.String category, java.lang.String obtainedBy, java.lang.String fromDate, java.lang.String tags, java.lang.String sectionLimit, java.lang.String email) throws java.rmi.RemoteException, holdkrykke.mp1.lib.client.QueryException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "getDataLinks"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {id, source, category, obtainedBy, fromDate, tags, sectionLimit, email});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (holdkrykke.mp1.lib.client.ResponseWrapper) _resp;
            } catch (java.lang.Exception _exception) {
                return (holdkrykke.mp1.lib.client.ResponseWrapper) org.apache.axis.utils.JavaUtils.convert(_resp, holdkrykke.mp1.lib.client.ResponseWrapper.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof holdkrykke.mp1.lib.client.QueryException) {
              throw (holdkrykke.mp1.lib.client.QueryException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public holdkrykke.mp1.lib.client.ResponseWrapper getCitations(java.lang.String id, java.lang.String source, java.lang.Integer offSet, java.lang.String pageSize, java.lang.String email) throws java.rmi.RemoteException, holdkrykke.mp1.lib.client.QueryException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "getCitations"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {id, source, offSet, pageSize, email});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (holdkrykke.mp1.lib.client.ResponseWrapper) _resp;
            } catch (java.lang.Exception _exception) {
                return (holdkrykke.mp1.lib.client.ResponseWrapper) org.apache.axis.utils.JavaUtils.convert(_resp, holdkrykke.mp1.lib.client.ResponseWrapper.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof holdkrykke.mp1.lib.client.QueryException) {
              throw (holdkrykke.mp1.lib.client.QueryException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public holdkrykke.mp1.lib.client.ResponseWrapper getReferences(java.lang.String id, java.lang.String source, java.lang.Integer offSet, java.lang.String pageSize, java.lang.String email) throws java.rmi.RemoteException, holdkrykke.mp1.lib.client.QueryException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "getReferences"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {id, source, offSet, pageSize, email});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (holdkrykke.mp1.lib.client.ResponseWrapper) _resp;
            } catch (java.lang.Exception _exception) {
                return (holdkrykke.mp1.lib.client.ResponseWrapper) org.apache.axis.utils.JavaUtils.convert(_resp, holdkrykke.mp1.lib.client.ResponseWrapper.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof holdkrykke.mp1.lib.client.QueryException) {
              throw (holdkrykke.mp1.lib.client.QueryException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public holdkrykke.mp1.lib.client.ResponseWrapper getDatabaseLinks(java.lang.String id, java.lang.String source, java.lang.String database, java.lang.Integer offSet, java.lang.String pageSize, java.lang.String email) throws java.rmi.RemoteException, holdkrykke.mp1.lib.client.QueryException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "getDatabaseLinks"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {id, source, database, offSet, pageSize, email});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (holdkrykke.mp1.lib.client.ResponseWrapper) _resp;
            } catch (java.lang.Exception _exception) {
                return (holdkrykke.mp1.lib.client.ResponseWrapper) org.apache.axis.utils.JavaUtils.convert(_resp, holdkrykke.mp1.lib.client.ResponseWrapper.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof holdkrykke.mp1.lib.client.QueryException) {
              throw (holdkrykke.mp1.lib.client.QueryException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public holdkrykke.mp1.lib.client.Result getSupplementaryFiles(java.lang.String id, java.lang.String source, java.lang.String inlineImages, java.lang.String email) throws java.rmi.RemoteException, holdkrykke.mp1.lib.client.QueryException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "getSupplementaryFiles"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {id, source, inlineImages, email});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (holdkrykke.mp1.lib.client.Result) _resp;
            } catch (java.lang.Exception _exception) {
                return (holdkrykke.mp1.lib.client.Result) org.apache.axis.utils.JavaUtils.convert(_resp, holdkrykke.mp1.lib.client.Result.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof holdkrykke.mp1.lib.client.QueryException) {
              throw (holdkrykke.mp1.lib.client.QueryException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public holdkrykke.mp1.lib.client.Result getFulltextXML(java.lang.String id, java.lang.String source, java.lang.String email) throws java.rmi.RemoteException, holdkrykke.mp1.lib.client.QueryException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "getFulltextXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {id, source, email});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (holdkrykke.mp1.lib.client.Result) _resp;
            } catch (java.lang.Exception _exception) {
                return (holdkrykke.mp1.lib.client.Result) org.apache.axis.utils.JavaUtils.convert(_resp, holdkrykke.mp1.lib.client.Result.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof holdkrykke.mp1.lib.client.QueryException) {
              throw (holdkrykke.mp1.lib.client.QueryException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public holdkrykke.mp1.lib.client.Result getBookXML(java.lang.String id, java.lang.String source, java.lang.String email) throws java.rmi.RemoteException, holdkrykke.mp1.lib.client.QueryException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "getBookXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {id, source, email});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (holdkrykke.mp1.lib.client.Result) _resp;
            } catch (java.lang.Exception _exception) {
                return (holdkrykke.mp1.lib.client.Result) org.apache.axis.utils.JavaUtils.convert(_resp, holdkrykke.mp1.lib.client.Result.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof holdkrykke.mp1.lib.client.QueryException) {
              throw (holdkrykke.mp1.lib.client.QueryException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public holdkrykke.mp1.lib.client.ResponseWrapper listSearchFields(java.lang.String email) throws java.rmi.RemoteException, holdkrykke.mp1.lib.client.QueryException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "listSearchFields"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {email});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (holdkrykke.mp1.lib.client.ResponseWrapper) _resp;
            } catch (java.lang.Exception _exception) {
                return (holdkrykke.mp1.lib.client.ResponseWrapper) org.apache.axis.utils.JavaUtils.convert(_resp, holdkrykke.mp1.lib.client.ResponseWrapper.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof holdkrykke.mp1.lib.client.QueryException) {
              throw (holdkrykke.mp1.lib.client.QueryException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
