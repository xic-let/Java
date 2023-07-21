import javax.swing.*;

public class caixas_5 {

    public static void main(String[] args) {

        int resposta = 0;
        int p1= JOptionPane.showConfirmDialog(null, "Gostou do atendimento?", "1ª pergunta", JOptionPane.YES_NO_OPTION);
        if (p1 == 0) resposta++;
        int p2= JOptionPane.showConfirmDialog(null, "Gostou do espaço?", "2ª pergunta", JOptionPane.YES_NO_OPTION);
        if (p2 == 0) resposta++;
        int p3= JOptionPane.showConfirmDialog(null, "Recomendaria?", "3ª pergunta", JOptionPane.YES_NO_OPTION);
        if (p3 == 0) resposta++;

        JOptionPane.showMessageDialog(null, "Respostas Afirmativas" + resposta);

    }
}
