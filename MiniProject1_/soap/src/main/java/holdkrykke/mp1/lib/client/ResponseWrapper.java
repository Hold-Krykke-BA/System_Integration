/**
 * ResponseWrapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package holdkrykke.mp1.lib.client;

public class ResponseWrapper  implements java.io.Serializable {
    private java.lang.String version;

    private java.lang.Integer hitCount;

    private java.lang.String nextCursorMark;

    private java.lang.String nextPageUrl;

    private holdkrykke.mp1.lib.client.Request request;

    private holdkrykke.mp1.lib.client.ProfileListBean profileList;

    private holdkrykke.mp1.lib.client.Result[] resultList;

    private holdkrykke.mp1.lib.client.DbCounts[] dbCountList;

    private holdkrykke.mp1.lib.client.DbCrossReference[] dbCrossReferenceList;

    private holdkrykke.mp1.lib.client.CitationData[] citationList;

    private holdkrykke.mp1.lib.client.ReferenceInfo[] referenceList;

    private holdkrykke.mp1.lib.client.SemanticCounts[] semanticTypeCountList;

    private holdkrykke.mp1.lib.client.MinedTerms[] semanticTypeList;

    private holdkrykke.mp1.lib.client.SearchTerm[] searchTermList;

    private holdkrykke.mp1.lib.client.FullTextXML fullTextXML;

    private holdkrykke.mp1.lib.client.LabsProviderCounts[] linksCountList;

    private holdkrykke.mp1.lib.client.LabsProvider[] providers;

    private holdkrykke.mp1.lib.client.Category[] dataLinkList;

    private holdkrykke.mp1.lib.client.FullTextImage[] fullTextImageList;

    public ResponseWrapper() {
    }

    public ResponseWrapper(
           java.lang.String version,
           java.lang.Integer hitCount,
           java.lang.String nextCursorMark,
           java.lang.String nextPageUrl,
           holdkrykke.mp1.lib.client.Request request,
           holdkrykke.mp1.lib.client.ProfileListBean profileList,
           holdkrykke.mp1.lib.client.Result[] resultList,
           holdkrykke.mp1.lib.client.DbCounts[] dbCountList,
           holdkrykke.mp1.lib.client.DbCrossReference[] dbCrossReferenceList,
           holdkrykke.mp1.lib.client.CitationData[] citationList,
           holdkrykke.mp1.lib.client.ReferenceInfo[] referenceList,
           holdkrykke.mp1.lib.client.SemanticCounts[] semanticTypeCountList,
           holdkrykke.mp1.lib.client.MinedTerms[] semanticTypeList,
           holdkrykke.mp1.lib.client.SearchTerm[] searchTermList,
           holdkrykke.mp1.lib.client.FullTextXML fullTextXML,
           holdkrykke.mp1.lib.client.LabsProviderCounts[] linksCountList,
           holdkrykke.mp1.lib.client.LabsProvider[] providers,
           holdkrykke.mp1.lib.client.Category[] dataLinkList,
           holdkrykke.mp1.lib.client.FullTextImage[] fullTextImageList) {
           this.version = version;
           this.hitCount = hitCount;
           this.nextCursorMark = nextCursorMark;
           this.nextPageUrl = nextPageUrl;
           this.request = request;
           this.profileList = profileList;
           this.resultList = resultList;
           this.dbCountList = dbCountList;
           this.dbCrossReferenceList = dbCrossReferenceList;
           this.citationList = citationList;
           this.referenceList = referenceList;
           this.semanticTypeCountList = semanticTypeCountList;
           this.semanticTypeList = semanticTypeList;
           this.searchTermList = searchTermList;
           this.fullTextXML = fullTextXML;
           this.linksCountList = linksCountList;
           this.providers = providers;
           this.dataLinkList = dataLinkList;
           this.fullTextImageList = fullTextImageList;
    }


    /**
     * Gets the version value for this ResponseWrapper.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this ResponseWrapper.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the hitCount value for this ResponseWrapper.
     * 
     * @return hitCount
     */
    public java.lang.Integer getHitCount() {
        return hitCount;
    }


    /**
     * Sets the hitCount value for this ResponseWrapper.
     * 
     * @param hitCount
     */
    public void setHitCount(java.lang.Integer hitCount) {
        this.hitCount = hitCount;
    }


    /**
     * Gets the nextCursorMark value for this ResponseWrapper.
     * 
     * @return nextCursorMark
     */
    public java.lang.String getNextCursorMark() {
        return nextCursorMark;
    }


    /**
     * Sets the nextCursorMark value for this ResponseWrapper.
     * 
     * @param nextCursorMark
     */
    public void setNextCursorMark(java.lang.String nextCursorMark) {
        this.nextCursorMark = nextCursorMark;
    }


    /**
     * Gets the nextPageUrl value for this ResponseWrapper.
     * 
     * @return nextPageUrl
     */
    public java.lang.String getNextPageUrl() {
        return nextPageUrl;
    }


    /**
     * Sets the nextPageUrl value for this ResponseWrapper.
     * 
     * @param nextPageUrl
     */
    public void setNextPageUrl(java.lang.String nextPageUrl) {
        this.nextPageUrl = nextPageUrl;
    }


    /**
     * Gets the request value for this ResponseWrapper.
     * 
     * @return request
     */
    public holdkrykke.mp1.lib.client.Request getRequest() {
        return request;
    }


    /**
     * Sets the request value for this ResponseWrapper.
     * 
     * @param request
     */
    public void setRequest(holdkrykke.mp1.lib.client.Request request) {
        this.request = request;
    }


    /**
     * Gets the profileList value for this ResponseWrapper.
     * 
     * @return profileList
     */
    public holdkrykke.mp1.lib.client.ProfileListBean getProfileList() {
        return profileList;
    }


    /**
     * Sets the profileList value for this ResponseWrapper.
     * 
     * @param profileList
     */
    public void setProfileList(holdkrykke.mp1.lib.client.ProfileListBean profileList) {
        this.profileList = profileList;
    }


    /**
     * Gets the resultList value for this ResponseWrapper.
     * 
     * @return resultList
     */
    public holdkrykke.mp1.lib.client.Result[] getResultList() {
        return resultList;
    }


    /**
     * Sets the resultList value for this ResponseWrapper.
     * 
     * @param resultList
     */
    public void setResultList(holdkrykke.mp1.lib.client.Result[] resultList) {
        this.resultList = resultList;
    }


    /**
     * Gets the dbCountList value for this ResponseWrapper.
     * 
     * @return dbCountList
     */
    public holdkrykke.mp1.lib.client.DbCounts[] getDbCountList() {
        return dbCountList;
    }


    /**
     * Sets the dbCountList value for this ResponseWrapper.
     * 
     * @param dbCountList
     */
    public void setDbCountList(holdkrykke.mp1.lib.client.DbCounts[] dbCountList) {
        this.dbCountList = dbCountList;
    }


    /**
     * Gets the dbCrossReferenceList value for this ResponseWrapper.
     * 
     * @return dbCrossReferenceList
     */
    public holdkrykke.mp1.lib.client.DbCrossReference[] getDbCrossReferenceList() {
        return dbCrossReferenceList;
    }


    /**
     * Sets the dbCrossReferenceList value for this ResponseWrapper.
     * 
     * @param dbCrossReferenceList
     */
    public void setDbCrossReferenceList(holdkrykke.mp1.lib.client.DbCrossReference[] dbCrossReferenceList) {
        this.dbCrossReferenceList = dbCrossReferenceList;
    }


    /**
     * Gets the citationList value for this ResponseWrapper.
     * 
     * @return citationList
     */
    public holdkrykke.mp1.lib.client.CitationData[] getCitationList() {
        return citationList;
    }


    /**
     * Sets the citationList value for this ResponseWrapper.
     * 
     * @param citationList
     */
    public void setCitationList(holdkrykke.mp1.lib.client.CitationData[] citationList) {
        this.citationList = citationList;
    }


    /**
     * Gets the referenceList value for this ResponseWrapper.
     * 
     * @return referenceList
     */
    public holdkrykke.mp1.lib.client.ReferenceInfo[] getReferenceList() {
        return referenceList;
    }


    /**
     * Sets the referenceList value for this ResponseWrapper.
     * 
     * @param referenceList
     */
    public void setReferenceList(holdkrykke.mp1.lib.client.ReferenceInfo[] referenceList) {
        this.referenceList = referenceList;
    }


    /**
     * Gets the semanticTypeCountList value for this ResponseWrapper.
     * 
     * @return semanticTypeCountList
     */
    public holdkrykke.mp1.lib.client.SemanticCounts[] getSemanticTypeCountList() {
        return semanticTypeCountList;
    }


    /**
     * Sets the semanticTypeCountList value for this ResponseWrapper.
     * 
     * @param semanticTypeCountList
     */
    public void setSemanticTypeCountList(holdkrykke.mp1.lib.client.SemanticCounts[] semanticTypeCountList) {
        this.semanticTypeCountList = semanticTypeCountList;
    }


    /**
     * Gets the semanticTypeList value for this ResponseWrapper.
     * 
     * @return semanticTypeList
     */
    public holdkrykke.mp1.lib.client.MinedTerms[] getSemanticTypeList() {
        return semanticTypeList;
    }


    /**
     * Sets the semanticTypeList value for this ResponseWrapper.
     * 
     * @param semanticTypeList
     */
    public void setSemanticTypeList(holdkrykke.mp1.lib.client.MinedTerms[] semanticTypeList) {
        this.semanticTypeList = semanticTypeList;
    }


    /**
     * Gets the searchTermList value for this ResponseWrapper.
     * 
     * @return searchTermList
     */
    public holdkrykke.mp1.lib.client.SearchTerm[] getSearchTermList() {
        return searchTermList;
    }


    /**
     * Sets the searchTermList value for this ResponseWrapper.
     * 
     * @param searchTermList
     */
    public void setSearchTermList(holdkrykke.mp1.lib.client.SearchTerm[] searchTermList) {
        this.searchTermList = searchTermList;
    }


    /**
     * Gets the fullTextXML value for this ResponseWrapper.
     * 
     * @return fullTextXML
     */
    public holdkrykke.mp1.lib.client.FullTextXML getFullTextXML() {
        return fullTextXML;
    }


    /**
     * Sets the fullTextXML value for this ResponseWrapper.
     * 
     * @param fullTextXML
     */
    public void setFullTextXML(holdkrykke.mp1.lib.client.FullTextXML fullTextXML) {
        this.fullTextXML = fullTextXML;
    }


    /**
     * Gets the linksCountList value for this ResponseWrapper.
     * 
     * @return linksCountList
     */
    public holdkrykke.mp1.lib.client.LabsProviderCounts[] getLinksCountList() {
        return linksCountList;
    }


    /**
     * Sets the linksCountList value for this ResponseWrapper.
     * 
     * @param linksCountList
     */
    public void setLinksCountList(holdkrykke.mp1.lib.client.LabsProviderCounts[] linksCountList) {
        this.linksCountList = linksCountList;
    }


    /**
     * Gets the providers value for this ResponseWrapper.
     * 
     * @return providers
     */
    public holdkrykke.mp1.lib.client.LabsProvider[] getProviders() {
        return providers;
    }


    /**
     * Sets the providers value for this ResponseWrapper.
     * 
     * @param providers
     */
    public void setProviders(holdkrykke.mp1.lib.client.LabsProvider[] providers) {
        this.providers = providers;
    }


    /**
     * Gets the dataLinkList value for this ResponseWrapper.
     * 
     * @return dataLinkList
     */
    public holdkrykke.mp1.lib.client.Category[] getDataLinkList() {
        return dataLinkList;
    }


    /**
     * Sets the dataLinkList value for this ResponseWrapper.
     * 
     * @param dataLinkList
     */
    public void setDataLinkList(holdkrykke.mp1.lib.client.Category[] dataLinkList) {
        this.dataLinkList = dataLinkList;
    }


    /**
     * Gets the fullTextImageList value for this ResponseWrapper.
     * 
     * @return fullTextImageList
     */
    public holdkrykke.mp1.lib.client.FullTextImage[] getFullTextImageList() {
        return fullTextImageList;
    }


    /**
     * Sets the fullTextImageList value for this ResponseWrapper.
     * 
     * @param fullTextImageList
     */
    public void setFullTextImageList(holdkrykke.mp1.lib.client.FullTextImage[] fullTextImageList) {
        this.fullTextImageList = fullTextImageList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResponseWrapper)) return false;
        ResponseWrapper other = (ResponseWrapper) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.hitCount==null && other.getHitCount()==null) || 
             (this.hitCount!=null &&
              this.hitCount.equals(other.getHitCount()))) &&
            ((this.nextCursorMark==null && other.getNextCursorMark()==null) || 
             (this.nextCursorMark!=null &&
              this.nextCursorMark.equals(other.getNextCursorMark()))) &&
            ((this.nextPageUrl==null && other.getNextPageUrl()==null) || 
             (this.nextPageUrl!=null &&
              this.nextPageUrl.equals(other.getNextPageUrl()))) &&
            ((this.request==null && other.getRequest()==null) || 
             (this.request!=null &&
              this.request.equals(other.getRequest()))) &&
            ((this.profileList==null && other.getProfileList()==null) || 
             (this.profileList!=null &&
              this.profileList.equals(other.getProfileList()))) &&
            ((this.resultList==null && other.getResultList()==null) || 
             (this.resultList!=null &&
              java.util.Arrays.equals(this.resultList, other.getResultList()))) &&
            ((this.dbCountList==null && other.getDbCountList()==null) || 
             (this.dbCountList!=null &&
              java.util.Arrays.equals(this.dbCountList, other.getDbCountList()))) &&
            ((this.dbCrossReferenceList==null && other.getDbCrossReferenceList()==null) || 
             (this.dbCrossReferenceList!=null &&
              java.util.Arrays.equals(this.dbCrossReferenceList, other.getDbCrossReferenceList()))) &&
            ((this.citationList==null && other.getCitationList()==null) || 
             (this.citationList!=null &&
              java.util.Arrays.equals(this.citationList, other.getCitationList()))) &&
            ((this.referenceList==null && other.getReferenceList()==null) || 
             (this.referenceList!=null &&
              java.util.Arrays.equals(this.referenceList, other.getReferenceList()))) &&
            ((this.semanticTypeCountList==null && other.getSemanticTypeCountList()==null) || 
             (this.semanticTypeCountList!=null &&
              java.util.Arrays.equals(this.semanticTypeCountList, other.getSemanticTypeCountList()))) &&
            ((this.semanticTypeList==null && other.getSemanticTypeList()==null) || 
             (this.semanticTypeList!=null &&
              java.util.Arrays.equals(this.semanticTypeList, other.getSemanticTypeList()))) &&
            ((this.searchTermList==null && other.getSearchTermList()==null) || 
             (this.searchTermList!=null &&
              java.util.Arrays.equals(this.searchTermList, other.getSearchTermList()))) &&
            ((this.fullTextXML==null && other.getFullTextXML()==null) || 
             (this.fullTextXML!=null &&
              this.fullTextXML.equals(other.getFullTextXML()))) &&
            ((this.linksCountList==null && other.getLinksCountList()==null) || 
             (this.linksCountList!=null &&
              java.util.Arrays.equals(this.linksCountList, other.getLinksCountList()))) &&
            ((this.providers==null && other.getProviders()==null) || 
             (this.providers!=null &&
              java.util.Arrays.equals(this.providers, other.getProviders()))) &&
            ((this.dataLinkList==null && other.getDataLinkList()==null) || 
             (this.dataLinkList!=null &&
              java.util.Arrays.equals(this.dataLinkList, other.getDataLinkList()))) &&
            ((this.fullTextImageList==null && other.getFullTextImageList()==null) || 
             (this.fullTextImageList!=null &&
              java.util.Arrays.equals(this.fullTextImageList, other.getFullTextImageList())));
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
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getHitCount() != null) {
            _hashCode += getHitCount().hashCode();
        }
        if (getNextCursorMark() != null) {
            _hashCode += getNextCursorMark().hashCode();
        }
        if (getNextPageUrl() != null) {
            _hashCode += getNextPageUrl().hashCode();
        }
        if (getRequest() != null) {
            _hashCode += getRequest().hashCode();
        }
        if (getProfileList() != null) {
            _hashCode += getProfileList().hashCode();
        }
        if (getResultList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResultList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResultList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDbCountList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDbCountList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDbCountList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDbCrossReferenceList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDbCrossReferenceList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDbCrossReferenceList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCitationList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCitationList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCitationList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReferenceList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReferenceList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReferenceList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSemanticTypeCountList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSemanticTypeCountList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSemanticTypeCountList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSemanticTypeList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSemanticTypeList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSemanticTypeList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSearchTermList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSearchTermList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSearchTermList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFullTextXML() != null) {
            _hashCode += getFullTextXML().hashCode();
        }
        if (getLinksCountList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLinksCountList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLinksCountList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProviders() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProviders());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProviders(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDataLinkList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDataLinkList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDataLinkList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFullTextImageList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFullTextImageList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFullTextImageList(), i);
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
        new org.apache.axis.description.TypeDesc(ResponseWrapper.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "responseWrapper"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hitCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hitCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextCursorMark");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nextCursorMark"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextPageUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nextPageUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("request");
        elemField.setXmlName(new javax.xml.namespace.QName("", "request"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "request"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profileList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "profileList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "profileListBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resultList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "result"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "result"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dbCountList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dbCountList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "dbCounts"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "db"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dbCrossReferenceList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dbCrossReferenceList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "dbCrossReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "dbCrossReference"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("citationList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "citationList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "CitationData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "citation"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "referenceList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "referenceInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "reference"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("semanticTypeCountList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "semanticTypeCountList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "semanticCounts"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "semanticType"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("semanticTypeList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "semanticTypeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "minedTerms"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "semanticType"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchTermList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "searchTermList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "SearchTerm"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "searchTerms"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullTextXML");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fullTextXML"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "fullTextXML"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linksCountList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "linksCountList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "labsProviderCounts"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "provider"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("providers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "providers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "labsProvider"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "provider"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataLinkList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataLinkList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.europepmc.org/data", "Category"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://www.europepmc.org/data", "Category"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullTextImageList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fullTextImageList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "fullTextImage"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "fullTextImage"));
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
