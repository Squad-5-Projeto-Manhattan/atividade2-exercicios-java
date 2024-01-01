package igor.problema04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.Normalizer;

public class Problema04 {
    public static void main(String[] args) throws IOException {
        //  Implemente um programa que determine se uma string é um
        //  palíndromo de frase (considerando pontuações e espaços).
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Digite uma palavras: ");
        String frase = bf.readLine().toLowerCase();
        String fraseInvertida = "";

        frase = removeAcentos(frase);

        for(int i = frase.length() -1; i >= 0 ; i--){
            fraseInvertida += frase.charAt(i);
        }

        if(frase.equals(fraseInvertida)){
            System.out.println("A frase é um palindromo");
        } else {
            System.out.println("A frase não é um palindromo");
        }

        bf.close();
    }

    private static String removeAcentos(String frase) {
        return Normalizer.normalize(frase, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
    }
}
