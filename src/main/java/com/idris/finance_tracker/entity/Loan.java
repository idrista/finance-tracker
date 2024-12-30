package com.idris.finance_tracker.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false)
    private Long amount;

    @Column(nullable = false)
    private String currency;

    private String description;

    @CreationTimestamp
    private LocalDateTime date;

    @OneToMany(mappedBy = "loan")
    private List<Transaction> LoanTransaction;
}
