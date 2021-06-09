import java.util.*;
public class Ejercicio1{
	public static void main(String[] args) {
	//inicio del programa, declaramos variables e inicializamos scanner
		Scanner scanner= new Scanner(System.in);
		int numA, numB,resultado;
		//Solicitamos que igrese los valores y los leemos	
		System.out.println("Ingrese el primer numero: ");
		numA = scanner.nextInt();
		System.out.println("Ingrese el segundo numero: ");
		numB = scanner.nextInt();
		//Si ingresan un valor en A continua la operacion
		if (numA>=0) {
			resultado = numA+numB;
			System.out.println("El resultado de la suma es: "+resultado);		
			
		}	
	}
}
