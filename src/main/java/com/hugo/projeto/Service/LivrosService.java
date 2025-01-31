package com.hugo.projeto.Service;

import com.hugo.projeto.Repository.LivrosRepository;
import com.hugo.projeto.entity.LivrosEntity;
import com.hugo.projeto.entity.UsuarioEntity;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class LivrosService {

    LivrosRepository livrosRepository;

    @Transactional
    public LivrosEntity salvar(LivrosEntity livros) {
        return livrosRepository.save(livros);
    }

    @Transactional
    public void deletarlivro(Long id) {
        livrosRepository.deleteById(id);
    }

    @Transactional
    public List<LivrosEntity>BuscarTodoslivros(){
        return livrosRepository.findAll();
    }

    @Transactional
    public LivrosEntity buscarporId(Long id){
        return livrosRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("ID NÃO ENCONTRADO"));
    }

//    @Transactional
//    public LivrosEntity atualizar(){
//
//    }
}
