/**
 * PatentClassifierInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package holdkrykke.mp1.lib.client;

public class PatentClassifierInfo  implements java.io.Serializable {
    private java.lang.String classification;

    private java.lang.String classificationType;

    private java.lang.String hyperlink;

    public PatentClassifierInfo() {
    }

    public PatentClassifierInfo(
           java.lang.String classification,
           java.lang.String classificationType,
           java.lang.String hyperlink) {
           this.classification = classification;
           this.classificationType = classificationType;
           this.hyperlink = hyperlink;
    }


    /**
     * Gets the classification value for this PatentClassifierInfo.
     * 
     * @return classification
     */
    public java.lang.String getClassification() {
        return classification;
    }


    /**
     * Sets the classification value for this PatentClassifierInfo.
     * 
     * @param classification
     */
    public void setClassification(java.lang.String classification) {
        this.classification = classification;
    }


    /**
     * Gets the classificationType value for this PatentClassifierInfo.
     * 
     * @return classificationType
     */
    public java.lang.String getClassificationType() {
        return classificationType;
    }


    /**
     * Sets the classificationType value for this PatentClassifierInfo.
     * 
     * @param classificationType
     */
    public void setClassificationType(java.lang.String classificationType) {
        this.classificationType = classificationType;
    }


    /**
     * Gets the hyperlink value for this PatentClassifierInfo.
     * 
     * @return hyperlink
     */
    public java.lang.String getHyperlink() {
        return hyperlink;
    }


    /**
     * Sets the hyperlink value for this PatentClassifierInfo.
     * 
     * @param hyperlink
     */
    public void setHyperlink(java.lang.String hyperlink) {
        this.hyperlink = hyperlink;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PatentClassifierInfo)) return false;
        PatentClassifierInfo other = (PatentClassifierInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.classification==null && other.getClassification()==null) || 
             (this.classification!=null &&
              this.classification.equals(other.getClassification()))) &&
            ((this.classificationType==null && other.getClassificationType()==null) || 
             (this.classificationType!=null &&
              this.classificationType.equals(other.getClassificationType()))) &&
            ((this.hyperlink==null && other.getHyperlink()==null) || 
             (this.hyperlink!=null &&
              this.hyperlink.equals(other.getHyperlink())));
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
        if (getClassification() != null) {
            _hashCode += getClassification().hashCode();
        }
        if (getClassificationType() != null) {
            _hashCode += getClassificationType().hashCode();
        }
        if (getHyperlink() != null) {
            _hashCode += getHyperlink().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PatentClassifierInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "patentClassifierInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classification");
        elemField.setXmlName(new javax.xml.namespace.QName("", "classification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classificationType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "classificationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hyperlink");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hyperlink"));
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
