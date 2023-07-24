//Criar um programa para gerar 10 números.
// Ordenar os números por ordem crescente.
// Mostrar os números sequencialmente depois de ordenados.

import java.util.Arrays;
import java.util.Random;

public class task_6 {

    public static void main(String[] args) {
        int[] numeros = new int[10];

        Random random = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt();
        }

        Arrays.sort(numeros);

        System.out.println("Números gerados e ordenados em ordem crescente:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}
