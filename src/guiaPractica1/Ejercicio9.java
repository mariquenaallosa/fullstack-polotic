package guiaPractica1;

import java.util.Scanner;

/**
 * A partir de una cantidad de pesos que el usuario ingresa a través del teclado
 * se  debe  obtener  su  equivalente  en  dólares,  en  euros,  en guaraníes
 * y en reales. Para este ejercicio se consideran las siguientes tasas:
 * 1 dólar = 231,68 pesos
 * 1 euro = 250,69 pesos
 * 1 peso = 31,00 guaraníes
 * 1 real = 46,81 pesos
 * Tip: en  este  ejercicio  se  puede  usar  la  función printf
 * y  mostrar  el resultado con dos decimales.
 */
public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un monto de dinero en pesos");
        float pesos = scanner.nextFloat();

        float dolar = pesos / 231.68f;
        float euro = pesos / 250.69f;
        float guaranies = 31.00f * pesos;
        float real = pesos / 46.81f;

        System.out.printf("Estos son sus equivalentes en:\nDólares: %.2f \nEuros: %.2f \nGuaraníes: %.2f \nReales: %" +
                ".2f\n", dolar,euro, guaranies, real);

    }
}
