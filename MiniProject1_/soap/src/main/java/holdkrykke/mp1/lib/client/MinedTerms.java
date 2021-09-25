/**
 * MinedTerms.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package holdkrykke.mp1.lib.client;

public class MinedTerms  implements java.io.Serializable {
    private java.lang.String name;

    private int total;

    private holdkrykke.mp1.lib.client.MinedSummary[] tmSummary;

    public MinedTerms() {
    }

    public MinedTerms(
           java.lang.String name,
           int total,
           holdkrykke.mp1.lib.client.MinedSummary[] tmSummary) {
           this.name = name;
           this.total = total;
           this.tmSummary = tmSummary;
    }


    /**
     * Gets the name value for this MinedTerms.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this MinedTerms.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the total value for this MinedTerms.
     * 
     * @return total
     */
    public int getTotal() {
        return total;
    }


    /**
     * Sets the total value for this MinedTerms.
     * 
     * @param total
     */
    public void setTotal(int total) {
        this.total = total;
    }


    /**
     * Gets the tmSummary value for this MinedTerms.
     * 
     * @return tmSummary
     */
    public holdkrykke.mp1.lib.client.MinedSummary[] getTmSummary() {
        return tmSummary;
    }


    /**
     * Sets the tmSummary value for this MinedTerms.
     * 
     * @param tmSummary
     */
    public void setTmSummary(holdkrykke.mp1.lib.client.MinedSummary[] tmSummary) {
        this.tmSummary = tmSummary;
    }

    public holdkrykke.mp1.lib.client.MinedSummary getTmSummary(int i) {
        return this.tmSummary[i];
    }

    public void setTmSummary(int i, holdkrykke.mp1.lib.client.MinedSummary _value) {
        this.tmSummary[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MinedTerms)) return false;
        MinedTerms other = (MinedTerms) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            this.total == other.getTotal() &&
            ((this.tmSummary==null && other.getTmSummary()==null) || 
             (this.tmSummary!=null &&
              java.util.Arrays.equals(this.tmSummary, other.getTmSummary())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        _hashCode += getTotal();
        if (getTmSummary() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTmSummary());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTmSummary(), i);
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
        new org.apache.axis.description.TypeDesc(MinedTerms.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "minedTerms"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total");
        elemField.setXmlName(new javax.xml.namespace.QName("", "total"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tmSummary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tmSummary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "minedSummary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
