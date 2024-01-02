package melissa;

import java.util.Scanner;

public class Problema18 {
    // SomaAlgarismosPrimos
    // função para verificar se um número é primo
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // função para calcular a soma dos algarismos primos de um número
    public static int somaAlgarismosPrimos(int num) {
        int sum = 0;

        // loop para iterar sobre cada dígito do número
        while (num > 0) {
            int digit = num % 10;  // Obtém o último dígito
            if (isPrime(digit)) {
                sum += digit;  // Adiciona o dígito primo à soma
            }
            num /= 10;  // Remove o último dígito do número
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // solicita o número ao usuário
        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        // verifica se o número é negativo ou zero
        if (numero <= 0) {
            System.out.println("Por favor, digite um número inteiro positivo.");
        } else {
            // calcula a soma dos algarismos primos e exibe o resultado
            int resultado = somaAlgarismosPrimos(numero);
            System.out.println("A soma dos algarismos primos de " + numero + " é: " + resultado);
        }

        scanner.close();
    }
}
