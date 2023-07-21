import java.util.Scanner;

public class ex3 {

    /*Solicitar ao utilizador um nr inteiro e apresentar o dobro e o triplo desse numero*/

    public static void main(String[] args) {

        Scanner Ler = new Scanner(System.in);

        int nbr1 = 0;

        System.out.println("Digite 1 Numero:");
        nbr1 = Ler.nextInt();

        System.out.println("O dobro do numero digitado é: " + (nbr1*2));
        System.out.println("O triplo do numero digitado é: " + (nbr1*3));

    }
}
