package problema29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Problema29 {
    public static void main(String[] args) throws IOException {
//        Implemente um programa que calcule a média ponderada de uma
//        lista de notas, onde os pesos são gerados aleatoriamente.
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Random random = new Random();
        int n;
        double somaPesos = 0,somaNotasComPeso = 0;

        String[] valoresDigitados;

        System.out.println("Digite a quantidade de notas a serem lidas:");
        n = Integer.parseInt(bf.readLine());

        double[] notas= new double[n];

        System.out.println("Digite a lista de notas:");
        valoresDigitados = bf.readLine().split("\\s+");

        int i =0;
        for (String x: valoresDigitados) {
            if (i < n){
                try {
                    notas[i] = Double.parseDouble(x);
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("Valor " + x + " invalido, desconsiderado");
                }
            }
            i++;
        }


        double notaComPeso = 0;
        double peso = 0;
        for (double x: notas) {
            peso = random.nextInt(1, n);
            notaComPeso = x * peso;
            somaNotasComPeso += notaComPeso;
            somaPesos += peso;
            System.out.println("Nota: " + x + " | Peso: " + peso);
        }

        System.out.println("Media ponderada: " + somaNotasComPeso / somaPesos);


    }
}
