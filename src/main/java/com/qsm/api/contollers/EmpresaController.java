package com.qsm.api.contollers;

import org.assertj.core.presentation.Representation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qsm.api.dtos.EmpresaDto;
import com.qsm.api.responses.Response;
//
//@RestController
//@RequestMapping("/api/empresa")
public class EmpresaController {

	@GetMapping(value="/{nome}")
	public String empresa(@PathVariable("nome") String nome) {
		return "Ola "+ nome;
	}
	
	@PostMapping
	public ResponseEntity<Response<EmpresaDto>> cadastrar(@RequestBody EmpresaDto empresaDto) {
		Response<EmpresaDto> response = new Response<EmpresaDto>();
		empresaDto.setId(1L);
		response.setData(empresaDto);
		
		return ResponseEntity.ok(response);
	}
}
