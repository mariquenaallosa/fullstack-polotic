package guiaPractica2;

import java.util.Scanner;

/**
 *
 * Escribir un programa que reciba un número entero por teclado. A
 * continuación, mostrar la tabla de multiplicar de ese número.
 *
 */
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero para generar la tabla de multiplicación");
        int numero = scanner.nextInt();

        System.out.println("Tabla del "+ numero);
        for (int i = 0 ; i<=10 ; i++){
            System.out.println(numero + " * " + i + " = " + numero*i);
        }
    }
}
