/**
 * Authors.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package holdkrykke.mp1.lib.client;

public class Authors  implements java.io.Serializable {
    private java.lang.String collectiveName;

    private java.lang.String fullName;

    private java.lang.String firstName;

    private java.lang.String lastName;

    private java.lang.String initials;

    private holdkrykke.mp1.lib.client.AuthorId authorId;

    private holdkrykke.mp1.lib.client.AuthorAffiliation[] authorAffiliationDetailsList;

    public Authors() {
    }

    public Authors(
           java.lang.String collectiveName,
           java.lang.String fullName,
           java.lang.String firstName,
           java.lang.String lastName,
           java.lang.String initials,
           holdkrykke.mp1.lib.client.AuthorId authorId,
           holdkrykke.mp1.lib.client.AuthorAffiliation[] authorAffiliationDetailsList) {
           this.collectiveName = collectiveName;
           this.fullName = fullName;
           this.firstName = firstName;
           this.lastName = lastName;
           this.initials = initials;
           this.authorId = authorId;
           this.authorAffiliationDetailsList = authorAffiliationDetailsList;
    }


    /**
     * Gets the collectiveName value for this Authors.
     * 
     * @return collectiveName
     */
    public java.lang.String getCollectiveName() {
        return collectiveName;
    }


    /**
     * Sets the collectiveName value for this Authors.
     * 
     * @param collectiveName
     */
    public void setCollectiveName(java.lang.String collectiveName) {
        this.collectiveName = collectiveName;
    }


    /**
     * Gets the fullName value for this Authors.
     * 
     * @return fullName
     */
    public java.lang.String getFullName() {
        return fullName;
    }


    /**
     * Sets the fullName value for this Authors.
     * 
     * @param fullName
     */
    public void setFullName(java.lang.String fullName) {
        this.fullName = fullName;
    }


    /**
     * Gets the firstName value for this Authors.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this Authors.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the lastName value for this Authors.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this Authors.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the initials value for this Authors.
     * 
     * @return initials
     */
    public java.lang.String getInitials() {
        return initials;
    }


    /**
     * Sets the initials value for this Authors.
     * 
     * @param initials
     */
    public void setInitials(java.lang.String initials) {
        this.initials = initials;
    }


    /**
     * Gets the authorId value for this Authors.
     * 
     * @return authorId
     */
    public holdkrykke.mp1.lib.client.AuthorId getAuthorId() {
        return authorId;
    }


    /**
     * Sets the authorId value for this Authors.
     * 
     * @param authorId
     */
    public void setAuthorId(holdkrykke.mp1.lib.client.AuthorId authorId) {
        this.authorId = authorId;
    }


    /**
     * Gets the authorAffiliationDetailsList value for this Authors.
     * 
     * @return authorAffiliationDetailsList
     */
    public holdkrykke.mp1.lib.client.AuthorAffiliation[] getAuthorAffiliationDetailsList() {
        return authorAffiliationDetailsList;
    }


    /**
     * Sets the authorAffiliationDetailsList value for this Authors.
     * 
     * @param authorAffiliationDetailsList
     */
    public void setAuthorAffiliationDetailsList(holdkrykke.mp1.lib.client.AuthorAffiliation[] authorAffiliationDetailsList) {
        this.authorAffiliationDetailsList = authorAffiliationDetailsList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Authors)) return false;
        Authors other = (Authors) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.collectiveName==null && other.getCollectiveName()==null) || 
             (this.collectiveName!=null &&
              this.collectiveName.equals(other.getCollectiveName()))) &&
            ((this.fullName==null && other.getFullName()==null) || 
             (this.fullName!=null &&
              this.fullName.equals(other.getFullName()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.initials==null && other.getInitials()==null) || 
             (this.initials!=null &&
              this.initials.equals(other.getInitials()))) &&
            ((this.authorId==null && other.getAuthorId()==null) || 
             (this.authorId!=null &&
              this.authorId.equals(other.getAuthorId()))) &&
            ((this.authorAffiliationDetailsList==null && other.getAuthorAffiliationDetailsList()==null) || 
             (this.authorAffiliationDetailsList!=null &&
              java.util.Arrays.equals(this.authorAffiliationDetailsList, other.getAuthorAffiliationDetailsList())));
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
        if (getCollectiveName() != null) {
            _hashCode += getCollectiveName().hashCode();
        }
        if (getFullName() != null) {
            _hashCode += getFullName().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getInitials() != null) {
            _hashCode += getInitials().hashCode();
        }
        if (getAuthorId() != null) {
            _hashCode += getAuthorId().hashCode();
        }
        if (getAuthorAffiliationDetailsList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAuthorAffiliationDetailsList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAuthorAffiliationDetailsList(), i);
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
        new org.apache.axis.description.TypeDesc(Authors.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "authors"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collectiveName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "collectiveName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fullName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "firstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initials");
        elemField.setXmlName(new javax.xml.namespace.QName("", "initials"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authorId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "authorId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorAffiliationDetailsList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authorAffiliationDetailsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "authorAffiliation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "authorAffiliation"));
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
