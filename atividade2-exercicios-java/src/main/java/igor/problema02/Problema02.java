package igor.problema02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Problema02 {
    public static void main(String[] args) throws IOException {
//        Elabore um programa que leia uma lista de números e retorne a
//        média dos números pares e ímpares separadamente.


        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] numerosLidos;
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();
        List<Integer> numeros = new ArrayList<>();

        // faz a leitura dos valores e separa eles em um array de Strings
        System.out.println("Digite uma lista de numeros para verificar os pares e impares: ");
        numerosLidos = bf.readLine().split( "\\s+" );


        // percorre o array
        for (String x: numerosLidos) {
            // é  converte o valor para inteiro e adiciona em uma lista de numeros inteiros
           try {
               numeros.add(Integer.parseInt(x));

           } catch (NumberFormatException e){
               // se nao for possivel, avisa que o valor será ignorado
               System.out.println("Valor " + x + " ignorado");
           }

        }


        // para cada numero na lista
        for(Integer a: numeros){
            // se o resto da divisão por 2 for igual a zero significa que o valor é par
            if ( a % 2 == 0) {
                // portanto, salva na lista de pares
                pares.add(a);
            } else {
                // senao, salva na de impares
                impares.add(a);
            }
        }

        System.out.print("Numeros pares lidos: ");
        printNumeros(pares);
        System.out.println("Media: "  + mediaNumeros(pares));

        System.out.print("Numeros impares lidos: ");
        printNumeros(impares);
        System.out.println("Media: "  + mediaNumeros(impares));


        bf.close();

    }

    public static void printNumeros(List<Integer> numeros){
        // para cada numero na lista
        for (Integer n: numeros) {
            // exibe o numero e concatena com um separador
            System.out.print( n + " - ");
        }
        // nova linha
        System.out.println();
    }

    public static Integer mediaNumeros(List<Integer> numeros){
        int soma = 0;
        for (Integer n: numeros) {
            soma += n;
        }

        return soma / numeros.size();
    }

}
