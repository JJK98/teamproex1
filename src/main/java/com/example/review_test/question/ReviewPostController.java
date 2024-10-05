package com.example.review_test.question;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@   Controller
@RequestMapping("/reviewPost")
@RequiredArgsConstructor
public class ReviewPostController {
    private final ReviewPostService reviewPostService;

    @GetMapping("/create")
    public String create(){
        return "review_form";
    }
    @PostMapping("/create")
    public ReviewPost createReviewPost(@Valid ReviewPostForm reviewPostForm) {
        ReviewPost reviewPost = new ReviewPost();
        reviewPost.setSubject(reviewPostForm.getSubject());
        reviewPost.setContent(reviewPostForm.getContent());
        reviewPost.setContentDetail(reviewPostForm.getContentDetail());
        reviewPost.setCreateDate(LocalDateTime.now());
        return reviewPostService.saveReviewPost(reviewPost);
    }
}
