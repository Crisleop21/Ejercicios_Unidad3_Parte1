import java.util.*;
public class Ejercicio17{
	public static void main(String[] args) {
		//declaramos variables e inicializamos scanner
		Scanner scanner = new Scanner(System.in);
		double a,b,c;
		//solicitamos la informacion
		System.out.println("Ingrese los calores de los lados del triangulo: ");
		a = scanner.nextDouble();
		b = scanner.nextDouble();
		c = scanner.nextDouble();
		//creamos un ciclo que compare y deduzca que tipo de triangulo es
		if (a==b && b==c) {
			System.out.println("Es un triangulo Equilatero");
		} else{
			if (a==b || a==c || b==c) {
				System.out.println("Es un triangulo isosceles");				
			} else{
				if (a!=b && a!=c && c!=b) {
					System.out.println("Es un triangulo escaleno");					
				}
			}
		}
	}
}