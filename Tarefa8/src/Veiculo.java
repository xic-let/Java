public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private double preco;
    private String combustivel;
    private int velocidadeMaxima;

    // Construtor
    public Veiculo(String marca, String modelo, int ano, double preco, String combustivel, int velocidadeMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
        this.combustivel = combustivel;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    // Métodos Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    // Método para imprimir dados do veículo
    public void dados() {
        System.out.println("Relatório do Veículo:");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Preço: " + preco);
        System.out.println("Combustível: " + combustivel);
        System.out.println("Velocidade Máxima: " + velocidadeMaxima + " km/h");
    }

    public static void main(String[] args) {
        // Exemplo de uso da classe Veiculo
        Veiculo meuCarro = new Veiculo("Toyota", "Corolla", 2023, 45000.0, "Gasolina", 180);
        meuCarro.dados();
    }
}
