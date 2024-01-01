package problema08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.util.Arrays;

public class Problema08 {
    public static void main(String[] args) throws IOException {
    //  Elabore um programa que converta um número decimal para octal
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int numeroDigitado = 0;


        System.out.println("Digite um número para converte-lo para Octal");
        try {
            // leitura e conversão da string para um inteiro
            numeroDigitado = Integer.parseInt(bf.readLine());

        } catch (NumberFormatException e){
            // se o valor for invalido para a conversão
            System.out.println("Numero digitado invalido!");
        }

        // faz a conversão para octal
        System.out.println("Numero Octal: " + Integer.toOctalString(numeroDigitado));

        bf.close();
    }
}
