

import javax.swing.*;

public class caixas_2 {

    public static void main(String[] args) {

        int resposta = JOptionPane.showConfirmDialog(null, "Confirma saída do programa?", "SAIR", JOptionPane.YES_NO_OPTION);

        if (resposta == 0){
            JOptionPane.showMessageDialog(null, "Até Breve", "ConfirmDialog", JOptionPane.INFORMATION_MESSAGE);
        }
        else if (resposta == 1){
            JOptionPane.showMessageDialog(null , "Ainda bem que continua connosco", "ConfimDialog", JOptionPane.ERROR_MESSAGE);
        }
    }
}
