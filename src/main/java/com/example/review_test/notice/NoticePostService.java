package com.example.review_test.notice;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NoticePostService {

    private final NoticePostRepository noticePostRepository;

    public Page<NoticePost> getNotices(Pageable pageable) {
        return noticePostRepository.findAll(pageable);
    }
}
