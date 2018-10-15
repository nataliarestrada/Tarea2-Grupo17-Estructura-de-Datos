import java.util.Random;

public class Principal {

	public static void main(String[] args) {


		Electrodomesticos[] coleccion = new Electrodomesticos[10];          
		double preciototal=0;

		double Total=Ejecutar(coleccion,preciototal);
		Mostrar(coleccion);

		System.out.println("TOTAL de precios finales de todos los elecrodomestico: $" + String.format("%.2f", Total));
	}

	public static double Ejecutar(Electrodomesticos[] coleccion,  double preciototal){

		int cant = 10;
		Random aleatorio=new Random();

		for (int i =0; i < cant; i++)
		{
			int num =aleatorio.nextInt(3)+1; 
			switch (num)
			{
			case 1:
				Heladera heladera = new Heladera();
				heladera.AtribBase();
				preciototal += heladera.PrecioFinal();
				coleccion[i] = heladera;
				break;
			case 2:
				Cocina cocina = new Cocina();
				cocina.AtribBase();
				preciototal += cocina.PrecioFinal();
				coleccion[i] = cocina;
				break;
			case 3:
				Lavarropa lavarropa = new Lavarropa();
				lavarropa.AtribBase();
				preciototal += lavarropa.PrecioFinal();
				coleccion[i] = lavarropa;
				
			}            
		}
		return preciototal;

	}
	public static void Mostrar(Electrodomesticos[] coleccion){

        for(int i=0;i<10;i++)
        {
            coleccion[i].Mostrar();
            
        }          
    }
}


