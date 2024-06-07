package miu.edu.pagination_demo.repository;

import miu.edu.pagination_demo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository<Book, Long> {
}
