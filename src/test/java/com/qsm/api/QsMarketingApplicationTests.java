package com.qsm.api;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class QsMarketingApplicationTests {

	@Value("${paginacao.qtd_por_pagina}")
	private int qtd;
	
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testCarregarContext() {
		//assertEquals(100, qtd);
	}

}
