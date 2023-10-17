import java.util.Scanner;

/*Exercício 4
Crie uma função em Java que, a partir de um texto digitado pelo utilizador, conte o número de palavras
(palavra é definida por qualquer sequência de caracteres delimitada por espaços em branco) e mostre o resultado.*/
public class T4 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o texto: ");
        String texto = ler.nextLine();
        ler.close();

        int numeroPalavras = contarPalavras(texto);
        System.out.println("Número de palavras: " + numeroPalavras);
    }

    public static int contarPalavras(String texto) {
        String[] palavras = texto.split("\\s+");
        return palavras.length;
    }

}
