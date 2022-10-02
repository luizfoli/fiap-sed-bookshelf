package br.com.fiap.bookshelf.infrastructure.mapper;

import br.com.fiap.bookshelf.domain.entity.Book;

import br.com.fiap.bookshelf.infrastructure.repository.entity.BookDBEntity;
import org.springframework.stereotype.Service;

@Service
public class BookMapper {

    public Book convertBookDBToBook(BookDBEntity bookDB) {
        return Book.builder()
                .id(bookDB.getId())
                .title(bookDB.getTitle())
                .authorName(bookDB.getAuthorName()).build();
    }

    public BookDBEntity convertBookToBookDB(Book book) {
        return BookDBEntity.builder()
                .id(book.getId())
                .title(book.getTitle())
                .authorName(book.getAuthorName())
                .build();
    }


}
