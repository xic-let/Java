import javax.swing.*;
import java.util.Objects;

/* Comparaçao de strings através do método equals */

public class caixas_7 {

    public static void main(String[] args) {

        String pass = JOptionPane.showInputDialog(null, "Digite password:");

        String pass1 = JOptionPane.showInputDialog(null, "Confirme Password");

        if(Objects.equals(pass.toUpperCase(), pass1.toUpperCase())){
            JOptionPane.showMessageDialog(null, "Login efectuado com sucesso", "Login", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "Palavras Passe Não coincidem", "Login", JOptionPane.INFORMATION_MESSAGE);

        }

    }
}
