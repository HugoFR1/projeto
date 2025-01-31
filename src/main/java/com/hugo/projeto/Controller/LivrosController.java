package com.hugo.projeto.Controller;

import com.hugo.projeto.Service.LivrosService;
import com.hugo.projeto.entity.LivrosEntity;
import com.hugo.projeto.entity.UsuarioEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/livros")
public class LivrosController {

    @Autowired
    LivrosService livrosService;

    @PostMapping
    public ResponseEntity<LivrosEntity>criar(@RequestBody LivrosEntity livrosEntity){
        LivrosEntity book = livrosService.salvar(livrosEntity);
        return ResponseEntity.status(HttpStatus.CREATED).body(book);
    }

    @DeleteMapping
    public ResponseEntity<String>deletar(@PathVariable Long id){
        livrosService.deletarlivro(id);
        return ResponseEntity.ok(String.format("ID %s Deletado", id));
    }

}
