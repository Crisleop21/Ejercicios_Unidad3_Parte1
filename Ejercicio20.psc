Algoritmo Capicua
	Definir num,a,b Como Entero
	Escribir 'Ingresa un numero: '
	Leer num
	a <- trunc(num/100)
	b <- (num MOD 10)
	Si a==b Entonces
		Escribir 'El numero ',n,' es un numero capicua'
	SiNo
		Escribir 'El numero ',n,' no es un numero capicua'
	FinSi
FinAlgoritmo
