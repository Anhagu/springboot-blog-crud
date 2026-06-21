package me.leejaehyeong.springbootblog.repository;

import me.leejaehyeong.springbootblog.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
