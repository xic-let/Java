import java.text.DecimalFormat;

public class Funcionario {
    private String nome;
    private String contatoMovel;
    private String email;

    public Funcionario(String nome, String contatoMovel, String email) {
        this.nome = nome;
        this.contatoMovel = contatoMovel;
        this.email = email;
    }

    // Getters e Setters para os atributos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContatoMovel() {
        return contatoMovel;
    }

    public void setContatoMovel(String contatoMovel) {
        this.contatoMovel = contatoMovel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Método para imprimir o salário (a ser sobrescrito pelas subclasses)
    public void imprimirSalario() {
        System.out.println("Salário: Não especificado");
    }
}
