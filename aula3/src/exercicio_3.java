
//classe random - permite gerar numeros aleatórios

import javax.swing.*;
import java.util.Random;

public class exercicio_3 {

    public static void main(String[] args) {

        Random Sorteio = new Random();

        for (int i = 1; i <= 3; i++) {

            int num = Sorteio.nextInt(5)+1; // 0 é o limite inferior e o limite superior e 4
            JOptionPane.showMessageDialog(null, num, i+ " º numero", JOptionPane.INFORMATION_MESSAGE);
        }
    }

}
