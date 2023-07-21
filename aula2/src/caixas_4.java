import javax.swing.*;

public class caixas_4 {

    public static void main(String[] args) {

        //roll switch

    int resposta = JOptionPane.showConfirmDialog(null, "Confirma saída do programa?", "SAIR", JOptionPane.YES_NO_OPTION);

        switch(resposta)

        {
            case 0 -> JOptionPane.showMessageDialog(null, "Até Breve", "ConfirmDialog", JOptionPane.INFORMATION_MESSAGE);

            case 1 -> JOptionPane.showMessageDialog(null, "Ainda bem que continua connosco", "ConfimDialog", JOptionPane.ERROR_MESSAGE);

            default -> JOptionPane.showMessageDialog(null, "ERRO", "ConfirmDialog", JOptionPane.ERROR_MESSAGE);
        }
    }
}
