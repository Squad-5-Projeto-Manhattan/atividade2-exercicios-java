package thalison.problema13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class problema13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numeroInformado, verificaEnquanto, somaNumerosImpares = 0;
        List<Integer> listaNumeros  = new ArrayList<>();



        //Percorre a lista e o "i" é o elemento "valor" que está na lista
        for (Integer i : listaNumeros){
            if (!(i % 2 ==0)){ //Usado primeiramente encontrar o par e utilizado a negação para pegar os ímpares
                somaNumerosImpares += i;
            }
        }

        System.out.print("A soma dos números ímpares é: " + somaNumerosImpares);

    }
}
