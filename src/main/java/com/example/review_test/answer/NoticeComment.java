package com.example.review_test.answer;

import com.example.review_test.notice.NoticePost;
import com.example.review_test.siteUser.User;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "notice_comment")
public class NoticeComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "post_id", nullable = false)
    private NoticePost post;

    @Column(name = "content", nullable = false, length = 500)
    private String content;

    private LocalDateTime createdDate;

    @Column(name = "modified_date")
    private LocalDateTime modifiedDate;
}
