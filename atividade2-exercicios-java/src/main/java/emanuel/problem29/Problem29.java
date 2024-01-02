package emanuel.problem29;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem29 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> grades = new ArrayList<>();

        // Solicita ao usuário a quantidade de notas a serem inseridas
        System.out.println("Digite a quantidade de notas a serem inseridas:");
        int n = scanner.nextInt();

        // Solicita ao usuário a lista de notas separadas por espaço
        System.out.println("Digite a lista de notas separadas por espaço:");
        for (int i = 0; i < n; i++) {
            try {
                double grade = scanner.nextDouble();
                grades.add(grade);
            } catch (Exception e) {
                System.out.println("Valor inválido, desconsiderado");
                // Limpar o buffer do scanner após um erro
                scanner.nextLine();
                i--;
            }
        }

        double sumWeights = 0, sumWeightedGrades = 0;

        // Gera pesos aleatórios com duas casas decimais e calcula a média ponderada
        System.out.println("Notas e pesos gerados aleatoriamente:");
        for (double grade : grades) {
            double weight = generateRandomWeight(n);
            double weightedGrade = grade * weight;
            sumWeightedGrades += weightedGrade;
            sumWeights += weight;
            System.out.println(String.format("Nota: %.2f | Peso: %.2f", grade, weight));
        }

        // Verifica se a soma dos pesos é maior que zero antes de calcular a média ponderada
        if (sumWeights > 0) {
            System.out.println("Média ponderada: " + String.format("%.2f", sumWeightedGrades / sumWeights));
        } else {
            System.out.println("Não foi possível calcular a média ponderada, pois a soma dos pesos é zero.");
        }

        scanner.close();
    }

    private static double generateRandomWeight(int n) {
        // Gera um peso aleatório com duas casas decimais entre 1 e n
        return Math.round((1 + Math.random() * n) * 100.0) / 100.0;
    }
}