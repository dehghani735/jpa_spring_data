package ir.detafti.jpa_spring_data.repositories;

import ir.detafti.jpa_spring_data.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

    @Query("""
            SELECT a FROM Author a WHERE a.id = :id
            """)
    Optional<Author> findAuthorById(Integer id); // Select a from Author a where a.id = :id

//    @Query("""
//            SELECT a FROM Author a
//             """)
//    List<Author> findAllAuthors();
}
