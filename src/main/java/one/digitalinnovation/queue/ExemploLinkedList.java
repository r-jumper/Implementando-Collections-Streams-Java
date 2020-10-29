package one.digitalinnovation.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {

    public static void main(String[] args) {

        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Augusto");
        filaBanco.add("Cesar");
        filaBanco.add("Talita");
        filaBanco.add("Fernando");
        filaBanco.add("Antunes");
        filaBanco.add("Ramos");

        System.out.println("Elementos na fila: " + filaBanco);

        String primeiroQueSai = filaBanco.poll();
            System.out.println("Remove primeiro elemento da fila: " + primeiroQueSai);

            System.out.println("Elementos na fila: " + filaBanco);

        String primeiroElemento = filaBanco.peek();
            System.out.println("Exibe primeiro elemento da fila: " + primeiroElemento);

        //filaBanco.clear(); // limpa a fila.

        String primeiroElementoErro = filaBanco.element();
            System.out.println(primeiroElementoErro);
            System.out.println(filaBanco);


        filaBanco.add("João");
            System.out.printf("Adicionado elemento João: ");
            System.out.println(filaBanco);


            System.out.println("Navegar Elementos da fila: ");
        for (String fila: filaBanco) {
            System.out.println(fila);
        }
            System.out.println("Integarir Elementos da fila: ");
        Iterator<String> iteretorFilaBanco = filaBanco.iterator();
        while (iteretorFilaBanco.hasNext()) {
            System.out.println(iteretorFilaBanco.next());
        }

            System.out.println("Tamanho da fila: " + filaBanco.size());
            System.out.println("Fila vazia: " + filaBanco.isEmpty());

        Boolean contem = filaBanco.contains("Fernando");
            System.out.println("Fila contém o elemento Fernando: " + contem);
    }
}
