package problema25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Problema25 {
    public static void main(String[] args) throws IOException {
        //  Escreva um programa que determine se um número é um número de
        //  Catalan

        // https://pt.wikipedia.org/wiki/N%C3%BAmeros_de_Catalan
        // https://www.youtube.com/watch?v=d24Qx-emJD0&ab_channel=AHoradoBizu


        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Long numeroConsiderado = -1L;
        List<Long> numerosDeCatalan = new ArrayList<>();


        // salva os valores digitados
        System.out.println("Digite um numero para testar se ele é um número de Catalan: ");
        String[] valoresLidos = bf.readLine().split("\\s+");

        // considera o primeiro valor digitado
        try{
            // e tenta salvar com um inteiro longo
            numeroConsiderado = Long.parseLong(valoresLidos[0]);
        } catch (NumberFormatException e){
            // avisa se ocorreu um tipo invalido
            System.out.println("Valor " + valoresLidos[0] + " Invalido. Deve ser um número natural!");
        }

        // verifica se o valor é um natural
        if( numeroConsiderado >= 0){
            numerosDeCatalan = gerarNumerosCatalan(numeroConsiderado);

        } else {
            //se nao, avisa do erro
            System.out.println("Numero invalido, ele de ser maior que 0!");
            System.out.println("Valor considerado: " + numeroConsiderado);
        }




        System.out.println(numerosDeCatalan);
        if(numerosDeCatalan.contains(numeroConsiderado)){
            System.out.println("O número digitado é um numero de Catalan!");
        } else {
            System.out.println("Não é um numero de Catalan!");
        }

        bf.close();

    }

    // metodo para gerar os numeros de Catalan
    private static List<Long> gerarNumerosCatalan(Long numeroConsiderado) {
        List<Long> listaDeNumerosDeCatalan = new ArrayList<>();
        long numeroDeCatalan = 0L;
        long i = 0L;
        long coeficienteBinomial = 0;
        double termo = 0;

        // System.out.println(numeroConsiderado);
        do {
            // binomio de termo atual
            coeficienteBinomial = binomio( i * 2, i);
            // fraçao do termo atual
            termo =  (double) 1 / (i + 1);

            // calculo para a geração do numero de Catalan
            numeroDeCatalan = (long) (termo * coeficienteBinomial);

            // adiciona o termo a liste de Catalan
            listaDeNumerosDeCatalan.add(numeroDeCatalan);
            i++;
            // debug -- havia um erro com a fração, pois ela era convertida para um inteiro longo antes
            // de fazer a operação com o binomio, gerando um erro na criação do numero

            //System.out.println(termo);

            // até gerar um numero maior ou igual ao numero digitado
        } while ( numeroDeCatalan < numeroConsiderado);

        // retorna a lista dos numeros de Catalan
        return listaDeNumerosDeCatalan;
    }


    // metodo para o calculo do coeficiente binomial
    static long binomio(long n, long p) {
        if ((n == p) || (p == 0))
            return 1;
        else
            // chamada recursiva para o calculo fatorial dos termos
            return binomio(n - 1, p) + binomio(n - 1, p - 1);
    }


}
