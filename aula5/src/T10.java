//Exercício 10
//Crie uma função em java que receba um array de cinco números inteiros e devolva qual o maior número inserido.


import java.util.Scanner;

public class T10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            numeros[i] = scanner.nextInt();
        }

        int maiorNumero = encontrarMaiorNumero(numeros);
        System.out.println("O maior número inserido é: " + maiorNumero);

        scanner.close();
    }

    public static int encontrarMaiorNumero(int[] numeros) {
        if (numeros == null || numeros.length == 0) {
            throw new IllegalArgumentException("O array não pode ser nulo ou vazio.");
        }

        int maior = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        return maior;
    }
}
