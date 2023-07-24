import javax.swing.*;
import java.util.Random;

import static javax.swing.JOptionPane.showMessageDialog;

public class ex2_vetores {

    public static void main(String[] args) {
        int[] vetor = new int[5];

        Random Aleatorio = new Random();

        for (int i = 0; i < 5; i++){
            vetor[i] = Aleatorio.nextInt(51);
         }


        for (int i = 0; i< 5; i++){
            showMessageDialog(null, "O valor da posição " +(i+1) + " é " + vetor[i], "Arrays", JOptionPane.INFORMATION_MESSAGE);
        }
        String saida= "";
        for (int i = 0; i< 5; i++){
            saida += " \n O valor da posição "+ (i+1) + " é "+ vetor[i];
        }
        showMessageDialog( null, saida, "Arrays", JOptionPane.INFORMATION_MESSAGE);
    }
}
