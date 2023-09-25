import javax.swing.JOptionPane;

public class TestarViaturas {
    public static void main(String[] args) {
        Dados dados = new Dados();

        while (true) {
            // Mostrar um menu de opções
            String[] opcoes = {"Adicionar Viatura", "Remover Viatura", "Listar Viaturas", "Listar Viaturas por Marca", "Calcular Total de Preço", "Sair"};
            int escolha = JOptionPane.showOptionDialog(
                    null,
                    "Escolha uma opção:",
                    "Gestão de Viaturas",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcoes,
                    opcoes[0]);

            switch (escolha) {
                case 0: // Adicionar Viatura
                    adicionarViatura(dados);
                    break;
                case 1: // Remover Viatura
                    removerViatura(dados);
                    break;
                case 2: // Listar Viaturas
                    listarViaturas(dados);
                    break;
                case 3: // Listar Viaturas por Marca
                    listarViaturasPorMarca(dados);
                    break;
                case 4: // Calcular Total de Preço
                    calcularTotalPreco(dados);
                    break;
                case 5: // Sair
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }

    // Método para adicionar uma viatura com caixas de diálogo
    private static void adicionarViatura(Dados dados) {
        String marca = JOptionPane.showInputDialog("Marca:");
        String modelo = JOptionPane.showInputDialog("Modelo:");
        String matricula = JOptionPane.showInputDialog("Matrícula:");
        String combustivel = JOptionPane.showInputDialog("Combustível:");
        int kilometrosAtuais = Integer.parseInt(JOptionPane.showInputDialog("Kilómetros Atuais:"));
        float preco = Float.parseFloat(JOptionPane.showInputDialog("Preço:"));

        Viatura viatura = new Viatura(marca, modelo, matricula, combustivel, kilometrosAtuais, preco);

        if (dados.adicionarViatura(viatura)) {
            JOptionPane.showMessageDialog(null, "Viatura adicionada com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro: Matrícula repetida. A viatura não foi adicionada.");
        }
    }

    // Método para remover uma viatura com caixas de diálogo
    private static void removerViatura(Dados dados) {
        String matricula = JOptionPane.showInputDialog("Informe a matrícula da viatura a remover:");
        if (dados.removerViatura(matricula)) {
            JOptionPane.showMessageDialog(null, "Viatura removida com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro: Viatura não encontrada.");
        }
    }

    // Método para listar todas as viaturas com caixas de diálogo
    private static void listarViaturas(Dados dados) {
        String mensagem = "Lista de Viaturas:\n\n";
        for (Viatura viatura : dados.getViaturas()) {
            mensagem += "Matrícula: " + viatura.getMatricula() + "\n";
            mensagem += "Marca: " + viatura.getMarca() + "\n";
            mensagem += "Modelo: " + viatura.getModelo() + "\n";
            mensagem += "Combustível: " + viatura.getCombustivel() + "\n";
            mensagem += "Kilómetros Atuais: " + viatura.getKilometrosAtuais() + "\n";
            mensagem += "Preço: " + viatura.getPreco() + "€\n\n";
        }
        JOptionPane.showMessageDialog(null, mensagem);
    }

    // Método para listar viaturas por marca com caixas de diálogo
    private static void listarViaturasPorMarca(Dados dados) {
        String marca = JOptionPane.showInputDialog("Informe a marca para listar as viaturas:");
        String mensagem = "Viaturas da Marca " + marca + ":\n\n";
        for (Viatura viatura : dados.getViaturasPorMarca(marca)) {
            mensagem += "Matrícula: " + viatura.getMatricula() + "\n";
            mensagem += "Marca: " + viatura.getMarca() + "\n";
            mensagem += "Modelo: " + viatura.getModelo() + "\n";
            mensagem += "Combustível: " + viatura.getCombustivel() + "\n";
            mensagem += "Kilómetros Atuais: " + viatura.getKilometrosAtuais() + "\n";
            mensagem += "Preço: " + viatura.getPreco() + "€\n\n";
        }
        JOptionPane.showMessageDialog(null, mensagem);
    }

    // Método para calcular o total do campo Preço com caixas de diálogo
    private static void calcularTotalPreco(Dados dados) {
        float totalPreco = dados.calcularTotalPreco();
        JOptionPane.showMessageDialog(null, "Total do Preço de Todas as Viaturas: " + totalPreco + "€");
    }
}
