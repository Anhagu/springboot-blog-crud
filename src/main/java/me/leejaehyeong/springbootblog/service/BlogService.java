package me.leejaehyeong.springbootblog.service;


import lombok.RequiredArgsConstructor;
import me.leejaehyeong.springbootblog.domain.Article;
import me.leejaehyeong.springbootblog.dto.AddArticleRequest;
import me.leejaehyeong.springbootblog.repository.BlogRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor // final이 붙거나 @NotNull이 붙은 필드의 생성자 추가
@Service // 빈으로 등록
public class BlogService {

    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }
}
