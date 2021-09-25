/**
 * PatentPriorityData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package holdkrykke.mp1.lib.client;

public class PatentPriorityData  implements java.io.Serializable {
    private java.lang.String priorityNumber;

    private java.lang.String priorityDate;

    private java.lang.Short orderIn;

    public PatentPriorityData() {
    }

    public PatentPriorityData(
           java.lang.String priorityNumber,
           java.lang.String priorityDate,
           java.lang.Short orderIn) {
           this.priorityNumber = priorityNumber;
           this.priorityDate = priorityDate;
           this.orderIn = orderIn;
    }


    /**
     * Gets the priorityNumber value for this PatentPriorityData.
     * 
     * @return priorityNumber
     */
    public java.lang.String getPriorityNumber() {
        return priorityNumber;
    }


    /**
     * Sets the priorityNumber value for this PatentPriorityData.
     * 
     * @param priorityNumber
     */
    public void setPriorityNumber(java.lang.String priorityNumber) {
        this.priorityNumber = priorityNumber;
    }


    /**
     * Gets the priorityDate value for this PatentPriorityData.
     * 
     * @return priorityDate
     */
    public java.lang.String getPriorityDate() {
        return priorityDate;
    }


    /**
     * Sets the priorityDate value for this PatentPriorityData.
     * 
     * @param priorityDate
     */
    public void setPriorityDate(java.lang.String priorityDate) {
        this.priorityDate = priorityDate;
    }


    /**
     * Gets the orderIn value for this PatentPriorityData.
     * 
     * @return orderIn
     */
    public java.lang.Short getOrderIn() {
        return orderIn;
    }


    /**
     * Sets the orderIn value for this PatentPriorityData.
     * 
     * @param orderIn
     */
    public void setOrderIn(java.lang.Short orderIn) {
        this.orderIn = orderIn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PatentPriorityData)) return false;
        PatentPriorityData other = (PatentPriorityData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.priorityNumber==null && other.getPriorityNumber()==null) || 
             (this.priorityNumber!=null &&
              this.priorityNumber.equals(other.getPriorityNumber()))) &&
            ((this.priorityDate==null && other.getPriorityDate()==null) || 
             (this.priorityDate!=null &&
              this.priorityDate.equals(other.getPriorityDate()))) &&
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
        if (getPriorityNumber() != null) {
            _hashCode += getPriorityNumber().hashCode();
        }
        if (getPriorityDate() != null) {
            _hashCode += getPriorityDate().hashCode();
        }
        if (getOrderIn() != null) {
            _hashCode += getOrderIn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PatentPriorityData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "patentPriorityData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priorityNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priorityNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priorityDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priorityDate"));
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
