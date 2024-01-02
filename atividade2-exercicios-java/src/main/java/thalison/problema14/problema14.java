package thalison.problema14;

import java.util.ArrayList;
import java.util.Scanner;

public class problema14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> numeros = new ArrayList<>();
        ArrayList<Double> pesos = new ArrayList<>();

        // Solicitar ao usuário para inserir os números e os pesos
        System.out.print("Quantidade de números: ");
        int quantidade = scanner.nextInt();

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Insira o número " + (i + 1) + ": ");
            double numero = scanner.nextDouble();
            numeros.add(numero);

            System.out.print("Insira o peso para o número " + (i + 1) + ": ");
            double peso = scanner.nextDouble();
            pesos.add(peso);
        }

        // Calcular a média geométrica ponderada
        double mediaGeometricaPonderada = calcularMediaGeometricaPonderada(numeros, pesos);

        // Exibir o resultado
        System.out.println("A média geométrica ponderada é: " + mediaGeometricaPonderada);
    }

    public static double calcularMediaGeometricaPonderada(ArrayList<Double> numeros, ArrayList<Double> pesos) {
        double produto = 1.0;

        for (int i = 0; i < numeros.size(); i++) {
            produto *= Math.pow(numeros.get(i), pesos.get(i));
        }

        double media = Math.pow(produto, 1.0 / numeros.size());
        return media;
    }
}
