package com.teste.entity;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MedicamentoTest {

	private Medicamento medicamento;
	@BeforeEach
	void setUp() {
		medicamento = new Medicamento(1l,"Durateston","Aplique na bunda","27/07/2077");
	}
	@Test
	@DisplayName("testando o getter e setter do campo ID")
	void testId() {
		//Act
		medicamento.setId(2l);
		
		assertEquals(2l,medicamento.getId());
	}
	
	@Test
	@DisplayName("testando o getter e setter do campo nome")
	void testNome() {
		//Act
		medicamento.setNome("Deca");
		
		assertEquals("Deca",medicamento.getNome());
	}
	
	@Test
	@DisplayName("testando o getter e setter do campo bula")
	void testBula() {
		//Act
		medicamento.setBula("Mantenha em ambiente frio");
		
		assertEquals("Mantenha em ambiente frio",medicamento.getBula());
	}
	
	@Test
	@DisplayName("testando o getter e setter do campo data de validade")
	void testDataValidade() {
		//Act
		medicamento.setDataValidade("13/06/2026");
		
		assertEquals("13/06/2026",medicamento.getDataValidade());
	}
	
	@Test
	@DisplayName("testando o construtor com todos os argumentos")
	void testConstructorAll() {
		
		//Act
		Medicamento  novoMedicamento = new Medicamento(3l,"Rivotril","Ingerir águA ANTES","10/07/2024");
		//Assertion
		assertAll("novoHospede",
				()-> assertEquals(3l, novoMedicamento.getId()),
				()-> assertEquals("Rivotril", novoMedicamento.getNome()),
				()-> assertEquals("Ingerir águA ANTES", novoMedicamento.getBula()),
				()-> assertEquals("10/07/2024", novoMedicamento.getDataValidade())
				);
	}
	
	
}
