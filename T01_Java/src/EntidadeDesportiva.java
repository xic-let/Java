import java.util.ArrayList;
import java.util.List;

class Entidade {
    private String nome;
    private String areaGeografica;
    private String contacto;
    private String NIF;

    public Entidade(String nome, String areaGeografica, String contacto, String NIF) {
        this.nome = nome;
        this.areaGeografica = areaGeografica;
        this.contacto = contacto;
        this.NIF = NIF;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAreaGeografica() {
        return areaGeografica;
    }

    public void setAreaGeografica(String areaGeografica) {
        this.areaGeografica = areaGeografica;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }
}
