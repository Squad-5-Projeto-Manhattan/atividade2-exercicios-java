package emanuel.problem26;

import java.io.IOException;
import java.util.*;

public class Problem26 {

    // Declaração das filas
    static Queue<Integer> queue;
    static Queue<Integer> reversedQueue;

    public static void main(String[] args) throws IOException {

        // Instancia um objeto Scanner para entrada de dados do usuário
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Instancia a fila como uma lista encadeada
        queue = new LinkedList<>();
        reversedQueue = new LinkedList<>();

        int n = 100;

        // Preenche a fila com números aleatórios entre 0 e n
        for (int i = 0; i < n; i++) {
            queue.add(random.nextInt(0, n));
        }

        // Imprime a fila original
        System.out.println("Fila Original: \n" + queue);

        // Chama o método para inverter a fila
        reverseQueue();

        // Imprime uma divisória entre as filas com a quantia de caracteres equivalente ao tamanho do conjunto
        String repeatedEquals = "-*".repeat(n*2);
        System.out.println(repeatedEquals+"-");

        // Imprime a fila invertida
        System.out.println("Fila Invertida: \n" + reversedQueue);

        // Fecha o Scanner para evitar vazamento de recursos
        scanner.close();
    }

    // Método para inverter a fila usando uma pilha
    static void reverseQueue() {
        Stack<Integer> stack = new Stack<>();

        // Transfere elementos da fila para a pilha, invertendo a ordem
        while (!queue.isEmpty()) {
            stack.add(queue.peek());
            queue.remove();
        }

        // Transfere elementos da pilha para a fila invertida
        while (!stack.isEmpty()) {
            reversedQueue.add(stack.peek());
            stack.pop();
        }
    }
}