package com.hugo.projeto.DTO.Mapper;

import com.hugo.projeto.DTO.LivrosDTO;
import com.hugo.projeto.entity.LivrosEntity;
import org.modelmapper.ModelMapper;

public class LivroMapper {

    public static LivrosDTO toDTO(LivrosEntity livrosEntity){
        return new ModelMapper().map(livrosEntity, LivrosDTO.class);
    }

    public static LivrosEntity toEntity(LivrosDTO livrosDTO){
        return new ModelMapper().map(livrosDTO, LivrosEntity.class);
    }
}
