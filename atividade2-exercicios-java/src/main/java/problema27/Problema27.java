package problema27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema27 {
    public static void main(String[] args) throws IOException{
        // Crie um programa que encontre o maior número primo menor que um
        // número fornecido.

        // https://pt.wikipedia.org/wiki/Crivo_de_Erat%C3%B3stenes
        // https://pt.wikipedia.org/wiki/Crivo_de_Atkin
        // https://acervolima.com/peneira-de-atkin/
        // https://www.youtube.com/watch?v=h9EHkZLekoY&ab_channel=AaronLearns


        // nesse programa, utilizo o crivo de atkins para gerar os primos até o limite informado
        // e retorna o ultimo primo antes do limite

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int numero = 0;

        System.out.println("Digite um número: ");
        try {
            numero = Integer.parseInt(bf.readLine());

        } catch (NumberFormatException e) {
            System.out.println("Valor digitado invalido");
        }

        if(numero > 0){

        } else {
            System.out.println("O valor deve ser maior que zero");
        }

        int ultimoPrimo = peneiraDeAtkin(numero);

        System.out.println("O maior primo antes do limite informado é: " + ultimoPrimo );

    }


    static int peneiraDeAtkin(int limite)
    {
        // 2 e 3 são numeros primos conhecidos
        if (limite > 2)
            System.out.print(2 + " ");

        if (limite > 3)
            System.out.print(3 + " ");

        // Inicializa a peneira com
        // valores falsos
        boolean peneira[] = new boolean[limite];

        for (int i = 0; i < limite; i++)
            peneira[i] = false;

        /* Marcamos a peneira[n] como verdadeira  se uma das seguintes formulas for verdade

        a) n = (4*x*x)+(y*y) tem um numero impar como solução, ID EST, existe um número ímpar de pares distintos
           (x, y)que satisfaz a equação e n % 12 = 1 or n % 12 = 5.
        b) n = (3*x*x)+(y*y) tem um numero impar como solução e n % 12 = 7
        c) n = (3*x*x)-(y*y)  tem um numero impar como solução, x > y e n % 12 = 11 */
        for (int x = 1; x * x < limite; x++) {
            for (int y = 1; y * y < limite; y++) {

                // Parte principal da peneira de Atkin
                int n = (4 * x * x) + (y * y);
                if (n <= limite && (n % 12 == 1 || n % 12 == 5))

                    peneira[n] ^= true;

                n = (3 * x * x) + (y * y);
                if (n <= limite && n % 12 == 7)
                    peneira[n] ^= true;

                n = (3 * x * x) - (y * y);
                if (x > y && n <= limite && n % 12 == 11)
                    peneira[n] ^= true;
            }
        }

        // Marca os multiplos de quadrados como nao primos
        for (int r = 5; r * r < limite; r++) {
            if (peneira[r]) {
                for (int i = r * r; i < limite;
                     i += r * r)
                    peneira[i] = false;
            }
        }

        int ultimoPrimo = 0;
        // Imprime os numeros primos usando peneira[]
        for (int a = 5; a < limite; a++)
            if (peneira[a]) {
                System.out.print(a + " ");
                ultimoPrimo = a;
            }
        System.out.println();
        return ultimoPrimo;
    }
}
