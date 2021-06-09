import java.util.*;
public class Ejercicio12{
	public static void main(String[] args) {
		//declaramos variables e inicializamos scanner
		Scanner scanner = new Scanner(System.in);
		double celsius,fahrenheit;
		//solicitamos los datos
		System.out.println("Ingrese el valor de la temperatura en grados celsius: ");
		celsius = scanner.nextDouble();
		//hacemos la conversion
		fahrenheit = (celsius*9/5)+32;
		//mostramos resultados
		System.out.println("La temperatura en grados fahrenheit es: "+fahrenheit+"F");

		

	}

}