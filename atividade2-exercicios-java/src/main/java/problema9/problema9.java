package problema9;

import java.util.Arrays;
import java.util.Scanner;

public class problema9 {

    public static void main(String[] args) {
        //

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe quantidade de números inteiros");
        int qtdInformada = scanner.nextInt();

        int [] vetor = new int[qtdInformada];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {

            System.out.println(Arrays.stream(vetor).iterator());

        }

    }
}

