import java.util.*;
import java.math.*;
public class Ejercicio7{
	public static void main(String[] args) {
		//declaramos variables
		double disminucion;
		double numero_random;
		double porcentaje;
		//generamos numero aleatorio
		numero_random = 10+Math.floor(Math.random()*50);
		//sacamos el porcentaje
		porcentaje = (15*numero_random)/100;
		//hacemos la disminuicion
		disminucion = numero_random-porcentaje;
		//imprimimos datos
		System.out.println("El numero aleatorio es: "+numero_random);
		System.out.println("El numero aleatorio disminuido en un 15% es: "+disminucion);
	}

}