package com.expenseworld.reimburse.domain;

import javax.persistence.*;

@Entity
@Table(name="RECEIPTS")
public class Receipt {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private Double amount;

    public Receipt() {
    }

    public Receipt(String name, Double amount) {
        this.name = name;
        this.amount = amount;
    }

    @ManyToOne
    @JoinColumn(name = "expense_id", nullable = false)
    private Expense expense;

    public Expense getExpense() {
        return expense;
    }

    public void setExpense(Expense expense) {
        this.expense = expense;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }


}
