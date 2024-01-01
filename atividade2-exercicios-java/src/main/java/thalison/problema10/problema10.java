package thalison.problema10;

import java.util.*;

public class problema10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> lista = new ArrayList<>();
        int qtdPalavras, cont = 0;
        String palavra = null;

        System.out.printf("Quantas palavras deseja informar:");
        qtdPalavras = scanner.nextInt();

        while (cont < qtdPalavras){
            System.out.println("Informe a palavras");
            palavra = scanner.next();
            lista.add(palavra);
            cont++;
        }

        //Usando a collections e o método sort que realiza a ordenação da lista.
        Collections.sort(lista);
        System.out.printf(lista.toString());


    }
}
