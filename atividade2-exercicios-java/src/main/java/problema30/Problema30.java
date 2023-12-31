package problema30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Problema30 {
    public static void main(String[] args) throws IOException {

//        Escreva um programa que determine se um número é um número
//                feliz
        /*
            Para saber se um número é feliz, você deve obter o quadrado de cada dígito deste número, em seguida você faz a soma desses resultados. A seguir o mesmo procedimento deve ser feito com o valor resultante desta soma. Se ao repetir o procedimento diversas vezes obtivermos o valor 1, o número inicial é considerado feliz.
            Tomamos o 7, que é um número feliz:
            7² = 49
            4² + 9² = 97
            9² + 7² = 130
            1² + 3² + 0² = 10
            1² + 0² = 1
            Podemos observar nesse exemplo que os números 49, 97, 130 e 10 também são felizes. Existem infinitos números felizes.
        */

        // https://acervolima.com/numeros-felizes/
        // https://acervolima.com/numero-feliz/

        System.out.println("Digite um numero para saber se ele é feliz ou não: ");
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int numero = Integer.parseInt(bf.readLine());

        if(ehFeliz(numero))
            System.out.println("=D");

        else
            System.out.println("D=");




    }

    static boolean ehFeliz(int n)
    {
        int devagar, rapido;

        //  inicializa rapido e devagar com n
        devagar = rapido = n;
        do
        {
            //  move o numero devagar
            // em uma interação
            devagar = somaQuadradoNumero(devagar);

            //  move o numero rapido
            // em duas interações
            rapido = somaQuadradoNumero(somaQuadradoNumero(rapido));

        }
        while (devagar != rapido);

        //  se os dois numeros encontrarem 1,
        // entao retorna verdade
        return (devagar == 1);
    }

    static int somaQuadradoNumero(int n)
    {
        int somaQuadrados = 0;
        while (n!= 0)
        {
            somaQuadrados += (n % 10) * (n % 10);
            n /= 10;
        }
        return somaQuadrados;
    }


}
