package com.jojoldu.book.springboot.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsUpdateRequestDto {

    private String contents;
    private String title;

    @Builder
    public PostsUpdateRequestDto(String contents, String title) {
        this.title = title;
        this.contents = contents;
    }
}
