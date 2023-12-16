package pl.grsw.fust.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.grsw.fust.model.Article;

import java.util.List;
import java.util.Optional;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {

//    List<Article> findAll();
//
//    Optional<Article> findById(Long id);

    Optional<Article> findBySlug(String slug);

    @Query("SELECT a FROM Article a ORDER BY a.created DESC")
    List<Article> findLatest(Pageable pageable);
}
