import java.text.DecimalFormat;

public class Financeiro extends Funcionario {
    private double salarioFixo;
    private double premioMensal;

    public Financeiro(String nome, String contatoMovel, String email, double salarioFixo) {
        super(nome, contatoMovel, email);
        this.salarioFixo = salarioFixo;
        this.premioMensal = 0.0;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double getPremioMensal() {
        return premioMensal;
    }

    public void setPremioMensal(double premioMensal) {
        this.premioMensal = premioMensal;
    }

    @Override
    public void imprimirSalario() {
        double salarioTotal = salarioFixo + premioMensal;
        DecimalFormat formatoEuro = new DecimalFormat("€#,##0.00");
        System.out.println("Salário: " + formatoEuro.format(salarioTotal));
    }
}

