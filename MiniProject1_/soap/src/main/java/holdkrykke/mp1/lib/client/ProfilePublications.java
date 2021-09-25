/**
 * ProfilePublications.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package holdkrykke.mp1.lib.client;

public class ProfilePublications  implements java.io.Serializable {
    private java.lang.String queryString;

    private java.lang.String profileType;

    private java.lang.String synonym;

    private java.lang.String email;

    public ProfilePublications() {
    }

    public ProfilePublications(
           java.lang.String queryString,
           java.lang.String profileType,
           java.lang.String synonym,
           java.lang.String email) {
           this.queryString = queryString;
           this.profileType = profileType;
           this.synonym = synonym;
           this.email = email;
    }


    /**
     * Gets the queryString value for this ProfilePublications.
     * 
     * @return queryString
     */
    public java.lang.String getQueryString() {
        return queryString;
    }


    /**
     * Sets the queryString value for this ProfilePublications.
     * 
     * @param queryString
     */
    public void setQueryString(java.lang.String queryString) {
        this.queryString = queryString;
    }


    /**
     * Gets the profileType value for this ProfilePublications.
     * 
     * @return profileType
     */
    public java.lang.String getProfileType() {
        return profileType;
    }


    /**
     * Sets the profileType value for this ProfilePublications.
     * 
     * @param profileType
     */
    public void setProfileType(java.lang.String profileType) {
        this.profileType = profileType;
    }


    /**
     * Gets the synonym value for this ProfilePublications.
     * 
     * @return synonym
     */
    public java.lang.String getSynonym() {
        return synonym;
    }


    /**
     * Sets the synonym value for this ProfilePublications.
     * 
     * @param synonym
     */
    public void setSynonym(java.lang.String synonym) {
        this.synonym = synonym;
    }


    /**
     * Gets the email value for this ProfilePublications.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this ProfilePublications.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProfilePublications)) return false;
        ProfilePublications other = (ProfilePublications) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.queryString==null && other.getQueryString()==null) || 
             (this.queryString!=null &&
              this.queryString.equals(other.getQueryString()))) &&
            ((this.profileType==null && other.getProfileType()==null) || 
             (this.profileType!=null &&
              this.profileType.equals(other.getProfileType()))) &&
            ((this.synonym==null && other.getSynonym()==null) || 
             (this.synonym!=null &&
              this.synonym.equals(other.getSynonym()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail())));
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
        if (getQueryString() != null) {
            _hashCode += getQueryString().hashCode();
        }
        if (getProfileType() != null) {
            _hashCode += getProfileType().hashCode();
        }
        if (getSynonym() != null) {
            _hashCode += getSynonym().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProfilePublications.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "profilePublications"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryString");
        elemField.setXmlName(new javax.xml.namespace.QName("", "queryString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profileType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "profileType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("synonym");
        elemField.setXmlName(new javax.xml.namespace.QName("", "synonym"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email"));
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
