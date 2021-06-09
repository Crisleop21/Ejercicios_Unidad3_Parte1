import java.util.*;
public class Ejercicio2{
	public static void main(String[] args) {
		//inicio del programa, declaramos variables e inicializamos scanner
		Scanner scanner= new Scanner(System.in);
		String pais,capital;
		//Solicitamos que igrese los valores y los leemos	
		System.out.println("Ingrese el nombre del pais");
		pais = scanner.nextLine();
		System.out.println("Ingrese la capital del pais");
		capital = scanner.nextLine();
		System.out.println(capital+" es la capital de "+pais);
		
	}


}