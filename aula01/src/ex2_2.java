import java.util.Scanner;
//Ler horas, minutos e segundos e escrever o tempo correspondente em segundos.
public class ex2_2 {

    public static void main(String[] args) {

        Scanner Ler = new Scanner(System.in);
        int hours = 0;
        int mins = 0;
        int secs = 0;


        System.out.println("Qual o valor de Horas? ");
        hours = Ler.nextInt();
        System.out.println("Qual o valor de Minutos? ");
        mins = Ler.nextInt();
        System.out.println("Qual o valor de Segundos? ");
        secs = Ler.nextInt();

        float reshours = hours * 3600;
        float resmins = mins * 60;
        float ressecs = secs;

        float result = (reshours + resmins + ressecs);


        System.out.printf( "%d horas, %d minutos e %d segundos são: %.2f Segundos", hours, mins, secs, result);
    }
}
