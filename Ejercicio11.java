import java.util.*;
public class Ejercicio11{
	public static void main(String[] args) {
		//definimos las variables e inicializamos el scanner
		Scanner scanner = new Scanner(System.in);
		double cm,yardas,m,pie,plg;
		//solicitamos los datos
		System.out.println("Ingrese una cantidad en cm: ");
		cm = scanner.nextDouble();
		//definimos los valores de conversion
		yardas = 0.0109361*cm;
		m = 0.01*cm;
		pie = 0.0328084*cm;
		plg = 0.393701*cm;
		//mostramos los resultados de las conversiones
		System.out.println("La cantida ingresada en cm es la siguiente en:");
		System.out.println(yardas+" yardas");
		System.out.println(m+" metro");
		System.out.println(pie+" pies");
		System.out.println(plg+" pulgadas");
	}

}