package com.idris.finance_tracker.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class Goal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false)
    private Long targetAmount;

    @Column(nullable = false)
    private String currency;

    @Column(nullable = false)
    private String title;

    private LocalDate targetDate;
    private String description;
}
