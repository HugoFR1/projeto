package com.hugo.projeto.DTO.Mapper;

import com.hugo.projeto.DTO.UsuarioDTO;
import com.hugo.projeto.DTO.UsuarioDTOFull;
import com.hugo.projeto.entity.UsuarioEntity;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

public class UsuarioMapper {

    public static UsuarioDTO toDTO(UsuarioEntity usuarioEntity){
        return new ModelMapper().map(usuarioEntity, UsuarioDTO.class);
    }

    public static UsuarioEntity toEntity(UsuarioDTO usuarioDTO){
        return new ModelMapper().map(usuarioDTO, UsuarioEntity.class);
    }

    public static UsuarioDTOFull toDTOFull(UsuarioEntity usuario){
        return new ModelMapper().map(usuario, UsuarioDTOFull.class);
    }

    public static List<UsuarioDTOFull> toDTOFullList(List<UsuarioEntity>usuarios){
        return usuarios.stream().map(UsuarioMapper::toDTOFull).collect(Collectors.toList());
    }
}
