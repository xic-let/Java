
import java.util.Scanner;

public class aula {

    public static void main (String[] args ){

        //construtor de leitura
        Scanner Ler = new Scanner(System.in);

        int nbr1 = 0, nbr2 = 0;

        System.out.println("Digite o 1o Numero:");
        nbr1 = Ler.nextInt();
        System.out.println("Digite o 2o Numero:");
        nbr2 = Ler.nextInt();
        System.out.println("A soma dos numeros é: " + (nbr1 + nbr2));
    }
}
