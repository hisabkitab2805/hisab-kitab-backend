package com.hisabkitab.entity;

import com.hisabkitab.entity.enums.SplittingType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import org.joda.time.DateTime;

@Entity
@Table(name = "expense")
public class Expense {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String description;
    private Double Amount;
    @ManyToOne
    @JoinColumn(name = "paid_by_id", referencedColumnName = "id")
    private User paidBy;
    @ManyToOne
    @JoinColumn(name = "group_id", referencedColumnName = "id")
    private Group groupId;
    private DateTime expenseDate;
    private SplittingType splittingType;
    @Column(columnDefinition = "json")
    private String splitDetails;

    public Expense(Long id, String description, Double amount, User paidBy, Group groupId, DateTime expenseDate, SplittingType splittingType, String splitDetails) {
        this.id = id;
        this.description = description;
        Amount = amount;
        this.paidBy = paidBy;
        this.groupId = groupId;
        this.expenseDate = expenseDate;
        this.splittingType = splittingType;
        this.splitDetails = splitDetails;
    }

    public Expense() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getAmount() {
        return Amount;
    }

    public void setAmount(Double amount) {
        Amount = amount;
    }

    public User getPaidBy() {
        return paidBy;
    }

    public void setPaidBy(User paidBy) {
        this.paidBy = paidBy;
    }

    public Group getGroupId() {
        return groupId;
    }

    public void setGroupId(Group groupId) {
        this.groupId = groupId;
    }

    public DateTime getExpenseDate() {
        return expenseDate;
    }

    public void setExpenseDate(DateTime expenseDate) {
        this.expenseDate = expenseDate;
    }

    public SplittingType getSplittingType() {
        return splittingType;
    }

    public void setSplittingType(SplittingType splittingType) {
        this.splittingType = splittingType;
    }

    public String getSplitDetails() {
        return splitDetails;
    }

    public void setSplitDetails(String splitDetails) {
        this.splitDetails = splitDetails;
    }
}

