package com.TapazApp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
public class ReportEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String id;
    String reportText;
    Boolean reportStatus;

    String fkReporterId;
    String fkReportedId;

    public ReportEntity() {
    }

    public ReportEntity(String id, String reportText, Boolean reportStatus, String fkReporterId, String fkReportedId) {
        this.id = id;
        this.reportText = reportText;
        this.reportStatus = reportStatus;
        this.fkReporterId = fkReporterId;
        this.fkReportedId = fkReportedId;
    }
}