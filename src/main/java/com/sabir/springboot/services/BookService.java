package com.sabir.springboot.services;

import com.sabir.springboot.dto.BookDto;
import com.sabir.springboot.entities.Book;

public interface BookService {
    BookDto addBook(Book book);
}
