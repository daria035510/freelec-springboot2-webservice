package com.jojoldu.book.springboot.web;

import com.jojoldu.book.springboot.service.posts.PostsServcie;
import com.jojoldu.book.springboot.web.dto.PostsReponseDto;
import com.jojoldu.book.springboot.web.dto.PostsSaveRequestDto;
import com.jojoldu.book.springboot.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsServcie postsServcie;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsServcie.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto) {
        return postsServcie.update(id, requestDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsReponseDto findById(@PathVariable Long id) {
        return postsServcie.findById(id);
    }

    @DeleteMapping("/api/v1/posts/{id}")
    public Long delete(@PathVariable Long id) {
        postsServcie.delete(id);
        return id;
    }
}
