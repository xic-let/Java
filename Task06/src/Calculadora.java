import javax.swing.JOptionPane;

public class Calculadora {
    private double numero1;
    private double numero2;

    // Construtor vazio
    public Calculadora() {
    }

    // Construtor com inicialização das variáveis
    public Calculadora(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // Getters e Setters para as variáveis
    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    // Métodos para realizar operações
    public double somar() {
        return numero1 + numero2;
    }

    public double subtrair() {
        return numero1 - numero2;
    }

    public double multiplicar() {
        return numero1 * numero2;
    }

    public double dividir() {
        if (numero2 != 0) {
            return numero1 / numero2;
        } else {
            JOptionPane.showMessageDialog(null, "Erro: Divisão por zero não é permitida.");
            return Double.NaN; // Retorna NaN (Not-a-Number) em caso de divisão por zero
        }
    }

    public static void main(String[] args) {
        // Solicitar ao usuário os dois números
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));

        // Criar um objeto Calculadora com os números informados
        Calculadora calculadora = new Calculadora(num1, num2);

        // Realizar as operações e exibir os resultados em caixas de diálogo
        String mensagem = "Resultados:\n";
        mensagem += "Soma: " + calculadora.somar() + "\n";
        mensagem += "Subtração: " + calculadora.subtrair() + "\n";
        mensagem += "Multiplicação: " + calculadora.multiplicar() + "\n";
        mensagem += "Divisão: " + calculadora.dividir() + "\n";
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
