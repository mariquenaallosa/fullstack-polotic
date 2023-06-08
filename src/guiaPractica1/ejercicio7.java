package guiaPractica1;

import java.util.Scanner;

/**
 * Escribir un programa que reciba el valor de dos edades y las guarde
 * en dos variables. Luego el programa debe intercambiar los valores de ambas
 * variables y mostrarlas por pantalla. Por ejemplo, si el usuario ingresó
 * los  valores  edad1  =  24  y  edad2  =  35,  el  programa  deberá
 * mostrar edad1 = 35 y edad2 = 24
 */
public class ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese edad");
        int edad1 = scanner.nextInt();

        System.out.println("Ingrese edad");
        int edad2 = scanner.nextInt();

        edad1 = edad1 ^ edad2;
        //edad 1 se vuelve otro número resultado de la comparación de bits entre edad1 y edad2
        edad2 = edad1 ^ edad2;
        //edad2 se vuelve la edad1 inicial resultado de la comparación de bits entre la edad1 nueva y edad2 inicial
        edad1 = edad1 ^ edad2;
        //edad 1 se vuelve la edad2 inicial resultado de la comparación de bits entre los valores de la operación anterior

        System.out.println("El valor de la edad 1 es " + edad1 + " y el valor de la edad 2 es " + edad2);

    }
}
