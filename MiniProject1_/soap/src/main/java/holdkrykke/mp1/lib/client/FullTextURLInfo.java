/**
 * FullTextURLInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package holdkrykke.mp1.lib.client;

public class FullTextURLInfo  implements java.io.Serializable {
    private java.lang.String availability;

    private java.lang.String availabilityCode;

    private java.lang.String documentStyle;

    private java.lang.String site;

    private java.lang.String url;

    public FullTextURLInfo() {
    }

    public FullTextURLInfo(
           java.lang.String availability,
           java.lang.String availabilityCode,
           java.lang.String documentStyle,
           java.lang.String site,
           java.lang.String url) {
           this.availability = availability;
           this.availabilityCode = availabilityCode;
           this.documentStyle = documentStyle;
           this.site = site;
           this.url = url;
    }


    /**
     * Gets the availability value for this FullTextURLInfo.
     * 
     * @return availability
     */
    public java.lang.String getAvailability() {
        return availability;
    }


    /**
     * Sets the availability value for this FullTextURLInfo.
     * 
     * @param availability
     */
    public void setAvailability(java.lang.String availability) {
        this.availability = availability;
    }


    /**
     * Gets the availabilityCode value for this FullTextURLInfo.
     * 
     * @return availabilityCode
     */
    public java.lang.String getAvailabilityCode() {
        return availabilityCode;
    }


    /**
     * Sets the availabilityCode value for this FullTextURLInfo.
     * 
     * @param availabilityCode
     */
    public void setAvailabilityCode(java.lang.String availabilityCode) {
        this.availabilityCode = availabilityCode;
    }


    /**
     * Gets the documentStyle value for this FullTextURLInfo.
     * 
     * @return documentStyle
     */
    public java.lang.String getDocumentStyle() {
        return documentStyle;
    }


    /**
     * Sets the documentStyle value for this FullTextURLInfo.
     * 
     * @param documentStyle
     */
    public void setDocumentStyle(java.lang.String documentStyle) {
        this.documentStyle = documentStyle;
    }


    /**
     * Gets the site value for this FullTextURLInfo.
     * 
     * @return site
     */
    public java.lang.String getSite() {
        return site;
    }


    /**
     * Sets the site value for this FullTextURLInfo.
     * 
     * @param site
     */
    public void setSite(java.lang.String site) {
        this.site = site;
    }


    /**
     * Gets the url value for this FullTextURLInfo.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this FullTextURLInfo.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FullTextURLInfo)) return false;
        FullTextURLInfo other = (FullTextURLInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.availability==null && other.getAvailability()==null) || 
             (this.availability!=null &&
              this.availability.equals(other.getAvailability()))) &&
            ((this.availabilityCode==null && other.getAvailabilityCode()==null) || 
             (this.availabilityCode!=null &&
              this.availabilityCode.equals(other.getAvailabilityCode()))) &&
            ((this.documentStyle==null && other.getDocumentStyle()==null) || 
             (this.documentStyle!=null &&
              this.documentStyle.equals(other.getDocumentStyle()))) &&
            ((this.site==null && other.getSite()==null) || 
             (this.site!=null &&
              this.site.equals(other.getSite()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl())));
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
        if (getAvailability() != null) {
            _hashCode += getAvailability().hashCode();
        }
        if (getAvailabilityCode() != null) {
            _hashCode += getAvailabilityCode().hashCode();
        }
        if (getDocumentStyle() != null) {
            _hashCode += getDocumentStyle().hashCode();
        }
        if (getSite() != null) {
            _hashCode += getSite().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FullTextURLInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "fullTextURLInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availability");
        elemField.setXmlName(new javax.xml.namespace.QName("", "availability"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availabilityCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "availabilityCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentStyle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentStyle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("site");
        elemField.setXmlName(new javax.xml.namespace.QName("", "site"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("", "url"));
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
