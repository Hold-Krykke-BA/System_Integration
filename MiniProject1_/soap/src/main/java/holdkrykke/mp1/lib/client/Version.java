/**
 * Version.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package holdkrykke.mp1.lib.client;

public class Version  implements java.io.Serializable {
    private java.lang.String id;

    private java.lang.String source;

    private java.lang.String firstPublishDate;

    private java.lang.Short versionNumber;

    private java.lang.String[] pubTypeList;

    public Version() {
    }

    public Version(
           java.lang.String id,
           java.lang.String source,
           java.lang.String firstPublishDate,
           java.lang.Short versionNumber,
           java.lang.String[] pubTypeList) {
           this.id = id;
           this.source = source;
           this.firstPublishDate = firstPublishDate;
           this.versionNumber = versionNumber;
           this.pubTypeList = pubTypeList;
    }


    /**
     * Gets the id value for this Version.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this Version.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the source value for this Version.
     * 
     * @return source
     */
    public java.lang.String getSource() {
        return source;
    }


    /**
     * Sets the source value for this Version.
     * 
     * @param source
     */
    public void setSource(java.lang.String source) {
        this.source = source;
    }


    /**
     * Gets the firstPublishDate value for this Version.
     * 
     * @return firstPublishDate
     */
    public java.lang.String getFirstPublishDate() {
        return firstPublishDate;
    }


    /**
     * Sets the firstPublishDate value for this Version.
     * 
     * @param firstPublishDate
     */
    public void setFirstPublishDate(java.lang.String firstPublishDate) {
        this.firstPublishDate = firstPublishDate;
    }


    /**
     * Gets the versionNumber value for this Version.
     * 
     * @return versionNumber
     */
    public java.lang.Short getVersionNumber() {
        return versionNumber;
    }


    /**
     * Sets the versionNumber value for this Version.
     * 
     * @param versionNumber
     */
    public void setVersionNumber(java.lang.Short versionNumber) {
        this.versionNumber = versionNumber;
    }


    /**
     * Gets the pubTypeList value for this Version.
     * 
     * @return pubTypeList
     */
    public java.lang.String[] getPubTypeList() {
        return pubTypeList;
    }


    /**
     * Sets the pubTypeList value for this Version.
     * 
     * @param pubTypeList
     */
    public void setPubTypeList(java.lang.String[] pubTypeList) {
        this.pubTypeList = pubTypeList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Version)) return false;
        Version other = (Version) obj;
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
            ((this.firstPublishDate==null && other.getFirstPublishDate()==null) || 
             (this.firstPublishDate!=null &&
              this.firstPublishDate.equals(other.getFirstPublishDate()))) &&
            ((this.versionNumber==null && other.getVersionNumber()==null) || 
             (this.versionNumber!=null &&
              this.versionNumber.equals(other.getVersionNumber()))) &&
            ((this.pubTypeList==null && other.getPubTypeList()==null) || 
             (this.pubTypeList!=null &&
              java.util.Arrays.equals(this.pubTypeList, other.getPubTypeList())));
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
        if (getFirstPublishDate() != null) {
            _hashCode += getFirstPublishDate().hashCode();
        }
        if (getVersionNumber() != null) {
            _hashCode += getVersionNumber().hashCode();
        }
        if (getPubTypeList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPubTypeList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPubTypeList(), i);
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
        new org.apache.axis.description.TypeDesc(Version.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "version"));
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
        elemField.setFieldName("firstPublishDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "firstPublishDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "versionNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pubTypeList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pubTypeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "pubType"));
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
