package com.example.review_test.siteUser;


import com.example.review_test.notice.NoticePost;
import com.example.review_test.question.ReviewPost;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 100, nullable = false, unique = true)
    private String userId;

    @Column(length = 100, nullable = false)
    private String nickname;

    @Column(name = "create_date", nullable = false)
    private LocalDateTime createDate;

    @Column(name = "password", nullable = false, length = 100)
    private String password;

    @Column(name = "email", nullable = false, length = 100)
    private String email;

    @Column
    private int authority;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<ReviewPost> reviewPosts;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<NoticePost> noticePosts;

}
