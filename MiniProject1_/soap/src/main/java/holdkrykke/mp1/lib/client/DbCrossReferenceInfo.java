/**
 * DbCrossReferenceInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package holdkrykke.mp1.lib.client;

public class DbCrossReferenceInfo  implements java.io.Serializable {
    private java.lang.String info1;

    private java.lang.String info2;

    private java.lang.String info3;

    private java.lang.String info4;

    public DbCrossReferenceInfo() {
    }

    public DbCrossReferenceInfo(
           java.lang.String info1,
           java.lang.String info2,
           java.lang.String info3,
           java.lang.String info4) {
           this.info1 = info1;
           this.info2 = info2;
           this.info3 = info3;
           this.info4 = info4;
    }


    /**
     * Gets the info1 value for this DbCrossReferenceInfo.
     * 
     * @return info1
     */
    public java.lang.String getInfo1() {
        return info1;
    }


    /**
     * Sets the info1 value for this DbCrossReferenceInfo.
     * 
     * @param info1
     */
    public void setInfo1(java.lang.String info1) {
        this.info1 = info1;
    }


    /**
     * Gets the info2 value for this DbCrossReferenceInfo.
     * 
     * @return info2
     */
    public java.lang.String getInfo2() {
        return info2;
    }


    /**
     * Sets the info2 value for this DbCrossReferenceInfo.
     * 
     * @param info2
     */
    public void setInfo2(java.lang.String info2) {
        this.info2 = info2;
    }


    /**
     * Gets the info3 value for this DbCrossReferenceInfo.
     * 
     * @return info3
     */
    public java.lang.String getInfo3() {
        return info3;
    }


    /**
     * Sets the info3 value for this DbCrossReferenceInfo.
     * 
     * @param info3
     */
    public void setInfo3(java.lang.String info3) {
        this.info3 = info3;
    }


    /**
     * Gets the info4 value for this DbCrossReferenceInfo.
     * 
     * @return info4
     */
    public java.lang.String getInfo4() {
        return info4;
    }


    /**
     * Sets the info4 value for this DbCrossReferenceInfo.
     * 
     * @param info4
     */
    public void setInfo4(java.lang.String info4) {
        this.info4 = info4;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DbCrossReferenceInfo)) return false;
        DbCrossReferenceInfo other = (DbCrossReferenceInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.info1==null && other.getInfo1()==null) || 
             (this.info1!=null &&
              this.info1.equals(other.getInfo1()))) &&
            ((this.info2==null && other.getInfo2()==null) || 
             (this.info2!=null &&
              this.info2.equals(other.getInfo2()))) &&
            ((this.info3==null && other.getInfo3()==null) || 
             (this.info3!=null &&
              this.info3.equals(other.getInfo3()))) &&
            ((this.info4==null && other.getInfo4()==null) || 
             (this.info4!=null &&
              this.info4.equals(other.getInfo4())));
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
        if (getInfo1() != null) {
            _hashCode += getInfo1().hashCode();
        }
        if (getInfo2() != null) {
            _hashCode += getInfo2().hashCode();
        }
        if (getInfo3() != null) {
            _hashCode += getInfo3().hashCode();
        }
        if (getInfo4() != null) {
            _hashCode += getInfo4().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DbCrossReferenceInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "dbCrossReferenceInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("info1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "info1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("info2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "info2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("info3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "info3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("info4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "info4"));
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
