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

import com.qsm.api.entities.Motoqueiro;
import com.qsm.api.repositories.MotoqueiroRepository;
import com.qsm.api.responses.Response;

@RestController
@CrossOrigin 
@RequestMapping("/api/motoqueiro")
public class MotoqueiroController {

	
	@Autowired
	private MotoqueiroRepository motoqueiroDAO;
	
	@GetMapping(value="")
	public ResponseEntity<List<Motoqueiro>> listar() {
		List<Motoqueiro> motoqueiros =  motoqueiroDAO.findAll();
		return ResponseEntity.ok(motoqueiros);
	}
	
	@PostMapping(value="salvar")
	public ResponseEntity<Response<Motoqueiro>> cadastrar(@RequestBody Motoqueiro motoqueiro) {
		Response<Motoqueiro> response = new Response<Motoqueiro>();
		motoqueiro = motoqueiroDAO.save(motoqueiro);
		response.setData(motoqueiro);
		
		return ResponseEntity.ok(response);
	}
	
	
	
}
