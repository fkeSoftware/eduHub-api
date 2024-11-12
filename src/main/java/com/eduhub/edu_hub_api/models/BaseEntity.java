package com.eduhub.edu_hub_api.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass

public abstract class BaseEntity {
    @Column(name = "createdAt")
    private LocalDateTime createdAt;

    @Column(name = "isActive")
    private int isActive;
}
