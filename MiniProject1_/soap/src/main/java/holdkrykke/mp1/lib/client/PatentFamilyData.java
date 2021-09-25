/**
 * PatentFamilyData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package holdkrykke.mp1.lib.client;

public class PatentFamilyData  implements java.io.Serializable {
    private java.lang.String familyNumber;

    private java.lang.Short orderIn;

    public PatentFamilyData() {
    }

    public PatentFamilyData(
           java.lang.String familyNumber,
           java.lang.Short orderIn) {
           this.familyNumber = familyNumber;
           this.orderIn = orderIn;
    }


    /**
     * Gets the familyNumber value for this PatentFamilyData.
     * 
     * @return familyNumber
     */
    public java.lang.String getFamilyNumber() {
        return familyNumber;
    }


    /**
     * Sets the familyNumber value for this PatentFamilyData.
     * 
     * @param familyNumber
     */
    public void setFamilyNumber(java.lang.String familyNumber) {
        this.familyNumber = familyNumber;
    }


    /**
     * Gets the orderIn value for this PatentFamilyData.
     * 
     * @return orderIn
     */
    public java.lang.Short getOrderIn() {
        return orderIn;
    }


    /**
     * Sets the orderIn value for this PatentFamilyData.
     * 
     * @param orderIn
     */
    public void setOrderIn(java.lang.Short orderIn) {
        this.orderIn = orderIn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PatentFamilyData)) return false;
        PatentFamilyData other = (PatentFamilyData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.familyNumber==null && other.getFamilyNumber()==null) || 
             (this.familyNumber!=null &&
              this.familyNumber.equals(other.getFamilyNumber()))) &&
            ((this.orderIn==null && other.getOrderIn()==null) || 
             (this.orderIn!=null &&
              this.orderIn.equals(other.getOrderIn())));
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
        if (getFamilyNumber() != null) {
            _hashCode += getFamilyNumber().hashCode();
        }
        if (getOrderIn() != null) {
            _hashCode += getOrderIn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PatentFamilyData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "patentFamilyData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("familyNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "familyNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderIn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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
