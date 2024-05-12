package com.sabir.springboot.services;

import com.sabir.springboot.dto.BookDto;

public interface BookService {
    BookDto createBook(BookDto bookDto);
}
