package com.sabir.springboot.services.impl;

import com.sabir.springboot.dto.BookDto;
import com.sabir.springboot.entities.Book;
import com.sabir.springboot.entities.User;
import com.sabir.springboot.exception.BookException;
import com.sabir.springboot.exception.UserException;
import com.sabir.springboot.mapper.BookMapper;
import com.sabir.springboot.repositories.BookRepository;
import com.sabir.springboot.repositories.UserRepository;
import com.sabir.springboot.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

    @Override
    public List<BookDto> getBooks() {
        List<Book> books =  bookRepository.findAll();
        return books.stream().map((book) -> BookMapper.mapToBookDto(book)).collect(Collectors.toList());
    }

    @Override
    public BookDto getBookById(Long bookId) {
        Book book = bookRepository.findById(bookId)
                .orElseThrow(() -> new BookException("Book is not found with given id : " + bookId));
        return BookMapper.mapToBookDto(book);
    }

    @Override
    public BookDto updateBook(Long book_id, BookDto book) {
        Book existingBook = bookRepository.findById(book_id)
                .orElseThrow(() -> new BookException("Book is not found with given id : " + book_id));
        existingBook.setTitle(book.getTitle());
        existingBook.setAuthor(book.getAuthor());
        existingBook.setBorrowed(book.isBorrowed());
        existingBook.setBorrowedBy(book.getBorrowedBy());

        Book updatedBook = bookRepository.save(existingBook);
        return BookMapper.mapToBookDto(updatedBook);
    }

    @Override
    public void deleteBook(Long book_id) {
        bookRepository.deleteById(book_id);
    }

    @Override
    public BookDto borrowBook(Long book_id, Long user_id) {
        Book book = bookRepository.findById(book_id)
                .orElseThrow(() -> new BookException("Book is not found with given id : " + book_id));

        User user = userRepository.findById(user_id)
                .orElseThrow(() -> new UserException("User is not found with given id : " + user_id));

        if(book != null && user != null){
            if(!book.isBorrowed()){
                book.setBorrowedBy(user);
                book.setBorrowed(true);
                Book savedBook = bookRepository.save(book);
                return BookMapper.mapToBookDto(savedBook);
            }else{
                System.out.println("Book already borrowed");
            }
        }
        return null;
    }
}
