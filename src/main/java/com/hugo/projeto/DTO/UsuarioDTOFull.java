package com.hugo.projeto.DTO;

import com.hugo.projeto.entity.UsuarioEntity;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UsuarioDTOFull {

    private Long id;

    private String username;

    private String password;

    private LocalDateTime datacriacao;

    private LocalDateTime datamodificacao;

    private String criadoPor;

    private String modificadoPor;

    private UsuarioEntity.Role role;
}
