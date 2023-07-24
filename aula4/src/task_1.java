
//Construir um programa em Java que gere aleatoriamente
// valores entre 0 e 100 para dois vetores (A e B) de 10 elementos cada
// e crie um 3o. vetor acumulando a soma dos elementos desses dois vetores.
// Mostre os valores dos vetores.

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Random;

import static javax.swing.JOptionPane.showMessageDialog;

public class task_1 {

    public static void main(String[] args) {
        int[] v1=new int[15];
        int[] v2=new int[15];
        int[] vsoma=new int[15];

        Random Aleatorio=new Random();

            for (int i = 0; i < 15; i++){
                v1[i] = Aleatorio.nextInt(101);
                v2[i] = Aleatorio.nextInt(101);
                vsoma[i] = v1[i] + v2[i];
                System.out.print("vector A é :" + v1[i]+" vector b é :"+ v2[i]+ "e a soma dos 2 é: " + vsoma[i] + "\n");
            }
            System.out.println();
        }
    }

