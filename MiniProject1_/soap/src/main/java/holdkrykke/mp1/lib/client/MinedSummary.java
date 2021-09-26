/**
 * MinedSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package holdkrykke.mp1.lib.client;

public class MinedSummary  implements java.io.Serializable {
    private java.lang.String term;

    private int count;

    private java.lang.String[] altNameList;

    private java.lang.String dbName;

    private java.lang.String[] dbIdList;

    public MinedSummary() {
    }

    public MinedSummary(
           java.lang.String term,
           int count,
           java.lang.String[] altNameList,
           java.lang.String dbName,
           java.lang.String[] dbIdList) {
           this.term = term;
           this.count = count;
           this.altNameList = altNameList;
           this.dbName = dbName;
           this.dbIdList = dbIdList;
    }


    /**
     * Gets the term value for this MinedSummary.
     * 
     * @return term
     */
    public java.lang.String getTerm() {
        return term;
    }


    /**
     * Sets the term value for this MinedSummary.
     * 
     * @param term
     */
    public void setTerm(java.lang.String term) {
        this.term = term;
    }


    /**
     * Gets the count value for this MinedSummary.
     * 
     * @return count
     */
    public int getCount() {
        return count;
    }


    /**
     * Sets the count value for this MinedSummary.
     * 
     * @param count
     */
    public void setCount(int count) {
        this.count = count;
    }


    /**
     * Gets the altNameList value for this MinedSummary.
     * 
     * @return altNameList
     */
    public java.lang.String[] getAltNameList() {
        return altNameList;
    }


    /**
     * Sets the altNameList value for this MinedSummary.
     * 
     * @param altNameList
     */
    public void setAltNameList(java.lang.String[] altNameList) {
        this.altNameList = altNameList;
    }


    /**
     * Gets the dbName value for this MinedSummary.
     * 
     * @return dbName
     */
    public java.lang.String getDbName() {
        return dbName;
    }


    /**
     * Sets the dbName value for this MinedSummary.
     * 
     * @param dbName
     */
    public void setDbName(java.lang.String dbName) {
        this.dbName = dbName;
    }


    /**
     * Gets the dbIdList value for this MinedSummary.
     * 
     * @return dbIdList
     */
    public java.lang.String[] getDbIdList() {
        return dbIdList;
    }


    /**
     * Sets the dbIdList value for this MinedSummary.
     * 
     * @param dbIdList
     */
    public void setDbIdList(java.lang.String[] dbIdList) {
        this.dbIdList = dbIdList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MinedSummary)) return false;
        MinedSummary other = (MinedSummary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.term==null && other.getTerm()==null) || 
             (this.term!=null &&
              this.term.equals(other.getTerm()))) &&
            this.count == other.getCount() &&
            ((this.altNameList==null && other.getAltNameList()==null) || 
             (this.altNameList!=null &&
              java.util.Arrays.equals(this.altNameList, other.getAltNameList()))) &&
            ((this.dbName==null && other.getDbName()==null) || 
             (this.dbName!=null &&
              this.dbName.equals(other.getDbName()))) &&
            ((this.dbIdList==null && other.getDbIdList()==null) || 
             (this.dbIdList!=null &&
              java.util.Arrays.equals(this.dbIdList, other.getDbIdList())));
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
        if (getTerm() != null) {
            _hashCode += getTerm().hashCode();
        }
        _hashCode += getCount();
        if (getAltNameList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAltNameList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAltNameList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDbName() != null) {
            _hashCode += getDbName().hashCode();
        }
        if (getDbIdList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDbIdList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDbIdList(), i);
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
        new org.apache.axis.description.TypeDesc(MinedSummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "minedSummary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("term");
        elemField.setXmlName(new javax.xml.namespace.QName("", "term"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("count");
        elemField.setXmlName(new javax.xml.namespace.QName("", "count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altNameList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "altNameList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "altName"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dbName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dbName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dbIdList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dbIdList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "dbId"));
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
