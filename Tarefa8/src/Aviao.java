public class Aviao extends Veiculo {
    private String tipoDeAsa;

    // Construtor
    public Aviao(String marca, String modelo, int ano, double preco, String combustivel, int velocidadeMaxima, String tipoDeAsa) {
        super(marca, modelo, ano, preco, combustivel, velocidadeMaxima);
        this.tipoDeAsa = tipoDeAsa;
    }

    // Método Getter e Setter para o atributo tipoDeAsa
    public String getTipoDeAsa() {
        return tipoDeAsa;
    }

    public void setTipoDeAsa(String tipoDeAsa) {
        this.tipoDeAsa = tipoDeAsa;
    }

    // Método para imprimir dados do avião (incluindo os dados do Veiculo e o tipo de asa)
    public void dados() {
        super.dados(); // Chama o método dados() da classe Veiculo para imprimir os dados do veículo
        System.out.println("Tipo de Asa: " + tipoDeAsa);
    }

}
