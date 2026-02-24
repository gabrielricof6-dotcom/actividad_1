//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        Random dato = new Random();

        int[] numeros = new int[10];
        int[] pares = new int[10];
        int[] impares = new int[10];
        int contPares = 0;
        int contImpares = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = dato.nextInt(100) + 1;
        }

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] % 2 == 0) {
                // Si el número es par
                pares[contPares] = numeros[i];
                contPares++;
            } else {
                // Si el número es impar
                impares[contImpares] = numeros[i];
                contImpares++;
            }
        }

        System.out.println("original:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.print(" ");

        System.out.println("números pares:");
        for (int i = 0; i < contPares; i++) {
            System.out.print(pares[i] + " ");
        }

        System.out.print(" ");

        System.out.println("números impares:");
        for (int i = 0; i < contImpares; i++) {
            System.out.print(impares[i] + " ");
        }

    }
}