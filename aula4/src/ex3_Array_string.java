import javax.swing.*;
import java.util.Random;

public class ex3_Array_string {

    public static void main(String[] args) {
        String[] Cores = new String[5];

        Cores[0] = "Azul";
        Cores[1] = "Branco";
        Cores[2] = "Vermelho";
        Cores[3] = "Amarelo";
        Cores[4] = "Laranja";

        do{
            Random Aleatorio = new Random();
            int cor = Aleatorio.nextInt(6);

            JOptionPane.showMessageDialog(null, "A cor sorteada foi: " + Cores[cor], "Cores", JOptionPane.INFORMATION_MESSAGE);

        }
        while (JOptionPane.showConfirmDialog(null, "Clique em Yes para repetir",
                "Nova cor",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION);
        }
    }

