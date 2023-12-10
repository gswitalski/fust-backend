package pl.grsw.fust.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.grsw.fust.dto.ArticleCardDto;
import pl.grsw.fust.service.ArticleService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/articles")
public class ArticleController {

    private final ArticleService articleService;

    @GetMapping("/latest")
    public List<ArticleCardDto> getLatestArticles() {
        return articleService.getLatestArticles().stream().map(ArticleCardDto::mapFromArticle).toList();
    }
}
