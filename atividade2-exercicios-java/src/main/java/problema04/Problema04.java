package problema04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problema04 {
    public static void main(String[] args) throws IOException {
        //  Implemente um programa que determine se uma string é um
        //  palíndromo de frase (considerando pontuações e espaços).
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Digite uma palavras: ");
        List<String> palavrasLidas = new ArrayList<>(Arrays.asList(bf.readLine().toLowerCase().split("\\s+")));
        String palavra =  palavrasLidas.get(0).toLowerCase();
        String palavraInvertida = "";

        for(int i = palavra.length() -1; i >= 0 ; i--){
            palavraInvertida += palavra.charAt(i);
        }

        if(palavra.equals(palavraInvertida)){
            System.out.println("A palavra é um palindromo");
        } else {
            System.out.println("A palavra não é um palindromo");
        }
    }
}
