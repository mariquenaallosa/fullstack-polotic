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

        System.out.println("Ingrese un número");
        int num1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese otro número");
        int num2 = scanner.nextInt();
        scanner.nextLine();


        // Operaciones
        int resultadoSuma = num1 + num2;
        int resultadoResta= num1 - num2;
        int resultadoMulti = num1 * num2;
        float resultadoDivi = num1 / num2;


        System.out.println("Resultados de las operaciones entre " + num1 + " y "+ num2);
        System.out.println("La suma de los números es: "+ resultadoSuma);
        System.out.println("La resta de los números es: "+ resultadoResta);
        System.out.println("La multiplicación de los números es: "+ resultadoMulti);
        System.out.println("La división de los números es: "+ resultadoDivi);


    }
}
