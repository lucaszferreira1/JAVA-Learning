package Testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Beans.*;

class Testes {

	private Funcionario func = new Funcionario(1, "Nenhum", "Nenhum", "Nenhum", "Nenhum", "Nenhum");
	private Local local = new Local(1, "Nenhum", "0", "Nenhum");
	private Companhia comp = new Companhia(1, "Nenhuma", "Nenhum", "Nenhum", "Nenhum", func);
	private Barco barco = new Barco(1, "Nenhum", "Nenhum", func, comp, local);
	
	@Test 
	void test_is_capitao_barco(){
		assertTrue(barco.isCapitao(func));
	}
	
	@Test 
	void test_is_not_capitao_barco(){
		Barco bt = new Barco(1, "Nenhum", "Nenhum", null, null, null);
		assertFalse(bt.isCapitao(func));
	}
	
	@Test
	void test_add_capitao_to_barco() {
		Barco bt = new Barco(1, "Nenhum", "Nenhum", null, null, null);
		bt.addCapitao(func);
		assertEquals(bt.getFunc(), func);
	}
	
	@Test
	void test_add_capitao_to_2barco() {
		Barco bt = new Barco(1, "Nenhum", "Nenhum", null, null, null);
		bt.addCapitao(func);
		assertTrue(bt.hasCapitao());
	}
	
	@Test
	void test_barco_nao_tem_capitao_barco() {
		Barco bt = new Barco(1, "Nenhum", "Nenhum", null, null, null);
		assertFalse(bt.hasCapitao());
	}
	
	@Test
	void test_local_nao_dentro_barco() {
		Barco bt = new Barco(1, "Nenhum", "Nenhum", null, null, null);
		assertFalse(bt.hasLocal());
	}
	
	@Test
	void test_barco_tem_capitao_barco() {
		assertTrue(barco.hasCapitao());
	}
	
	@Test
	void test_local_dentro_de_barco() {
		assertTrue(barco.hasLocal());
	}
}
