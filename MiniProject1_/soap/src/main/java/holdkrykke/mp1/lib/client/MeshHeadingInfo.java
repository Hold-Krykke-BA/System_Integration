/**
 * MeshHeadingInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package holdkrykke.mp1.lib.client;

public class MeshHeadingInfo  implements java.io.Serializable {
    private java.lang.String majorTopic_YN;

    private java.lang.String descriptorName;

    private holdkrykke.mp1.lib.client.MeshQualifierInfo[] meshQualifierList;

    public MeshHeadingInfo() {
    }

    public MeshHeadingInfo(
           java.lang.String majorTopic_YN,
           java.lang.String descriptorName,
           holdkrykke.mp1.lib.client.MeshQualifierInfo[] meshQualifierList) {
           this.majorTopic_YN = majorTopic_YN;
           this.descriptorName = descriptorName;
           this.meshQualifierList = meshQualifierList;
    }


    /**
     * Gets the majorTopic_YN value for this MeshHeadingInfo.
     * 
     * @return majorTopic_YN
     */
    public java.lang.String getMajorTopic_YN() {
        return majorTopic_YN;
    }


    /**
     * Sets the majorTopic_YN value for this MeshHeadingInfo.
     * 
     * @param majorTopic_YN
     */
    public void setMajorTopic_YN(java.lang.String majorTopic_YN) {
        this.majorTopic_YN = majorTopic_YN;
    }


    /**
     * Gets the descriptorName value for this MeshHeadingInfo.
     * 
     * @return descriptorName
     */
    public java.lang.String getDescriptorName() {
        return descriptorName;
    }


    /**
     * Sets the descriptorName value for this MeshHeadingInfo.
     * 
     * @param descriptorName
     */
    public void setDescriptorName(java.lang.String descriptorName) {
        this.descriptorName = descriptorName;
    }


    /**
     * Gets the meshQualifierList value for this MeshHeadingInfo.
     * 
     * @return meshQualifierList
     */
    public holdkrykke.mp1.lib.client.MeshQualifierInfo[] getMeshQualifierList() {
        return meshQualifierList;
    }


    /**
     * Sets the meshQualifierList value for this MeshHeadingInfo.
     * 
     * @param meshQualifierList
     */
    public void setMeshQualifierList(holdkrykke.mp1.lib.client.MeshQualifierInfo[] meshQualifierList) {
        this.meshQualifierList = meshQualifierList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MeshHeadingInfo)) return false;
        MeshHeadingInfo other = (MeshHeadingInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.majorTopic_YN==null && other.getMajorTopic_YN()==null) || 
             (this.majorTopic_YN!=null &&
              this.majorTopic_YN.equals(other.getMajorTopic_YN()))) &&
            ((this.descriptorName==null && other.getDescriptorName()==null) || 
             (this.descriptorName!=null &&
              this.descriptorName.equals(other.getDescriptorName()))) &&
            ((this.meshQualifierList==null && other.getMeshQualifierList()==null) || 
             (this.meshQualifierList!=null &&
              java.util.Arrays.equals(this.meshQualifierList, other.getMeshQualifierList())));
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
        if (getMajorTopic_YN() != null) {
            _hashCode += getMajorTopic_YN().hashCode();
        }
        if (getDescriptorName() != null) {
            _hashCode += getDescriptorName().hashCode();
        }
        if (getMeshQualifierList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMeshQualifierList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMeshQualifierList(), i);
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
        new org.apache.axis.description.TypeDesc(MeshHeadingInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "meshHeadingInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("majorTopic_YN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "majorTopic_YN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descriptorName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descriptorName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("meshQualifierList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "meshQualifierList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "meshQualifierInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "meshQualifier"));
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
