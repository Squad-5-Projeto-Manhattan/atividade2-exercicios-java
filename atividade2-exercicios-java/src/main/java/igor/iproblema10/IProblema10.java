package igor.iproblema10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class IProblema10 {
    public static void main(String[] args) throws IOException {
//        Escreva um programa que ordene uma lista de strings por ordem
//        lexicográfica reversa
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String [] frase;

        System.out.println("Digite uma lista de palavras: ");
        frase = bf.readLine().split("\\s+");

        // converte para uma lista
        List<String> listaAlfabetica = new ArrayList<>(Arrays.asList(frase));

        // faz a ordenação da lista lida
        Collections.sort(listaAlfabetica);

        // cria uma nova lista
        List<String> listaAlfabeticaReversa =  new ArrayList<>(listaAlfabetica);

        // inverte a lista
        Collections.reverse(listaAlfabeticaReversa);
//
//        System.out.println("Palavras em ordem alfabetica: ");
//        System.out.println(listaAlfabetica);

        System.out.println("Palavras em ordem alfabetica reversa: ");
        System.out.println(listaAlfabeticaReversa);

    }
}
