package com.example.review_test.answer;


import com.example.review_test.question.ReviewPost;
import com.example.review_test.siteUser.User;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class ReviewComment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private LocalDateTime createdDate;

    @Column
    private LocalDateTime modifiedDate;

    @ManyToOne
    private User user;

    @ManyToOne
    private ReviewPost reviewPost;

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private ReviewComment parentAnswer;  // 부모 댓글 (답글일 경우)

    @OneToMany(mappedBy = "parentAnswer", cascade = CascadeType.ALL)
    private List<ReviewComment> childAnswers = new ArrayList<>();  // 자식 댓글들 (답글들)
}
