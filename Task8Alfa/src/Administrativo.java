import java.text.DecimalFormat;

public class Administrativo extends Funcionario {
    private double salarioFixo;
    private int horasExtras;

    public Administrativo(String nome, String contatoMovel, String email, double salarioFixo) {
        super(nome, contatoMovel, email);
        this.salarioFixo = salarioFixo;
        this.horasExtras = 0;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    @Override
    public void imprimirSalario() {
        double salarioTotal = salarioFixo + (horasExtras * 3.0); // Pagamento de horas extras a 3 euros por hora
        DecimalFormat formatoEuro = new DecimalFormat("€#,##0.00");
        System.out.println("Salário: " + formatoEuro.format(salarioTotal));
    }
}
