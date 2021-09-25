/**
 * Journal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package holdkrykke.mp1.lib.client;

public class Journal  implements java.io.Serializable {
    private java.lang.String title;

    private java.lang.String ISOAbbreviation;

    private java.lang.String medlineAbbreviation;

    private java.lang.String NLMid;

    private java.lang.String ISSN;

    private java.lang.String ESSN;

    public Journal() {
    }

    public Journal(
           java.lang.String title,
           java.lang.String ISOAbbreviation,
           java.lang.String medlineAbbreviation,
           java.lang.String NLMid,
           java.lang.String ISSN,
           java.lang.String ESSN) {
           this.title = title;
           this.ISOAbbreviation = ISOAbbreviation;
           this.medlineAbbreviation = medlineAbbreviation;
           this.NLMid = NLMid;
           this.ISSN = ISSN;
           this.ESSN = ESSN;
    }


    /**
     * Gets the title value for this Journal.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this Journal.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the ISOAbbreviation value for this Journal.
     * 
     * @return ISOAbbreviation
     */
    public java.lang.String getISOAbbreviation() {
        return ISOAbbreviation;
    }


    /**
     * Sets the ISOAbbreviation value for this Journal.
     * 
     * @param ISOAbbreviation
     */
    public void setISOAbbreviation(java.lang.String ISOAbbreviation) {
        this.ISOAbbreviation = ISOAbbreviation;
    }


    /**
     * Gets the medlineAbbreviation value for this Journal.
     * 
     * @return medlineAbbreviation
     */
    public java.lang.String getMedlineAbbreviation() {
        return medlineAbbreviation;
    }


    /**
     * Sets the medlineAbbreviation value for this Journal.
     * 
     * @param medlineAbbreviation
     */
    public void setMedlineAbbreviation(java.lang.String medlineAbbreviation) {
        this.medlineAbbreviation = medlineAbbreviation;
    }


    /**
     * Gets the NLMid value for this Journal.
     * 
     * @return NLMid
     */
    public java.lang.String getNLMid() {
        return NLMid;
    }


    /**
     * Sets the NLMid value for this Journal.
     * 
     * @param NLMid
     */
    public void setNLMid(java.lang.String NLMid) {
        this.NLMid = NLMid;
    }


    /**
     * Gets the ISSN value for this Journal.
     * 
     * @return ISSN
     */
    public java.lang.String getISSN() {
        return ISSN;
    }


    /**
     * Sets the ISSN value for this Journal.
     * 
     * @param ISSN
     */
    public void setISSN(java.lang.String ISSN) {
        this.ISSN = ISSN;
    }


    /**
     * Gets the ESSN value for this Journal.
     * 
     * @return ESSN
     */
    public java.lang.String getESSN() {
        return ESSN;
    }


    /**
     * Sets the ESSN value for this Journal.
     * 
     * @param ESSN
     */
    public void setESSN(java.lang.String ESSN) {
        this.ESSN = ESSN;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Journal)) return false;
        Journal other = (Journal) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.ISOAbbreviation==null && other.getISOAbbreviation()==null) || 
             (this.ISOAbbreviation!=null &&
              this.ISOAbbreviation.equals(other.getISOAbbreviation()))) &&
            ((this.medlineAbbreviation==null && other.getMedlineAbbreviation()==null) || 
             (this.medlineAbbreviation!=null &&
              this.medlineAbbreviation.equals(other.getMedlineAbbreviation()))) &&
            ((this.NLMid==null && other.getNLMid()==null) || 
             (this.NLMid!=null &&
              this.NLMid.equals(other.getNLMid()))) &&
            ((this.ISSN==null && other.getISSN()==null) || 
             (this.ISSN!=null &&
              this.ISSN.equals(other.getISSN()))) &&
            ((this.ESSN==null && other.getESSN()==null) || 
             (this.ESSN!=null &&
              this.ESSN.equals(other.getESSN())));
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
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getISOAbbreviation() != null) {
            _hashCode += getISOAbbreviation().hashCode();
        }
        if (getMedlineAbbreviation() != null) {
            _hashCode += getMedlineAbbreviation().hashCode();
        }
        if (getNLMid() != null) {
            _hashCode += getNLMid().hashCode();
        }
        if (getISSN() != null) {
            _hashCode += getISSN().hashCode();
        }
        if (getESSN() != null) {
            _hashCode += getESSN().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Journal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "journal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ISOAbbreviation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ISOAbbreviation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medlineAbbreviation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "medlineAbbreviation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NLMid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NLMid"));
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
        elemField.setFieldName("ESSN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ESSN"));
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
