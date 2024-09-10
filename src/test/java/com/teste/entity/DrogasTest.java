package com.teste.entity;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DrogasTest {

    private Drogas drogas;

    @BeforeEach
    void setUp() {
        drogas = new Drogas(1L, "Ibuprofeno", "6847475887");
    }

    @Test
    @DisplayName("testando o getter e setter do campo ID")
    void testId() {
        // Act
        drogas.setId(2L);

        // Assertion
        assertEquals(2L, drogas.getId());
    }

    @Test
    @DisplayName("testando o getter e setter do campo nome")
    void testNome() {
        // Act
        drogas.setNome("Paracetamol");

        // Assertion
        assertEquals("Paracetamol", drogas.getNome());
    }

    @Test
    @DisplayName("testando o getter e setter do campo CNPJ")
    void testCnpj() {
        // Act
        drogas.setCnpj("7888778877");

        // Assertion
        assertEquals("7888778877", drogas.getCnpj());
    }

    @Test
    @DisplayName("testando o construtor com todos os argumentos")
    void testConstructorAll() {
        // Act
        Drogas novaDroga = new Drogas(3L, "Dipirona", "15975348000147");

        // Assertion
        assertAll("novaDroga",
                () -> assertEquals(3L, novaDroga.getId()),
                () -> assertEquals("Dipirona", novaDroga.getNome()),
                () -> assertEquals("15975348000147", novaDroga.getCnpj())
        );
    }
}
