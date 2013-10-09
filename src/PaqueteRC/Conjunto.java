package PaqueteRC;

public class Conjunto {

	
	public String [] arr ;
	public Conjunto VACIO;
	
	public Conjunto(int op) 
	{
		arr = new String[op];
	}
	
	public int Dimension()
	{
		
		return arr.length;
	}
	
	public Conjunto Union(Conjunto x)
	{
		
		Conjunto nuevo = new Conjunto(this.Dimension() + x.Dimension());
		int cont = 0;
		for (int i = 0; i < this.arr.length; i++) 
		{
			nuevo.arr[cont++]=arr[i];
		}	
		
		for (int i = 0; i < x.arr.length; i++) 
		{
			nuevo.arr[cont++]=x.arr[i];
		}
		return nuevo;
	}
	
	public int Cardinal()
	{
		int cont =0;
		for (String item : arr) 
		{
			
			if(item != null)
			{
				
				cont++;
			}
		}
		return cont;
	}
	
	public Conjunto interseccion(Conjunto x)
	{

		Conjunto nuevo = new Conjunto(arr.length);
		int cont =0;
		
		for(int i =0; i<arr.length; i++)
		{
			for(int j =0; j <arr.length; j++)
			{
				
				if(arr[i].equals(x.arr[j]))
				{
					nuevo.arr[cont++]=arr[i];
					break;
				}
			}
		}
		
		return nuevo;
	}
	
	public Conjunto diferencia(Conjunto x)
	{
		Conjunto nuevo = new Conjunto(arr.length);
		int cont=0;
		int index =0;
		
		for(int i =0; i<arr.length; i++)
		{
			for(int j =0; j <x.arr.length; j++)
			{
				
				if(arr[i]!=x.arr[j])
				{
					cont++;
				}
			}
			
			if(cont ==x.arr.length )
			{
				
				nuevo.arr[index++]=arr[i];
			}
			cont=0;
			
		}
		
		return nuevo;
	}
	
	public void Desplegar()
	{
		for (String item : arr) 
		{
			
			if(item != null)
			{
				
				System.out.println(item);
			}
		}
		
	}
	
	
	
	
	
	
	

}
