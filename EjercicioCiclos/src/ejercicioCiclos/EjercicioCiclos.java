package ejercicioCiclos;


import static ejercicioCiclos.Biblioteca.*;

public class EjercicioCiclos {

	public static void main(String[] args) {

		probarFor();

	}

	public static void probarFor() {
		for (int i = 0; i <= 9; i++) 
		{
			for (int j = 0; j <= 9; j++)
			{
				imprimirConsola(""+i+""+j);
				imprimirConsola("\n");
			}
		}
	}

}
