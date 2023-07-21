import javax.imageio.stream.ImageInputStream;
import javax.swing.*;

//Solicitar ao utilizador o nome e a idade e apresentar no ecra numa caixa de dialogo

public class caixas_6 {

    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog(null, "Como se chama:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog(null, " Quantos anos tem?"));

        JOptionPane.showMessageDialog(null, "Boa Noite "+nome + " tem " +idade +"anos de Idade!" );

    }
}
