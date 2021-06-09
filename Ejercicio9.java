import java.util.*;
public class Ejercicio9{
	public static void main(String[] args) {
		//declaramos variables e inicializamos scanner
		Scanner scanner = new Scanner(System.in);
		String palabraA;
		String palabraB;
		String temporalC;
		//solicitamos los datos
		System.out.println("Ingrese una palabra(A): ");
		palabraA = scanner.nextLine();
		System.out.println("Ingrese una segunda palabra(B): ");
		palabraB = scanner.nextLine();
		//asignamos los cambios de variables
		temporalC = palabraA;
		palabraA = palabraB;
		palabraB = temporalC;
		//presentamos resultados
		System.out.println("La palabra A luego del intercambio "+palabraA);
		System.out.println("La palabra B luego del intercambio "+palabraB);

	}

}