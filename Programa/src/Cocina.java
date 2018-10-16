import java.util.Random;

public class Cocina extends Electrodomesticos{
	private int alto;
	private int ancho;
	private int profundidad;
	private Alimentaciones alimentacion;
	
	public Cocina()
	{
		alto = 85;
		ancho = 65;
		profundidad = 65;
		alimentacion = Alimentaciones.Gas;
	}
	
	

    public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		if (alto>=80 && alto<=95) {
		this.alto = alto;
		}
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		if (ancho>=50 && ancho<=120) {
		this.ancho = ancho;
		}
	}

	public int getProfundidad() {
		return profundidad;
	}

	public void setProfundidad(int profundidad) {
		if (profundidad>=60 && profundidad<=70) {
		this.profundidad = profundidad;
		}
	}

	public Alimentaciones getAlimentacion() {
		return alimentacion;
	}

	public void setAlimentacion(Alimentaciones alimentacion) {
		if (alimentacion==Alimentaciones.Eléctrica||alimentacion==Alimentaciones.Gas) {
		this.alimentacion = alimentacion;
		}
	}

	public enum Alimentaciones{Eléctrica,Gas};
	
	public Alimentaciones RandAlimentacion(){
		Random rnd = new Random();
		
		Alimentaciones alimentacion=Alimentaciones.Gas;
		int valor = (rnd.nextInt(2) + 1);
		switch (valor)
		{
			case 1: 
				alimentacion=Alimentaciones.Gas;
				break;
			case 2: 
				alimentacion=Alimentaciones.Eléctrica;
		}
		return alimentacion;
	}	

	
	
	public  double PrecioFinal(){
		
           double preciofinal = (super.PrecioFinal());
			
			if ((ancho >= 60) && (ancho <= 79))
			{
				preciofinal += preciofinal*0.15;
			}
			else
			{
				if ((ancho >= 80) && (ancho <= 99))
				{
					preciofinal += preciofinal*0.2;
				}
				else
				{
					if (ancho > 100) 
					{
						preciofinal += preciofinal*0.3;
					}
				}
			}
			
			return preciofinal;

	}
	
	public void AtribBase()
	{
		Random rnd = new Random();

        super.AtribBase();	
		alto = (rnd.nextInt(95) + 80);		
		ancho = (rnd.nextInt(120) + 50);		
		profundidad = (rnd.nextInt(70) + 60);		
		alimentacion = RandAlimentacion();
	}
	
	public void Mostrar()
	{
		System.out.println("Cocina");
        super.Mostrar();
        System.out.print("/Alto: " + alto + "cm ");
        System.out.print("/Ancho: " + ancho + "cm ");
        System.out.print("/Profundidad: " + profundidad + "cm ");
        System.out.println("/Alimentacion: " + alimentacion);
        System.out.println("Precio Final: $" + String.format("%.2f", PrecioFinal()));
        System.out.println(" ");
	}
}



