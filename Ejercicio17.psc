Algoritmo Triangulos
	Definir a,b,c Como Real
	Escribir 'Ingrese los valores de los lados del triangulo: '
	Leer a,b,c
	Si a=b Y b=c Entonces
		Escribir 'Es un triangulo Equilatero'
	SiNo
		Si a=b o a=c o b=c Entonces
			Escribir "Es un triangulo isosceles"
		SiNo
			Si a<>b y a<>c y c<>b Entonces
				Escribir "Es un triangulo escaleno"
			FinSi
		FinSi
	FinSi
FinAlgoritmo
