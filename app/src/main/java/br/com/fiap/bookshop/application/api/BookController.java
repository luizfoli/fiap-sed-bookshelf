package br.com.fiap.bookshop.application.api;


import br.com.fiap.bookshop.domain.entity.Book;
import br.com.fiap.bookshop.domain.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static br.com.fiap.bookshop.application.api.BookController.ENDPOINT_NAME;

@Slf4j
@RestController
@RequestMapping(ENDPOINT_NAME)
public class BookController {

    public static final String ENDPOINT_NAME = "/api/v1/book";
    public static final String ERROR_MESSAGE = "Ocorreu um erro durante o processamento da requisição";
    public static final String IN_MESSAGE = "Registrando entrada para endpoint: ";
    public static final String OUT_MESSAGE = "Registrando saída para endpoint: ";

    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> get() {

        try {

            log.info(IN_MESSAGE + ENDPOINT_NAME + " | get");
            return this.bookService.getAll();

        } catch (Exception e) {
            log.error(e.getMessage());
            throw new RuntimeException(ERROR_MESSAGE);
        } finally {
            log.info(OUT_MESSAGE + ENDPOINT_NAME + " | get");
        }
    }


}
