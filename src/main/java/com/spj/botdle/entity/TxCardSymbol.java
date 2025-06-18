package com.spj.botdle.entity;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "tx_card_symbol")
public class TxCardSymbol {
    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "TX_CARD_ID", nullable = false)
    private Long txCardId;

    @Column(name = "LK_SYMBOL_CODE", length = 20)
    private String lkSymbolCode;

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

    public String getLkSymbolCode() {
        return lkSymbolCode;
    }

    public void setLkSymbolCode(String lkSymbolCode) {
        this.lkSymbolCode = lkSymbolCode;
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