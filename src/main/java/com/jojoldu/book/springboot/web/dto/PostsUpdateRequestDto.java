package com.jojoldu.book.springboot.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsUpdateRequestDto {

    private String content;
    private String title;

    @Builder
    public PostsUpdateRequestDto(String content, String title) {
        this.title = title;
        this.content = content;
    }
}
