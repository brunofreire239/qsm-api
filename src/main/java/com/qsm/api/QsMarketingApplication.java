package com.qsm.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.qsm.api.entities.Empresa;
import com.qsm.api.repositories.EmpresaRepository;

@SpringBootApplication
public class QsMarketingApplication {

	@Autowired
	private EmpresaRepository empresaRepository;
	

	public static void main(String[] args) {
		SpringApplication.run(QsMarketingApplication.class, args);
		
	}
	
	@Bean
	public CommandLineRunner commandLineRunner() {
		return args ->{
			Empresa empresa = new Empresa();
			empresa.setCnpj("123");
			empresa.setRazaoSocial("Bruno Sistemas");
			this.empresaRepository.save(empresa);
			
			List<Empresa> empresas = empresaRepository.findAll();
			empresas.forEach(System.out::println);
			
			Empresa empresaDb = empresaRepository.findById(1);
			System.out.println("Empresa ID: "+ empresaDb);
			
			empresaDb.setRazaoSocial("Mudando Razão SOcial ");
			empresaRepository.save(empresaDb);
			
			Empresa empresaCnpj = empresaRepository.findByCnpj("123");
			System.out.println("Empresa por CNPJ: " + empresaCnpj);
			
			this.empresaRepository.delete(1L);
			
			empresas = empresaDAO.findAll();
			System.out.println("Empresas: " + empresas.size());
			
			
		};
	}
}
