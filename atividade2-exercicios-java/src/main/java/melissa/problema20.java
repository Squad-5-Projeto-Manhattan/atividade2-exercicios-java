import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ContadorPalavrasDistintas {

    public static int contarPalavrasDistintas(String[] listaDeStrings) {
        Set<String> palavrasDistintas = new HashSet<>();

        for (String str : listaDeStrings) {
            // divide a string em palavras usando espaços como delimitadores
            String[] palavras = str.split("\\s+");

            // adiciona as palavras distintas ao conjunto
            for (String palavra : palavras) {
                palavrasDistintas.add(palavra.toLowerCase()); // Considere case-insensitive
            }
        }

        return palavrasDistintas.size();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // solicita ao usuário a quantidade de strings na lista
        System.out.print("Digite o número de strings na lista: ");
        int quantidadeDeStrings = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        // solicita ao usuário as strings
        String[] listaDeStrings = new String[quantidadeDeStrings];
        for (int i = 0; i < quantidadeDeStrings; i++) {
            System.out.print("Digite a string #" + (i + 1) + ": ");
            listaDeStrings[i] = scanner.nextLine();
        }

        // conta o número de palavras distintas na lista de strings
        int numeroDePalavrasDistintas = contarPalavrasDistintas(listaDeStrings);

        // exibe o resultado
        System.out.println("O número de palavras distintas na lista é: " + numeroDePalavrasDistintas);

        scanner.close();
    }
}
