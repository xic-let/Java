public class Main {
    public static void main(String[] args) {
        LigaFutebol liga = new LigaFutebol();

        // Criar e adicionar árbitros, clubes e jogadores aqui

        Arbitro arbitro1 = new Arbitro("Arbitro1", "Norte", "arbitro1@example.com", "123456789",
                "Cidade1", "Nacional", "Arbitro", 0, 3000.0);
        liga.adicionarArbitro(arbitro1);

        Clube clube1 = new Clube("Clube1", "Centro", "clube1@example.com", "987654321", "Cidade2", "Presidente1", "Geral");
        liga.adicionarClube(clube1);

        Jogador jogador1 = new Jogador("Jogador1", "Sul", "jogador1@example.com", "567890123", "Pais1", "Clube1", "Avançado", 1.85, 80, 4, 5000.0);
        liga.adicionarJogador(jogador1);

        // Realizar jogos
        liga.realizarJogos();

        // Imprimir receitas
        liga.imprimirReceitas();

        // Limpar valores acumulados
        liga.limparValoresAcumulados();
    }
}
