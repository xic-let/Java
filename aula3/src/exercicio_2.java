import javax.swing.*;

public class exercicio_2 {

    public static void main(String[] args) {
        int num= 1;
        int soma = 0;
        int contador = 0;

        while( num != 0){
            try {
                num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero"));
                soma += num;
                contador++;
            }catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Valor inválido", "Erro", JOptionPane.ERROR_MESSAGE);
            }

        }
        JOptionPane.showMessageDialog(null, " o valor da soma nos numeros inseridos é  " + soma + ", e o utilizador inseriu " + (contador - 1) + " numeros!");
    }
}
