package com.example.review_test.question;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReviewPostService {
    private final ReviewPostRepository reviewPostRepository;

    public ReviewPost saveReviewPost(ReviewPost reviewPost) {
        return reviewPostRepository.save(reviewPost);
    }
}