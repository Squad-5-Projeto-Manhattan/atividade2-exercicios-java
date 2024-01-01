package thalison.problema09;

import java.util.Scanner;

public class problema9 {

    public static void main(String[] args) {
        //

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe quantidade de números inteiros");
        int qtdInformada = scanner.nextInt();

        int [] vetor = new int[qtdInformada];

        for (int i = 0; i <= qtdInformada; i++) {
            if (i <= qtdInformada){
                vetor[i] = scanner.nextInt();
            }
        }

        int resultVerificao = verificaNumero(vetor, qtdInformada);

        System.out.printf("O número menos frequente é:" + resultVerificao);
    }

        public static int verificaNumero(int [] vetor, int qtdInformada){

        int [] contVet = new int[10];

        for (Integer numero : vetor) {
            contVet[numero]++;
        }

        int menosFrequente = vetor[0];

        for (int numero : vetor) {
                if (contVet[numero] < contVet[menosFrequente]) {
                    menosFrequente = numero;
                }
            }
            return menosFrequente;
        }
    }


