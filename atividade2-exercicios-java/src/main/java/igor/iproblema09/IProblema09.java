package igor.iproblema09;

import java.util.Arrays;
import java.util.Random;

public class IProblema09 {
    public static void main(String[] args) {
//        Implemente um programa que encontre o número menos frequente
//        em um vetor.
        int n = 20, valorMenorFrequencia = -1, frequencia = -1;
        int[] vetor = new int[n];
        Random random = new Random();

        for(int i =0; i < n; i ++){
            vetor[i] = random.nextInt(0, 5);
        }

        System.out.println(Arrays.toString(vetor));
        // pior das hipoteses, o vetor[n] tera no maximo, um valor com n repetições
        frequencia = vetor.length;

        // percorre os elementos do vetor
        for (int x: vetor) {
            // declara o contador auxiliar
            int aux = 0;
            // percorre o vetor do inicio
            for (int i = 0; i < n; i ++){
                // compara para ver se ele é igual ao elemento atual
                if(vetor[i] == x){
                    // se for, incrementa o contador
                    aux++;
                }
            }

            // se o contador for menor ou igual a frequencia
            // se for a primeira interação, ira considerar o primeiro elemento como o menor
            if(aux <= frequencia){
                valorMenorFrequencia = x;
                frequencia = aux;
            }
        }

        System.out.println("O valor com a menor frequencia no vetor é : " + valorMenorFrequencia);
        System.out.println("Com " + frequencia + " repetições");

    }
}
