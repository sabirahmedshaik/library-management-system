package com.sabir.springboot.mapper;

import com.sabir.springboot.dto.BookDto;
import com.sabir.springboot.entities.Book;

public class BookMapper {

    public BookDto mapToBookDto(Book book){
        BookDto bookDto = new BookDto();
        bookDto.setId(book.getId());
        bookDto.setTitle(book.getTitle());
        bookDto.setAuthor(book.getAuthor());
        bookDto.setBorrowed(book.isBorrowed());
        bookDto.setBorrowedBy(book.getBorrowedBy());
        return bookDto;
    }

    public Book mapToBook(BookDto bookDto){
        Book book = new Book();
        book.setId(bookDto.getId());
        book.setTitle(bookDto.getTitle());
        book.setAuthor(bookDto.getAuthor());
        book.setBorrowed(bookDto.isBorrowed());
        book.setBorrowedBy(bookDto.getBorrowedBy());
        return book;
    }
}
