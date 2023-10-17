import javax.swing.*;

public class Ex1 {

    public static void main(String[] args) {
        soma (15, 79);
    }

    public static void soma(float n1, float n2)
    {
        JOptionPane.showMessageDialog(null, "A soma dos numeros é " + (n1+n2), "Funçao soma", JOptionPane.INFORMATION_MESSAGE);
    }
    public static float soma1(float n1, float n2){
        return(n1+n2);
    }
}
