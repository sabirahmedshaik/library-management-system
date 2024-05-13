package com.sabir.springboot.services;

import com.sabir.springboot.dto.BookDto;

import java.util.List;

public interface BookService {
    BookDto createBook(BookDto bookDto);
    List<BookDto> getBooks();
    BookDto getBookById(Long bookId);
    BookDto updateBook(Long book_id, BookDto book);
    void deleteBook(Long book_id);
}
