import java.util.ArrayList;
import java.util.List;

public class LigaFutebol {
    private List<Arbitro> arbitros;
    private List<Clube> clubes;
    private List<Jogador> jogadores;

    public LigaFutebol() {
        arbitros = new ArrayList<>();
        clubes = new ArrayList<>();
        jogadores = new ArrayList<>();
    }

    public void adicionarArbitro(Arbitro arbitro) {
        arbitros.add(arbitro);
    }

    public void adicionarClube(Clube clube) {
        clubes.add(clube);
    }

    public void adicionarJogador(Jogador jogador) {
        jogadores.add(jogador);
    }

    public void realizarJogos() {
        // Suponha que a liga realize 4 jogos
        for (int i = 0; i < 4; i++) {
            for (Arbitro arbitro : arbitros) {
                arbitro.calcularReceitas();
            }
            for (Clube clube : clubes) {
                clube.calcularReceitas();
            }
            for (Jogador jogador : jogadores) {
                jogador.calcularReceitas();
            }
        }
    }

    public void imprimirReceitas() {
        System.out.println("Receitas da Liga de Futebol:");
        double receitaTotal = 0;
        for (Arbitro arbitro : arbitros) {
            receitaTotal += arbitro.getAjudaDeCusto();
        }
        for (Clube clube : clubes) {
            receitaTotal += clube.getReceitasBilheteira() + clube.getReceitasPublicidade() + clube.getReceitasTransmissaoTV();
        }
        for (Jogador jogador : jogadores) {
            receitaTotal += jogador.getPremioJogo() + jogador.getRendimentosDireitosImagem();
        }
        System.out.println("Receita Total: " + receitaTotal);
    }

    public void limparValoresAcumulados() {
        for (Arbitro arbitro : arbitros) {
            arbitro.limparValoresAcumulados();
        }
        for (Clube clube : clubes) {
            clube.limparValoresAcumulados();
        }
        for (Jogador jogador : jogadores) {
            jogador.limparValoresAcumulados();
        }
    }

    public static void main(String[] args) {
        LigaFutebol liga = new LigaFutebol();

        Arbitro arbitro1 = new Arbitro("Arbitro1", "Norte", "arbitro1@example.com", "123456789",
                "Cidade1", "Nacional", "Arbitro", 0, 3000.0);
        liga.adicionarArbitro(arbitro1);

        Clube clube1 = new Clube("Clube1", "Centro", "clube1@example.com", "987654321", "Cidade2", "Presidente1", "Geral");
        liga.adicionarClube(clube1);

        Jogador jogador1 = new Jogador("Jogador1", "Sul", "jogador1@example.com", "567890123", "Pais1", "Clube1", "Avançado", 1.85, 80, 4, 5000.0);
        liga.adicionarJogador(jogador1);

        liga.realizarJogos();
        liga.imprimirReceitas();

        liga.limparValoresAcumulados();
    }
}