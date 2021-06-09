import java.util.*;
public class Ejercicio16{
	public static void main(String[] args) {
		//definir las variables e iniciar scanner
		Scanner scanner = new Scanner(System.in);
		double a,b,c;
		//solicitamos la informacion
		System.out.println("Ingrese el primer numero: ");
		a = scanner.nextDouble();
		System.out.println("Ingrese el segundo numero: ");
		b = scanner.nextDouble();
		System.out.println("Ingrese el tercer numero: ");
		c = scanner.nextDouble();
		//creamos un ciclo donde compare los numeros
		if (a > b && a > c){
			System.out.println("El numero "+a+" es el mayor de los tres");			
		} else{
			if (b > a && b > c) {
				System.out.println("El numero "+b+" es el mayor de los tres");
			} else{
				if (c > a && c > b) {
					System.out.println("El numero "+c+" es el mayor de los tres");
				} else{
					System.out.println("Los numeros son iguales");
				}
			}
		}
	}
}