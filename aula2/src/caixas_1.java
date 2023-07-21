import javax.swing.*;

public class caixas_1 {

    public static void main(String[] args) {
        int n1 = 0, n2= 0;

        //Em Java, você pode usar a classe JOptionPane para exibir uma caixa de diálogo de entrada (input dialog) para solicitar a entrada do usuário.
        // A classe JOptionPane fornece vários métodos estáticos para criar diferentes tipos de caixas de diálogo, incluindo a caixa de diálogo de entrada.

        try {

            n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o 1o Numero:"));
            n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o 2o Numero:"));
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Verifique o valor Inserido", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // o bloco try e catch é utilizado para tratamento de exceções, permitindo que você lide com erros e exceções de forma controlada.
        // O bloco try contém o código que pode gerar uma exceção, e o bloco catch é responsável por capturar e tratar essa exceção.

        JOptionPane.showMessageDialog(null, " A soma dos números é " +(n1+n2), "Soma de 2 números", JOptionPane.INFORMATION_MESSAGE);

        //o termo "parse" refere-se geralmente à conversão de um tipo de dado para outro tipo.
        // Por exemplo, converter uma String para um número inteiro ou para um número de ponto flutuante.
    }
}
