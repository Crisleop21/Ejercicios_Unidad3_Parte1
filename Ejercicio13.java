import java.util.*;
import java.math.*;
public class Ejercicio13{
	public static void main(String[] args) {
		//declaramos variables e inicializamos scanner
		Scanner scanner = new Scanner(System.in);
		double radio,altura,volumen;
		//pedimos los datos
		System.out.println("Ingrese el radio: ");
		radio = scanner.nextDouble();
		if (radio >= 0) {
			System.out.println("Ingrese la altura: ");
			altura = scanner.nextDouble();
			if (altura >= 0) {
				volumen = (Math.PI*(Math.pow(radio,2))*altura);
				System.out.println("El volumen del cilindro es: "+volumen+" unidades cubicas");
			} else{
				System.out.println("Ingrese una cantidad positiva: ");
			
			}
				
			
			
		} else{
			System.out.println("Ingrese una cantidad positiva: ");
		}
	}

}