class Node {
    int data;      // armazena o valor do nó
    Node next;     // referência para o próximo nó na lista

    // construtor para inicializar um nó com um valor específico
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;   // referência para o primeiro nó na lista

    // adiciona um novo nó com o valor 'data' ao final da lista
    public void append(int data) {
        Node newNode = new Node(data);

        // se a lista estiver vazia, o novo nó se torna a cabeça (head) da lista
        if (head == null) {
            head = newNode;
            return;
        }

        // percorre a lista até o último nó
        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }

        // adiciona o novo nó ao final da lista
        lastNode.next = newNode;
    }

    // encontra a posição da primeira ocorrência do valor 'target' na lista
    public int findPosition(int target) {
        Node currentNode = head;
        int position = 1;

        // percorre a lista até encontrar o nó com o valor 'target'
        while (currentNode != null) {
            if (currentNode.data == target) {
                return position;  // retorna a posição se o valor for encontrado
            }
            currentNode = currentNode.next;
            position++;
        }

        return -1;  // retorna -1 se o valor não for encontrado na lista
    }
}

public class Main {
    public static void main(String[] args) {
        // cria uma instância de LinkedList
        LinkedList linkedList = new LinkedList();
        int[] elements = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};

        // adiciona elementos à lista encadeada
        for (int element : elements) {
            linkedList.append(element);
        }

        // encontra a posição da primeira ocorrência de um elemento na lista
        int targetElement = 5;
        int position = linkedList.findPosition(targetElement);

        // exibe o resultado
        if (position != -1) {
            System.out.println("A primeira ocorrência de " + targetElement + " está na posição " + position + ".");
        } else {
            System.out.println(targetElement + " não encontrado na lista.");
        }
    }
}
