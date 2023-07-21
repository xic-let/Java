import javax.swing.*;
import java.util.Random;

public class tarefa_1 {

    public static void main(String[] args) {

        do {
            Random Sorteio = new Random();
            int num = Sorteio.nextInt(101);
            for (int i = 0; i < 5; i++) {
                int guess = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero de 0 a 100!"));

                if (guess < num) {
                    JOptionPane.showMessageDialog(null, "O numero secreto é superior!", "ERROU", JOptionPane.ERROR_MESSAGE);
                } else if (guess > num) {
                    JOptionPane.showMessageDialog(null, "O numero secreto é inferior!", "ERROU", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Acertou! O numero sorteado é o " + num, "GANHOU!!!", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
            }
                JOptionPane.showMessageDialog(null, "O numero sorteado é: "+num, "Jogo Terminado", JOptionPane.INFORMATION_MESSAGE);

        }while (JOptionPane.showConfirmDialog(null, "Vamos Jogar ao sobe e desce?", "Novo Jogo", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);
    }
}
