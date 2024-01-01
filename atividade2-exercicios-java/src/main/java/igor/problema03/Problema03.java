package igor.problema03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problema03 {
    public static void main(String[] args) throws IOException {
    //  Elabore um programa que leia uma lista de palavras e retorne a
    //  palavra que contém o maior número de vogais
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int vogais = 0, vogaisDaPalavraAtual = 0;
        String palavraComMaisVogais = null;


        // faz a leitura das palavras e salva em uma lista
        System.out.println("Digite uma lista de palavras: ");
        List<String> palavrasLidas = new ArrayList<>(Arrays.asList(bf.readLine().toLowerCase().split("\\s+")));

        // percorre a lista
        for (String palavra: palavrasLidas) {
            // percorre a palavra
            for (int i =0; i < palavra.length(); i++){
                // verifica se na posição da letra na palavra é uma vogal
                if (palavra.charAt(i) == 'a' ||  palavra.charAt(i) == 'e' || palavra.charAt(i) == 'i' || palavra.charAt(i) == 'o' || palavra.charAt(i) == 'u' ){
                    // se for, incrementa o contador da palavra atual
                    vogaisDaPalavraAtual++;
                }
            }

            // se a palavra atual tiver uma contagem maior que a ultima maior
            if(vogaisDaPalavraAtual > vogais){
                // assume a atual como a maior palavra
                vogais = vogaisDaPalavraAtual;
                palavraComMaisVogais = palavra;
            }

            // reinicia a contagem para a proxima palavra
            vogaisDaPalavraAtual = 0;

        }

        System.out.println("Palavra com mais vogais: " + palavraComMaisVogais);
        System.out.println("Contendo " + vogais + " vogais.");

        bf.close();
    }

}
