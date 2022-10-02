package br.com.fiap.bookshelf.infrastructure.repository;

import br.com.fiap.bookshelf.infrastructure.repository.entity.BookDBEntity;
import br.com.fiap.bookshelf.infrastructure.repository.mock.MockUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookRepository {

    private MockUtils mockUtils;

    public BookRepository(MockUtils mockUtils) {
        this.mockUtils = mockUtils;
    }

    public List<BookDBEntity> findAll() {
        return this.mockUtils.getMockBookDBEntity();
    }

    public Optional<BookDBEntity> findById(Integer id) {
        return this.mockUtils.getMockBookDBEntity()
                .stream().filter(book -> book.getId() == id).findFirst();
    }

    public void add(BookDBEntity bookDBEntity) {
        this.mockUtils.addMockDBEntity(bookDBEntity);
    }



}
