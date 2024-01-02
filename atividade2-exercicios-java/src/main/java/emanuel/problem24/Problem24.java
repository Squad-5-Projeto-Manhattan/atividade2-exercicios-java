package emanuel.problem24;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> oddNumbers = new ArrayList<>();
        double sumOfSquares = 0.0;

        System.out.println("Informe uma lista de números. Após cada número, pressione ENTER. Para encerrar a lista, informe 0 (zero) na última posição:");

        // Loop para continuar a leitura até que seja inserido '0'
        while (true) {
            // Verifica se há uma linha disponível para leitura
            if (scanner.hasNextLine()) {
                // Lê a linha e remove espaços em branco antes e depois
                String line = scanner.nextLine().trim();

                // Se a linha for '0', encerra o loop
                if (line.equals("0")) {
                    break;
                }

                // Divide a linha em valores usando espaços em branco como delimitadores
                String[] inputValues = line.split("\\s+");

                // Itera sobre os valores da linha
                for (String value : inputValues) {
                    try {
                        // Tenta converter o valor para um número inteiro
                        int number = Integer.parseInt(value);

                        // Verifica se o número é ímpar
                        if (number % 2 == 1) {
                            // Adiciona o número ímpar à lista e adiciona seu quadrado à soma total
                            oddNumbers.add(number);
                            sumOfSquares += Math.pow(number, 2);
                        }
                    } catch (NumberFormatException ignored) {
                        // Captura exceção se o valor não puder ser convertido para um número inteiro
                        System.out.println("Valor inválido - " + value + ". Ignorado.");
                    }
                }
            }
        }

        // Exibe os números ímpares encontrados na lista
        System.out.println("Números ímpares encontrados na lista: " + oddNumbers);

        // Exibe o resultado da soma dos quadrados dos números ímpares informados
        System.out.println("Resultado da soma dos quadrados de cada elemento ímpar informado: " + sumOfSquares);

        // Fecha o scanner para evitar vazamento de recursos
        scanner.close();
    }
}