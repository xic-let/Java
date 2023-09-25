import java.util.ArrayList;
import java.util.Iterator;

public class Dados {
    private ArrayList<Viatura> viaturas;

    public Dados() {
        this.viaturas = new ArrayList<>();
    }

    // Método para adicionar viatura (não permite matrículas repetidas)
    public boolean adicionarViatura(Viatura viatura) {
        String matricula = viatura.getMatricula();

        // Verifica se a matrícula já existe
        for (Viatura v : viaturas) {
            if (v.getMatricula().equals(matricula)) {
                return false; // Matrícula repetida, não adiciona
            }
        }

        viaturas.add(viatura);
        return true; // Viatura adicionada com sucesso
    }

    // Método para remover viatura por matrícula
    public boolean removerViatura(String matricula) {
        Iterator<Viatura> iterator = viaturas.iterator();
        while (iterator.hasNext()) {
            Viatura viatura = iterator.next();
            if (viatura.getMatricula().equals(matricula)) {
                iterator.remove(); // Remove a viatura com a matrícula correspondente
                return true;
            }
        }
        return false; // Viatura não encontrada
    }

    // Método para listar todas as viaturas
    public ArrayList<Viatura> getViaturas() {
        return viaturas;
    }

    // Método para listar viaturas por marca
    public ArrayList<Viatura> getViaturasPorMarca(String marca) {
        ArrayList<Viatura> viaturasPorMarca = new ArrayList<>();
        for (Viatura viatura : viaturas) {
            if (viatura.getMarca().equalsIgnoreCase(marca)) {
                viaturasPorMarca.add(viatura);
            }
        }
        return viaturasPorMarca;
    }

    // Método para calcular o total do campo Preço de todas as viaturas
    public float calcularTotalPreco() {
        float totalPreco = 0;
        for (Viatura viatura : viaturas) {
            totalPreco += viatura.getPreco();
        }
        return totalPreco;
    }
}
