package br.com.fiap.bookshop.infrastructure.repository;

import br.com.fiap.bookshop.infrastructure.repository.entity.BookDBEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookRepository {

    public List<BookDBEntity> findAll() {
        return new ArrayList<>();
    }

    public Optional<BookDBEntity> findById(Integer id) {
        return Optional.of(BookDBEntity.builder()
                .id(1)
                .authorName("teste")
                .title("")
                .build());
    }



}
