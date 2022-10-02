package br.com.fiap.bookshelf.domain.service;

import br.com.fiap.bookshelf.domain.entity.Book;
import br.com.fiap.bookshelf.infrastructure.mapper.BookMapper;
import br.com.fiap.bookshelf.infrastructure.repository.BookRepository;
import br.com.fiap.bookshelf.infrastructure.repository.mock.MockUtils;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;

public class BookServiceTest {

    private BookRepository bookRepository = new BookRepository(new MockUtils());
    private BookMapper bookMapper = new BookMapper();
    private BookService bookService;

    public BookServiceTest() {
        this.bookService = new BookService(bookRepository, bookMapper);
    }

    @Test
    public void testGetAll() {
        assertFalse(bookService.getAll().isEmpty());
    }

    @Test
    public void testGetById() throws Exception {
        String titleOfFirst = this.bookService.getAll().stream().findFirst().get().getTitle();
        assertEquals(titleOfFirst, this.bookService.getBookById(1).getTitle());
    }

    @Test
    public void testAdd() throws Exception {
        Book book = Book.builder()
                .id(6)
                .title("Constituição da República Federativa do Brasil Constituição da República Federativa do Brasil")
                .authorName("Edições Camara")
                .build();

        this.bookService.add(book);
        assertEquals(book.getTitle(), this.bookService.getBookById(book.getId()).getTitle());
    }


}
