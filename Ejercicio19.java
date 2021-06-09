import java.util.*;
import java.math.*;
public class Ejercicio19{
	public static void main(String[] args) {
		//declaramos varible
		double num;
		//generamos un numero random entre el 1 y 1000
		num = 1+Math.floor(Math.random()*1000);
		//mostramos el numero aleatorio generado
		System.out.println("El numero generado aleatoriamente es: "+num);
		//creamos un ciclo que muestre si el numero 
		//generado es multiplo de 5 y si se encuentra entre los primeros 25 numeros
		if (num%5==0 && num<=25) {
			System.out.println("Correcto");
		} else {
			System.out.println("Incorrecto");
		}

	}
}