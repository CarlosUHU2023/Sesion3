package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;
import pkg.Movimiento;

class CuentaTest {

	static Cuenta aux;
	static Cuenta c12345;
	static Cuenta c67890;
	static Movimiento movimiento;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		aux=new Cuenta("1","Carlos",0); 
		c12345=new Cuenta("12345", "Pepe", 50);
		c67890=new Cuenta("67890", "Juan", 0);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		aux.setSaldo(10);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngresar() {
		aux.ingresar(10);
		assertEquals(20, aux.getSaldo());
	}
	@Test
	void testRetirarNegativo() {
		aux.retirar(520);
		assertEquals(10, aux.getSaldo());
	}
	@Test
	void testRetirar() {
		aux.retirar(5);
		assertEquals(5, aux.getSaldo());
	}
	@Test
	void testMovimiento() {
		aux.retirar(5);
		assertEquals(5, aux.getSaldo());
	}
	@Test
	void test0014() {
		c12345.retirar(200);
		assertEquals(200, c67890.getMovimietno(1));
		c67890.retirar(350);
		c12345.ingresar(100);
		c67890.retirar(200);
		c67890.retirar(150);
		c12345.retirar(200);
		c67890.ingresar(50);
		c67890.retirar(100);
		c12345.mostrarMovimientos();
		c67890.mostrarMovimientos();
		c67890.mostrarMovimientosFallidos;
		assertEquals(-450, c67890.getSaldo());
		assertEquals(-250,c12345.getSaldo());
	}
	
	
}
