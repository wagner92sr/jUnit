package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import Calculadora.Calculadora;

public class CalculadoraTest {
	
	private Calculadora c; 
	
	@Before
	public void inicializa(){
		 c = new Calculadora();
	}

	@Test
	public void somaDoisNumeros() {
		assertEquals(4, c.soma(2, 2) );
	}
	
	@Test
	public void subtraiDoisNumeros() {
		assertEquals(4, c.subtrai(6,2));
	}
	
	@Test
	public void divideDoisNumeros() {
		assertEquals(4, c.divide(8,2));
	}
	
	@Test
	public void multiplicaDoisNumeros() {
		assertEquals(4, c.multiplica(2,2));
	}


}
