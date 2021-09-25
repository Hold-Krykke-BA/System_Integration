/**
 * LabsProvider.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package holdkrykke.mp1.lib.client;

public class LabsProvider  implements java.io.Serializable {
    private java.lang.Integer id;

    private java.lang.String name;

    private java.lang.String description;

    private java.lang.String frontTab;

    private holdkrykke.mp1.lib.client.LabsLinks[] link;

    public LabsProvider() {
    }

    public LabsProvider(
           java.lang.Integer id,
           java.lang.String name,
           java.lang.String description,
           java.lang.String frontTab,
           holdkrykke.mp1.lib.client.LabsLinks[] link) {
           this.id = id;
           this.name = name;
           this.description = description;
           this.frontTab = frontTab;
           this.link = link;
    }


    /**
     * Gets the id value for this LabsProvider.
     * 
     * @return id
     */
    public java.lang.Integer getId() {
        return id;
    }


    /**
     * Sets the id value for this LabsProvider.
     * 
     * @param id
     */
    public void setId(java.lang.Integer id) {
        this.id = id;
    }


    /**
     * Gets the name value for this LabsProvider.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this LabsProvider.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the description value for this LabsProvider.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this LabsProvider.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the frontTab value for this LabsProvider.
     * 
     * @return frontTab
     */
    public java.lang.String getFrontTab() {
        return frontTab;
    }


    /**
     * Sets the frontTab value for this LabsProvider.
     * 
     * @param frontTab
     */
    public void setFrontTab(java.lang.String frontTab) {
        this.frontTab = frontTab;
    }


    /**
     * Gets the link value for this LabsProvider.
     * 
     * @return link
     */
    public holdkrykke.mp1.lib.client.LabsLinks[] getLink() {
        return link;
    }


    /**
     * Sets the link value for this LabsProvider.
     * 
     * @param link
     */
    public void setLink(holdkrykke.mp1.lib.client.LabsLinks[] link) {
        this.link = link;
    }

    public holdkrykke.mp1.lib.client.LabsLinks getLink(int i) {
        return this.link[i];
    }

    public void setLink(int i, holdkrykke.mp1.lib.client.LabsLinks _value) {
        this.link[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LabsProvider)) return false;
        LabsProvider other = (LabsProvider) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.frontTab==null && other.getFrontTab()==null) || 
             (this.frontTab!=null &&
              this.frontTab.equals(other.getFrontTab()))) &&
            ((this.link==null && other.getLink()==null) || 
             (this.link!=null &&
              java.util.Arrays.equals(this.link, other.getLink())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getFrontTab() != null) {
            _hashCode += getFrontTab().hashCode();
        }
        if (getLink() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLink());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLink(), i);
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
        new org.apache.axis.description.TypeDesc(LabsProvider.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "labsProvider"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frontTab");
        elemField.setXmlName(new javax.xml.namespace.QName("", "frontTab"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("link");
        elemField.setXmlName(new javax.xml.namespace.QName("", "link"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "labsLinks"));
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
