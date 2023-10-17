class Clube extends Entidade {
    private String sedeSocial;
    private String presidente;
    private String vocacao;
    private int jogosDisputados;
    private int assistencias;
    private double receitasBilheteira;
    private double receitasPublicidade;
    private double receitasTransmissaoTV;

    public Clube(String nome, String areaGeografica, String contacto, String NIF, String sedeSocial, String presidente, String vocacao) {
        super(nome, areaGeografica, contacto, NIF);
        this.sedeSocial = sedeSocial;
        this.presidente = presidente;
        this.vocacao = vocacao;
        this.jogosDisputados = 0;
        this.assistencias = 0;
        this.receitasBilheteira = 0;
        this.receitasPublicidade = 0;
        this.receitasTransmissaoTV = 0;
    }

    public double getReceitasPublicidade() {
        return receitasPublicidade;
    }

    // Métodos para calcular as receitas e imprimir dados
    public void calcularReceitas() {
        double precoMedioBilhete = 12.50;
        receitasBilheteira = precoMedioBilhete * assistencias;
        receitasPublicidade = 120000.00 * jogosDisputados;
    }

    public void imprimirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Sede Social: " + sedeSocial);
        System.out.println("Presidente: " + presidente);
        System.out.println("Vocação: " + vocacao);
        System.out.println("Jogos Disputados: " + jogosDisputados);
        System.out.println("Assistências: " + assistencias);
        System.out.println("Receitas Bilheteira: " + receitasBilheteira);
        System.out.println("Receitas de Publicidade: " + receitasPublicidade);
        System.out.println("Receitas de Transmissão TV: " + receitasTransmissaoTV);
    }

    public void limparValoresAcumulados() {
        receitasBilheteira = 0;
        receitasPublicidade = 0;
        receitasTransmissaoTV = 0;
    }
    public double getReceitasBilheteira() {
        return receitasBilheteira;
    }

    public double getReceitasTransmissaoTV() {
        return receitasTransmissaoTV;
    }
}
