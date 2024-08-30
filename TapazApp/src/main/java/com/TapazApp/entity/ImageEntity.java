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
public class ImageEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String id;
    String imageUrl;
    Boolean imageStatus;

    String fkStickerId;

    public ImageEntity() {
    }

    public ImageEntity(String id, String imageUrl, Boolean imageStatus, String fkStickerId) {
        this.id = id;
        this.imageUrl = imageUrl;
        this.imageStatus = imageStatus;
        this.fkStickerId = fkStickerId;
    }
}