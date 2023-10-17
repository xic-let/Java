/*Exercício 3
        Crie uma função em Java que dado um valor numérico digitado pelo utilizador (armazenado numa variável inteira), imprima cada um dos seus dígitos por extenso.
        Exemplo:
        O número: 4571 Resultado: quatro, cinco, sete, um*/

import java.util.Scanner;

public class T3 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = ler.nextInt();
        ler.close();

        imprimirDigitosPorExtenso(numero);
    }

    public static void imprimirDigitosPorExtenso(int numero) {
        String[] digitosPorExtenso = {
                "zero", "um", "dois", "três", "quatro",
                "cinco", "seis", "sete", "oito", "nove"
        };

        String numeroString = String.valueOf(numero);
        for (int i = 0; i < numeroString.length(); i++) {
            int digito = Character.getNumericValue(numeroString.charAt(i));
            if (i == 0) {
                System.out.print(digitosPorExtenso[digito]);
            } else {
                System.out.print(", " + digitosPorExtenso[digito]);
            }
        }

    }
}
