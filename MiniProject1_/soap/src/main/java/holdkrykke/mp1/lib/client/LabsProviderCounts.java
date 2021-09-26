/**
 * LabsProviderCounts.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package holdkrykke.mp1.lib.client;

public class LabsProviderCounts  implements java.io.Serializable {
    private java.lang.String providerName;

    private java.lang.Integer linksCount;

    public LabsProviderCounts() {
    }

    public LabsProviderCounts(
           java.lang.String providerName,
           java.lang.Integer linksCount) {
           this.providerName = providerName;
           this.linksCount = linksCount;
    }


    /**
     * Gets the providerName value for this LabsProviderCounts.
     * 
     * @return providerName
     */
    public java.lang.String getProviderName() {
        return providerName;
    }


    /**
     * Sets the providerName value for this LabsProviderCounts.
     * 
     * @param providerName
     */
    public void setProviderName(java.lang.String providerName) {
        this.providerName = providerName;
    }


    /**
     * Gets the linksCount value for this LabsProviderCounts.
     * 
     * @return linksCount
     */
    public java.lang.Integer getLinksCount() {
        return linksCount;
    }


    /**
     * Sets the linksCount value for this LabsProviderCounts.
     * 
     * @param linksCount
     */
    public void setLinksCount(java.lang.Integer linksCount) {
        this.linksCount = linksCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LabsProviderCounts)) return false;
        LabsProviderCounts other = (LabsProviderCounts) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.providerName==null && other.getProviderName()==null) || 
             (this.providerName!=null &&
              this.providerName.equals(other.getProviderName()))) &&
            ((this.linksCount==null && other.getLinksCount()==null) || 
             (this.linksCount!=null &&
              this.linksCount.equals(other.getLinksCount())));
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
        if (getProviderName() != null) {
            _hashCode += getProviderName().hashCode();
        }
        if (getLinksCount() != null) {
            _hashCode += getLinksCount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LabsProviderCounts.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "labsProviderCounts"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("providerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "providerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linksCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "linksCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
