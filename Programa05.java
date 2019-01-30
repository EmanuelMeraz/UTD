package programasPrimeraUnidad;

import java.util.Scanner;

public class Programa05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

      float calf;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.print("Ingresa la calificación: ");
		calf = leer.nextFloat();
		
		if (calf >= 80)
		{
			System.out.println("APROVADO ");
			
		}

		else
		{
			System.out.println("REPROBADO");
		}
		
	}

	}


