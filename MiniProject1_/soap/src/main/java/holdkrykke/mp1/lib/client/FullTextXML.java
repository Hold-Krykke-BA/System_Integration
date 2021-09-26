/**
 * FullTextXML.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package holdkrykke.mp1.lib.client;

public class FullTextXML  implements java.io.Serializable {
    private java.lang.String pmId;

    private java.lang.String pmcId;

    private java.lang.String message;

    private java.lang.String isOpenAccess;

    private java.lang.String fullTextXML;

    public FullTextXML() {
    }

    public FullTextXML(
           java.lang.String pmId,
           java.lang.String pmcId,
           java.lang.String message,
           java.lang.String isOpenAccess,
           java.lang.String fullTextXML) {
           this.pmId = pmId;
           this.pmcId = pmcId;
           this.message = message;
           this.isOpenAccess = isOpenAccess;
           this.fullTextXML = fullTextXML;
    }


    /**
     * Gets the pmId value for this FullTextXML.
     * 
     * @return pmId
     */
    public java.lang.String getPmId() {
        return pmId;
    }


    /**
     * Sets the pmId value for this FullTextXML.
     * 
     * @param pmId
     */
    public void setPmId(java.lang.String pmId) {
        this.pmId = pmId;
    }


    /**
     * Gets the pmcId value for this FullTextXML.
     * 
     * @return pmcId
     */
    public java.lang.String getPmcId() {
        return pmcId;
    }


    /**
     * Sets the pmcId value for this FullTextXML.
     * 
     * @param pmcId
     */
    public void setPmcId(java.lang.String pmcId) {
        this.pmcId = pmcId;
    }


    /**
     * Gets the message value for this FullTextXML.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this FullTextXML.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the isOpenAccess value for this FullTextXML.
     * 
     * @return isOpenAccess
     */
    public java.lang.String getIsOpenAccess() {
        return isOpenAccess;
    }


    /**
     * Sets the isOpenAccess value for this FullTextXML.
     * 
     * @param isOpenAccess
     */
    public void setIsOpenAccess(java.lang.String isOpenAccess) {
        this.isOpenAccess = isOpenAccess;
    }


    /**
     * Gets the fullTextXML value for this FullTextXML.
     * 
     * @return fullTextXML
     */
    public java.lang.String getFullTextXML() {
        return fullTextXML;
    }


    /**
     * Sets the fullTextXML value for this FullTextXML.
     * 
     * @param fullTextXML
     */
    public void setFullTextXML(java.lang.String fullTextXML) {
        this.fullTextXML = fullTextXML;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FullTextXML)) return false;
        FullTextXML other = (FullTextXML) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pmId==null && other.getPmId()==null) || 
             (this.pmId!=null &&
              this.pmId.equals(other.getPmId()))) &&
            ((this.pmcId==null && other.getPmcId()==null) || 
             (this.pmcId!=null &&
              this.pmcId.equals(other.getPmcId()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.isOpenAccess==null && other.getIsOpenAccess()==null) || 
             (this.isOpenAccess!=null &&
              this.isOpenAccess.equals(other.getIsOpenAccess()))) &&
            ((this.fullTextXML==null && other.getFullTextXML()==null) || 
             (this.fullTextXML!=null &&
              this.fullTextXML.equals(other.getFullTextXML())));
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
        if (getPmId() != null) {
            _hashCode += getPmId().hashCode();
        }
        if (getPmcId() != null) {
            _hashCode += getPmcId().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getIsOpenAccess() != null) {
            _hashCode += getIsOpenAccess().hashCode();
        }
        if (getFullTextXML() != null) {
            _hashCode += getFullTextXML().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FullTextXML.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "fullTextXML"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pmId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pmId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pmcId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pmcId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isOpenAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isOpenAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullTextXML");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fullTextXML"));
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
