import java.util.Scanner;

public class ex2 {
//criar um programa em java para solicitar ao utilizador um valor em kilos
    public static void main(String[] args) {

        Scanner Ler = new Scanner(System.in);
        float kg = 0;
        System.out.println("Digite o numero de Kg a converter: ");
        kg = Ler.nextFloat();
        System.out.println(" o valor em grams é de " +(kg*1000));

    }
}
