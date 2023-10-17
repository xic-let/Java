import javax.swing.*;
import java.text.DecimalFormat;

public class Animais {

    private String Nome;
    private String Cor;
    private String Ambiente;
    private float Comprimento;
    private float Velocidade;
    private int Patas;

    //construtor
    public Animais(String Nome, String Cor, String Ambiente, float Comprimento, float Velocidade, int Patas){
        this.Nome = Nome;
        this.Cor = Cor;
        this.Ambiente = Ambiente;
        this.Comprimento = Comprimento;
        this.Velocidade = Velocidade;
        this.Patas = Patas;
    }

    //metodo para mostrar dados
    public void DadosAnimal(){
        DecimalFormat Ft1 = new DecimalFormat("0,00cm");
        DecimalFormat Ft2 = new DecimalFormat("0,00ms");
        JOptionPane.showMessageDialog(null, " Nome: " + this.getNome() +
                "\nCor:" +this.getCor() +
                "\nAmbiente:" +this.getAmbiente() +
                "\nComprimento:" + Ft1.format(this.getComprimento()) +
                "\nVelocidade:" + Ft2.format(this.getVelocidade()) +
                "\nPatas:" +this.getPatas(), "Classe Animais", JOptionPane.INFORMATION_MESSAGE)
                ;
    }
    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String cor) {
        Cor = cor;
    }

    public String getAmbiente() {
        return Ambiente;
    }

    public void setAmbiente(String ambiente) {
        Ambiente = ambiente;
    }

    public float getComprimento() {
        return Comprimento;
    }

    public void setComprimento(float comprimento) {
        Comprimento = comprimento;
    }

    public float getVelocidade() {
        return Velocidade;
    }

    public void setVelocidade(float velocidade) {
        Velocidade = velocidade;
    }

    public int getPatas() {
        return Patas;
    }

    public void setPatas(int patas) {
        Patas = patas;
    }
}
