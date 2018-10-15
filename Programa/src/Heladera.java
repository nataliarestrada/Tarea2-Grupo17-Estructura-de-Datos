import java.util.Random;



public class Heladera extends Electrodomesticos {
	private Tipos tiporefr;
	private int caprefr;
		
	public Heladera()
	{
		tiporefr = Tipos.Congelador;
		caprefr = 40;
	}
	
    public Tipos getTiporefr() {
		return tiporefr;
	}

	public void setTiporefr(Tipos tiporefr) {
		this.tiporefr = tiporefr;
	}

	public int getCaprefr() {
		return caprefr;
	}

	public void setCaprefr(int caprefr) {
		this.caprefr = caprefr;
	}
	
	


	public enum Tipos{Congelador,Frigorífico}
	
	public Tipos RandTipo(){
		Random rnd = new Random();
		
		Tipos tipo=Tipos.Congelador;
		int valor = (rnd.nextInt(2) + 1);
		switch (valor)
		{
			case 1: 
				tipo=Tipos.Congelador;
				break;
			case 2: 
				tipo=Tipos.Frigorífico;
		}
		return tipo;
	}	
	
	public void AtribBase()
    {
		Random rnd = new Random();	
		super.AtribBase();
		tiporefr = RandTipo();
		caprefr = (rnd.nextInt(400) + 1);
    }
	
	
	public  double PrecioFinal(){
		
           double preciofinal = super.PrecioFinal();
			
			if (caprefr > 50)
			{
				if (tiporefr == Tipos.Congelador)
				{
					preciofinal += 100;
				}
				if (tiporefr == Tipos.Frigorífico)
				{
					preciofinal += 60;
				}
			}
			
			return preciofinal;
	}
	
	public void Mostrar(){
        System.out.println("Heladera");
        super.Mostrar();
        System.out.print("/ Tipo de Refrigerador: " + tiporefr);
        System.out.println("/ Capacidad del Refrigerador: " + caprefr + " litros ");
        System.out.println("Precio Final: $" + String.format("%.2f", PrecioFinal()));
        System.out.println(" ");
	}
	
}
