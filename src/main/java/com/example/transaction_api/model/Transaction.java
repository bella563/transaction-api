
package com.example.transaction_api.model;

import jakarta.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)  // UUID auto-généré
    private UUID id;

    private String description;  // Description de la transaction

    @Enumerated(EnumType.STRING)
    private TransactionType type;  // Type de transaction (Revenu ou Dépense)

    private Double amount;  // Montant de la transaction

    @Temporal(TemporalType.TIMESTAMP)
    private Date date;  // Date de la transaction

    // Getters et Setters

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
