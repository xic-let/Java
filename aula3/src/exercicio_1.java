
//solicitar numeros ao utilizador ate que o numero indicado seja 0
// no final mostrar a noma de numeros inseridos e indicar o numero de vezes que o user inseriu valores

import javax.swing.*;

public class exercicio_1 {

    public static void main(String[] args) {
        int num= 0;
        int soma = 0;
        int contador = 0;

        do{
            try {
                num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero"));
                soma += num;
                contador++;
            }catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Valor inválido", "Erro", JOptionPane.ERROR_MESSAGE);
            }

        }while( num != 0);
            JOptionPane.showMessageDialog(null, " o valor da soma nos numeros inseridos é  ," + soma + "e o utilizador inseriu " + (contador - 1) + " numeros!");
    }
}
