package me.leejaehyeong.springbootblog.controller;

import lombok.RequiredArgsConstructor;
import me.leejaehyeong.springbootblog.domain.Article;
import me.leejaehyeong.springbootblog.dto.AddArticleRequest;
import me.leejaehyeong.springbootblog.service.BlogService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController // HTTP Response Body에 객체 데이터를 JSON 형식으로 반환하는 컨트롤러
public class BlogApiController {

    private final BlogService blogService;

    @PostMapping("/api/articles")
    public ResponseEntity<Article> addArticle(@RequestBody AddArticleRequest request) {
        Article saveArticle = blogService.save(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(saveArticle);
    }
}
