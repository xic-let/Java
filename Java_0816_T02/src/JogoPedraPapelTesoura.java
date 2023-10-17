import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class JogoPedraPapelTesoura extends JFrame {
    private JLabel resultadoLabel;
    private JLabel placarLabel;
    private JButton jogarButton;
    private JButton resetButton;
    private JRadioButton pedraRadio;
    private JRadioButton papelRadio;
    private JRadioButton tesouraRadio;

    private int vitoriasJogador;
    private int vitoriasComputador;

    public JogoPedraPapelTesoura() {
        setTitle("Jogo Pedra, Papel, Tesoura");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        resultadoLabel = new JLabel("Escolha uma opção.");
        placarLabel = new JLabel("Jogador: 0 | Computador: 0");
        jogarButton = new JButton("Jogar");
        resetButton = new JButton("Reset");
        pedraRadio = new JRadioButton("Pedra");
        papelRadio = new JRadioButton("Papel");
        tesouraRadio = new JRadioButton("Tesoura");

        ButtonGroup grupoOpcoes = new ButtonGroup();
        grupoOpcoes.add(pedraRadio);
        grupoOpcoes.add(papelRadio);
        grupoOpcoes.add(tesouraRadio);

        add(resultadoLabel);
        add(placarLabel);
        add(jogarButton);
        add(resetButton);
        add(pedraRadio);
        add(papelRadio);
        add(tesouraRadio);

        jogarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jogar();
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vitoriasJogador = 0;
                vitoriasComputador = 0;
                atualizarPlacar();
            }
        });
    }

    private void jogar() {
        if (pedraRadio.isSelected() || papelRadio.isSelected() || tesouraRadio.isSelected()) {
            String[] opcoes = {"Pedra", "Papel", "Tesoura"};
            Random random = new Random();
            int escolhaComputador = random.nextInt(3);
            String escolhaJogador = pedraRadio.isSelected() ? "Pedra" : papelRadio.isSelected() ? "Papel" : "Tesoura";

            String escolhaComputadorStr = opcoes[escolhaComputador];

            if (escolhaJogador.equals(escolhaComputadorStr)) {
                resultadoLabel.setText("Empate! Ambos escolheram " + escolhaJogador + ".");
            } else if ((escolhaJogador.equals("Pedra") && escolhaComputadorStr.equals("Tesoura")) ||
                    (escolhaJogador.equals("Tesoura") && escolhaComputadorStr.equals("Papel")) ||
                    (escolhaJogador.equals("Papel") && escolhaComputadorStr.equals("Pedra"))) {
                resultadoLabel.setText("Jogador vence! " + escolhaJogador + " vence " + escolhaComputadorStr + ".");
                vitoriasJogador++;
            } else {
                resultadoLabel.setText("Computador vence! " + escolhaComputadorStr + " vence " + escolhaJogador + ".");
                vitoriasComputador++;
            }

            atualizarPlacar();
        } else {
            resultadoLabel.setText("Escolha uma opção antes de jogar.");
        }
    }

    private void atualizarPlacar() {
        placarLabel.setText("Jogador: " + vitoriasJogador + " | Computador: " + vitoriasComputador);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JogoPedraPapelTesoura jogo = new JogoPedraPapelTesoura();
                jogo.setVisible(true);
            }
        });
    }
}
