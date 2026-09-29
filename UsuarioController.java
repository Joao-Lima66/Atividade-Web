package com.uniceplac.ecommerce.controller;

import com.uniceplac.ecommerce.dto.UsuarioCadastroDTO;
import com.uniceplac.ecommerce.model.Usuario;
import com.uniceplac.ecommerce.repository.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @PostMapping
    public ResponseEntity<Usuario> criarUsuario(@Valid @RequestBody UsuarioCadastroDTO dto) {
        // 1. Instanciação da entidade Usuario
        Usuario usuario = new Usuario();

        // 2. Mapeamento dos dados do DTO para a Entidade
        usuario.setNome(dto.getNome());
        usuario.setEmail(dto.getEmail());
        usuario.setSenha(dto.getSenha());

        // 3. Persistência no Banco de Dados
        Usuario usuarioSalvo = repository.save(usuario);

        // Retorna HTTP 201 Created com a entidade salva
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioSalvo);
    }
}
