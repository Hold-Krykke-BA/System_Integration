/**
 * GrantInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package holdkrykke.mp1.lib.client;

public class GrantInfo  implements java.io.Serializable {
    private java.lang.String grantId;

    private java.lang.String agency;

    private java.lang.String acronym;

    private short orderIn;

    public GrantInfo() {
    }

    public GrantInfo(
           java.lang.String grantId,
           java.lang.String agency,
           java.lang.String acronym,
           short orderIn) {
           this.grantId = grantId;
           this.agency = agency;
           this.acronym = acronym;
           this.orderIn = orderIn;
    }


    /**
     * Gets the grantId value for this GrantInfo.
     * 
     * @return grantId
     */
    public java.lang.String getGrantId() {
        return grantId;
    }


    /**
     * Sets the grantId value for this GrantInfo.
     * 
     * @param grantId
     */
    public void setGrantId(java.lang.String grantId) {
        this.grantId = grantId;
    }


    /**
     * Gets the agency value for this GrantInfo.
     * 
     * @return agency
     */
    public java.lang.String getAgency() {
        return agency;
    }


    /**
     * Sets the agency value for this GrantInfo.
     * 
     * @param agency
     */
    public void setAgency(java.lang.String agency) {
        this.agency = agency;
    }


    /**
     * Gets the acronym value for this GrantInfo.
     * 
     * @return acronym
     */
    public java.lang.String getAcronym() {
        return acronym;
    }


    /**
     * Sets the acronym value for this GrantInfo.
     * 
     * @param acronym
     */
    public void setAcronym(java.lang.String acronym) {
        this.acronym = acronym;
    }


    /**
     * Gets the orderIn value for this GrantInfo.
     * 
     * @return orderIn
     */
    public short getOrderIn() {
        return orderIn;
    }


    /**
     * Sets the orderIn value for this GrantInfo.
     * 
     * @param orderIn
     */
    public void setOrderIn(short orderIn) {
        this.orderIn = orderIn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GrantInfo)) return false;
        GrantInfo other = (GrantInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.grantId==null && other.getGrantId()==null) || 
             (this.grantId!=null &&
              this.grantId.equals(other.getGrantId()))) &&
            ((this.agency==null && other.getAgency()==null) || 
             (this.agency!=null &&
              this.agency.equals(other.getAgency()))) &&
            ((this.acronym==null && other.getAcronym()==null) || 
             (this.acronym!=null &&
              this.acronym.equals(other.getAcronym()))) &&
            this.orderIn == other.getOrderIn();
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
        if (getGrantId() != null) {
            _hashCode += getGrantId().hashCode();
        }
        if (getAgency() != null) {
            _hashCode += getAgency().hashCode();
        }
        if (getAcronym() != null) {
            _hashCode += getAcronym().hashCode();
        }
        _hashCode += getOrderIn();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GrantInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "grantInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grantId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "grantId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "agency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acronym");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acronym"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderIn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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
