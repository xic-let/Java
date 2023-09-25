import java.text.DecimalFormat;
import java.util.Scanner;

public class TestarFuncionarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar informações do vendedor
        System.out.println("Dados do Vendedor:");
        System.out.print("Nome: ");
        String nomeVendedor = scanner.nextLine();
        System.out.print("Contato Móvel: ");
        String contatoMovelVendedor = scanner.nextLine();
        System.out.print("Email: ");
        String emailVendedor = scanner.nextLine();
        System.out.print("Salário Base do Vendedor: ");
        double salarioBaseVendedor = scanner.nextDouble();
        System.out.print("Total de Vendas do Vendedor: ");
        double vendasVendedor = scanner.nextDouble();

        Vendedor vendedor = new Vendedor(nomeVendedor, contatoMovelVendedor, emailVendedor, salarioBaseVendedor);
        vendedor.setVendas(vendasVendedor);

        // Solicitar informações do administrativo
        System.out.println("\nDados do Administrativo:");
        System.out.print("Nome: ");
        String nomeAdministrativo = scanner.nextLine(); // Consumir a quebra de linha anterior
        nomeAdministrativo = scanner.nextLine();
        System.out.print("Contato Móvel: ");
        String contatoMovelAdministrativo = scanner.nextLine();
        System.out.print("Email: ");
        String emailAdministrativo = scanner.nextLine();
        System.out.print("Salário Fixo do Administrativo: ");
        double salarioFixoAdministrativo = scanner.nextDouble();
        System.out.print("Horas Extras do Administrativo: ");
        int horasExtrasAdministrativo = scanner.nextInt();

        Administrativo administrativo = new Administrativo(nomeAdministrativo, contatoMovelAdministrativo, emailAdministrativo, salarioFixoAdministrativo);
        administrativo.setHorasExtras(horasExtrasAdministrativo);

        // Solicitar informações do financeiro
        System.out.println("\nDados do Financeiro:");
        System.out.print("Nome: ");
        String nomeFinanceiro = scanner.nextLine(); // Consumir a quebra de linha anterior
        nomeFinanceiro = scanner.nextLine();
        System.out.print("Contato Móvel: ");
        String contatoMovelFinanceiro = scanner.nextLine();
        System.out.print("Email: ");
        String emailFinanceiro = scanner.nextLine();
        System.out.print("Salário Fixo do Financeiro: ");
        double salarioFixoFinanceiro = scanner.nextDouble();
        System.out.print("Prêmio Mensal do Financeiro: ");
        double premioMensalFinanceiro = scanner.nextDouble();

        Financeiro financeiro = new Financeiro(nomeFinanceiro, contatoMovelFinanceiro, emailFinanceiro, salarioFixoFinanceiro);
        financeiro.setPremioMensal(premioMensalFinanceiro);

        // Fechar o scanner
        scanner.close();

        // Exibir informações dos funcionários
        System.out.println("\nDados do Vendedor:");
        exibirDadosFuncionario(vendedor);

        System.out.println("\nDados do Administrativo:");
        exibirDadosFuncionario(administrativo);

        System.out.println("\nDados do Financeiro:");
        exibirDadosFuncionario(financeiro);
    }

    // Método para exibir dados do funcionário
    private static void exibirDadosFuncionario(Funcionario funcionario) {
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Contato Móvel: " + funcionario.getContatoMovel());
        System.out.println("Email: " + funcionario.getEmail());
        funcionario.imprimirSalario();
    }
}
