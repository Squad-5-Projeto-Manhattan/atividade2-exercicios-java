package problema1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema01 {
    public static void main(String[] args) throws IOException {
        // Desenvolva um programa que calcule o coeficiente binomial de dois  números inteiros.
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int a, b;

        System.out.println("Digite dois numeros inteiros: ");

        String[] numeros = bf.readLine().split(" ");

        a = Integer.parseInt(numeros[0]);
        b = Integer.parseInt(numeros[1]);

        System.out.println(a);

        long C = binomio(a, b);

        System.out.println(C);

    }

    // formula utilizada encontrada neste site
    // https://miniwebtool.com/br/binomial-coefficient-calculator/?n=9&k=3

    static long binomio(int n, int k) {
        if ((n == k) || (k == 0))
            return 1;
        else
            return binomio(n - 1, k) + binomio(n - 1, k - 1);
    }
}
