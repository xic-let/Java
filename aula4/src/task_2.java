//Construir um programa para:
//a) Gerar 15 números inteiros (entre 0 e 50) que devem ser armazenados num vetor;
//b) Verificar se existem elementos iguais a um número indicado pelo utilizador.
// Se existirem, escrever os índices das respetivas posições;
//c) Indicar qual é o elemento de maior valor e o seu índice;
// d) Mostrar os elementos de índice 1, 3, 5, 7, 9, 11, 13.

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class task_2 {

    public static void main(String[] args) {
        int[] v1=new int[15];

        Random Aleatorio=new Random();

        for (int i = 0; i < 15; i++){
            v1[i] = Aleatorio.nextInt(51);
            System.out.print("O valor da posição " +(i+1) + " é " + v1[i] + "\n");

        }
        System.out.println("<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>");
        System.out.println("Insira um numero de 0 a 50: ");
        int num= 0;
        Scanner scanner = new Scanner(System.in);

        try {
            num = scanner.nextInt();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Por favor, insira um número válido.");
            return;
        }
        boolean find = false;
        for (int j = 0; j < v1.length; j++){
            if (v1[j] == num){
                System.out.println("Elemento " + num + " encontrado na posição " + (j+1));
                find = true;
            }
        }
        if(!find){
            System.out.println("Numero não encontrado");
        }

        System.out.println("<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>");

        int maxval = v1[0];

        for (int k = 0; k < v1.length; k++){
            if (v1[k] > maxval) {
                maxval = v1[k];
            }
        }
        System.out.println("O maior valor do array é: " + maxval);

        System.out.println("<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>");
            System.out.println("Posição 1: " + v1[0]);
            System.out.println("Posição 3: " + v1[2]);
            System.out.println("Posição 5: " + v1[4]);
            System.out.println("Posição 7: " + v1[6]);
            System.out.println("Posição 9: " + v1[8]);
            System.out.println("Posição 11: " + v1[10]);
            System.out.println("Posição 13: " + v1[12]);

        System.out.println("<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>");


    }
}
