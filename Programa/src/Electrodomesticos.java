import java.util.Random;

public class Electrodomesticos {
	private double preciobase;
    private Colores color;
    private Consumos consumo;
	private double peso;
	private double preciofinal;
	
	public Electrodomesticos(){
		preciobase=0;
	    color=Colores.Blanco;
	    consumo=Consumos.F;
	    peso=5;	    
	}
	//set and get de cada atributo
	
	public  double getPreciobase() {
		return preciobase;
	}

	public void setPreciobase(double preciobase) {
		if (preciobase>0){
			this.preciobase = preciobase;
		}
		
	}

	public Colores getColor() {
		return color;
	}

	public void setColor(Colores color) {
		if (color==Colores.Blanco||color==Colores.Negro||color==Colores.Rojo||color==Colores.Azul||color==Colores.Gris){
			this.color = color;
		}	
	}

	public Consumos getConsumo() {
		return consumo;
	}

	public void setConsumo(Consumos consumo) {
		if (consumo==Consumos.A||consumo==Consumos.B||consumo==Consumos.C||consumo==Consumos.D||consumo==Consumos.E||consumo==Consumos.F){
			this.consumo = consumo;
		}		
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso>0) {
			this.peso = peso;
		}	
	}
	
    public double getPreciofinal() {
		return preciofinal;
	}


	public enum Colores{Blanco,Negro,Rojo,Azul,Gris}
	//selecciona aleatoriamente un color
	public Colores RandColor(){
		Random rnd = new Random();
		
		Colores color=Colores.Blanco;
		int valor = (rnd.nextInt(5) + 1);
		switch (valor)
		{
			case 1: 
				color=Colores.Blanco;
				break;
			case 2: 
				color=Colores.Negro;
				break;
			case 3:
				color=Colores.Rojo;
				break;
			case 4:
				color=Colores.Azul;
				break;
            case 5:
            	color=Colores.Gris;
				
		}
		return color;
	}	
	

    public enum Consumos{A,B,C,D,E,F;}

	//seleciona aleatoriamente un consumo
    public Consumos RandConsumo(){
    	Random rnd = new Random();

    	Consumos consumio=Consumos.F;
    	int valor = (rnd.nextInt(6) + 1);
    	switch (valor)
    	{
    	case 1: 
    		consumio=Consumos.A;
    		break;
    	case 2: 
    		consumio=Consumos.B;
    		break;
    	case 3:
    		consumio=Consumos.C;
    		break;
    	case 4:
    		consumio=Consumos.D;
    		break;
    	case 5:
    		consumio=Consumos.E;
    		break;
    	case 6:
    		consumio=Consumos.F;

    	}
    	return consumio;
    }



	public void AtribBase(){
		
		preciobase = Math.random()*10000+1;
		color = RandColor();		
		consumo =RandConsumo();
		peso=Math.random()*120+5;
		 	
	}
	public  double PrecioFinal(){

		preciofinal = preciobase;
		switch (consumo)
		{
		case A:  
			preciofinal += 100;
			break;
		case B: 
			preciofinal += 80;
			break;
		case C:
			preciofinal += 60;
			break;
		case D:
			preciofinal += 50;
			break;
		case E:
			preciofinal += 30;
			break;
		case F:
			preciofinal += 10;
		}

		if ((peso >=0) && (peso <=19)){
			preciofinal += 10;
		}
		if ((peso >= 20) && (peso <= 49)){
			preciofinal += 50;
		}
		if ((peso >= 50) && (peso <= 79)){
			preciofinal += 80;
		}
		if (peso > 80){
			preciofinal += 100;
		}

		return preciofinal;
	}

	public void Mostrar() {
		
		System.out.print("Precio Base: $"+ String.format("%.2f", preciobase) + " /Color: "+ color + " /Tipo de Consumo: " + consumo + " /Peso: "+ String.format("%.2f", peso)+ "kg ");
	}
	
	

}
   


