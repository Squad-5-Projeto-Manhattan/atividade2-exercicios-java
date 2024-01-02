import java.util.Scanner;

public class CoeficienteBinomial {

    // função para calcular o fatorial de um número
    public static long calcularFatorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            return numero * calcularFatorial(numero - 1);
        }
    }

    // função para calcular o coeficiente binomial C(n, k)
    public static long coeficienteBinomial(int n, int k) {
        if (k < 0 || k > n) {
            return 0; // retorna 0 para valores inválidos de k
        }

        long numerador = calcularFatorial(n);
        long denominador = calcularFatorial(k) * calcularFatorial(n - k);

        return numerador / denominador;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // solicita ao usuário os valores de n e k
        System.out.print("Digite o valor de n: ");
        int n = scanner.nextInt();

        System.out.print("Digite o valor de k: ");
        int k = scanner.nextInt();

        // calcula e exibe o coeficiente binomial
        long resultado = coeficienteBinomial(n, k);
        System.out.println("O coeficiente binomial C(" + n + ", " + k + ") é: " + resultado);

        scanner.close();
    }
}
