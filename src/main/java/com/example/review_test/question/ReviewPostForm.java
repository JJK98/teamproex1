package com.example.review_test.question;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class ReviewPostForm {
    @NotEmpty (message = "제목은 필수 항목입니다.")
    @Size (max = 100, message = "제목은 100자를 초과할 수 없습니다.")
    private String subject;

    @NotEmpty(message = "내용은 필수 항목입니다.")
    private String content;

    private String contentDetail;
}