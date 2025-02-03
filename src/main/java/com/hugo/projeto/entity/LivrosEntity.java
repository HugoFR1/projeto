package com.hugo.projeto.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

@NoArgsConstructor @Getter @Setter
@Entity
@Table(name = "livros")
public class LivrosEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "genero")
    private String genero;

    @Column(name = "nome_autor")
    private String nomeAutor;

    @Column(name = "data_lancamento")
    private Date dataLancamento;



    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LivrosEntity that = (LivrosEntity) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "LivrosEntity{" +
                "id=" + id +
                '}';
    }

}
