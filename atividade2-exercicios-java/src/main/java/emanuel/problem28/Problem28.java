package emanuel.problem28;

import java.text.Normalizer;
import java.util.Scanner;

public class Problem28 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String[] words = scanner.nextLine().toLowerCase().split("\\s+");
        String invertedWord = "";

        // Remove acentos da palavra
        words[0] = removeAccents(words[0]);

        // Inverte a palavra
        for (int i = words[0].length() - 1; i >= 0; i--) {
            invertedWord += words[0].charAt(i);
        }

        // Verifica se a palavra é um palíndromo
        if (words[0].equals(invertedWord)) {
            System.out.println("A palavra é um palíndromo");
        } else {
            System.out.println("A palavra não é um palíndromo");
        }

        scanner.close();
    }

    // Remove acentos de uma string
    private static String removeAccents(String input) {
        return Normalizer.normalize(input, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
    }
}