package guiaPractica1;

import java.util.Scanner;
/*
*
* Escribir un programa en el cual se le pregunte al usuario su nombre. A continuación, mostrar un mensaje que diga
* "Hola, " completando el mensaje con el nombre que ingresó el usuario.
*
*/
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String name = scanner.nextLine();
        System.out.println("Hola, " + name);
    }
}
