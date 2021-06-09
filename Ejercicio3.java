import java.util.*;
public class Ejercicio3{
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		double num;
		double doble;
		double triple;
		System.out.println("Ingrese un numero: ");
		num = scanner.nextDouble();
		doble = num*2;
		triple = num*3;
		System.out.println("El doble del numero ingresado es: "+doble);
		System.out.println("El Triple del numero ingresado es: "+triple);
	}

}