

    public class ContaBancaria {
        private int numeroConta;
        private String nomeCliente;
        private double saldo;

        // Construtor para inicialização da conta
        public ContaBancaria(int numeroConta, String nomeCliente, double saldo) {
            this.numeroConta = numeroConta;
            this.nomeCliente = nomeCliente;
            this.saldo = saldo;
        }

        // Método para realizar depósito
        public void deposito(double valor) {
            saldo += valor;
            System.out.println("Depósito de Euros" + valor + " realizado. Novo saldo: €" + saldo);
        }

        // Método para realizar levantamento
        public void levantamento(double valor) {
            if (valor <= saldo) {
                saldo -= valor;
                System.out.println("Levantamento de Euros" + valor + " realizado. Novo saldo: €" + saldo);
            } else {
                System.out.println("Saldo insuficiente para realizar o levantamento.");
            }
        }

        // Método para consultar saldo
        public double consultarSaldo() {
            return saldo;
        }

        // Método para consultar informações da conta
        public void consultarConta() {
            System.out.println("Número da conta: " + numeroConta);
            System.out.println("Nome do cliente: " + nomeCliente);
            System.out.println("Saldo atual: €" + saldo);
        }

        // Método principal para teste
        public static void main(String[] args) {
            // Criação uma conta bancária com dados iniciais
            ContaBancaria minhaConta = new ContaBancaria(12345, "Patricia Cunha", 1000.0);

            // Realizar algumas operações
            minhaConta.consultarConta();
            minhaConta.deposito(500.0);
            minhaConta.levantamento(200.0);
            minhaConta.consultarConta();
        }
    }


