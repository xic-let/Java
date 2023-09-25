public class Carro extends Veiculo {
    private int portas;

    // Construtor
    public Carro(String marca, String modelo, int ano, double preco, String combustivel, int velocidadeMaxima, int portas) {
        super(marca, modelo, ano, preco, combustivel, velocidadeMaxima);
        this.portas = portas;
    }

    // Método Getter e Setter para o atributo portas
    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    // Método para imprimir dados do carro (incluindo os dados do Veiculo)
    public void dados() {
        super.dados(); // Chama o método dados() da classe Veiculo para imprimir os dados do veículo
        System.out.println("Portas: " + portas);
    }

}
