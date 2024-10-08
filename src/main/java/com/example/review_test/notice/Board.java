package com.example.review_test.notice;

import jakarta.persistence.*;

@Entity
@Table(name = "board")
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "board_type", nullable = false, unique = true)
    private String boardType;
}