package sumando;

import java.util.Scanner;

public class Sumando {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce el primer sumando: ");
		int sumandoUno = entrada.nextInt();
		System.out.print("Introduce el segundo sumando: ");
		int sumandoDos = entrada.nextInt();
		
		System.out.print("El resultado de la suma es " + (sumandoUno + sumandoDos));
		
		entrada.close();

	}

}
