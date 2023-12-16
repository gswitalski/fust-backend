package pl.grsw.fust.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.grsw.fust.model.Article;
import pl.grsw.fust.repository.ArticleRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArticleService {

    private final ArticleRepository articleRepository;

    public List<Article> getLatestArticles() {
        return articleRepository.findAll();
    }
}
