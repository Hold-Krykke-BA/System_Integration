/**
 * DataLinkedElement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package holdkrykke.mp1.lib.client;

public class DataLinkedElement  implements java.io.Serializable {
    private holdkrykke.mp1.lib.client.DataLinkObjectType type;

    private holdkrykke.mp1.lib.client.DataLinkIdentifier identifier;

    private java.lang.String title;

    private holdkrykke.mp1.lib.client.ObjectPublisher publisher;

    private java.lang.String imageURL;

    public DataLinkedElement() {
    }

    public DataLinkedElement(
           holdkrykke.mp1.lib.client.DataLinkObjectType type,
           holdkrykke.mp1.lib.client.DataLinkIdentifier identifier,
           java.lang.String title,
           holdkrykke.mp1.lib.client.ObjectPublisher publisher,
           java.lang.String imageURL) {
           this.type = type;
           this.identifier = identifier;
           this.title = title;
           this.publisher = publisher;
           this.imageURL = imageURL;
    }


    /**
     * Gets the type value for this DataLinkedElement.
     * 
     * @return type
     */
    public holdkrykke.mp1.lib.client.DataLinkObjectType getType() {
        return type;
    }


    /**
     * Sets the type value for this DataLinkedElement.
     * 
     * @param type
     */
    public void setType(holdkrykke.mp1.lib.client.DataLinkObjectType type) {
        this.type = type;
    }


    /**
     * Gets the identifier value for this DataLinkedElement.
     * 
     * @return identifier
     */
    public holdkrykke.mp1.lib.client.DataLinkIdentifier getIdentifier() {
        return identifier;
    }


    /**
     * Sets the identifier value for this DataLinkedElement.
     * 
     * @param identifier
     */
    public void setIdentifier(holdkrykke.mp1.lib.client.DataLinkIdentifier identifier) {
        this.identifier = identifier;
    }


    /**
     * Gets the title value for this DataLinkedElement.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this DataLinkedElement.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the publisher value for this DataLinkedElement.
     * 
     * @return publisher
     */
    public holdkrykke.mp1.lib.client.ObjectPublisher getPublisher() {
        return publisher;
    }


    /**
     * Sets the publisher value for this DataLinkedElement.
     * 
     * @param publisher
     */
    public void setPublisher(holdkrykke.mp1.lib.client.ObjectPublisher publisher) {
        this.publisher = publisher;
    }


    /**
     * Gets the imageURL value for this DataLinkedElement.
     * 
     * @return imageURL
     */
    public java.lang.String getImageURL() {
        return imageURL;
    }


    /**
     * Sets the imageURL value for this DataLinkedElement.
     * 
     * @param imageURL
     */
    public void setImageURL(java.lang.String imageURL) {
        this.imageURL = imageURL;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DataLinkedElement)) return false;
        DataLinkedElement other = (DataLinkedElement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.identifier==null && other.getIdentifier()==null) || 
             (this.identifier!=null &&
              this.identifier.equals(other.getIdentifier()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.publisher==null && other.getPublisher()==null) || 
             (this.publisher!=null &&
              this.publisher.equals(other.getPublisher()))) &&
            ((this.imageURL==null && other.getImageURL()==null) || 
             (this.imageURL!=null &&
              this.imageURL.equals(other.getImageURL())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getIdentifier() != null) {
            _hashCode += getIdentifier().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getPublisher() != null) {
            _hashCode += getPublisher().hashCode();
        }
        if (getImageURL() != null) {
            _hashCode += getImageURL().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DataLinkedElement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.scholix.org", "dataLinkedElement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.scholix.org", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.scholix.org", "dataLinkObjectType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.scholix.org", "Identifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.scholix.org", "dataLinkIdentifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.scholix.org", "Title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publisher");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.scholix.org", "Publisher"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.europepmc.org/data", "objectPublisher"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageURL");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.europepmc.org/data", "ImageURL"));
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
