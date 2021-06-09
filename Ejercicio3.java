import java.util.*;
public class Ejercicio3{
	public static void main(String[] args) {
		//inicio del programa, declaramos variables e inicializamos scanner
		Scanner scanner= new Scanner(System.in);
		double num;
		double doble;
		double triple;
		//Solicitamos que igrese los valores y los leemos	
		System.out.println("Ingrese un numero: ");
		num = scanner.nextDouble();
		//sacamos el doble y triple
		doble = num*2;
		triple = num*3;
		System.out.println("El doble del numero ingresado es: "+doble);
		System.out.println("El Triple del numero ingresado es: "+triple);
	}

}