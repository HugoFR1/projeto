package com.hugo.projeto.Controller;

import com.hugo.projeto.Service.UsuarioService;
import com.hugo.projeto.entity.UsuarioEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/usuarios")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

//    @PostMapping("/criar-usuario")
//
//    @PutMapping("/criar-usuario")
//
//    @DeleteMapping("/criar-usuario")
//
//    @GetMapping("/criar-usuario")


}
