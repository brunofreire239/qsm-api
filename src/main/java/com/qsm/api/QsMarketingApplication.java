package com.qsm.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.qsm.api.entities.Observacao;
import com.qsm.api.repositories.ObservacaoRepository;
import com.qsm.api.services.EmpresaService;

@SpringBootApplication
public class QsMarketingApplication {

	@Autowired
	private ObservacaoRepository empresaRepository;
	
	@Autowired
	private EmpresaService empresaService;
	

	public static void main(String[] args) {
		SpringApplication.run(QsMarketingApplication.class, args);
		
	}
	
	@Bean
	public CommandLineRunner commandLineRunner() {
		return args ->{
		
			
		};
	}
}
