import java.util.Scanner;

public class NumeroEntero {

	Scanner sc = new Scanner(System.in);
	private int num = 0;

	public void leerNumero() {

		String respuesta;

		do {
			System.out.println("Digite un numero entero:");

			num = sc.nextInt();

			calcularCifras();

			System.out.println("¿Desea continuar? (Si = S || No = N)");
			respuesta = sc.next();

		} while (respuesta.equalsIgnoreCase("S"));

	}

	public void calcularCifras() {

		int cifra = num, i = 0;

		do {
			cifra = cifra / 10;
			i++;
		} while (cifra > 0);

		System.out.println("El numero " + num + " tiene " + i + " cifras");
	}
}