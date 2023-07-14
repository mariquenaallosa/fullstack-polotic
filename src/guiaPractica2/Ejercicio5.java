package guiaPractica2;

import java.util.Scanner;

/**
 * Escribir un algoritmo que lea un valor n por teclado y muestre los primeros n términos de la sucesión de Fibonacci.
 */

public class Ejercicio5 {
        public static void main(String[] args) {
            // Crear objeto Scanner para leer la entrada del usuario
            Scanner scanner = new Scanner(System.in);

            // Solicitar al usuario que ingrese el valor de n
            System.out.print("Ingrese el valor de n: ");
            int n = scanner.nextInt();

            // Mostrar los primeros n términos de la sucesión de Fibonacci
            System.out.println("Sucesión de Fibonacci hasta el término " + n + ":");
            for (int i = 1; i <= n; i++) {
                System.out.print(fibonacci(i) + " ");
            }
        }

        // Método para calcular el término n de la sucesión de Fibonacci
        public static int fibonacci(int n) {
            if (n <= 1) {
                return n;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        }

}
