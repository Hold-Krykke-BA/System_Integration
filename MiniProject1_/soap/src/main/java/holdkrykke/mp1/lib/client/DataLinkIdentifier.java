/**
 * DataLinkIdentifier.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package holdkrykke.mp1.lib.client;

public class DataLinkIdentifier  implements java.io.Serializable {
    private java.lang.String ID;

    private java.lang.String IDScheme;

    private java.lang.String IDURL;

    public DataLinkIdentifier() {
    }

    public DataLinkIdentifier(
           java.lang.String ID,
           java.lang.String IDScheme,
           java.lang.String IDURL) {
           this.ID = ID;
           this.IDScheme = IDScheme;
           this.IDURL = IDURL;
    }


    /**
     * Gets the ID value for this DataLinkIdentifier.
     * 
     * @return ID
     */
    public java.lang.String getID() {
        return ID;
    }


    /**
     * Sets the ID value for this DataLinkIdentifier.
     * 
     * @param ID
     */
    public void setID(java.lang.String ID) {
        this.ID = ID;
    }


    /**
     * Gets the IDScheme value for this DataLinkIdentifier.
     * 
     * @return IDScheme
     */
    public java.lang.String getIDScheme() {
        return IDScheme;
    }


    /**
     * Sets the IDScheme value for this DataLinkIdentifier.
     * 
     * @param IDScheme
     */
    public void setIDScheme(java.lang.String IDScheme) {
        this.IDScheme = IDScheme;
    }


    /**
     * Gets the IDURL value for this DataLinkIdentifier.
     * 
     * @return IDURL
     */
    public java.lang.String getIDURL() {
        return IDURL;
    }


    /**
     * Sets the IDURL value for this DataLinkIdentifier.
     * 
     * @param IDURL
     */
    public void setIDURL(java.lang.String IDURL) {
        this.IDURL = IDURL;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DataLinkIdentifier)) return false;
        DataLinkIdentifier other = (DataLinkIdentifier) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID==null && other.getID()==null) || 
             (this.ID!=null &&
              this.ID.equals(other.getID()))) &&
            ((this.IDScheme==null && other.getIDScheme()==null) || 
             (this.IDScheme!=null &&
              this.IDScheme.equals(other.getIDScheme()))) &&
            ((this.IDURL==null && other.getIDURL()==null) || 
             (this.IDURL!=null &&
              this.IDURL.equals(other.getIDURL())));
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
        if (getID() != null) {
            _hashCode += getID().hashCode();
        }
        if (getIDScheme() != null) {
            _hashCode += getIDScheme().hashCode();
        }
        if (getIDURL() != null) {
            _hashCode += getIDURL().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DataLinkIdentifier.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.scholix.org", "dataLinkIdentifier"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.scholix.org", "ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDScheme");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.scholix.org", "IDScheme"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDURL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.scholix.org", "IDURL"));
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
