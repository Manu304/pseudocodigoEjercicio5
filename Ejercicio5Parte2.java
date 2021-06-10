import java.util.Scanner;

//202030799 Manuel Rojas
//Mostrar por pantalla la cantidad de mujeres mayores de edad y la cantidad de 
//hombres menores de edad de un total de N edades y sexo le�dos desde teclado.
public class Ejercicio5Parte2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int datoN, contadorM = 0, contadorH = 0;
        System.out.print("Cuantos datos desea ingresar? ");
        datoN = scanner.nextInt();
        for (int i=0; i<datoN; i++){
            System.out.print("\nIngrese la edad de la persona: ");
            int edad = scanner.nextInt();
            System.out.print("Ingrese el sexo de la persona (H/M): ");
            char sexo = scanner.next().toUpperCase().charAt(0);
            if ((sexo == 'M') && ((edad >= 18) && (edad >= 0))){
                contadorM++;
            }else if ((sexo == 'H') && ((edad <= 17) && (edad >= 0))){
                contadorH++;
            }
        }
        System.out.println("Hay " + contadorM + " mujeres mayores de edad. Y " + contadorH + " hombres menores de edad");
    } 
}