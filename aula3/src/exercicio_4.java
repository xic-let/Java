import javax.swing.*;
import java.util.Random;

public class exercicio_4 {

    public static void main(String[] args) {

        int i = 1;

        while (i <= 5) {

            Random Sorteio = new Random();

            int num = Sorteio.nextInt(51); // 0 é o limite inferior e o limite superior e 4
            JOptionPane.showMessageDialog(null, num, i + " º numero", JOptionPane.INFORMATION_MESSAGE);
            i++;
        }
    }
}
