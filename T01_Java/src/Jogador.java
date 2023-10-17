class Jogador extends Entidade {
    private String paisOrigem;
    private String clubeRepresentado;
    private String posicaoJogo;
    private double altura;
    private double peso;
    private int jogosParticipados;
    private double salarioBaseMensal;
    private double premioJogo;
    private double rendimentosDireitosImagem;

    public Jogador(String nome, String areaGeografica, String contacto, String NIF, String paisOrigem, String clubeRepresentado, String posicaoJogo, double altura, double peso, int jogosParticipados, double salarioBaseMensal) {
        super(nome, areaGeografica, contacto, NIF);
        this.paisOrigem = paisOrigem;
        this.clubeRepresentado = clubeRepresentado;
        this.posicaoJogo = posicaoJogo;
        this.altura = altura;
        this.peso = peso;
        this.jogosParticipados = jogosParticipados;
        this.salarioBaseMensal = salarioBaseMensal;
        this.premioJogo = 0;
        this.rendimentosDireitosImagem = 0;
    }

    // Métodos para calcular as receitas e imprimir dados
    public void calcularReceitas() {
        premioJogo = 650.00 * jogosParticipados;
        rendimentosDireitosImagem = 0.115 * salarioBaseMensal;
    }

    public void imprimirDados() {
        System.out.println("Nome: " + getNome());
    }

    public double getPremioJogo() {
        return premioJogo;
    }
    public double getRendimentosDireitosImagem() {
        return rendimentosDireitosImagem;
    }

    public void limparValoresAcumulados() {
    }
}