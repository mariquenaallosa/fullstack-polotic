package guiaPractica2;

import java.util.Scanner;

/*
* * Escribe un algoritmo que alcule el factorial de un número ingresado por teclado
*
*/
public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número");

        int num = scanner.nextInt();
        int factorial = 1;


        scanner.close();
        for (int i = 0 ; i < num ; i++){
            factorial *= (i +1);
            System.out.println(factorial);
        }

        System.out.println("Factorial de " + num  + " : " + factorial);

    }


}
