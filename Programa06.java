package programasPrimeraUnidad;

import java.util.Scanner;

public class Programa06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer=new Scanner(System.in);
		
		byte num=0;
		System.out.println("Ingrese un numero entero: ");
		num = leer.nextByte();
		
		if(num%2==0)
		{
			System.out.print("Es un número Par");
		}
		else
		{
			System.out.print("No es un número Par");
		}
		

	}

}
