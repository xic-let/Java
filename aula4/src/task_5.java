//Criar um programa para gerar 50 números (entre 0 e 30) e mostrá-los na ordem inversa de leitura,
// ou seja, o último número lido deve ser o primeiro a ser apresentado.


import java.util.Random;

public class task_5 {

    public static void main(String[] args) {
        int[] numeros = new int[50];


        Random random = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(31);
        }


        System.out.println("Números gerados na ordem inversa:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }

}
