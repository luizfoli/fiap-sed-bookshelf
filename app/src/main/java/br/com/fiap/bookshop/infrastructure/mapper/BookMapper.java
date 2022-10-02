package br.com.fiap.bookshop.infrastructure.mapper;

import br.com.fiap.bookshop.domain.entity.Book;

import br.com.fiap.bookshop.infrastructure.repository.entity.BookDBEntity;
import org.springframework.stereotype.Service;

@Service
public class BookMapper {

    public Book convertBookDBToBook(BookDBEntity bookDB) {
        return Book.builder()
                .id(bookDB.getId())
                .title(bookDB.getTitle())
                .authorName(bookDB.getAuthorName()).build();
    }


}
