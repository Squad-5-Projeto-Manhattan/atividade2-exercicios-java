package melissa;

import java.util.Scanner;

public class Problema19 {
    // QuadradoMagico

    // função para verificar se uma matriz é um quadrado mágico
    public static boolean isQuadradoMagico(int[][] matriz) {
        int tamanho = matriz.length;

        // calcula a soma esperada (a soma de uma linha, coluna ou diagonal)
        int somaEsperada = 0;
        for (int i = 0; i < tamanho; i++) {
            somaEsperada += matriz[0][i];
        }

        // verifica as somas das linhas
        for (int i = 1; i < tamanho; i++) {
            int somaLinha = 0;
            for (int j = 0; j < tamanho; j++) {
                somaLinha += matriz[i][j];
            }
            if (somaLinha != somaEsperada) {
                return false;
            }
        }

        // verifica as somas das colunas
        for (int j = 0; j < tamanho; j++) {
            int somaColuna = 0;
            for (int i = 0; i < tamanho; i++) {
                somaColuna += matriz[i][j];
            }
            if (somaColuna != somaEsperada) {
                return false;
            }
        }

        // verifica a soma da diagonal principal
        int somaDiagonalPrincipal = 0;
        for (int i = 0; i < tamanho; i++) {
            somaDiagonalPrincipal += matriz[i][i];
        }
        if (somaDiagonalPrincipal != somaEsperada) {
            return false;
        }

        // verifica a soma da diagonal secundária
        int somaDiagonalSecundaria = 0;
        for (int i = 0; i < tamanho; i++) {
            somaDiagonalSecundaria += matriz[i][tamanho - 1 - i];
        }
        return somaDiagonalSecundaria == somaEsperada;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // solicita ao usuário o tamanho da matriz
        System.out.print("Digite o tamanho da matriz (n x n): ");
        int tamanho = scanner.nextInt();

        // solicita ao usuário os elementos da matriz
        int[][] matriz = new int[tamanho][tamanho];
        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // verifica se a matriz é um quadrado mágico e exibe o resultado
        if (isQuadradoMagico(matriz)) {
            System.out.println("A matriz é um quadrado mágico!");
        } else {
            System.out.println("A matriz não é um quadrado mágico.");
        }

        scanner.close();
    }
}
