package br.com.fiap.bookshop.domain.service;

import br.com.fiap.bookshop.domain.entity.Book;
import br.com.fiap.bookshop.infrastructure.mapper.BookMapper;
import br.com.fiap.bookshop.infrastructure.repository.BookRepository;
import br.com.fiap.bookshop.infrastructure.repository.entity.BookDBEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class BookService {

    private BookRepository bookRepository;
    private BookMapper bookMapper;

    public BookService(BookRepository bookRepository, BookMapper bookMapper) {
        this.bookRepository = bookRepository;
        this.bookMapper = bookMapper;
    }

    public List<Book> getAll() {

        try {

            List<Book> books = new ArrayList<>();
            List<BookDBEntity> booksDb = this.bookRepository.findAll();
            booksDb.forEach(bookDb -> books.add(bookMapper.convertBookDBToBook(bookDb)));
            log.info("Retornando livros encontrados - getAll - ", books);
            return books;

        } catch (Exception e) {
            log.error("Erro duranto recuperação de todos os livros - getAll - ", e);
            throw e;
        }
    }

    public Book getBookById(int id) throws Exception {

        try {
            Optional<BookDBEntity> bookDB = this.bookRepository.findById(id);
            if(bookDB.isEmpty()) {
                throw new Exception("Nenhum livro encontrado com esse identificador");
            }

            log.info("Retornando livro encontrado com identificador " + id + " - getBookById");
            return this.bookMapper.convertBookDBToBook(bookDB.get());
        } catch (Exception e) {
            log.error(e.getMessage());
            throw e;
        }

    }


}
