package com.example.umc9th.domain.review.dto.res;

import lombok.Builder;

import java.time.LocalDate;

public class ReviewResDTO {
    @Builder
    public static class ReviewDTO {
        private Long id;
        private Long store;
        private String content;
        private Float star;
        private LocalDate createdDate;
    }
}
