package com.test.loadingTest.dto;

import com.test.loadingTest.entity.Member;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class BoardDto {

    private Long id;
    private String title;
    private String content;
    private Member member;
}
