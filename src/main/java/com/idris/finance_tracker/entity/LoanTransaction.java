package com.idris.finance_tracker.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Data
@Entity
public class LoanTransaction {
    @EmbeddedId
    private LoanTransactionId id;

    @ManyToOne
    @MapsId("loanId")
    private Loan loan;

    @ManyToOne
    @MapsId("transactionId")
    private Transaction transaction;

    @Column(nullable = false)
    private Long amount;

    private String description;

    @CreationTimestamp
    private LocalDateTime date;
}

