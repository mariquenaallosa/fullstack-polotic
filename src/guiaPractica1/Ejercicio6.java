package guiaPractica1;

import java.util.Scanner;

/**
 * Pedir al usuario que ingrese el precio de un producto y el porcentaje
 * de  descuento.  A  continuación  mostrar  por  pantalla  el  importe
 * descontado y el importe a pagar.
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto");
        float precio = scanner.nextFloat();

        System.out.println("Ingrese el porcentaje de descuento");
        float porcentaje = scanner.nextFloat();

        float descuento = (porcentaje/100)* precio;
        float importe = precio - descuento;

        System.out.println("El importe descontado es " + descuento + " y el importe a pagar es "+ importe);
    }}
