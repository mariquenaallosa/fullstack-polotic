package guiaPractica2;

import java.util.Scanner;

/**
 * Del listado de abajo, determinar qué animal eligió el usuario mediante
 * la  realización  de  tres  preguntas  del  tipo  SI/NO  acerca
 * de  las  tres características elegidas (herbívoro, mamífero, doméstico).
 * Mostrar el resultado por pantalla.
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Es herbívoro?");
        String respuesta = scanner.nextLine();
        boolean herbivoro = guardarRespuesta(respuesta);

        System.out.println("¿Es mamífero?");
        respuesta = scanner.nextLine();
        boolean mamifero = guardarRespuesta(respuesta);

        System.out.println("¿Es doméstico?");
        respuesta = scanner.nextLine();
        boolean domestico = guardarRespuesta(respuesta);

        scanner.close();
        System.out.println("El animal elegido es: " + mostrarAnimal(herbivoro, mamifero, domestico));
    }
    private static boolean guardarRespuesta(String respuesta) {
        boolean flag = true;
        if (respuesta.equalsIgnoreCase("no")) {
            flag = false;
        }
        return flag;
    }
    private static String mostrarAnimal(boolean herbivoro, boolean mamifero, boolean domestico) {
        String animal;
        if (herbivoro && mamifero && domestico) {
            animal = "Caballo";
        }
        else if ((!herbivoro) && (!mamifero) && (!domestico)) {
            animal = "Cóndor";
        }
        else if (herbivoro && mamifero) {
            animal = "Alce";
        }
        else if ((!herbivoro) && (!mamifero)) {
            animal = "Pitón";
        }
        else if (domestico && mamifero) {
            animal = "Gato";
        }
        else if ((!domestico) && (!mamifero)) {
            animal = "Caracol";
        }
        else if (herbivoro) {
            animal = "Tortuga";
        }
        else {
            animal = "León";
        }
        return animal;
    }
}
