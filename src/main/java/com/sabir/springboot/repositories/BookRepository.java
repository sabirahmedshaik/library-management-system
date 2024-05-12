package com.sabir.springboot.repositories;

import com.sabir.springboot.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
