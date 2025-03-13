package com.miempresa.entidad;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TiendaTest {
	Producto p;
	Producto p2;
	Producto p3;
	Tienda t;
	
	@BeforeEach
	void setUp() throws Exception {
		p = new Producto("Ratón", 10);
		p2 = new Producto("Teclado", 20);
		p3 = new Producto("Monitor", 30);
		t = new Tienda();
	}

	@Test
	@DisplayName("Prueba del método agregarProducto")
	void testAgregarProducto() {
		t.agregarProducto(p);
		t.agregarProducto(p2);
		t.agregarProducto(p3);
		int resultadoEsperado = 3;
		assertEquals(resultadoEsperado, t.obtenerProductos().size(), "El tamaño no coincide");
	}
	
	@Test
	@DisplayName("Prueba del método obtenerProductos")
	void testObtenerProductos() {
		t.agregarProducto(p);
		t.agregarProducto(p2);
		t.agregarProducto(p3);
		ArrayList<Producto> lista = (ArrayList<Producto>) t.obtenerProductos();
		String nombreEsperado1 = "Ratón";
		double precioEsperado1 = 30;
		assertEquals(nombreEsperado1, lista.get(0).getNombre(), "Los nombres no coinciden");
		assertEquals(precioEsperado1, lista.get(2).getPrecio(), "Los precios no coinciden");
	}
	
	@Test
	@DisplayName("Prueba del método calcularPrecioTotal")
	void testCalcularPrecioTotal() {
		t.agregarProducto(p);
		t.agregarProducto(p2);
		t.agregarProducto(p3);
		ArrayList<Producto> lista = (ArrayList<Producto>) t.obtenerProductos();
		double resultadoEsperado = 60;
		assertEquals(resultadoEsperado, t.calcularPrecioTotal(), "Las cantidades no coinciden");
	}

}
