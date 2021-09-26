/**
 * MeshQualifierInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package holdkrykke.mp1.lib.client;

public class MeshQualifierInfo  implements java.io.Serializable {
    private java.lang.String abbreviation;

    private java.lang.String qualifierName;

    private java.lang.String majorTopic_YN;

    public MeshQualifierInfo() {
    }

    public MeshQualifierInfo(
           java.lang.String abbreviation,
           java.lang.String qualifierName,
           java.lang.String majorTopic_YN) {
           this.abbreviation = abbreviation;
           this.qualifierName = qualifierName;
           this.majorTopic_YN = majorTopic_YN;
    }


    /**
     * Gets the abbreviation value for this MeshQualifierInfo.
     * 
     * @return abbreviation
     */
    public java.lang.String getAbbreviation() {
        return abbreviation;
    }


    /**
     * Sets the abbreviation value for this MeshQualifierInfo.
     * 
     * @param abbreviation
     */
    public void setAbbreviation(java.lang.String abbreviation) {
        this.abbreviation = abbreviation;
    }


    /**
     * Gets the qualifierName value for this MeshQualifierInfo.
     * 
     * @return qualifierName
     */
    public java.lang.String getQualifierName() {
        return qualifierName;
    }


    /**
     * Sets the qualifierName value for this MeshQualifierInfo.
     * 
     * @param qualifierName
     */
    public void setQualifierName(java.lang.String qualifierName) {
        this.qualifierName = qualifierName;
    }


    /**
     * Gets the majorTopic_YN value for this MeshQualifierInfo.
     * 
     * @return majorTopic_YN
     */
    public java.lang.String getMajorTopic_YN() {
        return majorTopic_YN;
    }


    /**
     * Sets the majorTopic_YN value for this MeshQualifierInfo.
     * 
     * @param majorTopic_YN
     */
    public void setMajorTopic_YN(java.lang.String majorTopic_YN) {
        this.majorTopic_YN = majorTopic_YN;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MeshQualifierInfo)) return false;
        MeshQualifierInfo other = (MeshQualifierInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.abbreviation==null && other.getAbbreviation()==null) || 
             (this.abbreviation!=null &&
              this.abbreviation.equals(other.getAbbreviation()))) &&
            ((this.qualifierName==null && other.getQualifierName()==null) || 
             (this.qualifierName!=null &&
              this.qualifierName.equals(other.getQualifierName()))) &&
            ((this.majorTopic_YN==null && other.getMajorTopic_YN()==null) || 
             (this.majorTopic_YN!=null &&
              this.majorTopic_YN.equals(other.getMajorTopic_YN())));
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
        if (getAbbreviation() != null) {
            _hashCode += getAbbreviation().hashCode();
        }
        if (getQualifierName() != null) {
            _hashCode += getQualifierName().hashCode();
        }
        if (getMajorTopic_YN() != null) {
            _hashCode += getMajorTopic_YN().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MeshQualifierInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "meshQualifierInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("abbreviation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "abbreviation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qualifierName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "qualifierName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("majorTopic_YN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "majorTopic_YN"));
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
