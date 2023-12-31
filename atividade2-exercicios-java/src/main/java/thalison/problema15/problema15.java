package thalison.problema15;

import java.util.Scanner;
import java.util.Stack;

import java.util.Stack;

import java.util.Stack;

public class problema15 {
    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();
        int numeroInformado, verificaEnquanto;
        Scanner scanner = new Scanner(System.in);
        // Adicionando elementos à pilha
        do {

            System.out.println("INFORME UM NÚMERO:");
            numeroInformado = scanner.nextInt();
           pilha.push(numeroInformado);

            System.out.println("PARA ADICIONAR OUTRO NUMERO:  1 - SIM  ou qualquer outro número para SAIR");
            verificaEnquanto = scanner.nextInt();

        }while (verificaEnquanto == 1);

        System.out.println("Pilha original: " + pilha);

        inverterPilha(pilha);

        System.out.println("Pilha invertida: " + pilha);

        scanner.close();
    }

    //Metodo que recbe a pilha de inteiros e realiza a inversão;
    public static void inverterPilha(Stack<Integer> pilha) {
        if (!pilha.isEmpty()) {
            // Retire o elemento do topo
            int elemento = pilha.pop();

            // Inverta a ordem dos elementos restantes
            inverterPilha(pilha);

            // Insira o elemento no fundo da pilha
            inserirNoFundo(pilha, elemento);
        }
    }

    //Metodo de inserirNofundo da pilha
    public static void inserirNoFundo(Stack<Integer> pilha, int elemento) {
        if (pilha.isEmpty()) {
            pilha.push(elemento);
        } else {
            // Retire o elemento do topo
            int topo = pilha.pop();

            // Insira o elemento no fundo
            inserirNoFundo(pilha, elemento);

            // Empurre de volta o elemento original
            pilha.push(topo);
        }
    }
}
