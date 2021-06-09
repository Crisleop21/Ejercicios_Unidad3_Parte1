import java.util.*;
public class Ejercicio10{
	public static void main(String[] args) {
		//declaramos variables e inicializamos scanner
		Scanner scanner = new Scanner(System.in);
		double base;
		double altura;
		double area;
		double perimetro;
		//solicitamos los datos
		System.out.println("Ingrese base del rectangulo: ");
		base = scanner.nextDouble();
		System.out.println("Ingrese la altura del rectangulo: ");
		altura = scanner.nextDouble();
		//generamos el area y perimetro
		area = base*altura;
		perimetro = (2*base)+(2*altura);
		//imprimimos resultados
		System.out.println("El area del rectangulo es: "+area);
		System.out.println("El perimetro del rectangulo es: "+perimetro);
		

	}
}
