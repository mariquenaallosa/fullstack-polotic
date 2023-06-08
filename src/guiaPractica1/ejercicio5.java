package guiaPractica1;

import java.util.Scanner;

/**
 * Pedir al usuario que ingrese el valor del radio de una circunferencia.
 * Calcular y mostrar por pantalla el área y el perímetro.
 * Recordá que el área y el perímetro se calculan con las siguientes fórmulas:
 * area = PI × radio² perimetro = 2 × PI × radio
 */
public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor del radio de la circuferencia");
        float radio = scanner.nextFloat();

        double areaCircuferencia = Math.PI * Math.pow(radio,2);
        double perimetroCircuferencia= 2 * Math.PI * radio;

        System.out.println("Área de la circufferencia: " + areaCircuferencia);
        System.out.println("Perímetro de la circuferencia: "+ perimetroCircuferencia);
    }
}
