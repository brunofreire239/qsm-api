package com.qsm.api.contollers;

import java.util.ArrayList;

import org.assertj.core.presentation.Representation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qsm.api.dtos.EmpresaDto;
import com.qsm.api.dtos.UsuarioDTO;
import com.qsm.api.entities.Operadora;
import com.qsm.api.entities.Usuario;
import com.qsm.api.repositories.OperadoraRepository;
import com.qsm.api.repositories.UsuarioRepository;
import com.qsm.api.responses.Response;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioRepository usuarioDAO;
	
	@PostMapping("/save")
	public ResponseEntity<Response<Usuario>> save(@RequestBody Usuario usuario) {
		Response<Usuario> response = new Response<Usuario>();
		usuario = usuarioDAO.save(usuario);
		response.setData(usuario);
		return ResponseEntity.ok(response);
	}
	
	@PostMapping("/atived")
	public ResponseEntity<Response<Usuario>> atived(@RequestBody Usuario usuario) {
		Response<Usuario> response = new Response<Usuario>();
		usuario.isEnabled(!usuario.getEnabled());
		usuario = usuarioDAO.save(usuario);
		response.setData(usuario);
		return ResponseEntity.ok(response);
	}
}
