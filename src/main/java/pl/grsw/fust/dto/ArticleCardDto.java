package pl.grsw.fust.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import pl.grsw.fust.model.Article;

@AllArgsConstructor
@Getter
@Builder
public class ArticleCardDto {
    private Long id;
    private String title;
    private String intro;

    public static  ArticleCardDto mapFromArticle(Article article) {
        return builder()
                .id(article.getId())
                .title(article.getTitle())
                .intro(article.getIntro())
                .build();
    }
}
