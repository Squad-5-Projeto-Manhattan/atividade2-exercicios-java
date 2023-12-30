package problema1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema01 {
    public static void main(String[] args) throws IOException {
        // Desenvolva um programa que calcule o coeficiente binomial de dois  números inteiros.
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n, p;
        long c = 0L;


        System.out.println("--- Calculador de coeficiente binomial ---");
        System.out.println("Digite dois numeros inteiros( n & p ): ");

        String[] numeros = bf.readLine().split(" ");

        n = Integer.parseInt(numeros[0]);
        p = Integer.parseInt(numeros[1]);



        // verificando se os numeros não sao naturais
        if(n >= 0 && 0 <= p) {

            // se forem naturais, verifica se n é maior que p
            if(n >= p) {
                c = binomio(n, p);

                // exibe o resultado
                System.out.println("Resultado: " + c);

            } else {
                System.out.println("O numero n deve ser maior que p!");
            }

        } else {
            System.out.println("Os numeros devem ser naturais n diferente de 0");
        }



    }

    // formula utilizada encontrada neste site
    // https://miniwebtool.com/br/binomial-coefficient-calculator/?n=9&k=3

    static long binomio(int n, int p) {
        if ((n == p) || (p == 0))
            return 1;
        else
            // chamada recursiva para o calculo fatorial dos termos
            return binomio(n - 1, p) + binomio(n - 1, p - 1);
    }
}
