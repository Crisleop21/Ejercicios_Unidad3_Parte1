import java.util.*;
import java.math.*;
public class Ejercicio4{
	public static void main(String[] args) {
		//inicio del programa, declaramos variables e inicializamos scanner
		Scanner scanner = new Scanner(System.in);
		double num;
		double cuadrado;
		double cubo;
		//Solicitamos que igrese los valores y los leemos	
		System.out.println("Ingrese un numero: ");
		num = scanner.nextDouble();
		cuadrado = Math.pow(num,2);
		cubo = Math.pow(num,3);
		System.out.println("El cuadrado del numero es: "+cuadrado);
		System.out.println("El cubo del numero es: "+cubo);

	}

}