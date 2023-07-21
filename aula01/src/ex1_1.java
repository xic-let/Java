import java.text.DecimalFormat;
import java.util.Scanner;
/*A  revista MyHouseespecializada  na  venda  de  artigos  para  casa,  indica
as  medidas  em  polegadas.  O senhor   Y,   antes   de   fazer   a   sua   encomenda   pretende
saber   as   correspondentes   medidas   em milimetros.  Crie  um  algoritmo
para  o  efeito  e  teste-o  sabendo  que  12.3  polegadas  correspondem  a 312.42 mm (1in.=25.4mm).*/


public class ex1_1 {

    public static void main(String[] args) {

        Scanner Ler = new Scanner(System.in);
        DecimalFormat Df = new DecimalFormat("0.00 mm");
        float inches = 0;
        System.out.println("Digite o número em Polegadas a converter: ");
        inches = Ler.nextFloat();
        System.out.println(" o valor em milimetros é de " +Df.format(inches*25.4));
    }
}
