package PaqueteRC;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConjuntoTest {

	
	Conjunto x = new Conjunto(5);
	Conjunto y = new Conjunto(5);
	
	int resultado;
	@Test
	public void testConjunto() 
	{
		
	}

	@Test
	public void testDimension() 
	{
		resultado = x.Dimension(); 
		assertEquals(5, resultado);
	}
	
	@Test
	public void testUnion() 
	{
		x.arr[0]="1";x.arr[1]="2";x.arr[2]="3";x.arr[3]="4";x.arr[4]="5";
		y.arr[0]="1";y.arr[1]="3";y.arr[2]="7";y.arr[3]="9";y.arr[4]="4";
		Conjunto esperado = x.Union(y);
		assertEquals(10, esperado.Dimension());

	}
	
	@Test
	public void testCardinal() {
		resultado = x.Cardinal(); 
		assertEquals(0, resultado);
	}

	@Test
	public void testInterseccion() 
	{
		x.arr[0]="1";x.arr[1]="2";x.arr[2]="3";x.arr[3]="4";x.arr[4]="5";
		y.arr[0]="1";y.arr[1]="8";y.arr[2]="9";y.arr[3]="12";y.arr[4]="6";
		Conjunto esperado = x.interseccion(y);

		assertEquals("1",esperado.arr[0]);
	}

	@Test
	public void testDiferencia() 
	{
		x.arr[0]="1";x.arr[1]="2";x.arr[2]="3";x.arr[3]="4";x.arr[4]="5";
		y.arr[0]="1";y.arr[1]="2";y.arr[2]="3";y.arr[3]="5";y.arr[4]="6";
		Conjunto esperado = x.diferencia(y);
		
		assertEquals("4",esperado.arr[0]);
	}

	@Test
	public void testDesplegar() 
	{
		x.arr[0]="1";x.arr[1]="2";x.arr[2]="3";x.arr[3]="4";x.arr[4]="5";
		x.Desplegar();
	}
	

	

	

}
