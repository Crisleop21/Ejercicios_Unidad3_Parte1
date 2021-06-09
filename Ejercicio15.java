import java.util.*;
public class Ejercicio15{
	public static void main(String[] args) {
		//declaramos variables e iniciamos scanner
		Scanner scanner = new Scanner(System.in);
		double a;
		//solicitamos los datos
		System.out.println("Ingrese un numero: ");
		a = scanner.nextDouble();
		//creamos un ciclo que compruebe si el numero es positivo, negativo o nulo
		if (a == 0) {
			System.out.println("El numero "+a+" es nulo");		
		} else{
			if (a >= 0) {
				System.out.println("El numero "+a+" es positivo");
			} else{
				System.out.println("El numero "+a+" es negativo");
			}
		}
	}
}