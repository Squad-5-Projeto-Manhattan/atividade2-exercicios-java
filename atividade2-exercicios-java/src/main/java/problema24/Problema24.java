package problema24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problema24 {
    public static void main(String[] args) throws IOException {
//        .Implemente um programa que calcule a soma dos quadrados dos
//        números ímpares.

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> numeros = new ArrayList<>();
        List<Integer> numerosImpares = new ArrayList<>();
        double somaQuadrados = 0.0;

        // recebe os valores digitados em um array de strings
        System.out.println("Digite uma lista de numeros");
        String[] valoresDigitados = bf.readLine().split("\\s+");

        // percorre o vetor digitado
        for (String x: valoresDigitados) {
            try {
                // e tenta converter a string para um valor inteiro, para dentro de uma lista
                numeros.add(Integer.parseInt(x));
            } catch (NumberFormatException valorInvalidoParaConversao){
                System.out.println("Valor " + x + " invalido. Desconsiderado");
            }
        }

        // percorre a lista dos numeros considerados
        for (int n: numeros) {
            // verifica se é um numero impar
            if(n % 2 == 1) {
                // se for, salva o numero para uma nova lista e adiciona seu quadrado a soma total
                numerosImpares.add(n);
                somaQuadrados += Math.pow(n, 2);
            }
        }


        System.out.println("Numeros impares considerados: " + numerosImpares);
        System.out.println("Soma dos quadrados dos numeros impares digitados: " + somaQuadrados);


    }
}