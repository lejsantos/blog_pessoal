package com.generation.blogpessoal.repository;


import com.generation.blogpessoal.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository {
    public Optional<Usuario> findByUsuario(String usuario);

    Optional<Usuario> findById(Long id);

    Usuario save(Usuario usuario);
}
