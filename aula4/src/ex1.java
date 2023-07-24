import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class ex1 {

    public static void main(String[] args) {
        int [] vetor = {5,10,15,20,25};

        for (int i =0; i < 5; i++)
        {
            JOptionPane.showMessageDialog(null, "O valor da posição " +(i+1) + " é " + vetor[i], "Arrays", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
