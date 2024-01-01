package igor.problema05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Problema05 {
    public static void main(String[] args) throws IOException {
//        Escreva um programa que conte o número de substrings distintas em
//        uma string.
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] fraseLida;

        System.out.println("Digite uma frase: ");
        // leitura da frase para um array de strings
        fraseLida = bf.readLine().toLowerCase().split("\\s+");

        // utilizando um set, que nao permite elementos repetidos, adicionamos os elementos nele
        Set<String> set = new HashSet<>();
        for(String a: fraseLida) {
            set.add(a);
        }

        // imprimimos o tamanho do set
        System.out.println("Quantidade de substrings: " + set.size());

        bf.close();
    }
}
