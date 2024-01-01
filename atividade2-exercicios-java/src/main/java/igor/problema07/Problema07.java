package igor.problema07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Problema07 {
    public static void main(String[] args) throws IOException {
            //   Crie um programa que remova os elementos duplicados de um vetor
            //   sem alterar a ordem original.
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Random random = new Random();
        // define o numero de elementos do vetor
        int n = 101;
        int quant = 0;
        int[] elementos = new int[n], unicos = new int[n];

        // popula o vetor com numeros aleatorios de 0 ate n
        for (int i = 0; i < n ; i++){
            elementos[i] = random.nextInt(0, n);
        }

        printVetor(elementos);

        // para os elementos do vetor
        for (int i = 0; i < elementos.length; i++){
            boolean existe = false;
            // percorre o vetor de unicos
            for(int j = 0; j < quant; j++){
                if(unicos[j] == elementos[i]){
                    existe = true;
                    break;
                }
            }

            // se nao existir repetidos, adiciona no vetor de unicos
            if (!existe){
                unicos[quant++] = elementos[i];
            }
        }

        // copia o vetor de unicos para o de elementos
        elementos = Arrays.copyOf(unicos, quant);

        printVetor(elementos);

    }



    public static void printVetor(int[] vetor){
        for (int n: vetor) {
            System.out.print( n + " - ");
        }
        System.out.println();
    }



}
