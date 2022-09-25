package com.pi3.nr13.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pi3.nr13.model.Usuario;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
