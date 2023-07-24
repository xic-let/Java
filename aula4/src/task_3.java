//Preencha aleatoriamente um vetor de 20 números inteiros (entre 1 e 100).
// Mostre os valores. Efetue uma contagem dos números gerados entre 1 e 25 (inclusive),
// entre 26 e 50 (inclusive), entre 51 e 75 (inclusive) e entre 76 e 100 (inclusive).
// Apresente os resultados da contagem.

import java.util.Random;

public class task_3 {

    public static void main(String[] args) {
        int[] vetor = new int[20];
        int countInterval1_25 = 0;
        int countInterval26_50 = 0;
        int countInterval51_75 = 0;
        int countInterval76_100 = 0;

        Random random = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(100) + 1;
        }

        System.out.println("Valores do vetor:");
        for (int num : vetor) {
            System.out.print(num + " ");

            if (num >= 1 && num <= 25) {
                countInterval1_25++;
            } else if (num >= 26 && num <= 50) {
                countInterval26_50++;
            } else if (num >= 51 && num <= 75) {
                countInterval51_75++;
            } else if (num >= 76 && num <= 100) {
                countInterval76_100++;
            }

        }
            System.out.println("\nResultados da contagem:");
            System.out.println("Entre 1 e 25 (inclusive): " + countInterval1_25 + " números");
            System.out.println("Entre 26 e 50 (inclusive): " + countInterval26_50 + " números");
            System.out.println("Entre 51 e 75 (inclusive): " + countInterval51_75 + " números");
            System.out.println("Entre 76 e 100 (inclusive): " + countInterval76_100 + " números");

    }

}
