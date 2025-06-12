package com.spj.botdle.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.Instant;

@Entity
@Table(name = "tx_card")
public class TxCard {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "NAME", nullable = false, length = 50)
    private String name;

    @Column(name = "LK_TYPE_CODE", length = 20)
    private String lkTypeCode;

    @Column(name = "LK_COLOR_CODE", length = 20)
    private String lkColorCode;

    @Column(name = "LK_COST_CODE", length = 20)
    private String lkCostCode;

    @Column(name = "LK_POWER_CODE", length = 20)
    private String lkPowerCode;

    @Column(name = "LK_GEM_CODE", length = 20)
    private String lkGemCode;

    @Column(name = "FULL_ABILITY", length = 1000)
    private String fullAbility;

    @Column(name = "RECORD_STATUS", nullable = false)
    private Character recordStatus;

    @Column(name = "CREATED_BY", nullable = false)
    private Long createdBy;

    @Column(name = "CREATED_AT", nullable = false)
    private Instant createdAt;

    @Column(name = "UPDATED_BY", nullable = false)
    private Long updatedBy;

    @Column(name = "UPDATED_AT", nullable = false)
    private Instant updatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLkTypeCode() {
        return lkTypeCode;
    }

    public void setLkTypeCode(String lkTypeCode) {
        this.lkTypeCode = lkTypeCode;
    }

    public String getLkColorCode() {
        return lkColorCode;
    }

    public void setLkColorCode(String lkColorCode) {
        this.lkColorCode = lkColorCode;
    }

    public String getLkCostCode() {
        return lkCostCode;
    }

    public void setLkCostCode(String lkCostCode) {
        this.lkCostCode = lkCostCode;
    }

    public String getLkPowerCode() {
        return lkPowerCode;
    }

    public void setLkPowerCode(String lkPowerCode) {
        this.lkPowerCode = lkPowerCode;
    }

    public String getLkGemCode() {
        return lkGemCode;
    }

    public void setLkGemCode(String lkGemCode) {
        this.lkGemCode = lkGemCode;
    }

    public String getFullAbility() {
        return fullAbility;
    }

    public void setFullAbility(String fullAbility) {
        this.fullAbility = fullAbility;
    }

    public Character getRecordStatus() {
        return recordStatus;
    }

    public void setRecordStatus(Character recordStatus) {
        this.recordStatus = recordStatus;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Long getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

}