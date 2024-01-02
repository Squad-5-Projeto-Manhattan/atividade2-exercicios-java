package emanuel.problem27;

import java.util.Scanner;

public class Problem27 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = 0;

        System.out.println("Digite um número: ");
        try {
            number = scanner.nextInt();
        } catch (Exception e) {
            // Trata exceção caso a entrada não seja um número inteiro
            System.out.println("Valor de entrada inválido");
            scanner.close();
            return;
        }

        // Verifica se o número fornecido é válido (maior que 1)
        if (number <= 1) {
            System.out.println("O número fornecido deve ser maior que 1.");
        } else {
            // Chama a função para encontrar o maior número primo antes do limite informado
            int lastPrime = findLastPrime(number);

            // Exibe o resultado ao usuário
            System.out.println("O maior número primo antes do limite informado é: " + lastPrime);
        }

        // Fecha o Scanner para evitar vazamento de recursos
        scanner.close();
    }

    // Verifica se um número é primo
    static boolean isPrime(int num) {
        // Verifica se o número é menor ou igual a 1 (não é primo)
        if (num <= 1) {
            return false;
        }

        // Verifica se o número é divisível por algum inteiro de 2 até a raiz quadrada do número
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Não é primo se for divisível por algum número
            }
        }
        return true; // É primo se não foi divisível por nenhum número
    }

    // Encontra o maior número primo antes do limite informado
    static int findLastPrime(int limit) {
        // Percorre os números a partir do limite - 1 até 2 para encontrar o maior número primo
        for (int i = limit - 1; i > 1; i--) {
            if (isPrime(i)) {
                return i; // Retorna o primeiro número primo encontrado
            }
        }
        return 0; // Se nenhum primo for encontrado, retorna 0
    }
}
