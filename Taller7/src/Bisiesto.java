import java.util.Scanner;

public class Bisiesto {

	Scanner sc = new Scanner(System.in);
	private int num = 0;

	public void leerAnho() {

		String respuesta;

		do {
			System.out.println("Digite el año: ");
			num = sc.nextInt();

			calcularNum();

			System.out.println("¿Desea continuar? (Si = S || No = N)");
			respuesta = sc.next();

		} while (respuesta.equalsIgnoreCase("S"));
	}

	public void calcularNum() {

		if (num % 4 == 0 && num % 100 != 0 || num % 400 == 0) {

			System.out.println("El año " + num + " es bisiesto");

		} else {

			System.out.println("El año " + num + " no es bisiesto");
		}
	}
}
