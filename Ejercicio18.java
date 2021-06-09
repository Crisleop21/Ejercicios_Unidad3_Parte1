import java.util.*;
public class Ejercicio18{
	public static void main(String[] args) {
		//Declaramos variables e inicializamos scanner
		Scanner scanner = new Scanner(System.in);
		String cade,d1,d2,d3,d4;
		int a,b,c,d,e,carac;

		//solicitamos que ingrese un numero
		System.out.println("Ingrese un numero: ");
		cade = scanner.nextLine();
		carac = cade.length();
		//creamos ciclos para comparar los digitos
		if (carac <= 4) {
			if (carac == 3) {
				cade = "0".concat(cade);
				if (carac == 2) {
					cade = "00".concat(cade);
					if (carac == 1) {
						cade = "000".concat(cade);
						if (carac == 0) {
							cade = "0000".concat(cade);						
						}
					}
				}
			}
			//especificamos las posiciones de los digitos
			d1 = cade.substring(0,1);
			d2 = cade.substring(1,2);
			d3 = cade.substring(2,3);
			d4 = cade.substring(3,4);
			a = Integer.parseInt(d1);
			b = Integer.parseInt(d2);
			c = Integer.parseInt(d3);
			d = Integer.parseInt(d4);
			//sumamos los digitos
			e = a+b+c+d;
			//presentamos los resultados de los digitos
			System.out.println("El primer digito es: "+d1);
			System.out.println("El segundo digito es: "+d2);
			System.out.println("El tercer digito es: "+d3);
			System.out.println("El cuarto digito es: "+d4);
			System.out.println("La suma de los digitos es: "+e);
		} else{
			System.out.println("Ingrese un valor de 4 digitos");
		}
	}
}