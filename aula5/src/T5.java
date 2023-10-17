//Exercício 5
//Crie uma função que receba um valor decimal e uma percentagem de desconto e apresente o valor do desconto.

import java.util.Scanner;

public class T5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor original: ");
        double valor = scanner.nextDouble();

        System.out.print("Digite a percentagem de desconto: ");
        double percentagemDesconto = scanner.nextDouble();

        double desconto = calcularDesconto(valor, percentagemDesconto);
        System.out.println("Valor do desconto: " + desconto);

        scanner.close();
    }

    public static double calcularDesconto(double valor, double percentagemDesconto) {
        if (valor < 0 || percentagemDesconto < 0) {
            throw new IllegalArgumentException("Os valores não podem ser negativos.");
        }

        double desconto = valor * (percentagemDesconto / 100.0);
        return desconto;

    }
}
