package PaqueteRC;

import static org.junit.Assert.assertEquals;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)
	{
		Conjunto x = new Conjunto(5);  Conjunto y= new Conjunto(5);
		x.arr[0]="1";x.arr[1]="2";x.arr[2]="3";x.arr[3]="4";x.arr[4]="5";
		y.arr[0]="1";y.arr[1]="2";y.arr[2]="3";y.arr[3]="5";y.arr[4]="6";
  		Conjunto esperado = x.diferencia(y);
        
  		System.out.print(esperado.arr[0]);
		
	}
}
