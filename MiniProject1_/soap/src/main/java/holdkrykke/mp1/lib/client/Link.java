/**
 * Link.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package holdkrykke.mp1.lib.client;

public class Link  implements java.io.Serializable {
    private java.lang.String obtainedBy;

    private java.lang.String publicationDate;

    private holdkrykke.mp1.lib.client.LinkProvider linkProvider;

    private holdkrykke.mp1.lib.client.RelationshipType relationshipType;

    private holdkrykke.mp1.lib.client.DataLinkedElement source;

    private holdkrykke.mp1.lib.client.DataLinkedElement target;

    private java.lang.Integer frequency;

    public Link() {
    }

    public Link(
           java.lang.String obtainedBy,
           java.lang.String publicationDate,
           holdkrykke.mp1.lib.client.LinkProvider linkProvider,
           holdkrykke.mp1.lib.client.RelationshipType relationshipType,
           holdkrykke.mp1.lib.client.DataLinkedElement source,
           holdkrykke.mp1.lib.client.DataLinkedElement target,
           java.lang.Integer frequency) {
           this.obtainedBy = obtainedBy;
           this.publicationDate = publicationDate;
           this.linkProvider = linkProvider;
           this.relationshipType = relationshipType;
           this.source = source;
           this.target = target;
           this.frequency = frequency;
    }


    /**
     * Gets the obtainedBy value for this Link.
     * 
     * @return obtainedBy
     */
    public java.lang.String getObtainedBy() {
        return obtainedBy;
    }


    /**
     * Sets the obtainedBy value for this Link.
     * 
     * @param obtainedBy
     */
    public void setObtainedBy(java.lang.String obtainedBy) {
        this.obtainedBy = obtainedBy;
    }


    /**
     * Gets the publicationDate value for this Link.
     * 
     * @return publicationDate
     */
    public java.lang.String getPublicationDate() {
        return publicationDate;
    }


    /**
     * Sets the publicationDate value for this Link.
     * 
     * @param publicationDate
     */
    public void setPublicationDate(java.lang.String publicationDate) {
        this.publicationDate = publicationDate;
    }


    /**
     * Gets the linkProvider value for this Link.
     * 
     * @return linkProvider
     */
    public holdkrykke.mp1.lib.client.LinkProvider getLinkProvider() {
        return linkProvider;
    }


    /**
     * Sets the linkProvider value for this Link.
     * 
     * @param linkProvider
     */
    public void setLinkProvider(holdkrykke.mp1.lib.client.LinkProvider linkProvider) {
        this.linkProvider = linkProvider;
    }


    /**
     * Gets the relationshipType value for this Link.
     * 
     * @return relationshipType
     */
    public holdkrykke.mp1.lib.client.RelationshipType getRelationshipType() {
        return relationshipType;
    }


    /**
     * Sets the relationshipType value for this Link.
     * 
     * @param relationshipType
     */
    public void setRelationshipType(holdkrykke.mp1.lib.client.RelationshipType relationshipType) {
        this.relationshipType = relationshipType;
    }


    /**
     * Gets the source value for this Link.
     * 
     * @return source
     */
    public holdkrykke.mp1.lib.client.DataLinkedElement getSource() {
        return source;
    }


    /**
     * Sets the source value for this Link.
     * 
     * @param source
     */
    public void setSource(holdkrykke.mp1.lib.client.DataLinkedElement source) {
        this.source = source;
    }


    /**
     * Gets the target value for this Link.
     * 
     * @return target
     */
    public holdkrykke.mp1.lib.client.DataLinkedElement getTarget() {
        return target;
    }


    /**
     * Sets the target value for this Link.
     * 
     * @param target
     */
    public void setTarget(holdkrykke.mp1.lib.client.DataLinkedElement target) {
        this.target = target;
    }


    /**
     * Gets the frequency value for this Link.
     * 
     * @return frequency
     */
    public java.lang.Integer getFrequency() {
        return frequency;
    }


    /**
     * Sets the frequency value for this Link.
     * 
     * @param frequency
     */
    public void setFrequency(java.lang.Integer frequency) {
        this.frequency = frequency;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Link)) return false;
        Link other = (Link) obj;
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
            ((this.publicationDate==null && other.getPublicationDate()==null) || 
             (this.publicationDate!=null &&
              this.publicationDate.equals(other.getPublicationDate()))) &&
            ((this.linkProvider==null && other.getLinkProvider()==null) || 
             (this.linkProvider!=null &&
              this.linkProvider.equals(other.getLinkProvider()))) &&
            ((this.relationshipType==null && other.getRelationshipType()==null) || 
             (this.relationshipType!=null &&
              this.relationshipType.equals(other.getRelationshipType()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.target==null && other.getTarget()==null) || 
             (this.target!=null &&
              this.target.equals(other.getTarget()))) &&
            ((this.frequency==null && other.getFrequency()==null) || 
             (this.frequency!=null &&
              this.frequency.equals(other.getFrequency())));
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
        if (getPublicationDate() != null) {
            _hashCode += getPublicationDate().hashCode();
        }
        if (getLinkProvider() != null) {
            _hashCode += getLinkProvider().hashCode();
        }
        if (getRelationshipType() != null) {
            _hashCode += getRelationshipType().hashCode();
        }
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getTarget() != null) {
            _hashCode += getTarget().hashCode();
        }
        if (getFrequency() != null) {
            _hashCode += getFrequency().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Link.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.scholix.org", "Link"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("obtainedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.scholix.org", "ObtainedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.scholix.org", "PublicationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkProvider");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.scholix.org", "LinkProvider"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.scholix.org", "linkProvider"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationshipType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.scholix.org", "RelationshipType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.scholix.org", "RelationshipType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.scholix.org", "Source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.scholix.org", "dataLinkedElement"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("target");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.scholix.org", "Target"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.scholix.org", "dataLinkedElement"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frequency");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.europepmc.org/data", "Frequency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
