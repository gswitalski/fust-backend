package pl.grsw.fust.service;

import org.springframework.stereotype.Service;
import pl.grsw.fust.model.Article;

import java.util.List;

@Service
public class ArticleService {

    public List<Article> getLatestArticles() {
        return List.of(
                new Article(1L, "Article 1", "Intro 1", "Content 1"),
                new Article(2L, "Article 2", "Intro 2", "Content 2"),
                new Article(3L, "Article 3", "Intro 3", "Content 3"),
                new Article(4L, "Article 4", "Intro 4", "Content 4"),
                new Article(5L, "Article 5", "Intro 5", "Content 5"),
                new Article(6L, "Article 6", "Intro 6", "Content 6")
        );
    }
}
