/**
 * Category.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package holdkrykke.mp1.lib.client;

public class Category  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String nameLong;

    private java.lang.String[] tags;

    private java.lang.Integer categoryLinkCount;

    private holdkrykke.mp1.lib.client.Section[] section;

    public Category() {
    }

    public Category(
           java.lang.String name,
           java.lang.String nameLong,
           java.lang.String[] tags,
           java.lang.Integer categoryLinkCount,
           holdkrykke.mp1.lib.client.Section[] section) {
           this.name = name;
           this.nameLong = nameLong;
           this.tags = tags;
           this.categoryLinkCount = categoryLinkCount;
           this.section = section;
    }


    /**
     * Gets the name value for this Category.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Category.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the nameLong value for this Category.
     * 
     * @return nameLong
     */
    public java.lang.String getNameLong() {
        return nameLong;
    }


    /**
     * Sets the nameLong value for this Category.
     * 
     * @param nameLong
     */
    public void setNameLong(java.lang.String nameLong) {
        this.nameLong = nameLong;
    }


    /**
     * Gets the tags value for this Category.
     * 
     * @return tags
     */
    public java.lang.String[] getTags() {
        return tags;
    }


    /**
     * Sets the tags value for this Category.
     * 
     * @param tags
     */
    public void setTags(java.lang.String[] tags) {
        this.tags = tags;
    }


    /**
     * Gets the categoryLinkCount value for this Category.
     * 
     * @return categoryLinkCount
     */
    public java.lang.Integer getCategoryLinkCount() {
        return categoryLinkCount;
    }


    /**
     * Sets the categoryLinkCount value for this Category.
     * 
     * @param categoryLinkCount
     */
    public void setCategoryLinkCount(java.lang.Integer categoryLinkCount) {
        this.categoryLinkCount = categoryLinkCount;
    }


    /**
     * Gets the section value for this Category.
     * 
     * @return section
     */
    public holdkrykke.mp1.lib.client.Section[] getSection() {
        return section;
    }


    /**
     * Sets the section value for this Category.
     * 
     * @param section
     */
    public void setSection(holdkrykke.mp1.lib.client.Section[] section) {
        this.section = section;
    }

    public holdkrykke.mp1.lib.client.Section getSection(int i) {
        return this.section[i];
    }

    public void setSection(int i, holdkrykke.mp1.lib.client.Section _value) {
        this.section[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Category)) return false;
        Category other = (Category) obj;
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
            ((this.nameLong==null && other.getNameLong()==null) || 
             (this.nameLong!=null &&
              this.nameLong.equals(other.getNameLong()))) &&
            ((this.tags==null && other.getTags()==null) || 
             (this.tags!=null &&
              java.util.Arrays.equals(this.tags, other.getTags()))) &&
            ((this.categoryLinkCount==null && other.getCategoryLinkCount()==null) || 
             (this.categoryLinkCount!=null &&
              this.categoryLinkCount.equals(other.getCategoryLinkCount()))) &&
            ((this.section==null && other.getSection()==null) || 
             (this.section!=null &&
              java.util.Arrays.equals(this.section, other.getSection())));
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
        if (getNameLong() != null) {
            _hashCode += getNameLong().hashCode();
        }
        if (getTags() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTags());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTags(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCategoryLinkCount() != null) {
            _hashCode += getCategoryLinkCount().hashCode();
        }
        if (getSection() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSection());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSection(), i);
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
        new org.apache.axis.description.TypeDesc(Category.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.europepmc.org/data", "Category"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.europepmc.org/data", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameLong");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.europepmc.org/data", "NameLong"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tags");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.europepmc.org/data", "Tags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://www.europepmc.org/data", "Tag"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryLinkCount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.europepmc.org/data", "CategoryLinkCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("section");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.europepmc.org/data", "Section"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.europepmc.org/data", "Section"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
