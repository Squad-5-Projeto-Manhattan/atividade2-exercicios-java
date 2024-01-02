import java.util.Scanner;

public class MediaNumerosNegativos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // solicita ao usuário a quantidade de números na lista
        System.out.print("Digite a quantidade de números na lista: ");
        int quantidadeNumeros = scanner.nextInt();

        // inicializa variáveis para cálculo da média
        int totalNegativos = 0;
        int somaNegativos = 0;

        // loop para ler os números e calcular a média dos negativos
        for (int i = 0; i < quantidadeNumeros; i++) {
            System.out.print("Digite o número #" + (i + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                totalNegativos++;
                somaNegativos += numero;
            }
        }

        // verifica se há números negativos antes de calcular a média
        if (totalNegativos > 0) {
            double mediaNegativos = (double) somaNegativos / totalNegativos;
            System.out.println("A média dos números negativos é: " + mediaNegativos);
        } else {
            System.out.println("Não há números negativos na lista.");
        }

        scanner.close();
    }
}
