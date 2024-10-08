package com.example.review_test.notice;

import com.example.review_test.answer.NoticeComment;
import com.example.review_test.answer.ReviewComment;
import com.example.review_test.siteUser.User;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

import lombok.Data;

@Entity
@Data
public class NoticePost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String subject;
    private String content;
    private LocalDate createDate;
    private LocalDate modifyDate;
    private User user;
    private String views;
    @OneToMany(mappedBy = "noticePost", cascade = CascadeType.REMOVE)
    private List<NoticeComment> comments;
}
