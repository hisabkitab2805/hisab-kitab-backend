package com.hisabkitab.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "debt")
public class Debt {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "group_id", referencedColumnName = "id")
    Group groupId;
    @ManyToOne
    @JoinColumn(name = "owed_by", referencedColumnName = "id")
    User owedBy;
    @ManyToOne
    @JoinColumn(name = "owed_to", referencedColumnName = "id")
    User owedTo;
    private Double amount;

    public Debt(Long id, Group groupId, User owedBy, User owedTo, Double amount) {
        this.id = id;
        this.groupId = groupId;
        this.owedBy = owedBy;
        this.owedTo = owedTo;
        this.amount = amount;
    }

    public Debt() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Group getGroupId() {
        return groupId;
    }

    public void setGroupId(Group groupId) {
        this.groupId = groupId;
    }

    public User getOwedBy() {
        return owedBy;
    }

    public void setOwedBy(User owedBy) {
        this.owedBy = owedBy;
    }

    public User getOwedTo() {
        return owedTo;
    }

    public void setOwedTo(User owedTo) {
        this.owedTo = owedTo;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}

