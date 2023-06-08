package guiaPractica1;

import java.util.Scanner;

/*
*
* Escribir un programa que lea dos números y realice el cáculo de la suma, la resta, la multiplicacion y la division
* entre ambos valores. Los resultados deben mostrarse por pantalla.
*
*/
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número");
        int num2 = scanner.nextInt();

        // Operaciones
        int resultadoSuma = num1 + num2;
        int resultadoResta= num1 - num2;
        int resultadoMulti = num1 * num2;
        float resultadoDivi = num1 / num2;


        System.out.println("Resultados de las operaciones entre " + num1 + " y "+ num2);
        System.out.println("Suma = "+ resultadoSuma);
        System.out.println("Resta = "+ resultadoResta);
        System.out.println("Multiplicación = "+ resultadoMulti);
        System.out.println("División 3= "+ resultadoDivi);


    }
}
