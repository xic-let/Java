class Arbitro extends Entidade {
    private String localResidencia;
    private String classificacao;
    private String profissao;
    private int jogosApitados;
    private double salarioBase;
    private double ajudaDeCusto;

    public Arbitro(String nome, String areaGeografica, String contacto, String NIF, String localResidencia, String classificacao, String profissao, int jogosApitados, double salarioBase) {
        super(nome, areaGeografica, contacto, NIF);
        this.localResidencia = localResidencia;
        this.classificacao = classificacao;
        this.profissao = profissao;
        this.jogosApitados = jogosApitados;
        this.salarioBase = salarioBase;
        this.ajudaDeCusto = 0;
    }

    // Métodos para calcular as receitas e imprimir dados
    public void calcularReceitas() {
        ajudaDeCusto = 240.57 * jogosApitados;
    }

    public void imprimirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Local de Residência: " + localResidencia);
        System.out.println("Classificação: " + classificacao);
        System.out.println("Profissão: " + profissao);
        System.out.println("Jogos Apitados: " + jogosApitados);
        System.out.println("Salário Base: " + salarioBase);
        System.out.println("Ajuda de Custo: " + ajudaDeCusto);
    }

    public void limparValoresAcumulados() {
        ajudaDeCusto = 0;
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }
}
