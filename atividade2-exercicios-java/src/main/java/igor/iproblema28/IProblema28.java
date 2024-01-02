package igor.iproblema28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.Normalizer;

public class IProblema28 {
    public static void main(String[] args) throws IOException {
    //   Elabore um programa que verifique se uma string é um palíndromo de
    //   palavra (desconsiderando espaços e pontuações).
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Digite uma palavras: ");
        String[] frase = bf.readLine().toLowerCase().split("\\s+");
        String palavraInvertida = "";

        frase[0] = removeAcentos(frase[0]);

        for(int i = frase[0].length() -1; i >= 0 ; i--){
            palavraInvertida += frase[0].charAt(i);
        }

        if(frase[0].equals(palavraInvertida)){
            System.out.println("A palavra é um palindromo");
        } else {
            System.out.println("A palavra não é um palindromo");
        }

        bf.close();

    }

    private static String removeAcentos(String frase) {
        return Normalizer.normalize(frase, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
    }
}
