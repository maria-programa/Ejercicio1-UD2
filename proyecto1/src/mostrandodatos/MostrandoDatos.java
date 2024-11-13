package mostrandodatos;

import java.util.Scanner;

public class MostrandoDatos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce tu nombre y apellido: ");
		String nombre = entrada.nextLine();
		
		System.out.print(nombre);
		
		entrada.close();

	}

}
