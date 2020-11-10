package com.github.r.jumper.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Fernando");
        nomes.add("Talita");
        nomes.add("Augusto");
        nomes.add("Cesar");
        nomes.add("Antunes");
        nomes.add("Ramos");

            System.out.println("Nomes aleatórios: " + nomes);

        nomes.set(3, "Rasec");
            System.out.println("Substitui elemento indice 3: " + nomes);

        Collections.sort(nomes);
            System.out.println("Elementos em ordem alfabética crescente: " + nomes);

        Collections.reverse(nomes);
            System.out.println("Elementos em ordem alfabetica decrescente: " + nomes);

        System.out.println("Lista de elementos: ");
        for(String percorreItem: nomes){
            System.out.println("- " + percorreItem);
        }

        nomes.remove(1);
            System.out.println("Remove elemento de indice 1: " + nomes);

        nomes.remove("Antunes");
            System.out.println("Remove o objeto Antunes: " + nomes);

        int posicao = nomes.indexOf("Augusto");
            System.out.println("Indice do objeto Augusto: " + posicao);

        int tamanho = nomes.size();
            System.out.println("Tamanho da lista: " + tamanho);

        String nome = nomes.get(3);
            System.out.println("Objeto com indice 3: " + nome);

        boolean contemElemento = nomes.contains("Fernando");
            System.out.println("Lista contém o objeto Fernando: " + contemElemento);

        boolean listaVazia = nomes.isEmpty();
            System.out.println("Lista está vazia: " + listaVazia);
        nomes.clear();
        System.out.println("Lista foi apagada.");
        listaVazia = nomes.isEmpty();
            System.out.println("Lista está vazia: " + listaVazia);



    }
}
