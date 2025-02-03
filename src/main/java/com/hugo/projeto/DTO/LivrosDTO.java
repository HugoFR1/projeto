package com.hugo.projeto.DTO;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LivrosDTO {

    private Long id;

    private String genero;

    private String nomeAutor;

    private Date dataLancamento;

}
