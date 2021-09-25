/**
 * Result.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package holdkrykke.mp1.lib.client;

public class Result  implements java.io.Serializable {
    private java.lang.Object mongoId;

    private holdkrykke.mp1.lib.client.Request request;

    private java.lang.Integer citationId;

    private java.lang.String id;

    private java.lang.String source;

    private java.lang.String pmid;

    private java.lang.String pmcid;

    private java.lang.String[] fullTextIdList;

    private java.lang.String doi;

    private java.lang.String title;

    private java.lang.String authorString;

    private holdkrykke.mp1.lib.client.Authors[] authorList;

    private holdkrykke.mp1.lib.client.Authors[] investigatorList;

    private holdkrykke.mp1.lib.client.AuthorId[] authorIdList;

    private java.lang.String[] dataLinksTagsList;

    private holdkrykke.mp1.lib.client.JournalInfo journalInfo;

    private java.lang.String journalTitle;

    private java.lang.String issue;

    private java.lang.String journalVolume;

    private java.lang.String pubYear;

    private java.lang.String journalIssn;

    private java.lang.String pageInfo;

    private java.lang.String abstractText;

    private java.lang.String affiliation;

    private java.lang.String publicationStatus;

    private java.lang.String language;

    private java.lang.String pubModel;

    private java.lang.String pubType;

    private java.lang.String[] pubTypeList;

    private java.lang.String brSummary;

    private holdkrykke.mp1.lib.client.BookOrReportDetails bookOrReportDetails;

    private holdkrykke.mp1.lib.client.PatentDetailsInfo patentDetails;

    private holdkrykke.mp1.lib.client.GrantInfo[] grantsList;

    private holdkrykke.mp1.lib.client.MeshHeadingInfo[] meshHeadingList;

    private java.lang.String[] keywordList;

    private holdkrykke.mp1.lib.client.ChemicalInfo[] chemicalList;

    private holdkrykke.mp1.lib.client.SubSet[] subsetList;

    private holdkrykke.mp1.lib.client.FullTextURLInfo[] fullTextUrlList;

    private holdkrykke.mp1.lib.client.CommentCorrection[] commentCorrectionList;

    private holdkrykke.mp1.lib.client.ExtComment[] extCommentList;

    private java.lang.String isOpenAccess;

    private java.lang.String inEPMC;

    private java.lang.String inPMC;

    private java.lang.String hasPDF;

    private java.lang.String hasBook;

    private java.lang.String bookid;

    private java.lang.String hasSuppl;

    private java.lang.Integer citedByCount;

    private java.lang.String hasData;

    private java.lang.String hasReferences;

    private java.lang.String hasTextMinedTerms;

    private java.lang.String hasDbCrossReferences;

    private java.lang.String[] dbCrossReferenceList;

    private java.lang.String hasSupplementary;

    private java.lang.String hasFullTextXML;

    private java.lang.String hasLabsLinks;

    private java.lang.String license;

    private holdkrykke.mp1.lib.client.Version[] versionList;

    private java.lang.Short versionNumber;

    private java.lang.String authMan;

    private java.lang.String epmcAuthMan;

    private java.lang.String nihAuthMan;

    private java.lang.String manuscriptId;

    private java.lang.String hasTMAccessionNumbers;

    private java.lang.String[] tmAccessionTypeList;

    private java.lang.String dateOfCompletion;

    private java.lang.String dateOfCreation;

    private java.lang.String firstIndexDate;

    private java.lang.String fullTextReceivedDate;

    private java.lang.String dateOfRevision;

    private java.lang.String electronicPublicationDate;

    private java.lang.String firstPublicationDate;

    private java.lang.String embargoDate;

    private org.apache.axis.types.URI fullText;

    private org.apache.axis.types.URI supplementaryFiles;

    private java.lang.String fullTextXML;

    private java.lang.String luceneScore;

    private java.util.Calendar dateUpdated;

    public Result() {
    }

    public Result(
           java.lang.Object mongoId,
           holdkrykke.mp1.lib.client.Request request,
           java.lang.Integer citationId,
           java.lang.String id,
           java.lang.String source,
           java.lang.String pmid,
           java.lang.String pmcid,
           java.lang.String[] fullTextIdList,
           java.lang.String doi,
           java.lang.String title,
           java.lang.String authorString,
           holdkrykke.mp1.lib.client.Authors[] authorList,
           holdkrykke.mp1.lib.client.Authors[] investigatorList,
           holdkrykke.mp1.lib.client.AuthorId[] authorIdList,
           java.lang.String[] dataLinksTagsList,
           holdkrykke.mp1.lib.client.JournalInfo journalInfo,
           java.lang.String journalTitle,
           java.lang.String issue,
           java.lang.String journalVolume,
           java.lang.String pubYear,
           java.lang.String journalIssn,
           java.lang.String pageInfo,
           java.lang.String abstractText,
           java.lang.String affiliation,
           java.lang.String publicationStatus,
           java.lang.String language,
           java.lang.String pubModel,
           java.lang.String pubType,
           java.lang.String[] pubTypeList,
           java.lang.String brSummary,
           holdkrykke.mp1.lib.client.BookOrReportDetails bookOrReportDetails,
           holdkrykke.mp1.lib.client.PatentDetailsInfo patentDetails,
           holdkrykke.mp1.lib.client.GrantInfo[] grantsList,
           holdkrykke.mp1.lib.client.MeshHeadingInfo[] meshHeadingList,
           java.lang.String[] keywordList,
           holdkrykke.mp1.lib.client.ChemicalInfo[] chemicalList,
           holdkrykke.mp1.lib.client.SubSet[] subsetList,
           holdkrykke.mp1.lib.client.FullTextURLInfo[] fullTextUrlList,
           holdkrykke.mp1.lib.client.CommentCorrection[] commentCorrectionList,
           holdkrykke.mp1.lib.client.ExtComment[] extCommentList,
           java.lang.String isOpenAccess,
           java.lang.String inEPMC,
           java.lang.String inPMC,
           java.lang.String hasPDF,
           java.lang.String hasBook,
           java.lang.String bookid,
           java.lang.String hasSuppl,
           java.lang.Integer citedByCount,
           java.lang.String hasData,
           java.lang.String hasReferences,
           java.lang.String hasTextMinedTerms,
           java.lang.String hasDbCrossReferences,
           java.lang.String[] dbCrossReferenceList,
           java.lang.String hasSupplementary,
           java.lang.String hasFullTextXML,
           java.lang.String hasLabsLinks,
           java.lang.String license,
           holdkrykke.mp1.lib.client.Version[] versionList,
           java.lang.Short versionNumber,
           java.lang.String authMan,
           java.lang.String epmcAuthMan,
           java.lang.String nihAuthMan,
           java.lang.String manuscriptId,
           java.lang.String hasTMAccessionNumbers,
           java.lang.String[] tmAccessionTypeList,
           java.lang.String dateOfCompletion,
           java.lang.String dateOfCreation,
           java.lang.String firstIndexDate,
           java.lang.String fullTextReceivedDate,
           java.lang.String dateOfRevision,
           java.lang.String electronicPublicationDate,
           java.lang.String firstPublicationDate,
           java.lang.String embargoDate,
           org.apache.axis.types.URI fullText,
           org.apache.axis.types.URI supplementaryFiles,
           java.lang.String fullTextXML,
           java.lang.String luceneScore,
           java.util.Calendar dateUpdated) {
           this.mongoId = mongoId;
           this.request = request;
           this.citationId = citationId;
           this.id = id;
           this.source = source;
           this.pmid = pmid;
           this.pmcid = pmcid;
           this.fullTextIdList = fullTextIdList;
           this.doi = doi;
           this.title = title;
           this.authorString = authorString;
           this.authorList = authorList;
           this.investigatorList = investigatorList;
           this.authorIdList = authorIdList;
           this.dataLinksTagsList = dataLinksTagsList;
           this.journalInfo = journalInfo;
           this.journalTitle = journalTitle;
           this.issue = issue;
           this.journalVolume = journalVolume;
           this.pubYear = pubYear;
           this.journalIssn = journalIssn;
           this.pageInfo = pageInfo;
           this.abstractText = abstractText;
           this.affiliation = affiliation;
           this.publicationStatus = publicationStatus;
           this.language = language;
           this.pubModel = pubModel;
           this.pubType = pubType;
           this.pubTypeList = pubTypeList;
           this.brSummary = brSummary;
           this.bookOrReportDetails = bookOrReportDetails;
           this.patentDetails = patentDetails;
           this.grantsList = grantsList;
           this.meshHeadingList = meshHeadingList;
           this.keywordList = keywordList;
           this.chemicalList = chemicalList;
           this.subsetList = subsetList;
           this.fullTextUrlList = fullTextUrlList;
           this.commentCorrectionList = commentCorrectionList;
           this.extCommentList = extCommentList;
           this.isOpenAccess = isOpenAccess;
           this.inEPMC = inEPMC;
           this.inPMC = inPMC;
           this.hasPDF = hasPDF;
           this.hasBook = hasBook;
           this.bookid = bookid;
           this.hasSuppl = hasSuppl;
           this.citedByCount = citedByCount;
           this.hasData = hasData;
           this.hasReferences = hasReferences;
           this.hasTextMinedTerms = hasTextMinedTerms;
           this.hasDbCrossReferences = hasDbCrossReferences;
           this.dbCrossReferenceList = dbCrossReferenceList;
           this.hasSupplementary = hasSupplementary;
           this.hasFullTextXML = hasFullTextXML;
           this.hasLabsLinks = hasLabsLinks;
           this.license = license;
           this.versionList = versionList;
           this.versionNumber = versionNumber;
           this.authMan = authMan;
           this.epmcAuthMan = epmcAuthMan;
           this.nihAuthMan = nihAuthMan;
           this.manuscriptId = manuscriptId;
           this.hasTMAccessionNumbers = hasTMAccessionNumbers;
           this.tmAccessionTypeList = tmAccessionTypeList;
           this.dateOfCompletion = dateOfCompletion;
           this.dateOfCreation = dateOfCreation;
           this.firstIndexDate = firstIndexDate;
           this.fullTextReceivedDate = fullTextReceivedDate;
           this.dateOfRevision = dateOfRevision;
           this.electronicPublicationDate = electronicPublicationDate;
           this.firstPublicationDate = firstPublicationDate;
           this.embargoDate = embargoDate;
           this.fullText = fullText;
           this.supplementaryFiles = supplementaryFiles;
           this.fullTextXML = fullTextXML;
           this.luceneScore = luceneScore;
           this.dateUpdated = dateUpdated;
    }


    /**
     * Gets the mongoId value for this Result.
     * 
     * @return mongoId
     */
    public java.lang.Object getMongoId() {
        return mongoId;
    }


    /**
     * Sets the mongoId value for this Result.
     * 
     * @param mongoId
     */
    public void setMongoId(java.lang.Object mongoId) {
        this.mongoId = mongoId;
    }


    /**
     * Gets the request value for this Result.
     * 
     * @return request
     */
    public holdkrykke.mp1.lib.client.Request getRequest() {
        return request;
    }


    /**
     * Sets the request value for this Result.
     * 
     * @param request
     */
    public void setRequest(holdkrykke.mp1.lib.client.Request request) {
        this.request = request;
    }


    /**
     * Gets the citationId value for this Result.
     * 
     * @return citationId
     */
    public java.lang.Integer getCitationId() {
        return citationId;
    }


    /**
     * Sets the citationId value for this Result.
     * 
     * @param citationId
     */
    public void setCitationId(java.lang.Integer citationId) {
        this.citationId = citationId;
    }


    /**
     * Gets the id value for this Result.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this Result.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the source value for this Result.
     * 
     * @return source
     */
    public java.lang.String getSource() {
        return source;
    }


    /**
     * Sets the source value for this Result.
     * 
     * @param source
     */
    public void setSource(java.lang.String source) {
        this.source = source;
    }


    /**
     * Gets the pmid value for this Result.
     * 
     * @return pmid
     */
    public java.lang.String getPmid() {
        return pmid;
    }


    /**
     * Sets the pmid value for this Result.
     * 
     * @param pmid
     */
    public void setPmid(java.lang.String pmid) {
        this.pmid = pmid;
    }


    /**
     * Gets the pmcid value for this Result.
     * 
     * @return pmcid
     */
    public java.lang.String getPmcid() {
        return pmcid;
    }


    /**
     * Sets the pmcid value for this Result.
     * 
     * @param pmcid
     */
    public void setPmcid(java.lang.String pmcid) {
        this.pmcid = pmcid;
    }


    /**
     * Gets the fullTextIdList value for this Result.
     * 
     * @return fullTextIdList
     */
    public java.lang.String[] getFullTextIdList() {
        return fullTextIdList;
    }


    /**
     * Sets the fullTextIdList value for this Result.
     * 
     * @param fullTextIdList
     */
    public void setFullTextIdList(java.lang.String[] fullTextIdList) {
        this.fullTextIdList = fullTextIdList;
    }


    /**
     * Gets the doi value for this Result.
     * 
     * @return doi
     */
    public java.lang.String getDoi() {
        return doi;
    }


    /**
     * Sets the doi value for this Result.
     * 
     * @param doi
     */
    public void setDoi(java.lang.String doi) {
        this.doi = doi;
    }


    /**
     * Gets the title value for this Result.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this Result.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the authorString value for this Result.
     * 
     * @return authorString
     */
    public java.lang.String getAuthorString() {
        return authorString;
    }


    /**
     * Sets the authorString value for this Result.
     * 
     * @param authorString
     */
    public void setAuthorString(java.lang.String authorString) {
        this.authorString = authorString;
    }


    /**
     * Gets the authorList value for this Result.
     * 
     * @return authorList
     */
    public holdkrykke.mp1.lib.client.Authors[] getAuthorList() {
        return authorList;
    }


    /**
     * Sets the authorList value for this Result.
     * 
     * @param authorList
     */
    public void setAuthorList(holdkrykke.mp1.lib.client.Authors[] authorList) {
        this.authorList = authorList;
    }


    /**
     * Gets the investigatorList value for this Result.
     * 
     * @return investigatorList
     */
    public holdkrykke.mp1.lib.client.Authors[] getInvestigatorList() {
        return investigatorList;
    }


    /**
     * Sets the investigatorList value for this Result.
     * 
     * @param investigatorList
     */
    public void setInvestigatorList(holdkrykke.mp1.lib.client.Authors[] investigatorList) {
        this.investigatorList = investigatorList;
    }


    /**
     * Gets the authorIdList value for this Result.
     * 
     * @return authorIdList
     */
    public holdkrykke.mp1.lib.client.AuthorId[] getAuthorIdList() {
        return authorIdList;
    }


    /**
     * Sets the authorIdList value for this Result.
     * 
     * @param authorIdList
     */
    public void setAuthorIdList(holdkrykke.mp1.lib.client.AuthorId[] authorIdList) {
        this.authorIdList = authorIdList;
    }


    /**
     * Gets the dataLinksTagsList value for this Result.
     * 
     * @return dataLinksTagsList
     */
    public java.lang.String[] getDataLinksTagsList() {
        return dataLinksTagsList;
    }


    /**
     * Sets the dataLinksTagsList value for this Result.
     * 
     * @param dataLinksTagsList
     */
    public void setDataLinksTagsList(java.lang.String[] dataLinksTagsList) {
        this.dataLinksTagsList = dataLinksTagsList;
    }


    /**
     * Gets the journalInfo value for this Result.
     * 
     * @return journalInfo
     */
    public holdkrykke.mp1.lib.client.JournalInfo getJournalInfo() {
        return journalInfo;
    }


    /**
     * Sets the journalInfo value for this Result.
     * 
     * @param journalInfo
     */
    public void setJournalInfo(holdkrykke.mp1.lib.client.JournalInfo journalInfo) {
        this.journalInfo = journalInfo;
    }


    /**
     * Gets the journalTitle value for this Result.
     * 
     * @return journalTitle
     */
    public java.lang.String getJournalTitle() {
        return journalTitle;
    }


    /**
     * Sets the journalTitle value for this Result.
     * 
     * @param journalTitle
     */
    public void setJournalTitle(java.lang.String journalTitle) {
        this.journalTitle = journalTitle;
    }


    /**
     * Gets the issue value for this Result.
     * 
     * @return issue
     */
    public java.lang.String getIssue() {
        return issue;
    }


    /**
     * Sets the issue value for this Result.
     * 
     * @param issue
     */
    public void setIssue(java.lang.String issue) {
        this.issue = issue;
    }


    /**
     * Gets the journalVolume value for this Result.
     * 
     * @return journalVolume
     */
    public java.lang.String getJournalVolume() {
        return journalVolume;
    }


    /**
     * Sets the journalVolume value for this Result.
     * 
     * @param journalVolume
     */
    public void setJournalVolume(java.lang.String journalVolume) {
        this.journalVolume = journalVolume;
    }


    /**
     * Gets the pubYear value for this Result.
     * 
     * @return pubYear
     */
    public java.lang.String getPubYear() {
        return pubYear;
    }


    /**
     * Sets the pubYear value for this Result.
     * 
     * @param pubYear
     */
    public void setPubYear(java.lang.String pubYear) {
        this.pubYear = pubYear;
    }


    /**
     * Gets the journalIssn value for this Result.
     * 
     * @return journalIssn
     */
    public java.lang.String getJournalIssn() {
        return journalIssn;
    }


    /**
     * Sets the journalIssn value for this Result.
     * 
     * @param journalIssn
     */
    public void setJournalIssn(java.lang.String journalIssn) {
        this.journalIssn = journalIssn;
    }


    /**
     * Gets the pageInfo value for this Result.
     * 
     * @return pageInfo
     */
    public java.lang.String getPageInfo() {
        return pageInfo;
    }


    /**
     * Sets the pageInfo value for this Result.
     * 
     * @param pageInfo
     */
    public void setPageInfo(java.lang.String pageInfo) {
        this.pageInfo = pageInfo;
    }


    /**
     * Gets the abstractText value for this Result.
     * 
     * @return abstractText
     */
    public java.lang.String getAbstractText() {
        return abstractText;
    }


    /**
     * Sets the abstractText value for this Result.
     * 
     * @param abstractText
     */
    public void setAbstractText(java.lang.String abstractText) {
        this.abstractText = abstractText;
    }


    /**
     * Gets the affiliation value for this Result.
     * 
     * @return affiliation
     */
    public java.lang.String getAffiliation() {
        return affiliation;
    }


    /**
     * Sets the affiliation value for this Result.
     * 
     * @param affiliation
     */
    public void setAffiliation(java.lang.String affiliation) {
        this.affiliation = affiliation;
    }


    /**
     * Gets the publicationStatus value for this Result.
     * 
     * @return publicationStatus
     */
    public java.lang.String getPublicationStatus() {
        return publicationStatus;
    }


    /**
     * Sets the publicationStatus value for this Result.
     * 
     * @param publicationStatus
     */
    public void setPublicationStatus(java.lang.String publicationStatus) {
        this.publicationStatus = publicationStatus;
    }


    /**
     * Gets the language value for this Result.
     * 
     * @return language
     */
    public java.lang.String getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this Result.
     * 
     * @param language
     */
    public void setLanguage(java.lang.String language) {
        this.language = language;
    }


    /**
     * Gets the pubModel value for this Result.
     * 
     * @return pubModel
     */
    public java.lang.String getPubModel() {
        return pubModel;
    }


    /**
     * Sets the pubModel value for this Result.
     * 
     * @param pubModel
     */
    public void setPubModel(java.lang.String pubModel) {
        this.pubModel = pubModel;
    }


    /**
     * Gets the pubType value for this Result.
     * 
     * @return pubType
     */
    public java.lang.String getPubType() {
        return pubType;
    }


    /**
     * Sets the pubType value for this Result.
     * 
     * @param pubType
     */
    public void setPubType(java.lang.String pubType) {
        this.pubType = pubType;
    }


    /**
     * Gets the pubTypeList value for this Result.
     * 
     * @return pubTypeList
     */
    public java.lang.String[] getPubTypeList() {
        return pubTypeList;
    }


    /**
     * Sets the pubTypeList value for this Result.
     * 
     * @param pubTypeList
     */
    public void setPubTypeList(java.lang.String[] pubTypeList) {
        this.pubTypeList = pubTypeList;
    }


    /**
     * Gets the brSummary value for this Result.
     * 
     * @return brSummary
     */
    public java.lang.String getBrSummary() {
        return brSummary;
    }


    /**
     * Sets the brSummary value for this Result.
     * 
     * @param brSummary
     */
    public void setBrSummary(java.lang.String brSummary) {
        this.brSummary = brSummary;
    }


    /**
     * Gets the bookOrReportDetails value for this Result.
     * 
     * @return bookOrReportDetails
     */
    public holdkrykke.mp1.lib.client.BookOrReportDetails getBookOrReportDetails() {
        return bookOrReportDetails;
    }


    /**
     * Sets the bookOrReportDetails value for this Result.
     * 
     * @param bookOrReportDetails
     */
    public void setBookOrReportDetails(holdkrykke.mp1.lib.client.BookOrReportDetails bookOrReportDetails) {
        this.bookOrReportDetails = bookOrReportDetails;
    }


    /**
     * Gets the patentDetails value for this Result.
     * 
     * @return patentDetails
     */
    public holdkrykke.mp1.lib.client.PatentDetailsInfo getPatentDetails() {
        return patentDetails;
    }


    /**
     * Sets the patentDetails value for this Result.
     * 
     * @param patentDetails
     */
    public void setPatentDetails(holdkrykke.mp1.lib.client.PatentDetailsInfo patentDetails) {
        this.patentDetails = patentDetails;
    }


    /**
     * Gets the grantsList value for this Result.
     * 
     * @return grantsList
     */
    public holdkrykke.mp1.lib.client.GrantInfo[] getGrantsList() {
        return grantsList;
    }


    /**
     * Sets the grantsList value for this Result.
     * 
     * @param grantsList
     */
    public void setGrantsList(holdkrykke.mp1.lib.client.GrantInfo[] grantsList) {
        this.grantsList = grantsList;
    }


    /**
     * Gets the meshHeadingList value for this Result.
     * 
     * @return meshHeadingList
     */
    public holdkrykke.mp1.lib.client.MeshHeadingInfo[] getMeshHeadingList() {
        return meshHeadingList;
    }


    /**
     * Sets the meshHeadingList value for this Result.
     * 
     * @param meshHeadingList
     */
    public void setMeshHeadingList(holdkrykke.mp1.lib.client.MeshHeadingInfo[] meshHeadingList) {
        this.meshHeadingList = meshHeadingList;
    }


    /**
     * Gets the keywordList value for this Result.
     * 
     * @return keywordList
     */
    public java.lang.String[] getKeywordList() {
        return keywordList;
    }


    /**
     * Sets the keywordList value for this Result.
     * 
     * @param keywordList
     */
    public void setKeywordList(java.lang.String[] keywordList) {
        this.keywordList = keywordList;
    }


    /**
     * Gets the chemicalList value for this Result.
     * 
     * @return chemicalList
     */
    public holdkrykke.mp1.lib.client.ChemicalInfo[] getChemicalList() {
        return chemicalList;
    }


    /**
     * Sets the chemicalList value for this Result.
     * 
     * @param chemicalList
     */
    public void setChemicalList(holdkrykke.mp1.lib.client.ChemicalInfo[] chemicalList) {
        this.chemicalList = chemicalList;
    }


    /**
     * Gets the subsetList value for this Result.
     * 
     * @return subsetList
     */
    public holdkrykke.mp1.lib.client.SubSet[] getSubsetList() {
        return subsetList;
    }


    /**
     * Sets the subsetList value for this Result.
     * 
     * @param subsetList
     */
    public void setSubsetList(holdkrykke.mp1.lib.client.SubSet[] subsetList) {
        this.subsetList = subsetList;
    }


    /**
     * Gets the fullTextUrlList value for this Result.
     * 
     * @return fullTextUrlList
     */
    public holdkrykke.mp1.lib.client.FullTextURLInfo[] getFullTextUrlList() {
        return fullTextUrlList;
    }


    /**
     * Sets the fullTextUrlList value for this Result.
     * 
     * @param fullTextUrlList
     */
    public void setFullTextUrlList(holdkrykke.mp1.lib.client.FullTextURLInfo[] fullTextUrlList) {
        this.fullTextUrlList = fullTextUrlList;
    }


    /**
     * Gets the commentCorrectionList value for this Result.
     * 
     * @return commentCorrectionList
     */
    public holdkrykke.mp1.lib.client.CommentCorrection[] getCommentCorrectionList() {
        return commentCorrectionList;
    }


    /**
     * Sets the commentCorrectionList value for this Result.
     * 
     * @param commentCorrectionList
     */
    public void setCommentCorrectionList(holdkrykke.mp1.lib.client.CommentCorrection[] commentCorrectionList) {
        this.commentCorrectionList = commentCorrectionList;
    }


    /**
     * Gets the extCommentList value for this Result.
     * 
     * @return extCommentList
     */
    public holdkrykke.mp1.lib.client.ExtComment[] getExtCommentList() {
        return extCommentList;
    }


    /**
     * Sets the extCommentList value for this Result.
     * 
     * @param extCommentList
     */
    public void setExtCommentList(holdkrykke.mp1.lib.client.ExtComment[] extCommentList) {
        this.extCommentList = extCommentList;
    }


    /**
     * Gets the isOpenAccess value for this Result.
     * 
     * @return isOpenAccess
     */
    public java.lang.String getIsOpenAccess() {
        return isOpenAccess;
    }


    /**
     * Sets the isOpenAccess value for this Result.
     * 
     * @param isOpenAccess
     */
    public void setIsOpenAccess(java.lang.String isOpenAccess) {
        this.isOpenAccess = isOpenAccess;
    }


    /**
     * Gets the inEPMC value for this Result.
     * 
     * @return inEPMC
     */
    public java.lang.String getInEPMC() {
        return inEPMC;
    }


    /**
     * Sets the inEPMC value for this Result.
     * 
     * @param inEPMC
     */
    public void setInEPMC(java.lang.String inEPMC) {
        this.inEPMC = inEPMC;
    }


    /**
     * Gets the inPMC value for this Result.
     * 
     * @return inPMC
     */
    public java.lang.String getInPMC() {
        return inPMC;
    }


    /**
     * Sets the inPMC value for this Result.
     * 
     * @param inPMC
     */
    public void setInPMC(java.lang.String inPMC) {
        this.inPMC = inPMC;
    }


    /**
     * Gets the hasPDF value for this Result.
     * 
     * @return hasPDF
     */
    public java.lang.String getHasPDF() {
        return hasPDF;
    }


    /**
     * Sets the hasPDF value for this Result.
     * 
     * @param hasPDF
     */
    public void setHasPDF(java.lang.String hasPDF) {
        this.hasPDF = hasPDF;
    }


    /**
     * Gets the hasBook value for this Result.
     * 
     * @return hasBook
     */
    public java.lang.String getHasBook() {
        return hasBook;
    }


    /**
     * Sets the hasBook value for this Result.
     * 
     * @param hasBook
     */
    public void setHasBook(java.lang.String hasBook) {
        this.hasBook = hasBook;
    }


    /**
     * Gets the bookid value for this Result.
     * 
     * @return bookid
     */
    public java.lang.String getBookid() {
        return bookid;
    }


    /**
     * Sets the bookid value for this Result.
     * 
     * @param bookid
     */
    public void setBookid(java.lang.String bookid) {
        this.bookid = bookid;
    }


    /**
     * Gets the hasSuppl value for this Result.
     * 
     * @return hasSuppl
     */
    public java.lang.String getHasSuppl() {
        return hasSuppl;
    }


    /**
     * Sets the hasSuppl value for this Result.
     * 
     * @param hasSuppl
     */
    public void setHasSuppl(java.lang.String hasSuppl) {
        this.hasSuppl = hasSuppl;
    }


    /**
     * Gets the citedByCount value for this Result.
     * 
     * @return citedByCount
     */
    public java.lang.Integer getCitedByCount() {
        return citedByCount;
    }


    /**
     * Sets the citedByCount value for this Result.
     * 
     * @param citedByCount
     */
    public void setCitedByCount(java.lang.Integer citedByCount) {
        this.citedByCount = citedByCount;
    }


    /**
     * Gets the hasData value for this Result.
     * 
     * @return hasData
     */
    public java.lang.String getHasData() {
        return hasData;
    }


    /**
     * Sets the hasData value for this Result.
     * 
     * @param hasData
     */
    public void setHasData(java.lang.String hasData) {
        this.hasData = hasData;
    }


    /**
     * Gets the hasReferences value for this Result.
     * 
     * @return hasReferences
     */
    public java.lang.String getHasReferences() {
        return hasReferences;
    }


    /**
     * Sets the hasReferences value for this Result.
     * 
     * @param hasReferences
     */
    public void setHasReferences(java.lang.String hasReferences) {
        this.hasReferences = hasReferences;
    }


    /**
     * Gets the hasTextMinedTerms value for this Result.
     * 
     * @return hasTextMinedTerms
     */
    public java.lang.String getHasTextMinedTerms() {
        return hasTextMinedTerms;
    }


    /**
     * Sets the hasTextMinedTerms value for this Result.
     * 
     * @param hasTextMinedTerms
     */
    public void setHasTextMinedTerms(java.lang.String hasTextMinedTerms) {
        this.hasTextMinedTerms = hasTextMinedTerms;
    }


    /**
     * Gets the hasDbCrossReferences value for this Result.
     * 
     * @return hasDbCrossReferences
     */
    public java.lang.String getHasDbCrossReferences() {
        return hasDbCrossReferences;
    }


    /**
     * Sets the hasDbCrossReferences value for this Result.
     * 
     * @param hasDbCrossReferences
     */
    public void setHasDbCrossReferences(java.lang.String hasDbCrossReferences) {
        this.hasDbCrossReferences = hasDbCrossReferences;
    }


    /**
     * Gets the dbCrossReferenceList value for this Result.
     * 
     * @return dbCrossReferenceList
     */
    public java.lang.String[] getDbCrossReferenceList() {
        return dbCrossReferenceList;
    }


    /**
     * Sets the dbCrossReferenceList value for this Result.
     * 
     * @param dbCrossReferenceList
     */
    public void setDbCrossReferenceList(java.lang.String[] dbCrossReferenceList) {
        this.dbCrossReferenceList = dbCrossReferenceList;
    }


    /**
     * Gets the hasSupplementary value for this Result.
     * 
     * @return hasSupplementary
     */
    public java.lang.String getHasSupplementary() {
        return hasSupplementary;
    }


    /**
     * Sets the hasSupplementary value for this Result.
     * 
     * @param hasSupplementary
     */
    public void setHasSupplementary(java.lang.String hasSupplementary) {
        this.hasSupplementary = hasSupplementary;
    }


    /**
     * Gets the hasFullTextXML value for this Result.
     * 
     * @return hasFullTextXML
     */
    public java.lang.String getHasFullTextXML() {
        return hasFullTextXML;
    }


    /**
     * Sets the hasFullTextXML value for this Result.
     * 
     * @param hasFullTextXML
     */
    public void setHasFullTextXML(java.lang.String hasFullTextXML) {
        this.hasFullTextXML = hasFullTextXML;
    }


    /**
     * Gets the hasLabsLinks value for this Result.
     * 
     * @return hasLabsLinks
     */
    public java.lang.String getHasLabsLinks() {
        return hasLabsLinks;
    }


    /**
     * Sets the hasLabsLinks value for this Result.
     * 
     * @param hasLabsLinks
     */
    public void setHasLabsLinks(java.lang.String hasLabsLinks) {
        this.hasLabsLinks = hasLabsLinks;
    }


    /**
     * Gets the license value for this Result.
     * 
     * @return license
     */
    public java.lang.String getLicense() {
        return license;
    }


    /**
     * Sets the license value for this Result.
     * 
     * @param license
     */
    public void setLicense(java.lang.String license) {
        this.license = license;
    }


    /**
     * Gets the versionList value for this Result.
     * 
     * @return versionList
     */
    public holdkrykke.mp1.lib.client.Version[] getVersionList() {
        return versionList;
    }


    /**
     * Sets the versionList value for this Result.
     * 
     * @param versionList
     */
    public void setVersionList(holdkrykke.mp1.lib.client.Version[] versionList) {
        this.versionList = versionList;
    }


    /**
     * Gets the versionNumber value for this Result.
     * 
     * @return versionNumber
     */
    public java.lang.Short getVersionNumber() {
        return versionNumber;
    }


    /**
     * Sets the versionNumber value for this Result.
     * 
     * @param versionNumber
     */
    public void setVersionNumber(java.lang.Short versionNumber) {
        this.versionNumber = versionNumber;
    }


    /**
     * Gets the authMan value for this Result.
     * 
     * @return authMan
     */
    public java.lang.String getAuthMan() {
        return authMan;
    }


    /**
     * Sets the authMan value for this Result.
     * 
     * @param authMan
     */
    public void setAuthMan(java.lang.String authMan) {
        this.authMan = authMan;
    }


    /**
     * Gets the epmcAuthMan value for this Result.
     * 
     * @return epmcAuthMan
     */
    public java.lang.String getEpmcAuthMan() {
        return epmcAuthMan;
    }


    /**
     * Sets the epmcAuthMan value for this Result.
     * 
     * @param epmcAuthMan
     */
    public void setEpmcAuthMan(java.lang.String epmcAuthMan) {
        this.epmcAuthMan = epmcAuthMan;
    }


    /**
     * Gets the nihAuthMan value for this Result.
     * 
     * @return nihAuthMan
     */
    public java.lang.String getNihAuthMan() {
        return nihAuthMan;
    }


    /**
     * Sets the nihAuthMan value for this Result.
     * 
     * @param nihAuthMan
     */
    public void setNihAuthMan(java.lang.String nihAuthMan) {
        this.nihAuthMan = nihAuthMan;
    }


    /**
     * Gets the manuscriptId value for this Result.
     * 
     * @return manuscriptId
     */
    public java.lang.String getManuscriptId() {
        return manuscriptId;
    }


    /**
     * Sets the manuscriptId value for this Result.
     * 
     * @param manuscriptId
     */
    public void setManuscriptId(java.lang.String manuscriptId) {
        this.manuscriptId = manuscriptId;
    }


    /**
     * Gets the hasTMAccessionNumbers value for this Result.
     * 
     * @return hasTMAccessionNumbers
     */
    public java.lang.String getHasTMAccessionNumbers() {
        return hasTMAccessionNumbers;
    }


    /**
     * Sets the hasTMAccessionNumbers value for this Result.
     * 
     * @param hasTMAccessionNumbers
     */
    public void setHasTMAccessionNumbers(java.lang.String hasTMAccessionNumbers) {
        this.hasTMAccessionNumbers = hasTMAccessionNumbers;
    }


    /**
     * Gets the tmAccessionTypeList value for this Result.
     * 
     * @return tmAccessionTypeList
     */
    public java.lang.String[] getTmAccessionTypeList() {
        return tmAccessionTypeList;
    }


    /**
     * Sets the tmAccessionTypeList value for this Result.
     * 
     * @param tmAccessionTypeList
     */
    public void setTmAccessionTypeList(java.lang.String[] tmAccessionTypeList) {
        this.tmAccessionTypeList = tmAccessionTypeList;
    }


    /**
     * Gets the dateOfCompletion value for this Result.
     * 
     * @return dateOfCompletion
     */
    public java.lang.String getDateOfCompletion() {
        return dateOfCompletion;
    }


    /**
     * Sets the dateOfCompletion value for this Result.
     * 
     * @param dateOfCompletion
     */
    public void setDateOfCompletion(java.lang.String dateOfCompletion) {
        this.dateOfCompletion = dateOfCompletion;
    }


    /**
     * Gets the dateOfCreation value for this Result.
     * 
     * @return dateOfCreation
     */
    public java.lang.String getDateOfCreation() {
        return dateOfCreation;
    }


    /**
     * Sets the dateOfCreation value for this Result.
     * 
     * @param dateOfCreation
     */
    public void setDateOfCreation(java.lang.String dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }


    /**
     * Gets the firstIndexDate value for this Result.
     * 
     * @return firstIndexDate
     */
    public java.lang.String getFirstIndexDate() {
        return firstIndexDate;
    }


    /**
     * Sets the firstIndexDate value for this Result.
     * 
     * @param firstIndexDate
     */
    public void setFirstIndexDate(java.lang.String firstIndexDate) {
        this.firstIndexDate = firstIndexDate;
    }


    /**
     * Gets the fullTextReceivedDate value for this Result.
     * 
     * @return fullTextReceivedDate
     */
    public java.lang.String getFullTextReceivedDate() {
        return fullTextReceivedDate;
    }


    /**
     * Sets the fullTextReceivedDate value for this Result.
     * 
     * @param fullTextReceivedDate
     */
    public void setFullTextReceivedDate(java.lang.String fullTextReceivedDate) {
        this.fullTextReceivedDate = fullTextReceivedDate;
    }


    /**
     * Gets the dateOfRevision value for this Result.
     * 
     * @return dateOfRevision
     */
    public java.lang.String getDateOfRevision() {
        return dateOfRevision;
    }


    /**
     * Sets the dateOfRevision value for this Result.
     * 
     * @param dateOfRevision
     */
    public void setDateOfRevision(java.lang.String dateOfRevision) {
        this.dateOfRevision = dateOfRevision;
    }


    /**
     * Gets the electronicPublicationDate value for this Result.
     * 
     * @return electronicPublicationDate
     */
    public java.lang.String getElectronicPublicationDate() {
        return electronicPublicationDate;
    }


    /**
     * Sets the electronicPublicationDate value for this Result.
     * 
     * @param electronicPublicationDate
     */
    public void setElectronicPublicationDate(java.lang.String electronicPublicationDate) {
        this.electronicPublicationDate = electronicPublicationDate;
    }


    /**
     * Gets the firstPublicationDate value for this Result.
     * 
     * @return firstPublicationDate
     */
    public java.lang.String getFirstPublicationDate() {
        return firstPublicationDate;
    }


    /**
     * Sets the firstPublicationDate value for this Result.
     * 
     * @param firstPublicationDate
     */
    public void setFirstPublicationDate(java.lang.String firstPublicationDate) {
        this.firstPublicationDate = firstPublicationDate;
    }


    /**
     * Gets the embargoDate value for this Result.
     * 
     * @return embargoDate
     */
    public java.lang.String getEmbargoDate() {
        return embargoDate;
    }


    /**
     * Sets the embargoDate value for this Result.
     * 
     * @param embargoDate
     */
    public void setEmbargoDate(java.lang.String embargoDate) {
        this.embargoDate = embargoDate;
    }


    /**
     * Gets the fullText value for this Result.
     * 
     * @return fullText
     */
    public org.apache.axis.types.URI getFullText() {
        return fullText;
    }


    /**
     * Sets the fullText value for this Result.
     * 
     * @param fullText
     */
    public void setFullText(org.apache.axis.types.URI fullText) {
        this.fullText = fullText;
    }


    /**
     * Gets the supplementaryFiles value for this Result.
     * 
     * @return supplementaryFiles
     */
    public org.apache.axis.types.URI getSupplementaryFiles() {
        return supplementaryFiles;
    }


    /**
     * Sets the supplementaryFiles value for this Result.
     * 
     * @param supplementaryFiles
     */
    public void setSupplementaryFiles(org.apache.axis.types.URI supplementaryFiles) {
        this.supplementaryFiles = supplementaryFiles;
    }


    /**
     * Gets the fullTextXML value for this Result.
     * 
     * @return fullTextXML
     */
    public java.lang.String getFullTextXML() {
        return fullTextXML;
    }


    /**
     * Sets the fullTextXML value for this Result.
     * 
     * @param fullTextXML
     */
    public void setFullTextXML(java.lang.String fullTextXML) {
        this.fullTextXML = fullTextXML;
    }


    /**
     * Gets the luceneScore value for this Result.
     * 
     * @return luceneScore
     */
    public java.lang.String getLuceneScore() {
        return luceneScore;
    }


    /**
     * Sets the luceneScore value for this Result.
     * 
     * @param luceneScore
     */
    public void setLuceneScore(java.lang.String luceneScore) {
        this.luceneScore = luceneScore;
    }


    /**
     * Gets the dateUpdated value for this Result.
     * 
     * @return dateUpdated
     */
    public java.util.Calendar getDateUpdated() {
        return dateUpdated;
    }


    /**
     * Sets the dateUpdated value for this Result.
     * 
     * @param dateUpdated
     */
    public void setDateUpdated(java.util.Calendar dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Result)) return false;
        Result other = (Result) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mongoId==null && other.getMongoId()==null) || 
             (this.mongoId!=null &&
              this.mongoId.equals(other.getMongoId()))) &&
            ((this.request==null && other.getRequest()==null) || 
             (this.request!=null &&
              this.request.equals(other.getRequest()))) &&
            ((this.citationId==null && other.getCitationId()==null) || 
             (this.citationId!=null &&
              this.citationId.equals(other.getCitationId()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.pmid==null && other.getPmid()==null) || 
             (this.pmid!=null &&
              this.pmid.equals(other.getPmid()))) &&
            ((this.pmcid==null && other.getPmcid()==null) || 
             (this.pmcid!=null &&
              this.pmcid.equals(other.getPmcid()))) &&
            ((this.fullTextIdList==null && other.getFullTextIdList()==null) || 
             (this.fullTextIdList!=null &&
              java.util.Arrays.equals(this.fullTextIdList, other.getFullTextIdList()))) &&
            ((this.doi==null && other.getDoi()==null) || 
             (this.doi!=null &&
              this.doi.equals(other.getDoi()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.authorString==null && other.getAuthorString()==null) || 
             (this.authorString!=null &&
              this.authorString.equals(other.getAuthorString()))) &&
            ((this.authorList==null && other.getAuthorList()==null) || 
             (this.authorList!=null &&
              java.util.Arrays.equals(this.authorList, other.getAuthorList()))) &&
            ((this.investigatorList==null && other.getInvestigatorList()==null) || 
             (this.investigatorList!=null &&
              java.util.Arrays.equals(this.investigatorList, other.getInvestigatorList()))) &&
            ((this.authorIdList==null && other.getAuthorIdList()==null) || 
             (this.authorIdList!=null &&
              java.util.Arrays.equals(this.authorIdList, other.getAuthorIdList()))) &&
            ((this.dataLinksTagsList==null && other.getDataLinksTagsList()==null) || 
             (this.dataLinksTagsList!=null &&
              java.util.Arrays.equals(this.dataLinksTagsList, other.getDataLinksTagsList()))) &&
            ((this.journalInfo==null && other.getJournalInfo()==null) || 
             (this.journalInfo!=null &&
              this.journalInfo.equals(other.getJournalInfo()))) &&
            ((this.journalTitle==null && other.getJournalTitle()==null) || 
             (this.journalTitle!=null &&
              this.journalTitle.equals(other.getJournalTitle()))) &&
            ((this.issue==null && other.getIssue()==null) || 
             (this.issue!=null &&
              this.issue.equals(other.getIssue()))) &&
            ((this.journalVolume==null && other.getJournalVolume()==null) || 
             (this.journalVolume!=null &&
              this.journalVolume.equals(other.getJournalVolume()))) &&
            ((this.pubYear==null && other.getPubYear()==null) || 
             (this.pubYear!=null &&
              this.pubYear.equals(other.getPubYear()))) &&
            ((this.journalIssn==null && other.getJournalIssn()==null) || 
             (this.journalIssn!=null &&
              this.journalIssn.equals(other.getJournalIssn()))) &&
            ((this.pageInfo==null && other.getPageInfo()==null) || 
             (this.pageInfo!=null &&
              this.pageInfo.equals(other.getPageInfo()))) &&
            ((this.abstractText==null && other.getAbstractText()==null) || 
             (this.abstractText!=null &&
              this.abstractText.equals(other.getAbstractText()))) &&
            ((this.affiliation==null && other.getAffiliation()==null) || 
             (this.affiliation!=null &&
              this.affiliation.equals(other.getAffiliation()))) &&
            ((this.publicationStatus==null && other.getPublicationStatus()==null) || 
             (this.publicationStatus!=null &&
              this.publicationStatus.equals(other.getPublicationStatus()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage()))) &&
            ((this.pubModel==null && other.getPubModel()==null) || 
             (this.pubModel!=null &&
              this.pubModel.equals(other.getPubModel()))) &&
            ((this.pubType==null && other.getPubType()==null) || 
             (this.pubType!=null &&
              this.pubType.equals(other.getPubType()))) &&
            ((this.pubTypeList==null && other.getPubTypeList()==null) || 
             (this.pubTypeList!=null &&
              java.util.Arrays.equals(this.pubTypeList, other.getPubTypeList()))) &&
            ((this.brSummary==null && other.getBrSummary()==null) || 
             (this.brSummary!=null &&
              this.brSummary.equals(other.getBrSummary()))) &&
            ((this.bookOrReportDetails==null && other.getBookOrReportDetails()==null) || 
             (this.bookOrReportDetails!=null &&
              this.bookOrReportDetails.equals(other.getBookOrReportDetails()))) &&
            ((this.patentDetails==null && other.getPatentDetails()==null) || 
             (this.patentDetails!=null &&
              this.patentDetails.equals(other.getPatentDetails()))) &&
            ((this.grantsList==null && other.getGrantsList()==null) || 
             (this.grantsList!=null &&
              java.util.Arrays.equals(this.grantsList, other.getGrantsList()))) &&
            ((this.meshHeadingList==null && other.getMeshHeadingList()==null) || 
             (this.meshHeadingList!=null &&
              java.util.Arrays.equals(this.meshHeadingList, other.getMeshHeadingList()))) &&
            ((this.keywordList==null && other.getKeywordList()==null) || 
             (this.keywordList!=null &&
              java.util.Arrays.equals(this.keywordList, other.getKeywordList()))) &&
            ((this.chemicalList==null && other.getChemicalList()==null) || 
             (this.chemicalList!=null &&
              java.util.Arrays.equals(this.chemicalList, other.getChemicalList()))) &&
            ((this.subsetList==null && other.getSubsetList()==null) || 
             (this.subsetList!=null &&
              java.util.Arrays.equals(this.subsetList, other.getSubsetList()))) &&
            ((this.fullTextUrlList==null && other.getFullTextUrlList()==null) || 
             (this.fullTextUrlList!=null &&
              java.util.Arrays.equals(this.fullTextUrlList, other.getFullTextUrlList()))) &&
            ((this.commentCorrectionList==null && other.getCommentCorrectionList()==null) || 
             (this.commentCorrectionList!=null &&
              java.util.Arrays.equals(this.commentCorrectionList, other.getCommentCorrectionList()))) &&
            ((this.extCommentList==null && other.getExtCommentList()==null) || 
             (this.extCommentList!=null &&
              java.util.Arrays.equals(this.extCommentList, other.getExtCommentList()))) &&
            ((this.isOpenAccess==null && other.getIsOpenAccess()==null) || 
             (this.isOpenAccess!=null &&
              this.isOpenAccess.equals(other.getIsOpenAccess()))) &&
            ((this.inEPMC==null && other.getInEPMC()==null) || 
             (this.inEPMC!=null &&
              this.inEPMC.equals(other.getInEPMC()))) &&
            ((this.inPMC==null && other.getInPMC()==null) || 
             (this.inPMC!=null &&
              this.inPMC.equals(other.getInPMC()))) &&
            ((this.hasPDF==null && other.getHasPDF()==null) || 
             (this.hasPDF!=null &&
              this.hasPDF.equals(other.getHasPDF()))) &&
            ((this.hasBook==null && other.getHasBook()==null) || 
             (this.hasBook!=null &&
              this.hasBook.equals(other.getHasBook()))) &&
            ((this.bookid==null && other.getBookid()==null) || 
             (this.bookid!=null &&
              this.bookid.equals(other.getBookid()))) &&
            ((this.hasSuppl==null && other.getHasSuppl()==null) || 
             (this.hasSuppl!=null &&
              this.hasSuppl.equals(other.getHasSuppl()))) &&
            ((this.citedByCount==null && other.getCitedByCount()==null) || 
             (this.citedByCount!=null &&
              this.citedByCount.equals(other.getCitedByCount()))) &&
            ((this.hasData==null && other.getHasData()==null) || 
             (this.hasData!=null &&
              this.hasData.equals(other.getHasData()))) &&
            ((this.hasReferences==null && other.getHasReferences()==null) || 
             (this.hasReferences!=null &&
              this.hasReferences.equals(other.getHasReferences()))) &&
            ((this.hasTextMinedTerms==null && other.getHasTextMinedTerms()==null) || 
             (this.hasTextMinedTerms!=null &&
              this.hasTextMinedTerms.equals(other.getHasTextMinedTerms()))) &&
            ((this.hasDbCrossReferences==null && other.getHasDbCrossReferences()==null) || 
             (this.hasDbCrossReferences!=null &&
              this.hasDbCrossReferences.equals(other.getHasDbCrossReferences()))) &&
            ((this.dbCrossReferenceList==null && other.getDbCrossReferenceList()==null) || 
             (this.dbCrossReferenceList!=null &&
              java.util.Arrays.equals(this.dbCrossReferenceList, other.getDbCrossReferenceList()))) &&
            ((this.hasSupplementary==null && other.getHasSupplementary()==null) || 
             (this.hasSupplementary!=null &&
              this.hasSupplementary.equals(other.getHasSupplementary()))) &&
            ((this.hasFullTextXML==null && other.getHasFullTextXML()==null) || 
             (this.hasFullTextXML!=null &&
              this.hasFullTextXML.equals(other.getHasFullTextXML()))) &&
            ((this.hasLabsLinks==null && other.getHasLabsLinks()==null) || 
             (this.hasLabsLinks!=null &&
              this.hasLabsLinks.equals(other.getHasLabsLinks()))) &&
            ((this.license==null && other.getLicense()==null) || 
             (this.license!=null &&
              this.license.equals(other.getLicense()))) &&
            ((this.versionList==null && other.getVersionList()==null) || 
             (this.versionList!=null &&
              java.util.Arrays.equals(this.versionList, other.getVersionList()))) &&
            ((this.versionNumber==null && other.getVersionNumber()==null) || 
             (this.versionNumber!=null &&
              this.versionNumber.equals(other.getVersionNumber()))) &&
            ((this.authMan==null && other.getAuthMan()==null) || 
             (this.authMan!=null &&
              this.authMan.equals(other.getAuthMan()))) &&
            ((this.epmcAuthMan==null && other.getEpmcAuthMan()==null) || 
             (this.epmcAuthMan!=null &&
              this.epmcAuthMan.equals(other.getEpmcAuthMan()))) &&
            ((this.nihAuthMan==null && other.getNihAuthMan()==null) || 
             (this.nihAuthMan!=null &&
              this.nihAuthMan.equals(other.getNihAuthMan()))) &&
            ((this.manuscriptId==null && other.getManuscriptId()==null) || 
             (this.manuscriptId!=null &&
              this.manuscriptId.equals(other.getManuscriptId()))) &&
            ((this.hasTMAccessionNumbers==null && other.getHasTMAccessionNumbers()==null) || 
             (this.hasTMAccessionNumbers!=null &&
              this.hasTMAccessionNumbers.equals(other.getHasTMAccessionNumbers()))) &&
            ((this.tmAccessionTypeList==null && other.getTmAccessionTypeList()==null) || 
             (this.tmAccessionTypeList!=null &&
              java.util.Arrays.equals(this.tmAccessionTypeList, other.getTmAccessionTypeList()))) &&
            ((this.dateOfCompletion==null && other.getDateOfCompletion()==null) || 
             (this.dateOfCompletion!=null &&
              this.dateOfCompletion.equals(other.getDateOfCompletion()))) &&
            ((this.dateOfCreation==null && other.getDateOfCreation()==null) || 
             (this.dateOfCreation!=null &&
              this.dateOfCreation.equals(other.getDateOfCreation()))) &&
            ((this.firstIndexDate==null && other.getFirstIndexDate()==null) || 
             (this.firstIndexDate!=null &&
              this.firstIndexDate.equals(other.getFirstIndexDate()))) &&
            ((this.fullTextReceivedDate==null && other.getFullTextReceivedDate()==null) || 
             (this.fullTextReceivedDate!=null &&
              this.fullTextReceivedDate.equals(other.getFullTextReceivedDate()))) &&
            ((this.dateOfRevision==null && other.getDateOfRevision()==null) || 
             (this.dateOfRevision!=null &&
              this.dateOfRevision.equals(other.getDateOfRevision()))) &&
            ((this.electronicPublicationDate==null && other.getElectronicPublicationDate()==null) || 
             (this.electronicPublicationDate!=null &&
              this.electronicPublicationDate.equals(other.getElectronicPublicationDate()))) &&
            ((this.firstPublicationDate==null && other.getFirstPublicationDate()==null) || 
             (this.firstPublicationDate!=null &&
              this.firstPublicationDate.equals(other.getFirstPublicationDate()))) &&
            ((this.embargoDate==null && other.getEmbargoDate()==null) || 
             (this.embargoDate!=null &&
              this.embargoDate.equals(other.getEmbargoDate()))) &&
            ((this.fullText==null && other.getFullText()==null) || 
             (this.fullText!=null &&
              this.fullText.equals(other.getFullText()))) &&
            ((this.supplementaryFiles==null && other.getSupplementaryFiles()==null) || 
             (this.supplementaryFiles!=null &&
              this.supplementaryFiles.equals(other.getSupplementaryFiles()))) &&
            ((this.fullTextXML==null && other.getFullTextXML()==null) || 
             (this.fullTextXML!=null &&
              this.fullTextXML.equals(other.getFullTextXML()))) &&
            ((this.luceneScore==null && other.getLuceneScore()==null) || 
             (this.luceneScore!=null &&
              this.luceneScore.equals(other.getLuceneScore()))) &&
            ((this.dateUpdated==null && other.getDateUpdated()==null) || 
             (this.dateUpdated!=null &&
              this.dateUpdated.equals(other.getDateUpdated())));
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
        if (getMongoId() != null) {
            _hashCode += getMongoId().hashCode();
        }
        if (getRequest() != null) {
            _hashCode += getRequest().hashCode();
        }
        if (getCitationId() != null) {
            _hashCode += getCitationId().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getPmid() != null) {
            _hashCode += getPmid().hashCode();
        }
        if (getPmcid() != null) {
            _hashCode += getPmcid().hashCode();
        }
        if (getFullTextIdList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFullTextIdList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFullTextIdList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDoi() != null) {
            _hashCode += getDoi().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getAuthorString() != null) {
            _hashCode += getAuthorString().hashCode();
        }
        if (getAuthorList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAuthorList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAuthorList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInvestigatorList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInvestigatorList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInvestigatorList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAuthorIdList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAuthorIdList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAuthorIdList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDataLinksTagsList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDataLinksTagsList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDataLinksTagsList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getJournalInfo() != null) {
            _hashCode += getJournalInfo().hashCode();
        }
        if (getJournalTitle() != null) {
            _hashCode += getJournalTitle().hashCode();
        }
        if (getIssue() != null) {
            _hashCode += getIssue().hashCode();
        }
        if (getJournalVolume() != null) {
            _hashCode += getJournalVolume().hashCode();
        }
        if (getPubYear() != null) {
            _hashCode += getPubYear().hashCode();
        }
        if (getJournalIssn() != null) {
            _hashCode += getJournalIssn().hashCode();
        }
        if (getPageInfo() != null) {
            _hashCode += getPageInfo().hashCode();
        }
        if (getAbstractText() != null) {
            _hashCode += getAbstractText().hashCode();
        }
        if (getAffiliation() != null) {
            _hashCode += getAffiliation().hashCode();
        }
        if (getPublicationStatus() != null) {
            _hashCode += getPublicationStatus().hashCode();
        }
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        if (getPubModel() != null) {
            _hashCode += getPubModel().hashCode();
        }
        if (getPubType() != null) {
            _hashCode += getPubType().hashCode();
        }
        if (getPubTypeList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPubTypeList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPubTypeList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBrSummary() != null) {
            _hashCode += getBrSummary().hashCode();
        }
        if (getBookOrReportDetails() != null) {
            _hashCode += getBookOrReportDetails().hashCode();
        }
        if (getPatentDetails() != null) {
            _hashCode += getPatentDetails().hashCode();
        }
        if (getGrantsList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGrantsList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGrantsList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMeshHeadingList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMeshHeadingList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMeshHeadingList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getKeywordList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKeywordList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKeywordList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getChemicalList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChemicalList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChemicalList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubsetList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubsetList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubsetList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFullTextUrlList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFullTextUrlList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFullTextUrlList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCommentCorrectionList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCommentCorrectionList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCommentCorrectionList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExtCommentList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExtCommentList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExtCommentList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsOpenAccess() != null) {
            _hashCode += getIsOpenAccess().hashCode();
        }
        if (getInEPMC() != null) {
            _hashCode += getInEPMC().hashCode();
        }
        if (getInPMC() != null) {
            _hashCode += getInPMC().hashCode();
        }
        if (getHasPDF() != null) {
            _hashCode += getHasPDF().hashCode();
        }
        if (getHasBook() != null) {
            _hashCode += getHasBook().hashCode();
        }
        if (getBookid() != null) {
            _hashCode += getBookid().hashCode();
        }
        if (getHasSuppl() != null) {
            _hashCode += getHasSuppl().hashCode();
        }
        if (getCitedByCount() != null) {
            _hashCode += getCitedByCount().hashCode();
        }
        if (getHasData() != null) {
            _hashCode += getHasData().hashCode();
        }
        if (getHasReferences() != null) {
            _hashCode += getHasReferences().hashCode();
        }
        if (getHasTextMinedTerms() != null) {
            _hashCode += getHasTextMinedTerms().hashCode();
        }
        if (getHasDbCrossReferences() != null) {
            _hashCode += getHasDbCrossReferences().hashCode();
        }
        if (getDbCrossReferenceList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDbCrossReferenceList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDbCrossReferenceList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHasSupplementary() != null) {
            _hashCode += getHasSupplementary().hashCode();
        }
        if (getHasFullTextXML() != null) {
            _hashCode += getHasFullTextXML().hashCode();
        }
        if (getHasLabsLinks() != null) {
            _hashCode += getHasLabsLinks().hashCode();
        }
        if (getLicense() != null) {
            _hashCode += getLicense().hashCode();
        }
        if (getVersionList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVersionList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVersionList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVersionNumber() != null) {
            _hashCode += getVersionNumber().hashCode();
        }
        if (getAuthMan() != null) {
            _hashCode += getAuthMan().hashCode();
        }
        if (getEpmcAuthMan() != null) {
            _hashCode += getEpmcAuthMan().hashCode();
        }
        if (getNihAuthMan() != null) {
            _hashCode += getNihAuthMan().hashCode();
        }
        if (getManuscriptId() != null) {
            _hashCode += getManuscriptId().hashCode();
        }
        if (getHasTMAccessionNumbers() != null) {
            _hashCode += getHasTMAccessionNumbers().hashCode();
        }
        if (getTmAccessionTypeList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTmAccessionTypeList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTmAccessionTypeList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDateOfCompletion() != null) {
            _hashCode += getDateOfCompletion().hashCode();
        }
        if (getDateOfCreation() != null) {
            _hashCode += getDateOfCreation().hashCode();
        }
        if (getFirstIndexDate() != null) {
            _hashCode += getFirstIndexDate().hashCode();
        }
        if (getFullTextReceivedDate() != null) {
            _hashCode += getFullTextReceivedDate().hashCode();
        }
        if (getDateOfRevision() != null) {
            _hashCode += getDateOfRevision().hashCode();
        }
        if (getElectronicPublicationDate() != null) {
            _hashCode += getElectronicPublicationDate().hashCode();
        }
        if (getFirstPublicationDate() != null) {
            _hashCode += getFirstPublicationDate().hashCode();
        }
        if (getEmbargoDate() != null) {
            _hashCode += getEmbargoDate().hashCode();
        }
        if (getFullText() != null) {
            _hashCode += getFullText().hashCode();
        }
        if (getSupplementaryFiles() != null) {
            _hashCode += getSupplementaryFiles().hashCode();
        }
        if (getFullTextXML() != null) {
            _hashCode += getFullTextXML().hashCode();
        }
        if (getLuceneScore() != null) {
            _hashCode += getLuceneScore().hashCode();
        }
        if (getDateUpdated() != null) {
            _hashCode += getDateUpdated().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Result.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "result"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mongoId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mongoId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("request");
        elemField.setXmlName(new javax.xml.namespace.QName("", "request"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "request"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("citationId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "citationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pmid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pmid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pmcid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pmcid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullTextIdList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fullTextIdList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "fullTextId"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doi");
        elemField.setXmlName(new javax.xml.namespace.QName("", "doi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorString");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authorString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authorList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "authors"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "author"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("investigatorList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "investigatorList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "authors"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "investigator"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorIdList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authorIdList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "authorId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "authorId"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataLinksTagsList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataLinksTagsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "dataLinkstag"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("journalInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "journalInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "journalInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("journalTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "journalTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "issue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("journalVolume");
        elemField.setXmlName(new javax.xml.namespace.QName("", "journalVolume"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pubYear");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pubYear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("journalIssn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "journalIssn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pageInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("abstractText");
        elemField.setXmlName(new javax.xml.namespace.QName("", "abstractText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("affiliation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "affiliation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicationStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "publicationStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("", "language"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pubModel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pubModel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pubType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pubType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pubTypeList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pubTypeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "pubType"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brSummary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "brSummary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bookOrReportDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bookOrReportDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "bookOrReportDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("patentDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "patentDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "patentDetailsInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grantsList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "grantsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "grantInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "grant"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("meshHeadingList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "meshHeadingList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "meshHeadingInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "meshHeading"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywordList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "keywordList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "keyword"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chemicalList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chemicalList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "chemicalInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "chemical"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsetList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subsetList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "subSet"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "subset"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullTextUrlList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fullTextUrlList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "fullTextURLInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "fullTextUrl"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commentCorrectionList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "commentCorrectionList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "commentCorrection"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "commentCorrection"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extCommentList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "extCommentList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "extComment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "extComment"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isOpenAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isOpenAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inEPMC");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inEPMC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inPMC");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inPMC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasPDF");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hasPDF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasBook");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hasBook"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bookid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bookid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasSuppl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hasSuppl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("citedByCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "citedByCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hasData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasReferences");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hasReferences"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasTextMinedTerms");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hasTextMinedTerms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasDbCrossReferences");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hasDbCrossReferences"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dbCrossReferenceList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dbCrossReferenceList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "dbName"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasSupplementary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hasSupplementary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasFullTextXML");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hasFullTextXML"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasLabsLinks");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hasLabsLinks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("license");
        elemField.setXmlName(new javax.xml.namespace.QName("", "license"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "versionList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.cdb.ebi.ac.uk/", "version"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "version"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "versionNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authMan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authMan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("epmcAuthMan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "epmcAuthMan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nihAuthMan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nihAuthMan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manuscriptId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "manuscriptId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasTMAccessionNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hasTMAccessionNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tmAccessionTypeList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tmAccessionTypeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "accessionType"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOfCompletion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateOfCompletion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOfCreation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateOfCreation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstIndexDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "firstIndexDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullTextReceivedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fullTextReceivedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOfRevision");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateOfRevision"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("electronicPublicationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "electronicPublicationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstPublicationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "firstPublicationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("embargoDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "embargoDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullText");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fullText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplementaryFiles");
        elemField.setXmlName(new javax.xml.namespace.QName("", "supplementaryFiles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullTextXML");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fullTextXML"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("luceneScore");
        elemField.setXmlName(new javax.xml.namespace.QName("", "luceneScore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateUpdated");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateUpdated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
