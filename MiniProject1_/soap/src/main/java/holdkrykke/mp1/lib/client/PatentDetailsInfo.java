/**
 * PatentDetailsInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package holdkrykke.mp1.lib.client;

public class PatentDetailsInfo  implements java.io.Serializable {
    private java.lang.String countryCode;

    private java.lang.String country;

    private java.lang.String typeCode;

    private java.lang.String typeDescription;

    private holdkrykke.mp1.lib.client.PatentClassifierInfo[] classifierList;

    private holdkrykke.mp1.lib.client.PatentApplication application;

    private holdkrykke.mp1.lib.client.PatentPriorityData[] priorityList;

    private holdkrykke.mp1.lib.client.PatentFamilyData[] familyList;

    public PatentDetailsInfo() {
    }

    public PatentDetailsInfo(
           java.lang.String countryCode,
           java.lang.String country,
           java.lang.String typeCode,
           java.lang.String typeDescription,
           holdkrykke.mp1.lib.client.PatentClassifierInfo[] classifierList,
           holdkrykke.mp1.lib.client.PatentApplication application,
           holdkrykke.mp1.lib.client.PatentPriorityData[] priorityList,
           holdkrykke.mp1.lib.client.PatentFamilyData[] familyList) {
           this.countryCode = countryCode;
           this.country = country;
           this.typeCode = typeCode;
           this.typeDescription = typeDescription;
           this.classifierList = classifierList;
           this.application = application;
           this.priorityList = priorityList;
           this.familyList = familyList;
    }


    /**
     * Gets the countryCode value for this PatentDetailsInfo.
     * 
     * @return countryCode
     */
    public java.lang.String getCountryCode() {
        return countryCode;
    }


    /**
     * Sets the countryCode value for this PatentDetailsInfo.
     * 
     * @param countryCode
     */
    public void setCountryCode(java.lang.String countryCode) {
        this.countryCode = countryCode;
    }


    /**
     * Gets the country value for this PatentDetailsInfo.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this PatentDetailsInfo.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the typeCode value for this PatentDetailsInfo.
     * 
     * @return typeCode
     */
    public java.lang.String getTypeCode() {
        return typeCode;
    }


    /**
     * Sets the typeCode value for this PatentDetailsInfo.
     * 
     * @param typeCode
     */
    public void setTypeCode(java.lang.String typeCode) {
        this.typeCode = typeCode;
    }


    /**
     * Gets the typeDescription value for this PatentDetailsInfo.
     * 
     * @return typeDescription
     */
    public java.lang.String getTypeDescription() {
        return typeDescription;
    }


    /**
     * Sets the typeDescription value for this PatentDetailsInfo.
     * 
     * @param typeDescription
     */
    public void setTypeDescription(java.lang.String typeDescription) {
        this.typeDescription = typeDescription;
    }


    /**
     * Gets the classifierList value for this PatentDetailsInfo.
     * 
     * @return classifierList
     */
    public holdkrykke.mp1.lib.client.PatentClassifierInfo[] getClassifierList() {
        return classifierList;
    }


    /**
     * Sets the classifierList value for this PatentDetailsInfo.
     * 
     * @param classifierList
     */
    public void setClassifierList(holdkrykke.mp1.lib.client.PatentClassifierInfo[] classifierList) {
        this.classifierList = classifierList;
    }


    /**
     * Gets the application value for this PatentDetailsInfo.
     * 
     * @return application
     */
    public holdkrykke.mp1.lib.client.PatentApplication getApplication() {
        return application;
    }


    /**
     * Sets the application value for this PatentDetailsInfo.
     * 
     * @param application
     */
    public void setApplication(holdkrykke.mp1.lib.client.PatentApplication application) {
        this.application = application;
    }


    /**
     * Gets the priorityList value for this PatentDetailsInfo.
     * 
     * @return priorityList
     */
    public holdkrykke.mp1.lib.client.PatentPriorityData[] getPriorityList() {
        return priorityList;
    }


    /**
     * Sets the priorityList value for this PatentDetailsInfo.
     * 
     * @param priorityList
     */
    public void setPriorityList(holdkrykke.mp1.lib.client.PatentPriorityData[] priorityList) {
        this.priorityList = priorityList;
    }


    /**
     * Gets the familyList value for this PatentDetailsInfo.
     * 
     * @return familyList
     */
    public holdkrykke.mp1.lib.client.PatentFamilyData[] getFamilyList() {
        return familyList;
    }


    /**
     * Sets the familyList value for this PatentDetailsInfo.
     * 
     * @param familyList
     */
    public void setFamilyList(holdkrykke.mp1.lib.client.PatentFamilyData[] familyList) {
        this.familyList = familyList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PatentDetailsInfo)) return false;
        PatentDetailsInfo other = (PatentDetailsInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.countryCode==null && other.getCountryCode()==null) || 
             (this.countryCode!=null &&
              this.countryCode.equals(other.getCountryCode()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.typeCode==null && other.getTypeCode()==null) || 
             (this.typeCode!=null &&
              this.typeCode.equals(other.getTypeCode()))) &&
            ((this.typeDescription==null && other.getTypeDescription()==null) || 
             (this.typeDescription!=null &&
              this.typeDescription.equals(other.getTypeDescription()))) &&
            ((this.classifierList==null && other.getClassifierList()==null) || 
             (this.classifierList!=null &&
              java.util.Arrays.equals(this.classifierList, other.getClassifierList()))) &&
            ((this.application==null && other.getApplication()==null) || 
             (this.application!=null &&
              this.application.equals(other.getApplication()))) &&
            ((this.priorityList==null && other.getPriorityList()==null) || 
             (this.priorityList!=null &&
              java.util.Arrays.equals(this.priorityList, other.getPriorityList()))) &&
            ((this.familyList==null && other.getFamilyList()==null) || 
             (this.familyList!=null &&
              java.util.Arrays.equals(this.familyList, other.getFamilyList())));
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
        if (getCountryCode() != null) {
            _hashCode += getCountryCode().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getTypeCode() != null) {
            _hashCode += getTypeCode().hashCode();
        }
        if (getTypeDescription() != null) {
            _hashCode += getTypeDescription().hashCode();
        }
        if (getClassifierList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClassifierList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClassifierList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getApplication() != null) {
            _hashCode += getApplication().hashCode();
        }
        if (getPriorityList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPriorityList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPriorityList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFamilyList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFamilyList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFamilyList(), i);
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
        new org.apache.axis.description.TypeDesc(PatentDetailsInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "patentDetailsInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "countryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "typeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "typeDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classifierList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "classifierList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "patentClassifierInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "classifier"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("application");
        elemField.setXmlName(new javax.xml.namespace.QName("", "application"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "patentApplication"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priorityList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priorityList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "patentPriorityData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "priority"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("familyList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "familyList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "patentFamilyData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "family"));
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
