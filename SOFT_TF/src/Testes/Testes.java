package Testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Beans.*;
import controllers.BarcoContr;

class Testes {
	private Funcionario func = new Funcionario(1, "Jorge", "Nenhum", "Nenhum", "Nenhum", "Nenhum");
	private Local local = new Local(1, "Nenhum", "0", "Nenhum");
	private Companhia comp = new Companhia(1, "Nenhuma", "Nenhum", "Nenhum", "Nenhum", func);
	private Barco barco = new Barco(1, "Nenhum", "Nenhum", func, comp, local);
	
	@Test 
	void test_is_capitao_barco(){
		assertTrue(barco.isCapitao(this.func));
	}
	
	
	@Test 
	void test_is_not_capitao_barco(){
		Barco bt = new Barco(1, "Nenhum", "Nenhum", null, null, null);
		assertFalse(bt.isCapitao(this.func));
	}
	
	@Test
	void test_add_capitao_to_barco() {
		Barco bt = new Barco(1, "Nenhum", "Nenhum", null, null, null);
		bt.addCapitao(this.func);
		assertEquals(bt.getFunc(), this.func);
	}
	
	@Test
	void test_add_capitao_to_barco2() {
		Barco bt = new Barco(1, "Nenhum", "Nenhum", null, null, null);
		bt.addCapitao(this.func);
		assertTrue(bt.hasCapitao());
	}
	
	@Test
	void test_add_capitao_to_barco_ja_capitao() {
		Barco bt = new Barco(1, "Nenhum", "Nenhum", null, null, null);
		assertTrue(bt.addCapitao(this.func));
	}
	
	@Test
	void test_add_capitao_to_barco_nja_capitao() {
		Barco bt = new Barco(1, "Nenhum", "Nenhum", null, null, null);
		bt.addCapitao(this.func);
		assertFalse(bt.addCapitao(this.func));
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
		assertTrue(this.barco.hasCapitao());
	}
	
	@Test
	void test_local_dentro_de_barco() {
		assertTrue(this.barco.hasLocal());
	}
	
	@Test
	void test_getBarcos_vazio() {
		BarcoContr barC = new BarcoContr();
		assertEquals(barC.getBarcos().size(), 0);
	}
	
	@Test
	void test_add_barco1() {
		BarcoContr barC = new BarcoContr();
		barC.add(this.barco);
		assertTrue(barC.get(0).equals(barco));
	}
	
	@Test
	void test_add_barco2() {
		BarcoContr barC = new BarcoContr();
		barC.add(this.barco);
		assertEquals(barC.getBarcos().size(), 1);
	}
	
	@Test
	void test_add_barco3() {
		BarcoContr barC = new BarcoContr();
		barC.add(this.barco);
		barC.add(this.barco);
		barC.add(this.barco);
		assertEquals(barC.getBarcos().size(), 3);
	}
	
	@Test
	void test_add_barco4() {
		BarcoContr barC = new BarcoContr();
		barC.add(this.barco);
		barC.add(new Barco(1, "Nenhum", "Nenhum", null, null, null));
		assertEquals(barC.getBarcos().size(), 2);
	}
	
	@Test
	void test_remove_barco() {
		BarcoContr barC = new BarcoContr();
		barC.add(this.barco);
		barC.remove(this.barco);
		test_getBarcos_vazio();
	}
	
	@Test
	void test_barcos_atracados1() {
		BarcoContr barC = new BarcoContr();
		barC.add(this.barco);
		assertEquals(barC.getBarcosAtracados().size(), 1);
	}
	
	@Test
	void test_barcos_atracados2() {
		BarcoContr barC = new BarcoContr();
		barC.add(this.barco);
		barC.add(this.barco);
		assertEquals(barC.getBarcosAtracados().size(), 2);
	}
	
	@Test
	void test_barcos_natracados() {
		BarcoContr barC = new BarcoContr();
		Barco barco = new Barco(1, "Nenhum", "Nenhum", null, null, null);
		barC.add(barco);
		assertEquals(barC.getBarcosAtracados().size(), 0);
	}
	
	@Test 
	void test_barcos_c_capitao() {
		BarcoContr barC = new BarcoContr();
		barC.add(this.barco);
		assertEquals(barC.getBarcosCCapitaes().size(), 1);
	}
	
	@Test 
	void test_barcos_c_capitao2() {
		BarcoContr barC = new BarcoContr();
		barC.add(this.barco);
		barC.add(this.barco);
		assertEquals(barC.getBarcosCCapitaes().size(), 2);
	}
	
	@Test 
	void test_barcos_nc_capitao() {
		BarcoContr barC = new BarcoContr();
		assertEquals(barC.getBarcosCCapitaes().size(), 0);
	}
	
	@Test 
	void test_get_barcos_local1() {
		BarcoContr barC = new BarcoContr();
		barC.add(this.barco);
		assertEquals(barC.getBarcosNoLocal(local).size(), 1);
	}
	
	@Test 
	void test_get_barcos_local2() {
		BarcoContr barC = new BarcoContr();
		barC.add(this.barco);
		barC.add(this.barco);
		assertEquals(barC.getBarcosNoLocal(local).size(), 2);
	}
	
	@Test 
	void test_get_nbarcos_local() {
		BarcoContr barC = new BarcoContr();
		assertEquals(barC.getBarcosNoLocal(local).size(), 0);
	}
}
