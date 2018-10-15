import java.util.Random;

public class Lavarropa extends Electrodomesticos {
	private int carga;
	
	public Lavarropa()
	{
		carga = 10;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		if (carga>0) {
			this.carga = carga;
		}
	}
	
	public void AtribBase() 
	{			
		Random rnd = new Random();
        super.AtribBase();		
		carga =(rnd.nextInt(15) + 1);
	}
	
	public  double PrecioFinal(){
		
           double preciofinal = super.PrecioFinal();
			
			if (carga > 10)
			{
				preciofinal += (carga*(0.33));
			}
			
			return preciofinal;
		
	}
	
	
	
	public  void Mostrar()
	{
        System.out.println("Lavarropas");
        super.Mostrar();
        System.out.println("/Carga del Lavarropas: " + carga + "kg ");
        System.out.println("Precio Final: $" +String.format("%.2f", PrecioFinal()));
        System.out.println(" ");
	}
}


