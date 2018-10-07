package com.expenseworld.reimburse.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="EXPENSE")
public class Expense {
    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(targetEntity = Receipt.class, mappedBy = "expense", fetch=FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Receipt> receipts;

    public Expense() {
    }

    public Expense(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Receipt> getReceipts() {
        return receipts;
    }

    public void setReceipts(List<Receipt> receipts) {
        this.receipts = receipts;
    }


}
