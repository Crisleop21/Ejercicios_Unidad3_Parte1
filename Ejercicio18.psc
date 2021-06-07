Algoritmo Digitos
	Definir cade Como Caracter
	Definir a,b,c,d,e Como Entero
	Escribir 'ingrese numero '
	Leer cade
	carac <- Longitud(cade)
	Si carac<=4 Entonces
		Si carac==3 Entonces
			cade <- Concatenar('0',cade)
			Si carac==2 Entonces
				cade <- Concatenar('00',cade)
				Si carac==1 Entonces
					cade <- Concatenar('000',cade)
					Si carac==0 Entonces
						cade <- Concatenar('0000',cade)
					FinSi
				FinSi
			FinSi
		FinSi
		d1 <- subcadena(cade,1,1)
		d2 <- subcadena(cade,2,2)
		d3 <- subcadena(cade,3,3)
		d4 <- subcadena(cade,4,4)
		a <- ConvertirANumero(d1)
		b <- ConvertirANumero(d2)
		c <- ConvertirANumero(d3)
		d <- ConvertirANumero(d4)
		e <- a+b+c+d
		Escribir 'El primer digito es:	',d1
		Escribir 'El segundo digito es:	',d2
		Escribir 'El tercer digito es:	',d3
		Escribir 'El cuarto digito es:	',d4
		Escribir 'La suma de los digitos es: ',e
	SiNo
		Escribir 'Ingrese un valor de 4 digitos'
	FinSi
FinAlgoritmo
