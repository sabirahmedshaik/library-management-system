package com.sabir.springboot.services.impl;

import com.sabir.springboot.dto.BookDto;
import com.sabir.springboot.entities.Book;
import com.sabir.springboot.mapper.BookMapper;
import com.sabir.springboot.repositories.BookRepository;
import com.sabir.springboot.repositories.UserRepository;
import com.sabir.springboot.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public BookDto createBook(BookDto bookDto) {
        Book book = BookMapper.mapToBook((bookDto));
        Book savedBook = bookRepository.save(book);
        return BookMapper.mapToBookDto(savedBook);
    }
}
