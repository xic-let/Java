// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class TesteVeiculos {
    public static void main(String[] args) {
        // 4.1 - Criar um objeto jipe do tipo Veiculo
        Veiculo jipe = new Veiculo("Range Rover", "XPTO 20", 2000, 20000.0, "Gasóleo", 240);
        System.out.println("Dados do Jipe:");
        jipe.dados();
        System.out.println();

        // 4.2 - Criar um objeto bolide do tipo Carro
        Carro bolide = new Carro("Honda", "Civic", 2004, 15000.0, "Gasolina", 200, 5);
        System.out.println("Dados do Carro (Bolide):");
        bolide.dados();
        System.out.println();

        // 4.3 - Criar um objeto voar do tipo Aviao
        Aviao voar = new Aviao("Boing", "777", 2004, 400000.0, "Jet Fuel", 950, "Fixa");
        System.out.println("Dados do Avião (Voar):");
        voar.dados();
        System.out.println();

        //4.4 - Criar um objeto veiculo favorito

        Carro preferido = new Carro("Tesla", "Model3", 2020, 45000.0, "Eléctrico", 240, 5);
        System.out.println("Dados do Carro (preferido):");
        preferido.dados();
        System.out.println();

        }
    }
