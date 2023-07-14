package guiaPractica2;
/** Escribir  un  algoritmo  que  imprima  el  listado  de  los  números
 * primos menores que 200. Aclaración: el número 1 no es primo.
 * Tip: un  número  es  primo  si  es  divisible  únicamente  por  1 y  por  sí mismo.
 * Por ejemplo, el 7 es primo porque sólo es divisible por 1 y por 7. El 6 no es primo
 * porque es divisible por 1, por 2, por 3 y por 6.
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        int n = 200;

        for (int i = 2; i <= n; i++) {
            boolean esPrimo = true;

            for (int j = 2; j <= i/2; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                System.out.println(i);
            }
        }
    }
}
