package pl.grsw.fust.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Article {
    private Long id;
    private String title;
    private String intro;
    private String content;
}
