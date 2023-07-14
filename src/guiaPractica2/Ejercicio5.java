package guiaPractica2;

import java.util.Scanner;

/**
 * Escribir un algoritmo que lea un valor n por teclado y muestre los primeros n términos de la sucesión de Fibonacci.
 */

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número para generara la serie de Fibonacci correspondiente: ");
        int cantidad = scanner.nextInt();
        int[] fibonacci = new int[cantidad];

        fibonacci[0]= 0;
        fibonacci[1]= 1;

        for (int i = 2; i < cantidad; i++){

        }

        scanner.close();

        System.out.println("Números ordenados:");
        for (int i = 0; i < cantidad; i++) {
            System.out.print(fibonacci[i] + "  ");
        }
    }

}
