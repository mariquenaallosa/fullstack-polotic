package guiaPractica1;
/**
 * Pedir  al  usuario  que  ingrese  una  temperatura  en  grados  Celsius
 * y mostrar por pantalla su equivalente en kelvin y grados Fahrenheit.
 * Las fórmulas para conversiones son:
 * Kelvin = 273,15 + Celsius Fahrenheit = 1,8 × Celsius
 */
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una temperatura en grados Celsius");
        float celsius = scanner.nextFloat();

        float kelvin = 273.15f + celsius;
        float fahrenheit = (1.8f * celsius)+ 32;

        System.out.println("Equivalentes en:\n" + "Kelvin: " + kelvin + "\n" + "Fahrenheit: " + fahrenheit);


    }
}
