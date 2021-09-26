/**
 * DbCrossReference.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package holdkrykke.mp1.lib.client;

public class DbCrossReference  implements java.io.Serializable {
    private java.lang.String dbName;

    private int dbCount;

    private holdkrykke.mp1.lib.client.DbCrossReferenceInfo[] dbCrossReferenceInfo;

    public DbCrossReference() {
    }

    public DbCrossReference(
           java.lang.String dbName,
           int dbCount,
           holdkrykke.mp1.lib.client.DbCrossReferenceInfo[] dbCrossReferenceInfo) {
           this.dbName = dbName;
           this.dbCount = dbCount;
           this.dbCrossReferenceInfo = dbCrossReferenceInfo;
    }


    /**
     * Gets the dbName value for this DbCrossReference.
     * 
     * @return dbName
     */
    public java.lang.String getDbName() {
        return dbName;
    }


    /**
     * Sets the dbName value for this DbCrossReference.
     * 
     * @param dbName
     */
    public void setDbName(java.lang.String dbName) {
        this.dbName = dbName;
    }


    /**
     * Gets the dbCount value for this DbCrossReference.
     * 
     * @return dbCount
     */
    public int getDbCount() {
        return dbCount;
    }


    /**
     * Sets the dbCount value for this DbCrossReference.
     * 
     * @param dbCount
     */
    public void setDbCount(int dbCount) {
        this.dbCount = dbCount;
    }


    /**
     * Gets the dbCrossReferenceInfo value for this DbCrossReference.
     * 
     * @return dbCrossReferenceInfo
     */
    public holdkrykke.mp1.lib.client.DbCrossReferenceInfo[] getDbCrossReferenceInfo() {
        return dbCrossReferenceInfo;
    }


    /**
     * Sets the dbCrossReferenceInfo value for this DbCrossReference.
     * 
     * @param dbCrossReferenceInfo
     */
    public void setDbCrossReferenceInfo(holdkrykke.mp1.lib.client.DbCrossReferenceInfo[] dbCrossReferenceInfo) {
        this.dbCrossReferenceInfo = dbCrossReferenceInfo;
    }

    public holdkrykke.mp1.lib.client.DbCrossReferenceInfo getDbCrossReferenceInfo(int i) {
        return this.dbCrossReferenceInfo[i];
    }

    public void setDbCrossReferenceInfo(int i, holdkrykke.mp1.lib.client.DbCrossReferenceInfo _value) {
        this.dbCrossReferenceInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DbCrossReference)) return false;
        DbCrossReference other = (DbCrossReference) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dbName==null && other.getDbName()==null) || 
             (this.dbName!=null &&
              this.dbName.equals(other.getDbName()))) &&
            this.dbCount == other.getDbCount() &&
            ((this.dbCrossReferenceInfo==null && other.getDbCrossReferenceInfo()==null) || 
             (this.dbCrossReferenceInfo!=null &&
              java.util.Arrays.equals(this.dbCrossReferenceInfo, other.getDbCrossReferenceInfo())));
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
        if (getDbName() != null) {
            _hashCode += getDbName().hashCode();
        }
        _hashCode += getDbCount();
        if (getDbCrossReferenceInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDbCrossReferenceInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDbCrossReferenceInfo(), i);
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
        new org.apache.axis.description.TypeDesc(DbCrossReference.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "dbCrossReference"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dbName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dbName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dbCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dbCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dbCrossReferenceInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dbCrossReferenceInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "dbCrossReferenceInfo"));
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
