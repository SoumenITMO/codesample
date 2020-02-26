package com.samasa.hspms.Booking.validation.Entity.RoomBooking;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "unit_doc_nextseq")
public class UnitDocNextseq {
    private Integer docNextseqId;
    private String unitCode;
    private String documentCode;
    private String processType;
    private String productSegment;
    private Date periodDateStart;
    private Date periodDateEnd;
    private String docPrefix;
    private String docSuffix;
    private String nextseqNo;
    private String fisPeriodStatus;

    @Id
    @Column(name = "doc_nextseq_id", nullable = false)
    public Integer getDocNextseqId() {
        return docNextseqId;
    }

    public void setDocNextseqId(Integer docNextseqId) {
        this.docNextseqId = docNextseqId;
    }

    @Basic
    @Column(name = "unit_code", nullable = false, length = 5)
    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    @Basic
    @Column(name = "document_code", nullable = false, length = 4)
    public String getDocumentCode() {
        return documentCode;
    }

    public void setDocumentCode(String documentCode) {
        this.documentCode = documentCode;
    }

    @Basic
    @Column(name = "process_type", nullable = false, length = 3)
    public String getProcessType() {
        return processType;
    }

    public void setProcessType(String processType) {
        this.processType = processType;
    }

    @Basic
    @Column(name = "product_segment", nullable = true, length = 3)
    public String getProductSegment() {
        return productSegment;
    }

    public void setProductSegment(String productSegment) {
        this.productSegment = productSegment;
    }

    @Basic
    @Column(name = "period_date_start", nullable = false)
    public Date getPeriodDateStart() {
        return periodDateStart;
    }

    public void setPeriodDateStart(Date periodDateStart) {
        this.periodDateStart = periodDateStart;
    }

    @Basic
    @Column(name = "period_date_end", nullable = false)
    public Date getPeriodDateEnd() {
        return periodDateEnd;
    }

    public void setPeriodDateEnd(Date periodDateEnd) {
        this.periodDateEnd = periodDateEnd;
    }

    @Basic
    @Column(name = "doc_prefix", nullable = true, length = 10)
    public String getDocPrefix() {
        return docPrefix;
    }

    public void setDocPrefix(String docPrefix) {
        this.docPrefix = docPrefix;
    }

    @Basic
    @Column(name = "doc_suffix", nullable = true, length = 10)
    public String getDocSuffix() {
        return docSuffix;
    }

    public void setDocSuffix(String docSuffix) {
        this.docSuffix = docSuffix;
    }

    @Basic
    @Column(name = "nextseq_no", nullable = false)
    public String getNextseqNo() {
        return nextseqNo;
    }

    public void setNextseqNo(String nextseqNo) {
        this.nextseqNo = nextseqNo;
    }

    @Basic
    @Column(name = "fis_period_status", nullable = false, length = 1)
    public String getFisPeriodStatus() {
        return fisPeriodStatus;
    }

    public void setFisPeriodStatus(String fisPeriodStatus) {
        this.fisPeriodStatus = fisPeriodStatus;
    }
}
