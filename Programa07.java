package programasPrimeraUnidad;

import java.util.Scanner;

public class Programa07 {
	
	public static void main(String[] args) {
		
		Scanner leer =new Scanner (System.in);
		float fare, cent;
		
		System.out.println("Ingrese en los grados fahrenheit deseados a convertir");
		fare=leer.nextFloat();
		
	 cent=(fare-32)*5/9;
	 
	 System.out.print("Los grados equivales a grados centigrados es: "+cent);
	 System.out.println(cent+ "Grados° y Grados Fharenheid  "+fare);
	 
		
	}

}
