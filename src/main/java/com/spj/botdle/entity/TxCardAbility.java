package com.spj.botdle.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.Instant;

@Entity
@Table(name = "tx_card_ability")
public class TxCardAbility {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "TX_CARD_ID", nullable = false)
    private Long txCardId;

    @Column(name = "LK_ABILITY_CODE", length = 20)
    private String lkAbilityCode;

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

    public Long getTxCardId() {
        return txCardId;
    }

    public void setTxCardId(Long txCardId) {
        this.txCardId = txCardId;
    }

    public String getLkAbilityCode() {
        return lkAbilityCode;
    }

    public void setLkAbilityCode(String lkAbilityCode) {
        this.lkAbilityCode = lkAbilityCode;
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