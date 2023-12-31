package thalison.problema12;

import java.util.Scanner;

public class problema12 {

    public static void main(String[] args) {

        double numeroInf, formula;
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Informa o n-ésimo termo da sequência FIBONACI");
        numeroInf = scanner.nextDouble();

        //Metodo da formula adicionando o resultado na variável
        formula = formunaFibonacci(numeroInf);

        //O método valueOf é um método estático que recebe um argumento de qualquer tipo e o converte em um objeto String, que pode ser então processado por métodos como print
        System.out.printf(String.valueOf(formula));

        scanner.close();

    }


    //Aula que encontrei a formula geral https://www.youtube.com/watch?v=rF4VGqwSTLc
    public static double formunaFibonacci(double n){
        double a = (1 + Math.sqrt(5)) / 2;
        double b = (1 - Math.sqrt(5)) / 2;
        double resulFormula = ((Math.pow(a, n) - Math.pow( b, n))  * (1 / Math.sqrt(5)));
        return resulFormula;
    }

}



