import java.util.Scanner;

/*Um  grupo  de  pessoas participou nnum rodízio de  pizza.
Fazer  um  programa  que  lê  o númerode pessoas e calcula o
valor da conta sabendo que o rodízio custa 15,00€por pessoa.
O programa deve calcular e imprimir a conta, a comissão
de 10% do empregadoe o valor final da conta.*/
public class ex3_3 {

    public static void main(String[] args) {

        Scanner Ler = new Scanner(System.in);
        int ppl = 0;
        System.out.println("Bem vindo ao rodizio de pizza: ");
        System.out.println("Digite o número de pessoas que se vão deliciar: ");
        ppl = Ler.nextInt();
        double tab = (ppl * 15) * (1.10);
        System.out.println(" o valor da conta será de " + tab + "euros");
    }

}
