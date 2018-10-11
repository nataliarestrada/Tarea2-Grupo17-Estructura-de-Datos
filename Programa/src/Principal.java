import java.util.Random;

public class Principal {

	public static void main(String[] args) {


		Electrodomesticos[] coleccion = new Electrodomesticos[15];          
		double preciototal = 0;

		Ejecutar(coleccion,preciototal);
		Mostrar(coleccion);

		System.out.println("Total de precios finales para todos los elementos de la coleccion: $" + preciototal);



	}

	public static void Ejecutar(Electrodomesticos[] coleccion,  double preciototal){
		int i, num, cant;

		cant = 15;
		Random aleatorio=new Random();

		for (i = 0; i < cant; i++)
		{
			num =aleatorio.nextInt(2); 
			switch (num)
			{
			case 0:
				Heladera heladera = new Heladera();
				// pausa en milisegundos 
				Thread.sleep(14);
				heladera.AtribBase();
				preciototal = preciototal+heladera.PrecioFinal;
				coleccion[i] = heladera;
				break;
			case 1:
				Cocina cocina = new Cocina();
				Thread.sleep(14);
				cocina.AtribBase();
				preciototal = preciototal+cocina.PrecioFinal;
				coleccion[i] = cocina;
				break;
			case 2:
				Lavarropa lavarropa = new Lavarropa();
				Thread.sleep(14);
				lavarropa.AtribBase();
				preciototal = preciototal+lavarropa.PrecioFinal;
				coleccion[i] = lavarropa;
				break;
			}            
		}

	}
	public static void Mostrar(Electrodomesticos[] coleccion){

        for(int i=0;i<4;i++)
        {
            coleccion[i].Mostrar();
        }          
    }
}


