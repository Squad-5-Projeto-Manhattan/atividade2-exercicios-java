package thalison.problema16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class problema16 {

    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();
        int numeroInformado, verificaEnquanto, somaNumerosImpares = 0;
        Scanner scanner = new Scanner(System.in);

        do {

            System.out.println("Informe um número:");
            numeroInformado = scanner.nextInt();
            lista.add(numeroInformado);

            System.out.println("Deseja adicionar outro número a lista digite:  1 - sim ou qualquer outro número para sair");
            verificaEnquanto = scanner.nextInt();

        }while (verificaEnquanto == 1);

        System.out.println("Lista original:" + lista);

        //Usando Collections para realizar o reverso
        Collections.reverse(lista);

        System.out.printf("Lista reversa" + lista);


    }
}
