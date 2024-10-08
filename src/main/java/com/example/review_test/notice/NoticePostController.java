package com.example.review_test.notice;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class NoticePostController {

    private final NoticePostService noticePostService;

    @GetMapping("/notice")
    public String listNotices(@RequestParam(value = "page",defaultValue = "0") int page, Model model) {
        Pageable pageable = PageRequest.of(page, 10); // 페이지당 10개의 항목 표시
        Page<NoticePost> noticePostPage = noticePostService.getNotices(pageable);
        model.addAttribute("currentPageName", "notice");
        model.addAttribute("noticePostPage", noticePostPage);
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", noticePostPage.getTotalPages());
        return "board_notice";
    }
}