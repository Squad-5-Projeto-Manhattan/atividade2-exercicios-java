package thalison.problema11;

import java.util.Scanner;

public class problema11 {

    public static void main(String[] args) {

        int numeroInformadoU;
        double resultado;
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Informe um número ");
        numeroInformadoU = scanner.nextInt();

        resultado =  sHarmonica(numeroInformadoU);

        System.out.println("RESULTADO SÉRIE HARMONICA");
        System.out.printf(String.valueOf(resultado));


    }

    // Vídeo aula que foi utilizado para compreender  https://www.youtube.com/watch?v=m2Vwra7PWPo
    public static double sHarmonica(int n){
        double CalcSoma = 0.0;

        for (int i = 1 ; i <= n; i++) {
            CalcSoma+= 1.0 / i;
        }
        return CalcSoma;
    }
}

