package guiaPractica1;

import java.util.Scanner;

/*
*
* Escribir un programa que lea la estatura de tres personas, calcule el promedio de la altura de ellos y lo informe
*
*/
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la estatura de la primera persona");
        double estatura1 = scanner.nextDouble();

        System.out.println("Ingrese la estatura de la segunda persona");
        double estatura2 = scanner.nextDouble();

        System.out.println("Ingrese la estatura de la tercera persona");
        double estatura3 = scanner.nextDouble();


        double promedioAlturas = (estatura1 + estatura2 + estatura3)/3;

        System.out.println("El promedio de las alturas ingresadas es: "+ promedioAlturas);

    }
}
