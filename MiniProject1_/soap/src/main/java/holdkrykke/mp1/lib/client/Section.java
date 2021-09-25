/**
 * Section.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package holdkrykke.mp1.lib.client;

public class Section  implements java.io.Serializable {
    private java.lang.String obtainedBy;

    private java.lang.String[] tags;

    private java.lang.Integer sectionLinkCount;

    private java.lang.String collectionURL;

    private holdkrykke.mp1.lib.client.Link[] linklist;

    public Section() {
    }

    public Section(
           java.lang.String obtainedBy,
           java.lang.String[] tags,
           java.lang.Integer sectionLinkCount,
           java.lang.String collectionURL,
           holdkrykke.mp1.lib.client.Link[] linklist) {
           this.obtainedBy = obtainedBy;
           this.tags = tags;
           this.sectionLinkCount = sectionLinkCount;
           this.collectionURL = collectionURL;
           this.linklist = linklist;
    }


    /**
     * Gets the obtainedBy value for this Section.
     * 
     * @return obtainedBy
     */
    public java.lang.String getObtainedBy() {
        return obtainedBy;
    }


    /**
     * Sets the obtainedBy value for this Section.
     * 
     * @param obtainedBy
     */
    public void setObtainedBy(java.lang.String obtainedBy) {
        this.obtainedBy = obtainedBy;
    }


    /**
     * Gets the tags value for this Section.
     * 
     * @return tags
     */
    public java.lang.String[] getTags() {
        return tags;
    }


    /**
     * Sets the tags value for this Section.
     * 
     * @param tags
     */
    public void setTags(java.lang.String[] tags) {
        this.tags = tags;
    }


    /**
     * Gets the sectionLinkCount value for this Section.
     * 
     * @return sectionLinkCount
     */
    public java.lang.Integer getSectionLinkCount() {
        return sectionLinkCount;
    }


    /**
     * Sets the sectionLinkCount value for this Section.
     * 
     * @param sectionLinkCount
     */
    public void setSectionLinkCount(java.lang.Integer sectionLinkCount) {
        this.sectionLinkCount = sectionLinkCount;
    }


    /**
     * Gets the collectionURL value for this Section.
     * 
     * @return collectionURL
     */
    public java.lang.String getCollectionURL() {
        return collectionURL;
    }


    /**
     * Sets the collectionURL value for this Section.
     * 
     * @param collectionURL
     */
    public void setCollectionURL(java.lang.String collectionURL) {
        this.collectionURL = collectionURL;
    }


    /**
     * Gets the linklist value for this Section.
     * 
     * @return linklist
     */
    public holdkrykke.mp1.lib.client.Link[] getLinklist() {
        return linklist;
    }


    /**
     * Sets the linklist value for this Section.
     * 
     * @param linklist
     */
    public void setLinklist(holdkrykke.mp1.lib.client.Link[] linklist) {
        this.linklist = linklist;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Section)) return false;
        Section other = (Section) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.obtainedBy==null && other.getObtainedBy()==null) || 
             (this.obtainedBy!=null &&
              this.obtainedBy.equals(other.getObtainedBy()))) &&
            ((this.tags==null && other.getTags()==null) || 
             (this.tags!=null &&
              java.util.Arrays.equals(this.tags, other.getTags()))) &&
            ((this.sectionLinkCount==null && other.getSectionLinkCount()==null) || 
             (this.sectionLinkCount!=null &&
              this.sectionLinkCount.equals(other.getSectionLinkCount()))) &&
            ((this.collectionURL==null && other.getCollectionURL()==null) || 
             (this.collectionURL!=null &&
              this.collectionURL.equals(other.getCollectionURL()))) &&
            ((this.linklist==null && other.getLinklist()==null) || 
             (this.linklist!=null &&
              java.util.Arrays.equals(this.linklist, other.getLinklist())));
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
        if (getObtainedBy() != null) {
            _hashCode += getObtainedBy().hashCode();
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
        if (getSectionLinkCount() != null) {
            _hashCode += getSectionLinkCount().hashCode();
        }
        if (getCollectionURL() != null) {
            _hashCode += getCollectionURL().hashCode();
        }
        if (getLinklist() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLinklist());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLinklist(), i);
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
        new org.apache.axis.description.TypeDesc(Section.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.europepmc.org/data", "Section"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("obtainedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.europepmc.org/data", "ObtainedBy"));
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
        elemField.setFieldName("sectionLinkCount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.europepmc.org/data", "SectionLinkCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collectionURL");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.europepmc.org/data", "CollectionURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linklist");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.europepmc.org/data", "Linklist"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.scholix.org", "Link"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Link"));
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
