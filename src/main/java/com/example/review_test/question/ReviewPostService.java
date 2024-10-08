package com.example.review_test.question;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReviewPostService {
    private final ReviewPostRepository reviewPostRepository;

    public ReviewPost saveReviewPost(ReviewPost reviewPost) {
        return reviewPostRepository.save(reviewPost);
    }
    public List<ReviewPost> getList(){
        return this.reviewPostRepository.findAll();
    }
}