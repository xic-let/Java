import java.util.Scanner;

/*Fazer um programa para calcular a contribuição paraa Segurança Social,
IRSe osindicato apartir dosalário bruto, que é um atributode entrada.
• SS –11,5%• IRS-25%• Sindicato–0,5 %
O programa deve imprimir o valor das contribuições e o valor do salário líquido.*/
public class ex4_4 {
    public static void main(String[] args) {

        Scanner Ler = new Scanner(System.in);
        int gross = 0;
        System.out.println("Simulador de salário: ");
        System.out.println("Digite valor de Salário bruto Mensal: ");
        gross = Ler.nextInt();
        double ss = (gross * 11.5) / 100;
        double irs = gross * 0.4;
        double union = (gross * 0.5) / 100;

        double cont = ss+irs+union;
        double liq = gross - cont;
        System.out.println(" valor total das contribuições é de: " + cont + "euros");
        System.out.println(" valor do salário liquido é de: " + liq + "euros");
    }

}
