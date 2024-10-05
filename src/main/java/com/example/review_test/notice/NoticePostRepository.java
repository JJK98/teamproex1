package com.example.review_test.notice;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoticePostRepository extends JpaRepository<NoticePost, Long> {
    Page<NoticePost> findAll(Pageable pageable);  // 페이징 처리
}
