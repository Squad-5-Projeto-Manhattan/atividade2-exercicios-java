import java.util.Scanner;

public class NumeroTriangularCentrado {

    // função para verificar se um número é um quadrado perfeito
    public static boolean isQuadradoPerfeito(int num) {
        int raizQuadrada = (int) Math.sqrt(num);
        return raizQuadrada * raizQuadrada == num;
    }

    // função para verificar se um número é um número triangular centrado
    public static boolean isNumeroTriangularCentrado(int num) {
        // a fórmula para um número triangular centrado
        // é T(n) = n * (n + 1) * (2n + 1) / 6
        // vamos verificar se o número é triangular e centrado
        int n = (int) Math.round(Math.cbrt(num * 6)); // A inversa da fórmula

        return n * (n + 1) * (2 * n + 1) == num * 6;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // solicita ao usuário um número para verificar se é triangular centrado
        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        // verifica se o número é um número triangular centrado
        if (numero > 0 && isQuadradoPerfeito(8 * numero + 1) && isNumeroTriangularCentrado(numero)) {
            System.out.println(numero + " é um número triangular centrado.");
        } else {
            System.out.println(numero + " não é um número triangular centrado.");
        }

        scanner.close();
    }
}
