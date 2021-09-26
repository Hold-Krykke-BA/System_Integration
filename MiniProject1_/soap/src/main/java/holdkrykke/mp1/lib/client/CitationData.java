/**
 * CitationData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package holdkrykke.mp1.lib.client;

public class CitationData  implements java.io.Serializable {
    private java.lang.String id;

    private java.lang.String source;

    private java.lang.String citationType;

    private java.lang.String title;

    private java.lang.String authorString;

    private java.lang.String journalAbbreviation;

    private int pubYear;

    private java.lang.String volume;

    private java.lang.String ISSN;

    private java.lang.String issue;

    private java.lang.String pageInfo;

    private int citedByCount;

    private java.lang.String text;

    public CitationData() {
    }

    public CitationData(
           java.lang.String id,
           java.lang.String source,
           java.lang.String citationType,
           java.lang.String title,
           java.lang.String authorString,
           java.lang.String journalAbbreviation,
           int pubYear,
           java.lang.String volume,
           java.lang.String ISSN,
           java.lang.String issue,
           java.lang.String pageInfo,
           int citedByCount,
           java.lang.String text) {
           this.id = id;
           this.source = source;
           this.citationType = citationType;
           this.title = title;
           this.authorString = authorString;
           this.journalAbbreviation = journalAbbreviation;
           this.pubYear = pubYear;
           this.volume = volume;
           this.ISSN = ISSN;
           this.issue = issue;
           this.pageInfo = pageInfo;
           this.citedByCount = citedByCount;
           this.text = text;
    }


    /**
     * Gets the id value for this CitationData.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this CitationData.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the source value for this CitationData.
     * 
     * @return source
     */
    public java.lang.String getSource() {
        return source;
    }


    /**
     * Sets the source value for this CitationData.
     * 
     * @param source
     */
    public void setSource(java.lang.String source) {
        this.source = source;
    }


    /**
     * Gets the citationType value for this CitationData.
     * 
     * @return citationType
     */
    public java.lang.String getCitationType() {
        return citationType;
    }


    /**
     * Sets the citationType value for this CitationData.
     * 
     * @param citationType
     */
    public void setCitationType(java.lang.String citationType) {
        this.citationType = citationType;
    }


    /**
     * Gets the title value for this CitationData.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this CitationData.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the authorString value for this CitationData.
     * 
     * @return authorString
     */
    public java.lang.String getAuthorString() {
        return authorString;
    }


    /**
     * Sets the authorString value for this CitationData.
     * 
     * @param authorString
     */
    public void setAuthorString(java.lang.String authorString) {
        this.authorString = authorString;
    }


    /**
     * Gets the journalAbbreviation value for this CitationData.
     * 
     * @return journalAbbreviation
     */
    public java.lang.String getJournalAbbreviation() {
        return journalAbbreviation;
    }


    /**
     * Sets the journalAbbreviation value for this CitationData.
     * 
     * @param journalAbbreviation
     */
    public void setJournalAbbreviation(java.lang.String journalAbbreviation) {
        this.journalAbbreviation = journalAbbreviation;
    }


    /**
     * Gets the pubYear value for this CitationData.
     * 
     * @return pubYear
     */
    public int getPubYear() {
        return pubYear;
    }


    /**
     * Sets the pubYear value for this CitationData.
     * 
     * @param pubYear
     */
    public void setPubYear(int pubYear) {
        this.pubYear = pubYear;
    }


    /**
     * Gets the volume value for this CitationData.
     * 
     * @return volume
     */
    public java.lang.String getVolume() {
        return volume;
    }


    /**
     * Sets the volume value for this CitationData.
     * 
     * @param volume
     */
    public void setVolume(java.lang.String volume) {
        this.volume = volume;
    }


    /**
     * Gets the ISSN value for this CitationData.
     * 
     * @return ISSN
     */
    public java.lang.String getISSN() {
        return ISSN;
    }


    /**
     * Sets the ISSN value for this CitationData.
     * 
     * @param ISSN
     */
    public void setISSN(java.lang.String ISSN) {
        this.ISSN = ISSN;
    }


    /**
     * Gets the issue value for this CitationData.
     * 
     * @return issue
     */
    public java.lang.String getIssue() {
        return issue;
    }


    /**
     * Sets the issue value for this CitationData.
     * 
     * @param issue
     */
    public void setIssue(java.lang.String issue) {
        this.issue = issue;
    }


    /**
     * Gets the pageInfo value for this CitationData.
     * 
     * @return pageInfo
     */
    public java.lang.String getPageInfo() {
        return pageInfo;
    }


    /**
     * Sets the pageInfo value for this CitationData.
     * 
     * @param pageInfo
     */
    public void setPageInfo(java.lang.String pageInfo) {
        this.pageInfo = pageInfo;
    }


    /**
     * Gets the citedByCount value for this CitationData.
     * 
     * @return citedByCount
     */
    public int getCitedByCount() {
        return citedByCount;
    }


    /**
     * Sets the citedByCount value for this CitationData.
     * 
     * @param citedByCount
     */
    public void setCitedByCount(int citedByCount) {
        this.citedByCount = citedByCount;
    }


    /**
     * Gets the text value for this CitationData.
     * 
     * @return text
     */
    public java.lang.String getText() {
        return text;
    }


    /**
     * Sets the text value for this CitationData.
     * 
     * @param text
     */
    public void setText(java.lang.String text) {
        this.text = text;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CitationData)) return false;
        CitationData other = (CitationData) obj;
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
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.citationType==null && other.getCitationType()==null) || 
             (this.citationType!=null &&
              this.citationType.equals(other.getCitationType()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.authorString==null && other.getAuthorString()==null) || 
             (this.authorString!=null &&
              this.authorString.equals(other.getAuthorString()))) &&
            ((this.journalAbbreviation==null && other.getJournalAbbreviation()==null) || 
             (this.journalAbbreviation!=null &&
              this.journalAbbreviation.equals(other.getJournalAbbreviation()))) &&
            this.pubYear == other.getPubYear() &&
            ((this.volume==null && other.getVolume()==null) || 
             (this.volume!=null &&
              this.volume.equals(other.getVolume()))) &&
            ((this.ISSN==null && other.getISSN()==null) || 
             (this.ISSN!=null &&
              this.ISSN.equals(other.getISSN()))) &&
            ((this.issue==null && other.getIssue()==null) || 
             (this.issue!=null &&
              this.issue.equals(other.getIssue()))) &&
            ((this.pageInfo==null && other.getPageInfo()==null) || 
             (this.pageInfo!=null &&
              this.pageInfo.equals(other.getPageInfo()))) &&
            this.citedByCount == other.getCitedByCount() &&
            ((this.text==null && other.getText()==null) || 
             (this.text!=null &&
              this.text.equals(other.getText())));
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
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getCitationType() != null) {
            _hashCode += getCitationType().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getAuthorString() != null) {
            _hashCode += getAuthorString().hashCode();
        }
        if (getJournalAbbreviation() != null) {
            _hashCode += getJournalAbbreviation().hashCode();
        }
        _hashCode += getPubYear();
        if (getVolume() != null) {
            _hashCode += getVolume().hashCode();
        }
        if (getISSN() != null) {
            _hashCode += getISSN().hashCode();
        }
        if (getIssue() != null) {
            _hashCode += getIssue().hashCode();
        }
        if (getPageInfo() != null) {
            _hashCode += getPageInfo().hashCode();
        }
        _hashCode += getCitedByCount();
        if (getText() != null) {
            _hashCode += getText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CitationData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "CitationData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("citationType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "citationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorString");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authorString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("journalAbbreviation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "journalAbbreviation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pubYear");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pubYear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("volume");
        elemField.setXmlName(new javax.xml.namespace.QName("", "volume"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ISSN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ISSN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "issue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pageInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("citedByCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "citedByCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("text");
        elemField.setXmlName(new javax.xml.namespace.QName("", "text"));
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
