package emanuel.problem25;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Long> catalanNumbers = new ArrayList<>();

        System.out.println("Digite um número para testar se ele é um número de Catalan: ");
        String[] inputValues = scanner.nextLine().split("\\s+");

        Long targetNumber = -1L;

        try {
            targetNumber = Long.parseLong(inputValues[0]);
        } catch (NumberFormatException e) {
            System.out.println("Valor " + inputValues[0] + " inválido. Deve ser um número natural!");
        }

        if (targetNumber >= 0) {
            catalanNumbers = generateCatalanNumbers(targetNumber);
        } else {
            System.out.println("Número inválido. Deve ser maior ou igual a 0!");
            System.out.println("Valor considerado: " + targetNumber);
        }

        System.out.println(catalanNumbers);
        if (catalanNumbers.contains(targetNumber)) {
            System.out.println("O número digitado é um número de Catalan!");
        } else {
            System.out.println("Não é um número de Catalan!");
        }

        scanner.close();
    }

    /**
     * Gera os números de Catalan até o número considerado.
     *
     * @param targetNumber O número até o qual gerar os números de Catalan.
     * @return Lista dos números de Catalan gerados.
     */
    private static List<Long> generateCatalanNumbers(Long targetNumber) {
        List<Long> catalanNumberList = new ArrayList<>();
        long catalanNumber = 0L;
        long i = 0L;
        long binomialCoefficient = 0;
        double term = 0;

        do {
            // Cálculo do coeficiente binomial e termo
            binomialCoefficient = binomio(i * 2, i);
            term = (double) 1 / (i + 1);

            // Cálculo do número de Catalan
            catalanNumber = (long) (term * binomialCoefficient);

            // Adiciona o número de Catalan à lista
            catalanNumberList.add(catalanNumber);
            i++;
        } while (catalanNumber < targetNumber);

        return catalanNumberList;
    }

    /**
     * Calcula o coeficiente binomial C(n, p).
     *
     * @param n O valor total.
     * @param p O valor parcial.
     * @return O coeficiente binomial.
     */
    static long binomio(long n, long p) {
        if ((n == p) || (p == 0))
            return 1;
        else
            return binomio(n - 1, p) + binomio(n - 1, p - 1);
    }
}
