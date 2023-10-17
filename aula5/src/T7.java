//Exercício 7
//Crie uma função que gere um número aleatório entre 0 e 50 e devolva a informação se o número é par ou ímpar.

import java.util.Random;

public class T7 {

    public static void main(String[] args) {
        Random random = new Random();

        int numeroAleatorio = random.nextInt(51);;
        System.out.println("Número gerado: " + numeroAleatorio);

        if (numeroAleatorio % 2 == 0) {
            System.out.println("É um número par.");
        } else {
            System.out.println("É um número ímpar.");
        }
    }

}
