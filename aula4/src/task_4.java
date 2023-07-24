//Construir um programa para gerar aleatoriamente um vetor de 25 números (entre 0 e 500). Calcular e mostrar:
//a) Quantidade de elementos iguais a 100;
//b) Quantidade de elementos pares;
//c) Quantidade de elementos menores que 50;
// d) Elemento de menor valor;

import java.util.Random;

public class task_4 {

    public static void main(String[] args) {

        int[] vetor = new int[25];
        int countEqual100 = 0;
        int countEven = 0;
        int countLessThan50 = 0;
        int minValue = Integer.MAX_VALUE;

        Random random = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(501);
        }

        for (int num : vetor) {
            if (num == 100) {
                countEqual100++;
            }
            if (num % 2 == 0) {
                countEven++;
            }
            if (num < 50) {
                countLessThan50++;
            }
            if (num < minValue) {
                minValue = num;
            }
        }

        System.out.println("Vetor gerado:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }


        System.out.println("\n\nResultados:");
        System.out.println("Quantidade de elementos iguais a 100: " + countEqual100);
        System.out.println("Quantidade de elementos pares: " + countEven);
        System.out.println("Quantidade de elementos menores que 50: " + countLessThan50);
        System.out.println("Elemento de menor valor: " + minValue);

    }
}
