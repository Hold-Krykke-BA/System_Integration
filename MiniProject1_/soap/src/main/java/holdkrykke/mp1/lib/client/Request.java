/**
 * Request.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package holdkrykke.mp1.lib.client;

public class Request  implements java.io.Serializable {
    private java.lang.String queryString;

    private java.lang.String internalQuery;

    private java.lang.String resultType;

    private java.lang.String profileType;

    private java.lang.String id;

    private java.lang.String source;

    private java.lang.String category;

    private java.lang.String tags;

    private java.lang.String obtainedBy;

    private java.lang.String fromDate;

    private java.lang.Integer sectionLimit;

    private java.lang.Integer offSet;

    private java.lang.String cursorMark;

    private java.lang.Integer pageSize;

    private java.lang.String sort;

    private java.lang.String database;

    private java.lang.String semanticType;

    private java.lang.Boolean synonym;

    private java.lang.Boolean inlineImages;

    private java.lang.String email;

    private java.lang.String providerId;

    private java.lang.String format;

    private java.lang.String callback;

    private java.lang.String debug;

    public Request() {
    }

    public Request(
           java.lang.String queryString,
           java.lang.String internalQuery,
           java.lang.String resultType,
           java.lang.String profileType,
           java.lang.String id,
           java.lang.String source,
           java.lang.String category,
           java.lang.String tags,
           java.lang.String obtainedBy,
           java.lang.String fromDate,
           java.lang.Integer sectionLimit,
           java.lang.Integer offSet,
           java.lang.String cursorMark,
           java.lang.Integer pageSize,
           java.lang.String sort,
           java.lang.String database,
           java.lang.String semanticType,
           java.lang.Boolean synonym,
           java.lang.Boolean inlineImages,
           java.lang.String email,
           java.lang.String providerId,
           java.lang.String format,
           java.lang.String callback,
           java.lang.String debug) {
           this.queryString = queryString;
           this.internalQuery = internalQuery;
           this.resultType = resultType;
           this.profileType = profileType;
           this.id = id;
           this.source = source;
           this.category = category;
           this.tags = tags;
           this.obtainedBy = obtainedBy;
           this.fromDate = fromDate;
           this.sectionLimit = sectionLimit;
           this.offSet = offSet;
           this.cursorMark = cursorMark;
           this.pageSize = pageSize;
           this.sort = sort;
           this.database = database;
           this.semanticType = semanticType;
           this.synonym = synonym;
           this.inlineImages = inlineImages;
           this.email = email;
           this.providerId = providerId;
           this.format = format;
           this.callback = callback;
           this.debug = debug;
    }


    /**
     * Gets the queryString value for this Request.
     * 
     * @return queryString
     */
    public java.lang.String getQueryString() {
        return queryString;
    }


    /**
     * Sets the queryString value for this Request.
     * 
     * @param queryString
     */
    public void setQueryString(java.lang.String queryString) {
        this.queryString = queryString;
    }


    /**
     * Gets the internalQuery value for this Request.
     * 
     * @return internalQuery
     */
    public java.lang.String getInternalQuery() {
        return internalQuery;
    }


    /**
     * Sets the internalQuery value for this Request.
     * 
     * @param internalQuery
     */
    public void setInternalQuery(java.lang.String internalQuery) {
        this.internalQuery = internalQuery;
    }


    /**
     * Gets the resultType value for this Request.
     * 
     * @return resultType
     */
    public java.lang.String getResultType() {
        return resultType;
    }


    /**
     * Sets the resultType value for this Request.
     * 
     * @param resultType
     */
    public void setResultType(java.lang.String resultType) {
        this.resultType = resultType;
    }


    /**
     * Gets the profileType value for this Request.
     * 
     * @return profileType
     */
    public java.lang.String getProfileType() {
        return profileType;
    }


    /**
     * Sets the profileType value for this Request.
     * 
     * @param profileType
     */
    public void setProfileType(java.lang.String profileType) {
        this.profileType = profileType;
    }


    /**
     * Gets the id value for this Request.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this Request.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the source value for this Request.
     * 
     * @return source
     */
    public java.lang.String getSource() {
        return source;
    }


    /**
     * Sets the source value for this Request.
     * 
     * @param source
     */
    public void setSource(java.lang.String source) {
        this.source = source;
    }


    /**
     * Gets the category value for this Request.
     * 
     * @return category
     */
    public java.lang.String getCategory() {
        return category;
    }


    /**
     * Sets the category value for this Request.
     * 
     * @param category
     */
    public void setCategory(java.lang.String category) {
        this.category = category;
    }


    /**
     * Gets the tags value for this Request.
     * 
     * @return tags
     */
    public java.lang.String getTags() {
        return tags;
    }


    /**
     * Sets the tags value for this Request.
     * 
     * @param tags
     */
    public void setTags(java.lang.String tags) {
        this.tags = tags;
    }


    /**
     * Gets the obtainedBy value for this Request.
     * 
     * @return obtainedBy
     */
    public java.lang.String getObtainedBy() {
        return obtainedBy;
    }


    /**
     * Sets the obtainedBy value for this Request.
     * 
     * @param obtainedBy
     */
    public void setObtainedBy(java.lang.String obtainedBy) {
        this.obtainedBy = obtainedBy;
    }


    /**
     * Gets the fromDate value for this Request.
     * 
     * @return fromDate
     */
    public java.lang.String getFromDate() {
        return fromDate;
    }


    /**
     * Sets the fromDate value for this Request.
     * 
     * @param fromDate
     */
    public void setFromDate(java.lang.String fromDate) {
        this.fromDate = fromDate;
    }


    /**
     * Gets the sectionLimit value for this Request.
     * 
     * @return sectionLimit
     */
    public java.lang.Integer getSectionLimit() {
        return sectionLimit;
    }


    /**
     * Sets the sectionLimit value for this Request.
     * 
     * @param sectionLimit
     */
    public void setSectionLimit(java.lang.Integer sectionLimit) {
        this.sectionLimit = sectionLimit;
    }


    /**
     * Gets the offSet value for this Request.
     * 
     * @return offSet
     */
    public java.lang.Integer getOffSet() {
        return offSet;
    }


    /**
     * Sets the offSet value for this Request.
     * 
     * @param offSet
     */
    public void setOffSet(java.lang.Integer offSet) {
        this.offSet = offSet;
    }


    /**
     * Gets the cursorMark value for this Request.
     * 
     * @return cursorMark
     */
    public java.lang.String getCursorMark() {
        return cursorMark;
    }


    /**
     * Sets the cursorMark value for this Request.
     * 
     * @param cursorMark
     */
    public void setCursorMark(java.lang.String cursorMark) {
        this.cursorMark = cursorMark;
    }


    /**
     * Gets the pageSize value for this Request.
     * 
     * @return pageSize
     */
    public java.lang.Integer getPageSize() {
        return pageSize;
    }


    /**
     * Sets the pageSize value for this Request.
     * 
     * @param pageSize
     */
    public void setPageSize(java.lang.Integer pageSize) {
        this.pageSize = pageSize;
    }


    /**
     * Gets the sort value for this Request.
     * 
     * @return sort
     */
    public java.lang.String getSort() {
        return sort;
    }


    /**
     * Sets the sort value for this Request.
     * 
     * @param sort
     */
    public void setSort(java.lang.String sort) {
        this.sort = sort;
    }


    /**
     * Gets the database value for this Request.
     * 
     * @return database
     */
    public java.lang.String getDatabase() {
        return database;
    }


    /**
     * Sets the database value for this Request.
     * 
     * @param database
     */
    public void setDatabase(java.lang.String database) {
        this.database = database;
    }


    /**
     * Gets the semanticType value for this Request.
     * 
     * @return semanticType
     */
    public java.lang.String getSemanticType() {
        return semanticType;
    }


    /**
     * Sets the semanticType value for this Request.
     * 
     * @param semanticType
     */
    public void setSemanticType(java.lang.String semanticType) {
        this.semanticType = semanticType;
    }


    /**
     * Gets the synonym value for this Request.
     * 
     * @return synonym
     */
    public java.lang.Boolean getSynonym() {
        return synonym;
    }


    /**
     * Sets the synonym value for this Request.
     * 
     * @param synonym
     */
    public void setSynonym(java.lang.Boolean synonym) {
        this.synonym = synonym;
    }


    /**
     * Gets the inlineImages value for this Request.
     * 
     * @return inlineImages
     */
    public java.lang.Boolean getInlineImages() {
        return inlineImages;
    }


    /**
     * Sets the inlineImages value for this Request.
     * 
     * @param inlineImages
     */
    public void setInlineImages(java.lang.Boolean inlineImages) {
        this.inlineImages = inlineImages;
    }


    /**
     * Gets the email value for this Request.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this Request.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the providerId value for this Request.
     * 
     * @return providerId
     */
    public java.lang.String getProviderId() {
        return providerId;
    }


    /**
     * Sets the providerId value for this Request.
     * 
     * @param providerId
     */
    public void setProviderId(java.lang.String providerId) {
        this.providerId = providerId;
    }


    /**
     * Gets the format value for this Request.
     * 
     * @return format
     */
    public java.lang.String getFormat() {
        return format;
    }


    /**
     * Sets the format value for this Request.
     * 
     * @param format
     */
    public void setFormat(java.lang.String format) {
        this.format = format;
    }


    /**
     * Gets the callback value for this Request.
     * 
     * @return callback
     */
    public java.lang.String getCallback() {
        return callback;
    }


    /**
     * Sets the callback value for this Request.
     * 
     * @param callback
     */
    public void setCallback(java.lang.String callback) {
        this.callback = callback;
    }


    /**
     * Gets the debug value for this Request.
     * 
     * @return debug
     */
    public java.lang.String getDebug() {
        return debug;
    }


    /**
     * Sets the debug value for this Request.
     * 
     * @param debug
     */
    public void setDebug(java.lang.String debug) {
        this.debug = debug;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Request)) return false;
        Request other = (Request) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.queryString==null && other.getQueryString()==null) || 
             (this.queryString!=null &&
              this.queryString.equals(other.getQueryString()))) &&
            ((this.internalQuery==null && other.getInternalQuery()==null) || 
             (this.internalQuery!=null &&
              this.internalQuery.equals(other.getInternalQuery()))) &&
            ((this.resultType==null && other.getResultType()==null) || 
             (this.resultType!=null &&
              this.resultType.equals(other.getResultType()))) &&
            ((this.profileType==null && other.getProfileType()==null) || 
             (this.profileType!=null &&
              this.profileType.equals(other.getProfileType()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.tags==null && other.getTags()==null) || 
             (this.tags!=null &&
              this.tags.equals(other.getTags()))) &&
            ((this.obtainedBy==null && other.getObtainedBy()==null) || 
             (this.obtainedBy!=null &&
              this.obtainedBy.equals(other.getObtainedBy()))) &&
            ((this.fromDate==null && other.getFromDate()==null) || 
             (this.fromDate!=null &&
              this.fromDate.equals(other.getFromDate()))) &&
            ((this.sectionLimit==null && other.getSectionLimit()==null) || 
             (this.sectionLimit!=null &&
              this.sectionLimit.equals(other.getSectionLimit()))) &&
            ((this.offSet==null && other.getOffSet()==null) || 
             (this.offSet!=null &&
              this.offSet.equals(other.getOffSet()))) &&
            ((this.cursorMark==null && other.getCursorMark()==null) || 
             (this.cursorMark!=null &&
              this.cursorMark.equals(other.getCursorMark()))) &&
            ((this.pageSize==null && other.getPageSize()==null) || 
             (this.pageSize!=null &&
              this.pageSize.equals(other.getPageSize()))) &&
            ((this.sort==null && other.getSort()==null) || 
             (this.sort!=null &&
              this.sort.equals(other.getSort()))) &&
            ((this.database==null && other.getDatabase()==null) || 
             (this.database!=null &&
              this.database.equals(other.getDatabase()))) &&
            ((this.semanticType==null && other.getSemanticType()==null) || 
             (this.semanticType!=null &&
              this.semanticType.equals(other.getSemanticType()))) &&
            ((this.synonym==null && other.getSynonym()==null) || 
             (this.synonym!=null &&
              this.synonym.equals(other.getSynonym()))) &&
            ((this.inlineImages==null && other.getInlineImages()==null) || 
             (this.inlineImages!=null &&
              this.inlineImages.equals(other.getInlineImages()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.providerId==null && other.getProviderId()==null) || 
             (this.providerId!=null &&
              this.providerId.equals(other.getProviderId()))) &&
            ((this.format==null && other.getFormat()==null) || 
             (this.format!=null &&
              this.format.equals(other.getFormat()))) &&
            ((this.callback==null && other.getCallback()==null) || 
             (this.callback!=null &&
              this.callback.equals(other.getCallback()))) &&
            ((this.debug==null && other.getDebug()==null) || 
             (this.debug!=null &&
              this.debug.equals(other.getDebug())));
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
        if (getQueryString() != null) {
            _hashCode += getQueryString().hashCode();
        }
        if (getInternalQuery() != null) {
            _hashCode += getInternalQuery().hashCode();
        }
        if (getResultType() != null) {
            _hashCode += getResultType().hashCode();
        }
        if (getProfileType() != null) {
            _hashCode += getProfileType().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getTags() != null) {
            _hashCode += getTags().hashCode();
        }
        if (getObtainedBy() != null) {
            _hashCode += getObtainedBy().hashCode();
        }
        if (getFromDate() != null) {
            _hashCode += getFromDate().hashCode();
        }
        if (getSectionLimit() != null) {
            _hashCode += getSectionLimit().hashCode();
        }
        if (getOffSet() != null) {
            _hashCode += getOffSet().hashCode();
        }
        if (getCursorMark() != null) {
            _hashCode += getCursorMark().hashCode();
        }
        if (getPageSize() != null) {
            _hashCode += getPageSize().hashCode();
        }
        if (getSort() != null) {
            _hashCode += getSort().hashCode();
        }
        if (getDatabase() != null) {
            _hashCode += getDatabase().hashCode();
        }
        if (getSemanticType() != null) {
            _hashCode += getSemanticType().hashCode();
        }
        if (getSynonym() != null) {
            _hashCode += getSynonym().hashCode();
        }
        if (getInlineImages() != null) {
            _hashCode += getInlineImages().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getProviderId() != null) {
            _hashCode += getProviderId().hashCode();
        }
        if (getFormat() != null) {
            _hashCode += getFormat().hashCode();
        }
        if (getCallback() != null) {
            _hashCode += getCallback().hashCode();
        }
        if (getDebug() != null) {
            _hashCode += getDebug().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Request.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "request"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryString");
        elemField.setXmlName(new javax.xml.namespace.QName("", "queryString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalQuery");
        elemField.setXmlName(new javax.xml.namespace.QName("", "internalQuery"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resultType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profileType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "profileType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("obtainedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "obtainedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fromDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sectionLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sectionLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offSet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cursorMark");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cursorMark"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pageSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sort");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("database");
        elemField.setXmlName(new javax.xml.namespace.QName("", "database"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("semanticType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "semanticType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("synonym");
        elemField.setXmlName(new javax.xml.namespace.QName("", "synonym"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inlineImages");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inlineImages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("providerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "providerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("format");
        elemField.setXmlName(new javax.xml.namespace.QName("", "format"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callback");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callback"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debug");
        elemField.setXmlName(new javax.xml.namespace.QName("", "debug"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
