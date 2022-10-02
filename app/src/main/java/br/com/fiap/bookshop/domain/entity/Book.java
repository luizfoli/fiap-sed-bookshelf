package br.com.fiap.bookshop.domain.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Book {

    private Integer id;
    private String title;
    private String authorName;

}
