package com.spj.botdle.entity;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "tx_card")
public class TxCard {
    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "SERIAL_CODE")
    private String serialCode;

    @Column(name = "NAME_EN", nullable = false, length = 50)
    private String nameEn;

    @Column(name = "NAME_TH", nullable = false, length = 50)
    private String nameTh;

    @Column(name = "IS_ONLY_ONE")
    private Character isOnlyOne;

    @Column(name = "LK_TYPE_CODE", length = 20)
    private String lkTypeCode;

    @Column(name = "LK_COST_COLOR_CODE", length = 20)
    private String lkCostColorCode;

    @Column(name = "LK_COST_CODE", length = 20)
    private String lkCostCode;

    @Column(name = "LK_CARD_COLOR", length = 20)
    private String lkCardColor;

    @Column(name = "LK_POWER_CODE", length = 20)
    private String lkPowerCode;

    @Column(name = "LK_GEM_CODE", length = 20)
    private String lkGemCode;

    @Column(name = "LK_PACK_CODE", length = 20)
    private String lkPackCode;

    @Column(name = "LK_SOI_CODE", length = 20)
    private String lkSoiCode;

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

    public String getSerialCode() {
        return serialCode;
    }

    public void setSerialCode(String serialCode) {
        this.serialCode = serialCode;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public String getNameTh() {
        return nameTh;
    }

    public void setNameTh(String nameTh) {
        this.nameTh = nameTh;
    }

    public Character getIsOnlyOne() {
        return isOnlyOne;
    }

    public void setIsOnlyOne(Character isOnlyOne) {
        this.isOnlyOne = isOnlyOne;
    }

    public String getLkTypeCode() {
        return lkTypeCode;
    }

    public void setLkTypeCode(String lkTypeCode) {
        this.lkTypeCode = lkTypeCode;
    }

    public String getLkCostColorCode() {
        return lkCostColorCode;
    }

    public void setLkCostColorCode(String lkCostColorCode) {
        this.lkCostColorCode = lkCostColorCode;
    }

    public String getLkCostCode() {
        return lkCostCode;
    }

    public void setLkCostCode(String lkCostCode) {
        this.lkCostCode = lkCostCode;
    }

    public String getLkCardColor() {
        return lkCardColor;
    }

    public void setLkCardColor(String lkCardColor) {
        this.lkCardColor = lkCardColor;
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

    public String getLkPackCode() {
        return lkPackCode;
    }

    public void setLkPackCode(String lkPackCode) {
        this.lkPackCode = lkPackCode;
    }

    public String getLkSoiCode() {
        return lkSoiCode;
    }

    public void setLkSoiCode(String lkSoiCode) {
        this.lkSoiCode = lkSoiCode;
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