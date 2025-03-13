package com.miempresa.entidad;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ProductoTest {
	Producto p;

	@BeforeEach
	void setUp() throws Exception {
		p = new Producto("Ratón", 10);
	}

	@Test
	@DisplayName("Prueba del método getNombre")
	void testGetNombre() {
		String resultadoEsperado = "Ratón";
		assertEquals(resultadoEsperado, p.getNombre(), "Los nombres no coinciden");
	}
	
	@Test
	@DisplayName("Prueba del método getPrecio")
	void testGetPrecio() {
		double resultadoEsperado = 10;
		assertEquals(resultadoEsperado, p.getPrecio(), "Los precios no coinciden");
	}
	
	@Test
	@DisplayName("Prueba del método setNombre")
	void testSetNombre() {
		String resultadoEsperado = "Teclado";
		p.setNombre("Teclado");
		assertEquals(resultadoEsperado, p.getNombre(), "Los nombres no coinciden");
	}
	
	@Test
	@DisplayName("Prueba del método setPrecio")
	void testSetPrecio() {
		double resultadoEsperado = 20;
		p.setPrecio(20);
		assertEquals(resultadoEsperado, p.getPrecio(), "Los precios no coinciden");
	}
	
	@Test
	@DisplayName("Prueba del método setPrecio negativo")
	void testSetPrecioNegativo() {
		String resultadoEsperado = "El precio no puede ser negativo: -10.0";
		Exception exception = assertThrows(IllegalArgumentException.class, () -> p.setPrecio(-10));
		assertEquals(resultadoEsperado, exception.getMessage(), "EL método setPrecio permite un precio negativo");
	}

}
