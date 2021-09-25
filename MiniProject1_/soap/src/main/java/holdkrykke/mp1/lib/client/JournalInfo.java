/**
 * JournalInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package holdkrykke.mp1.lib.client;

public class JournalInfo  implements java.io.Serializable {
    private java.lang.String issue;

    private java.lang.String volume;

    private java.lang.Integer journalIssueId;

    private java.lang.String dateOfPublication;

    private java.lang.Byte monthOfPublication;

    private java.lang.Short yearOfPublication;

    private java.lang.String printPublicationDate;

    private holdkrykke.mp1.lib.client.Journal journal;

    public JournalInfo() {
    }

    public JournalInfo(
           java.lang.String issue,
           java.lang.String volume,
           java.lang.Integer journalIssueId,
           java.lang.String dateOfPublication,
           java.lang.Byte monthOfPublication,
           java.lang.Short yearOfPublication,
           java.lang.String printPublicationDate,
           holdkrykke.mp1.lib.client.Journal journal) {
           this.issue = issue;
           this.volume = volume;
           this.journalIssueId = journalIssueId;
           this.dateOfPublication = dateOfPublication;
           this.monthOfPublication = monthOfPublication;
           this.yearOfPublication = yearOfPublication;
           this.printPublicationDate = printPublicationDate;
           this.journal = journal;
    }


    /**
     * Gets the issue value for this JournalInfo.
     * 
     * @return issue
     */
    public java.lang.String getIssue() {
        return issue;
    }


    /**
     * Sets the issue value for this JournalInfo.
     * 
     * @param issue
     */
    public void setIssue(java.lang.String issue) {
        this.issue = issue;
    }


    /**
     * Gets the volume value for this JournalInfo.
     * 
     * @return volume
     */
    public java.lang.String getVolume() {
        return volume;
    }


    /**
     * Sets the volume value for this JournalInfo.
     * 
     * @param volume
     */
    public void setVolume(java.lang.String volume) {
        this.volume = volume;
    }


    /**
     * Gets the journalIssueId value for this JournalInfo.
     * 
     * @return journalIssueId
     */
    public java.lang.Integer getJournalIssueId() {
        return journalIssueId;
    }


    /**
     * Sets the journalIssueId value for this JournalInfo.
     * 
     * @param journalIssueId
     */
    public void setJournalIssueId(java.lang.Integer journalIssueId) {
        this.journalIssueId = journalIssueId;
    }


    /**
     * Gets the dateOfPublication value for this JournalInfo.
     * 
     * @return dateOfPublication
     */
    public java.lang.String getDateOfPublication() {
        return dateOfPublication;
    }


    /**
     * Sets the dateOfPublication value for this JournalInfo.
     * 
     * @param dateOfPublication
     */
    public void setDateOfPublication(java.lang.String dateOfPublication) {
        this.dateOfPublication = dateOfPublication;
    }


    /**
     * Gets the monthOfPublication value for this JournalInfo.
     * 
     * @return monthOfPublication
     */
    public java.lang.Byte getMonthOfPublication() {
        return monthOfPublication;
    }


    /**
     * Sets the monthOfPublication value for this JournalInfo.
     * 
     * @param monthOfPublication
     */
    public void setMonthOfPublication(java.lang.Byte monthOfPublication) {
        this.monthOfPublication = monthOfPublication;
    }


    /**
     * Gets the yearOfPublication value for this JournalInfo.
     * 
     * @return yearOfPublication
     */
    public java.lang.Short getYearOfPublication() {
        return yearOfPublication;
    }


    /**
     * Sets the yearOfPublication value for this JournalInfo.
     * 
     * @param yearOfPublication
     */
    public void setYearOfPublication(java.lang.Short yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }


    /**
     * Gets the printPublicationDate value for this JournalInfo.
     * 
     * @return printPublicationDate
     */
    public java.lang.String getPrintPublicationDate() {
        return printPublicationDate;
    }


    /**
     * Sets the printPublicationDate value for this JournalInfo.
     * 
     * @param printPublicationDate
     */
    public void setPrintPublicationDate(java.lang.String printPublicationDate) {
        this.printPublicationDate = printPublicationDate;
    }


    /**
     * Gets the journal value for this JournalInfo.
     * 
     * @return journal
     */
    public holdkrykke.mp1.lib.client.Journal getJournal() {
        return journal;
    }


    /**
     * Sets the journal value for this JournalInfo.
     * 
     * @param journal
     */
    public void setJournal(holdkrykke.mp1.lib.client.Journal journal) {
        this.journal = journal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof JournalInfo)) return false;
        JournalInfo other = (JournalInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.issue==null && other.getIssue()==null) || 
             (this.issue!=null &&
              this.issue.equals(other.getIssue()))) &&
            ((this.volume==null && other.getVolume()==null) || 
             (this.volume!=null &&
              this.volume.equals(other.getVolume()))) &&
            ((this.journalIssueId==null && other.getJournalIssueId()==null) || 
             (this.journalIssueId!=null &&
              this.journalIssueId.equals(other.getJournalIssueId()))) &&
            ((this.dateOfPublication==null && other.getDateOfPublication()==null) || 
             (this.dateOfPublication!=null &&
              this.dateOfPublication.equals(other.getDateOfPublication()))) &&
            ((this.monthOfPublication==null && other.getMonthOfPublication()==null) || 
             (this.monthOfPublication!=null &&
              this.monthOfPublication.equals(other.getMonthOfPublication()))) &&
            ((this.yearOfPublication==null && other.getYearOfPublication()==null) || 
             (this.yearOfPublication!=null &&
              this.yearOfPublication.equals(other.getYearOfPublication()))) &&
            ((this.printPublicationDate==null && other.getPrintPublicationDate()==null) || 
             (this.printPublicationDate!=null &&
              this.printPublicationDate.equals(other.getPrintPublicationDate()))) &&
            ((this.journal==null && other.getJournal()==null) || 
             (this.journal!=null &&
              this.journal.equals(other.getJournal())));
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
        if (getIssue() != null) {
            _hashCode += getIssue().hashCode();
        }
        if (getVolume() != null) {
            _hashCode += getVolume().hashCode();
        }
        if (getJournalIssueId() != null) {
            _hashCode += getJournalIssueId().hashCode();
        }
        if (getDateOfPublication() != null) {
            _hashCode += getDateOfPublication().hashCode();
        }
        if (getMonthOfPublication() != null) {
            _hashCode += getMonthOfPublication().hashCode();
        }
        if (getYearOfPublication() != null) {
            _hashCode += getYearOfPublication().hashCode();
        }
        if (getPrintPublicationDate() != null) {
            _hashCode += getPrintPublicationDate().hashCode();
        }
        if (getJournal() != null) {
            _hashCode += getJournal().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(JournalInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "journalInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "issue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("volume");
        elemField.setXmlName(new javax.xml.namespace.QName("", "volume"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("journalIssueId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "journalIssueId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOfPublication");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateOfPublication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monthOfPublication");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monthOfPublication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "byte"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("yearOfPublication");
        elemField.setXmlName(new javax.xml.namespace.QName("", "yearOfPublication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printPublicationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "printPublicationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("journal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "journal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "journal"));
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
