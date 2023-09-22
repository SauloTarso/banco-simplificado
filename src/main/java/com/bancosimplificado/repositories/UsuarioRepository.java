package com.bancosimplificado.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bancosimplificado.domain.usuario.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	Optional<Usuario> findUsuarioByDocumento(String documento);

	Optional<Usuario> findUsuarioById(Long id);

}
