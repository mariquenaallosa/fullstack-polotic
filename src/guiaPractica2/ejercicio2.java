package guiaPractica2;

import java.util.Scanner;
/**
 *  Escribir un programa que lea una palabra por teclado y determine si es un palíndromo.
 * Tip: los palíndromos son palabras que se leen igual de izquierda a derecha y viceversa. Por ejemplo, reconocer.
 */

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una palabra: ");
        String palabra = scanner.nextLine();

        if (esPalindromo(palabra)) {
            System.out.println(palabra + " es un palíndromo.");
        } else {
            System.out.println(palabra + " no es un palíndromo.");
        }
    }

    public static boolean esPalindromo(String palabra) {
        // Eliminar espacios y convertir a minúsculas para ignorar diferencias de formato
        palabra = palabra.replaceAll("\\s+", "").toLowerCase();

        int longitud = palabra.length();
        for (int i = 0; i < longitud / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(longitud - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
