import java.text.DecimalFormat;
import java.util.Random;

public class ex4_matriz {

    public static void main(String[] args) {
        // declarar uma matriz 3 x 3

        int[][] matriz=new int[3][3];

        Random Aleatorio=new Random();
        DecimalFormat Ft=new DecimalFormat("00");
        for(int linha=0;linha<3;linha++){
            for(int coluna=0;coluna<3;coluna++){
                matriz[linha][coluna]=Aleatorio.nextInt(21);
                System.out.print(Ft.format(matriz[linha][coluna])+" ");
            }
            System.out.println();
        }
        // Elementos da diagonal esquerda
        System.out.println("\nValores da diagonal esquerda:");
        for(int i=0;i<3;i++){
            System.out.print(Ft.format(matriz[i][i])+" ");
        }
        // Elementos da diagonal direita
        System.out.println("\nValores da diagonal direita:");
        for(int i=0;i<3;i++){
            System.out.print(Ft.format(matriz[i][2-i])+" ");
        }
    }
}
