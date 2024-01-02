package igor.iproblema11;

import java.util.Scanner;

public class IProblema11 {
    public static void main(String[] args) {
//        Desenvolva um programa que calcule a série harmônica de um
//        número

        // https://pt.wikipedia.org/wiki/S%C3%A9rie_harm%C3%B3nica_(matem%C3%A1tica)
        // https://acervolima.com/programa-java-para-gerar-series-harmonicas/

        // num é o valor que sera usado no calculo da serie
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o numero: ");

        int num = in.nextInt();
        double result = 0.0;

        System.out.println("The harmonic series is: ");

        //  imprimindo a série harmônica até o valor num
        for (int i = num; i > 0; i--) {

            // calculating harmonic values
            result +=  (double)1 / i;

            System.out.print(result + ", ");
        }

    }
}
