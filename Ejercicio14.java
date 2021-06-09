import java.util.*;
public class Ejercicio14{
	public static void main(String[] args) {
		//declaramos variables e iniciamos scanner
		Scanner scanner = new Scanner(System.in);
		double a,b;
		//solicitamos datos
		System.out.println("Ingrese un numero: ");
		a = scanner.nextDouble();
		System.out.println("Ingrese un segundo numero: ");
		b = scanner.nextDouble();
		//creamos un ciclo que compruebe si a es divisible entre b
		if (a % b == 0) {
			System.out.println("El numero "+a+" es divisible entre "+b);
		} else{
			System.out.println("El numero "+a+" no es divisible entre "+b);
		}
	}

}