/*Exercício 1
Crie uma função em Java que receba o nome e o apelido e escreva no seguinte formato: O seu nome é apelido, nome.
Nota: Use as caixas de diálogo para interface com o utilizador
*/

import javax.swing.*;

public class T1 {

    public static void main(String[] args) {

            String nome = JOptionPane.showInputDialog("Digite o seu nome:");
            String apelido = JOptionPane.showInputDialog("Digite o seu apelido:");

            JOptionPane.showMessageDialog(null, "O seu nome é " + apelido + ", " + nome + ".");
        }

    }

