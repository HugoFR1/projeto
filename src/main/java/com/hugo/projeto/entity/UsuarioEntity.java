package com.hugo.projeto.entity;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name = "usuarios")
public class UsuarioEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "username", nullable = false, unique = true, length = 100)
    private String username;

    @Column(name = "password", nullable = false, length = 200)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false, length = 25)
    private Role role;

    @Column(name = "data_criacao")
    private LocalDateTime datacriacao;

    @Column(name = "data_modificacao")
    private LocalDateTime datamodificacao;

    @Column(name = "criado_por")
    private String criadoPor;

    @Column(name = "modificado_por")
    private String modificadoPor;



    public enum Role {
        ROLE_ADMIN, ROLE_CLIENTE
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsuarioEntity that = (UsuarioEntity) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "UsuarioEntity{" +
                "id=" + id +
                '}';
    }
}
