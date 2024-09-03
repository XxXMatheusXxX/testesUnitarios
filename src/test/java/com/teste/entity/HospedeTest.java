package com.teste.entity;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HospedeTest {

	private Hospede hospede;
	@BeforeEach
	void setUp() {
		hospede = new Hospede(1l,"Miguel Aparecido da Costa Silva","miguelito@gmail.com","(11)4002-8922");
	}
	@Test
	@DisplayName("testando o getter e setter do campo ID")
	void testId() {
		//Act
		hospede.setId(2l);
		
		assertEquals(2l,hospede.getId());
	}
	
	@Test
	@DisplayName("testando o getter e setter do campo nome")
	void testNome() {
		//Act
		hospede.setNome("Juscelino");
		
		assertEquals("Juscelino",hospede.getNome());
	}
	
	@Test
	@DisplayName("testando o getter e setter do campo email")
	void testEmail() {
		//Act
		hospede.setEmail("jk1227@gmail.com");
		
		assertEquals("jk1227@gmail.com",hospede.getEmail());
	}
	
	@Test
	@DisplayName("testando o getter e setter do campo telefone")
	void testTelefone() {
		//Act
		hospede.setTelefone("159999919");
		
		assertEquals("159999919",hospede.getTelefone());
	}
	
	@Test
	@DisplayName("testando o construtor com todos os argumentos")
	void testConstructorAll() {
		
		//Act
		Hospede  novoHospede = new Hospede(3l,"Matheus","matheus@gmail.com","15-991376599");
		//Assertion
		assertAll("novoHospede",
				()-> assertEquals(3l, novoHospede.getId()),
				()-> assertEquals("Matheus", novoHospede.getNome()),
				()-> assertEquals("matheus@gmail.com", novoHospede.getEmail()),
				()-> assertEquals("15-991376599", novoHospede.getTelefone())
				);
	}
	
	
}
