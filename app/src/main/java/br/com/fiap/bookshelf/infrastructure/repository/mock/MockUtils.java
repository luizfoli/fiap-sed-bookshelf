package br.com.fiap.bookshelf.infrastructure.repository.mock;

import br.com.fiap.bookshelf.infrastructure.repository.entity.BookDBEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MockUtils {

    private List<BookDBEntity> mockEntities = new ArrayList<>();

    public MockUtils() {
        mockEntities.add(BookDBEntity.builder().id(1).authorName("Marco Tulio Valente ").title("Engenharia de Software Moderna: Princípios e Práticas para Desenvolvimento de Software com Produtividade").build());
        mockEntities.add(BookDBEntity.builder().id(2).authorName("Liev Tolstói").title("Guerra e paz").build());
        mockEntities.add(BookDBEntity.builder().id(3).authorName("Uncle Bob").title("Clean Code").build());
        mockEntities.add(BookDBEntity.builder().id(4).authorName("Uncle Bob").title("Clean Architecture").build());
        mockEntities.add(BookDBEntity.builder().id(5).authorName("Frederick P. Brooks Jr").title("Mythical Man-Month").build());
    }

    public List<BookDBEntity> getMockBookDBEntity() {
        return this.mockEntities;
    }

    public void addMockDBEntity(BookDBEntity bookDBEntity) {
        this.mockEntities.add(bookDBEntity);
    }
}
