/**
 * ProfileListBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package holdkrykke.mp1.lib.client;

public class ProfileListBean  implements java.io.Serializable {
    private holdkrykke.mp1.lib.client.Profile[] source;

    private holdkrykke.mp1.lib.client.Profile[] pubType;

    private holdkrykke.mp1.lib.client.Profile[] subset;

    public ProfileListBean() {
    }

    public ProfileListBean(
           holdkrykke.mp1.lib.client.Profile[] source,
           holdkrykke.mp1.lib.client.Profile[] pubType,
           holdkrykke.mp1.lib.client.Profile[] subset) {
           this.source = source;
           this.pubType = pubType;
           this.subset = subset;
    }


    /**
     * Gets the source value for this ProfileListBean.
     * 
     * @return source
     */
    public holdkrykke.mp1.lib.client.Profile[] getSource() {
        return source;
    }


    /**
     * Sets the source value for this ProfileListBean.
     * 
     * @param source
     */
    public void setSource(holdkrykke.mp1.lib.client.Profile[] source) {
        this.source = source;
    }

    public holdkrykke.mp1.lib.client.Profile getSource(int i) {
        return this.source[i];
    }

    public void setSource(int i, holdkrykke.mp1.lib.client.Profile _value) {
        this.source[i] = _value;
    }


    /**
     * Gets the pubType value for this ProfileListBean.
     * 
     * @return pubType
     */
    public holdkrykke.mp1.lib.client.Profile[] getPubType() {
        return pubType;
    }


    /**
     * Sets the pubType value for this ProfileListBean.
     * 
     * @param pubType
     */
    public void setPubType(holdkrykke.mp1.lib.client.Profile[] pubType) {
        this.pubType = pubType;
    }

    public holdkrykke.mp1.lib.client.Profile getPubType(int i) {
        return this.pubType[i];
    }

    public void setPubType(int i, holdkrykke.mp1.lib.client.Profile _value) {
        this.pubType[i] = _value;
    }


    /**
     * Gets the subset value for this ProfileListBean.
     * 
     * @return subset
     */
    public holdkrykke.mp1.lib.client.Profile[] getSubset() {
        return subset;
    }


    /**
     * Sets the subset value for this ProfileListBean.
     * 
     * @param subset
     */
    public void setSubset(holdkrykke.mp1.lib.client.Profile[] subset) {
        this.subset = subset;
    }

    public holdkrykke.mp1.lib.client.Profile getSubset(int i) {
        return this.subset[i];
    }

    public void setSubset(int i, holdkrykke.mp1.lib.client.Profile _value) {
        this.subset[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProfileListBean)) return false;
        ProfileListBean other = (ProfileListBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              java.util.Arrays.equals(this.source, other.getSource()))) &&
            ((this.pubType==null && other.getPubType()==null) || 
             (this.pubType!=null &&
              java.util.Arrays.equals(this.pubType, other.getPubType()))) &&
            ((this.subset==null && other.getSubset()==null) || 
             (this.subset!=null &&
              java.util.Arrays.equals(this.subset, other.getSubset())));
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
        if (getSource() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSource());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSource(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPubType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPubType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPubType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubset() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubset());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubset(), i);
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
        new org.apache.axis.description.TypeDesc(ProfileListBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "profileListBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "profile"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pubType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pubType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "profile"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subset");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "profile"));
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
