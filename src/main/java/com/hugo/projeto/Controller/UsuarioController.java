package com.hugo.projeto.Controller;

import com.hugo.projeto.DTO.Mapper.UsuarioMapper;
import com.hugo.projeto.DTO.UsuarioDTO;
import com.hugo.projeto.DTO.UsuarioDTOFull;
import com.hugo.projeto.Service.UsuarioService;
import com.hugo.projeto.entity.UsuarioEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/usuarios")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<UsuarioEntity>criar(@RequestBody UsuarioEntity usuario){
        UsuarioEntity user = usuarioService.salvar(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

    @DeleteMapping("/deletar-{id}")
    public ResponseEntity<String>deletar(@PathVariable Long id){
        usuarioService.deletarUsuario(id);
        return ResponseEntity.ok(String.format("ID %s Deletado", id));
    }

    @GetMapping("/pegar-id-usuario")
    public UsuarioDTO PegarPorId(@RequestParam Long id){
        UsuarioEntity oi = usuarioService.buscarPorId(id);
        return UsuarioMapper.toDTO(oi);

    }

    @PutMapping("atualizar-usuario/{id}")
    public ResponseEntity<UsuarioDTOFull> atualizar(@PathVariable Long id,
                                    @RequestBody UsuarioDTO usuarioDTO){
    UsuarioEntity usuario = usuarioService.update(id, UsuarioMapper.toEntity(usuarioDTO));
    return ResponseEntity.ok(UsuarioMapper.toDTOFull(usuario));
    }
//oi
}
