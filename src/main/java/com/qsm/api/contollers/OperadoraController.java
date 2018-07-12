package com.qsm.api.contollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qsm.api.entities.Operadora;
import com.qsm.api.repositories.OperadoraRepository;
import com.qsm.api.responses.Response;

@RestController
@CrossOrigin 
@RequestMapping("/api/operadora")
public class OperadoraController {


	@Autowired
	private OperadoraRepository operadoraDAO;
	
	
	@PostMapping("/salvar")
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
	
	@GetMapping(value="")
	public ResponseEntity<List<Operadora>> listar() {
		List<Operadora> operadoras =  operadoraDAO.findAll();
		return ResponseEntity.ok(operadoras);
	}
}
