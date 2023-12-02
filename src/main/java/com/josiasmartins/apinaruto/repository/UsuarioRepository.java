package com.josiasmartins.apinaruto.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.josiasmartins.apinaruto.domain.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Optional<Usuario> findByLogin(String login);

}
