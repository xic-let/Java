import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraDeHorarioVooGUI {
public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {
            criarGUI();
        }
    });
}

private static void criarGUI() {
    JFrame frame = new JFrame("Calculadora de Horário de Voo");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 200);

    JPanel panel = new JPanel();
    panel.setLayout(new BorderLayout());

    JPanel entradaPanel = new JPanel();
    entradaPanel.setLayout(new GridLayout(2, 2));

    JPanel calculoPanel = new JPanel();
    calculoPanel.setLayout(new FlowLayout());

    JLabel labelHoraPartida = new JLabel("Hora de Partida (0-23):");
    JTextField campoHoraPartida = new JTextField(10);
    JLabel labelMinutosPartida = new JLabel("Minutos de Partida (0-59):");
    JTextField campoMinutosPartida = new JTextField(10);
    JLabel labelDuracaoHoras = new JLabel("Duração do Voo (horas):");
    JTextField campoDuracaoHoras = new JTextField(10);
    JLabel labelDuracaoMinutos = new JLabel("Duração do Voo (minutos):");
    JTextField campoDuracaoMinutos = new JTextField(10);

    JButton calcularButton = new JButton("Calcular");
    JButton limparButton = new JButton("Limpar");

    JLabel resultadoLabel = new JLabel("Hora de Chegada:");
    JTextField resultadoCampo = new JTextField(15);
    resultadoCampo.setEditable(false);

    entradaPanel.add(labelHoraPartida);
    entradaPanel.add(campoHoraPartida);
    entradaPanel.add(labelMinutosPartida);
    entradaPanel.add(campoMinutosPartida);
    entradaPanel.add(labelDuracaoHoras);
    entradaPanel.add(campoDuracaoHoras);
    entradaPanel.add(labelDuracaoMinutos);
    entradaPanel.add(campoDuracaoMinutos);

    calculoPanel.add(calcularButton);
    calculoPanel.add(limparButton);
    calculoPanel.add(resultadoLabel);
    calculoPanel.add(resultadoCampo);


    calcularButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
    int horaPartida = Integer.parseInt(campoHoraPartida.getText());
    int minutosPartida = Integer.parseInt(campoMinutosPartida.getText());
    int duracaoHoras = Integer.parseInt(campoDuracaoHoras.getText());
    int duracaoMinutos = Integer.parseInt(campoDuracaoMinutos.getText());

    int horaChegada = horaPartida + duracaoHoras;
    int minutosChegada = minutosPartida + duracaoMinutos;

    if (minutosChegada >= 60) {
        horaChegada += minutosChegada / 60;
        minutosChegada %= 60;
    }

    if (horaChegada > 23) {
        horaChegada %= 24;
    }

    String chegada = horaChegada + "h" + minutosChegada + "min";
    resultadoCampo.setText(chegada);

    if (horaChegada < horaPartida || (horaChegada == horaPartida && minutosChegada < minutosPartida)) {
        resultadoCampo.setText(chegada + " (Dia Seguinte)");
    } else {
        resultadoCampo.setText(chegada + " (Mesmo Dia)");
    }
}
});

    limparButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            campoHoraPartida.setText("");
            campoMinutosPartida.setText("");
            campoDuracaoHoras.setText("");
            campoDuracaoMinutos.setText("");
            resultadoCampo.setText("");
        }
    });

    panel.add(entradaPanel, BorderLayout.NORTH);
    panel.add(calculoPanel, BorderLayout.CENTER);

    frame.add(panel);
    frame.setVisible(true);
}
}
