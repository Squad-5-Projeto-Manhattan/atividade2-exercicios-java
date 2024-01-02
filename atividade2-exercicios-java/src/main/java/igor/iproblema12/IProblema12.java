package igor.iproblema12;

import java.util.Scanner;

public class IProblema12 {
    public static void main(String[] args) {
//        implemente um programa que calcule o n-ésimo termo de uma
//        sequência de Fibonacci.

        // https://wagnergaspar.com/como-calcular-o-enesimo-termo-da-sequencia-de-fibonacci-com-recursao/
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um termo: ");
        int nesimoTermo = sc.nextInt();


        // calcula o termo utilzando recursividade
        System.out.println("O termo de fibonnaci é : " + fibonnaci(nesimoTermo));


    }

    public static int fibonnaci(int n){
        if(n == 1){
            return 0;
        } else {
            if(n==2){
                return 1;
            } else {
                return fibonnaci(n -1) + fibonnaci(n -2);
            }
        }
    }


}
