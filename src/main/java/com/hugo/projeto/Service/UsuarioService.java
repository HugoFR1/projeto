package com.hugo.projeto.Service;

import com.hugo.projeto.Repository.UsuarioRepository;
import com.hugo.projeto.entity.UsuarioEntity;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Transactional
    public UsuarioEntity salvar(UsuarioEntity usuarioEntity) {
        return usuarioRepository.save(usuarioEntity);
    }

    @Transactional
    public UsuarioEntity buscarPorId(Long id){
        return usuarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("ID NÃO ENCONTRADO"));
    }

    @Transactional
    public List<UsuarioEntity> BuscaTudo() {
        return usuarioRepository.findAll();
    }

    @Transactional
    public void deletarUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }

    @Transactional
    public UsuarioEntity update(Long id, UsuarioEntity usuarioEntity){
        UsuarioEntity usu = this.buscarPorId(id);
        ModelMapper moreuMeper = new ModelMapper();
        moreuMeper.getConfiguration().setSkipNullEnabled(true);
        moreuMeper.map(usuarioEntity, usu);

        return usuarioRepository.save(usuarioEntity);
    }
}
