package com.qsm.api.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.qsm.api.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	
}
