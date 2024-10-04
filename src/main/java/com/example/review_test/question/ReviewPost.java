package com.example.review_test.question;


import com.example.review_test.Image;
import com.example.review_test.answer.ReviewComment;
import com.example.review_test.siteUser.User;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
public class ReviewPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 100, nullable = false)
    private String subject;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    @Column(nullable = false)
    private LocalDateTime createDate;

    @Column
    private LocalDateTime modifyDate;

    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "reviewPost", cascade = CascadeType.REMOVE)
    private List<ReviewComment> comments;

    @OneToMany(mappedBy = "post", cascade = CascadeType.REMOVE)
    private List<Image> images;

    @Column
    private int views;

    @Column
    private int vote;
}
