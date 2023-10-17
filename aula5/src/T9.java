import java.util.Scanner;

//Exercício 9
//Crie uma função em Java que receba o peso e a altura e devolva o valor do IMC.
public class T9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu peso (em kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a sua altura (em metros): ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);
        if (peso <= 0 || altura <= 0) {
            throw new IllegalArgumentException("O peso e a altura devem ser valores positivos.");
        }

        System.out.println("O IMC é: " + imc);

        scanner.close();
    }


}
