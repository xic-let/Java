//Exercício 8
//Crie uma função que receba um número inteiro e retorne o quadrado desse número.

import java.util.Scanner;

public class T8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int quadrado = numero * numero;
        System.out.println("O quadrado de " + numero + " é: " + quadrado);

        scanner.close();
    }


}
