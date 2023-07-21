import javax.swing.*;

public class Ex_1 {

    public static void main(String[] args) {

        int resposta = 0;
        int p1= JOptionPane.showConfirmDialog(null, "Telefonou para a vitima", "1ª pergunta", JOptionPane.YES_NO_OPTION);
        if (p1 == 0) resposta++;
        int p2= JOptionPane.showConfirmDialog(null, "Esteve no Local do crime?", "2ª pergunta", JOptionPane.YES_NO_OPTION);
        if (p2 == 0) resposta++;
        int p3= JOptionPane.showConfirmDialog(null, "Mora perto da Vitima?", "3ª pergunta", JOptionPane.YES_NO_OPTION);
        if (p3 == 0) resposta++;
        int p4= JOptionPane.showConfirmDialog(null, "Tinha dividas com a vítima?", "4ª pergunta", JOptionPane.YES_NO_OPTION);
        if (p4 == 0) resposta++;
        int p5= JOptionPane.showConfirmDialog(null, "Já trabalhou com a vitima?", "5ª pergunta", JOptionPane.YES_NO_OPTION);
        if (p5 == 0) resposta++;


        if (resposta == 2)
            JOptionPane.showMessageDialog(null, "Respostas Afirmativas" + resposta + "\n Você é Suspeito!");
        if (resposta > 2 && resposta < 5)
            JOptionPane.showMessageDialog(null, "Respostas Afirmativas" + resposta + "\n Você é Cumplice!");
        if (resposta == 5)
            JOptionPane.showMessageDialog(null, "Respostas Afirmativas" + resposta + "\n Você é o Assassino!");
        else if (resposta < 2)
            JOptionPane.showMessageDialog(null, "Respostas Afirmativas" + resposta + "\n Você está inocente!");

    }
}
