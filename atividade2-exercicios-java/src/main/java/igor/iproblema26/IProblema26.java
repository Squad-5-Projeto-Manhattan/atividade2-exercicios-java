package igor.iproblema26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class IProblema26 {

    // declarando as filas
    static Queue<Integer> fila;
    static Queue<Integer> filaInvertida;
    public static void main(String[] args) throws IOException {
        //  Desenvolva um programa que inverta a ordem dos elementos em uma
        //  fila.

        // https://www.dio.me/articles/estruturas-de-dados-em-java-filas-listas-arvores-e-collections
        // https://acervolima.com/invertendo-uma-fila/


        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Random random = new Random();

        // instancia a fila como uma lista encadeada
        fila = new LinkedList<>();
        filaInvertida = new LinkedList<>();



        int n = 100;

        // popula a fila
        for (int i = 0; i < n; i++){
            fila.add(random.nextInt(0,n));
        }

        System.out.println("Fila original: \n" + fila);

        inverterFila();
        System.out.println("====================================================================");

        System.out.println("Fila invertida: \n" + filaInvertida);


        bf.close();

    }


    static void inverterFila()
    {
        Stack<Integer> stack = new Stack<>();
        while (!fila.isEmpty()) {
            stack.add(fila.peek());
            fila.remove();
        }
        while (!stack.isEmpty()) {
            filaInvertida.add(stack.peek());
            stack.pop();
        }
    }
}
