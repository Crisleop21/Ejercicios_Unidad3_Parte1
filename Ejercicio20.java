import java.util.*;
import java.math.*;
public class Ejercicio20{
	public static void main(String[] args) {
		//definimos variables e inicializamos scanner
		Scanner scanner = new Scanner(System.in);
		double num,a,b;

		//pedimos un numero
		System.out.println("Ingresa un numero: ");
		num = scanner.nextDouble();

		//asignamos valores
		a = Math.floor(num/100);
		b = (num%10);
		//creamos un ciclo
		if (a==b) {

			System.out.println("El numero"+num+" es un numero capicua");
		} else{
			System.out.println("El numero"+num+" no es un numero capicua");
		}
	}
}