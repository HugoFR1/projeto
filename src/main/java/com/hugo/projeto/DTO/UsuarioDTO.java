package com.hugo.projeto.DTO;

import com.hugo.projeto.entity.UsuarioEntity;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UsuarioDTO {

    private String username;

    private String password;


}
