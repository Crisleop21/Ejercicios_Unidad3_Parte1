import java.util.*;
public class Ejercicio8{
	public static void main(String[] args) {
		//declaramos las variables e inicializamos el scanner
		Scanner scanner = new Scanner(System.in);
		int a;
		int b;
		int c;
		int prom;
		//solicitamos los datos
		System.out.println("Ingrese un numero: ");
		a = scanner.nextInt();
		System.out.println("Ingrese un segundo numero: ");
		b = scanner.nextInt();
		System.out.println("Ingrese un tercer numero: ");
		c = scanner.nextInt();
		//sacamos el promedio de los 3 numeros
		prom = (a+b+c)/3;
		//mostramos el promedio
		System.out.println("El promedio es: "+prom);

	}

}