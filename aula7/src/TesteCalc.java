import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class TesteCalc {
    public static void main(String[] args) {

        String[] Operacoes={
                "Somar", "Subtrair", "Multiplicar", "Dividir"
        };

        //Criar Instancia da classe Calculadora

        Calculadora Calc = new Calculadora();

        do{

            int Escolha = JOptionPane.showOptionDialog(null, "Escolha a opção pretendida:", "Classe caluladora", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.PLAIN_MESSAGE, null, Operacoes, null);

            try {
                Calc.setNumero1(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o 1o Numero")));

                Calc.setNumero2(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o 2o Numero")));
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, "ERRO", "Calculadora", JOptionPane.ERROR_MESSAGE);
            }
            switch (Escolha){
                case 0 -> JOptionPane.showMessageDialog(null, "O resultado da soma é: " +
                        Calc.Soma(), "Soma", JOptionPane.INFORMATION_MESSAGE);
                case 1 -> JOptionPane.showMessageDialog(null, "O resultado da subtração é: " +
                        Calc.Subtrair(), "Subtração", JOptionPane.INFORMATION_MESSAGE);
                case 2 -> JOptionPane.showMessageDialog(null, "O resultado da multiplicação é: " +
                        Calc.Multiplicar(), "Multiplicação", JOptionPane.INFORMATION_MESSAGE);
                case 3 -> {
                    if(Calc.getNumero2() == 0) {
                        JOptionPane.showMessageDialog(null, "Divisão por zero inválida", "Claculadora", JOptionPane.ERROR_MESSAGE);

                    }
                    else{
                        JOptionPane.showMessageDialog(null, "O resultado da divisão é: " +
                                Calc.Dividir(), "Divisão", JOptionPane.INFORMATION_MESSAGE);
                    }
                }

            }

        }while (JOptionPane.showConfirmDialog(null, "Clique em Yes para continuar", "Classe Calculadora", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION);
    }
}