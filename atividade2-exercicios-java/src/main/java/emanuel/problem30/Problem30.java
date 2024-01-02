package emanuel.problem30;

import java.io.IOException;
import java.util.Scanner;

public class Problem30 {
    public static void main(String[] args) throws IOException {
        /*
         * Para verificar se um número é feliz, você deve elevar ao quadrado cada dígito do número,
         * em seguida, você faz a soma desses resultados. O mesmo procedimento deve ser repetido com a soma resultante.
         * Se, após repetir o procedimento várias vezes, obtiver o valor 1, o número inicial é considerado feliz.
         * Por exemplo, 7 é um número feliz:
         * 7² = 49
         * 4² + 9² = 97
         * 9² + 7² = 130
         * 1² + 3² + 0² = 10
         * 1² + 0² = 1
         * Neste exemplo os números 49, 97, 130 e 10 também são felizes.
         */

        System.out.println("Digite um número para verificar se eh um numero feliz ou nao:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (isHappy(number))
            System.out.println("=D Eh um numero feliz!");
        else
            System.out.println(":( Não eh um numero feliz...");

        scanner.close();
    }

    static boolean isHappy(int n) {
        int slow, fast;

        // Inicializa slow e fast com n
        slow = fast = n;
        do {
            // Move o número slow em uma iteração
            slow = sumSquareDigits(slow);

            // Move o número fast em duas iterações
            fast = sumSquareDigits(sumSquareDigits(fast));

        } while (slow != fast);

        // Se os dois números se encontrarem em 1, então retorna verdade
        return (slow == 1);
    }

    static int sumSquareDigits(int n) {
        int sumSquares = 0;
        while (n != 0) {
            sumSquares += (n % 10) * (n % 10);
            n /= 10;
        }
        return sumSquares;
    }
}