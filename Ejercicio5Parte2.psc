//202030799 Manuel Rojas
//Mostrar por pantalla la cantidad de mujeres mayores de edad y la cantidad de 
//hombres menores de edad de un total de N edades y sexo leídos desde teclado.
Proceso Ejercicio5Parte2
	Escribir "¿Cuantos datos desea ingresar?"
	Leer datoN
	contadorM <- 0
	contadorH <- 0
	Para i<-1 hasta datoN Con Paso 1 Hacer
		Escribir "Ingrese edad de la persona"
		Leer edad
		Escribir "Ingrese el sexo de la persona (H/M)"
		Leer sexo
		Si (sexo == "M") & (edad >= 18) Entonces
			contadorM <- contadorM + 1
		SiNo
			Si (sexo == "H") & (edad <= 17) Entonces
				contadorH <- contadorH + 1
			SiNo
				Escribir "Ingrese una edad y sexo validos"
			FinSi
		FinSi
	FinPara
	
	Escribir "Hay ", contadorM, " mujeres mayores de edad. Y ", contadorH, " hombres menores de edad"
FinProceso
