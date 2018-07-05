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
@RequestMapping("/api/operadora")
public class OperadoraController {


	@Autowired
	private OperadoraRepository operadoraDAO;
	
	
	@PostMapping("/save")
	public ResponseEntity<Response<Operadora>> save(@RequestBody Operadora operadora) {
		Response<Operadora> response = new Response<Operadora>();
		operadora = operadoraDAO.save(operadora);
		response.setData(operadora);
		return ResponseEntity.ok(response);
	}
	
	@PostMapping("/atived")
	public ResponseEntity<Response<Operadora>> atived(@RequestBody Operadora operadora) {
		Response<Operadora> response = new Response<Operadora>();
		operadora = operadoraDAO.save(operadora);
		response.setData(operadora);
		return ResponseEntity.ok(response);
	}
}
