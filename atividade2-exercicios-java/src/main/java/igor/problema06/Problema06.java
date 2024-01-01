package igor.problema06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Problema06 {
    public static void main(String[] args) throws IOException {
        //   Desenvolva um programa que determine se um número é um número
        //   de Armstrong.

        // um numero de armstrong, ou tambem conhecido com numero narcisista, é um numero que se
        // elevarmos seus digitos pela quantidade de algarismo, obtemos o proprio numero

        // https://en.wikipedia.org/wiki/Narcissistic_number
        // https://www.youtube.com/watch?v=yvoG3ubSxg4&ab_channel=TodaaMatem%C3%A1tica

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        double soma = 0;

        System.out.println("Digite um número: ");
        String numero = bf.readLine().trim();
        String numeroConsiderado = "";

        List<Integer> digitos = new ArrayList<>();
        for (int i = 0; i < numero.length(); i++) {
            try {
                // pega um digito valido que foi lido no teclado
                digitos.add(Integer.parseInt(String.valueOf(numero.charAt(i))));
                numeroConsiderado += String.valueOf(numero.charAt(i));

            } catch(NumberFormatException e){
                System.out.println("Digito " + e.getMessage() +" invalido. Ignorado");
            }
        }

        // monta o numero considero
        Integer numeroOriginal = Integer.parseInt(numeroConsiderado);


        // testa para ver se o numero tem mais de 60 digitos, se houver nao realiza o calculo,
        // pois não há numeros de armstrong com mais de 60 digitos

        if( digitos.size() < 60){
            for (int i = 0; i < digitos.size(); i++){
                // para cada digito considerado, eleva ao numero de algarismos
                soma += Math.pow(digitos.get(i), digitos.size());
            }
        }

        if(numeroOriginal == soma){
            System.out.println("O número digitado é um número de Armstrong | número Narcisista!");
        } else {
            System.out.println("Não é um número de Armstrong");
        }



        bf.close();
    }
}
