import java.text.DecimalFormat;

public class Vendedor extends Funcionario {
    private double salarioBase;
    private double vendas;

    public Vendedor(String nome, String contatoMovel, String email, double salarioBase) {
        super(nome, contatoMovel, email);
        this.salarioBase = salarioBase;
        this.vendas = 0.0;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getVendas() {
        return vendas;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }

    @Override
    public void imprimirSalario() {
        double salarioTotal = salarioBase + (vendas * 0.05); // Comissão de 5% sobre as vendas
        DecimalFormat formatoEuro = new DecimalFormat("€#,##0.00");
        System.out.println("Salário: " + formatoEuro.format(salarioTotal));
    }
}
