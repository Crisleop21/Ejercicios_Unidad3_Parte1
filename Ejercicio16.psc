Algoritmo TresNumeros
	Definir a,b,c Como Real
	Escribir 'Ingrese el primer numero: '
	Leer a
	Escribir 'Ingrese el segundo numero: '
	Leer b
	Escribir 'Ingrese el tercer numero: '
	Leer c
	Si a>b Y a>c Entonces
		Escribir 'El numero ',a,' es el mayor de los tres'
	SiNo
		Si b>a Y b>c Entonces
			Escribir 'El numero ',b,' es el mayor de los tres'
		SiNo
			Si c>a Y c>b Entonces
				Escribir 'El numero ',c,' es el mayor de los tres'
			SiNo
				Escribir 'Los numeros son iguales'
			FinSi
		FinSi
	FinSi
FinAlgoritmo
