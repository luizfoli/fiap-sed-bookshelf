package br.com.fiap.bookshop.domain.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Author {

    private String id;
    private String name;

}
