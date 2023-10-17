import java.util.Scanner;

//Exercício 6
//Crie uma função que receba a idade de uma pessoa em anos e devolva a informação se é ou não maior.
public class T6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();

        if (idade > 17) {
            System.out.println("É maior de idade.");
        } else {
            System.out.println("Não é maior de idade.");
        }
        scanner.close();
    }
}
