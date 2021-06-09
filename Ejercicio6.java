import java.util.*;
import java.math.*;
public class Ejercicio6{
	public static void main(String[] args) {
		//inicio del programa, declaramos variables
		double numero_aleatorio;
		double porcentaje;
		//generamos un numero aleatorio entre 0 y 200
		numero_aleatorio = 0+Math.floor(Math.random()*200);
		//sacamos el porcentaje del numero aleatorio
		porcentaje = (30*numero_aleatorio)/100;
		//imprimimos resultados
		System.out.println("El numero aleatorio es: "+numero_aleatorio);
		System.out.println("El porcentaje del numero aleatorio es: "+porcentaje);
	}

}