package com.qsm.api.contollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qsm.api.entities.Observacao;
import com.qsm.api.entities.Usuario;
import com.qsm.api.repositories.ObservacaoRepository;
import com.qsm.api.repositories.UsuarioRepository;
import com.qsm.api.responses.Response;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioRepository usuarioDAO;
	
	@Autowired
	private ObservacaoRepository observacaoDAO;
	
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
		usuario = usuarioDAO.save(usuario);
		response.setData(usuario);
		return ResponseEntity.ok(response);
	}
	
	@GetMapping("/listar")
	public ResponseEntity<List<Usuario>> listar() {
		List<Usuario> usuarios = usuarioDAO.findAll();
		return ResponseEntity.ok(usuarios);
	}
	
//	@PostMapping("/inserirObservacao")
//	public ResponseEntity<Response<Observacao>> inserirObservacao(@RequestBody Observacao observacao) {
//		Response<Observacao> response = new Response<Observacao>();
//		observacao = observacaoDAO.save(observacao);
//		response.setData(observacao);
//		return ResponseEntity.ok(response);
//	}
}
