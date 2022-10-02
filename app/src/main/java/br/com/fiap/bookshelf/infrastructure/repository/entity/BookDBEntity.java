package br.com.fiap.bookshelf.infrastructure.repository.entity;

import lombok.*;

@Builder
@Getter
@Setter
public class BookDBEntity {

    private Integer id;
    private String title;
    private String authorName;

}
