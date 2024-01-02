package thalison.problema09;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class problema9 {

    public static void main(String[] args) {
        //

        Scanner scanner = new Scanner(System.in);



        System.out.printf("QUANTOS NÚMEROS DESEJA ADICIONAR:");
        int qtdNumero = scanner.nextInt();

        int [] vetorDeNumeros = new int[qtdNumero];

        for (int i = 0; i < qtdNumero; i++) {
            vetorDeNumeros[i] = scanner.nextInt();
        }

        int resultado = encontrarMenosFrequente(vetorDeNumeros);

        System.out.println("O número menos frequente no vetor é: " + resultado);
    }

    public static int encontrarMenosFrequente(int[] vetor) {
        // Use um HashMap para contar a frequência de cada elemento no vetor
        Map<Integer, Integer> contagemElementos = new HashMap<>();

        for (int elemento : vetor) {
            contagemElementos.put(elemento, contagemElementos.getOrDefault(elemento, 0) + 1);
        }

        // Encontre o elemento com a menor frequência
        int menosFrequente = Integer.MAX_VALUE;
        int menorContagem = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : contagemElementos.entrySet()) {
            int elemento = entry.getKey();
            int contagem = entry.getValue();

            if (contagem < menorContagem) {
                menosFrequente = elemento;
                menorContagem = contagem;
            }
        }

        return menosFrequente;
    }
    }


