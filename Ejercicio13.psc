Algoritmo Volumen
	Escribir 'Ingrese el radio: '
	Leer radio
	Si radio>=0 Entonces
		Escribir 'Ingrese la altura: '
		Leer altura
		Si altura>=0 Entonces
			v <- (PI*(radio^2)*altura)
			Escribir 'El Volumen del cilindro es: ',v
		SiNo
			Escribir 'Ingrese una cantidad positiva'
		FinSi
	SiNo
		Escribir 'Ingrese una cantidad positiva'
	FinSi
FinAlgoritmo
