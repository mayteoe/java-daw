Algoritmo SumarDosEnteros
	Escribir 'Este programa calcula el cociente entre dos enteros, hasta que meta como divisor un 0'
	Escribir 'Introducir entero 1'
	Leer A
	Mientras A<>0 Hacer
		Escribir 'Introducir entero 2'
		Leer B
		Si B<>0 Entonces
			Resultado <- A/B
			Escribir Resultado
		SiNo
			Escribir 'División por cero'
		FinSi
		Escribir 'Introducir entero 1'
		Leer A
	FinMientras
	Escribir 'Mensaje de despedida'
FinAlgoritmo
