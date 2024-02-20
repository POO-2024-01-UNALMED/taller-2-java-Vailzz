package test;

public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	
	static int cantidadCreados;
	
	int cantidadAsientos() {
		int counter = 0;
		for(int i = 0; i < asientos.length; i++) {
			if(this.asientos[i] != null) {
			
				counter++;
			}
		}
		return counter;
	}
	
	String verificarIntegridad()
	{
		if(this.registro == this.motor.registro)
		{
			for (int i = 0; i < asientos.length; i++)
			{
				if(this.asientos[i] != null)
				{
					if(this.asientos[i].registro == this.registro)
					{
						return "Auto original";
					}
				}else {return "Las piezas no son originales";}

				
			}
		}
		return "Las piezas no son originales";
			 
	}
		
	
}
