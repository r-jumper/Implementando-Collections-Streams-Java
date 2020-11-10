package com.github.r.jumper.set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExemploTreeSet {

    public static void main(String[] args) {

        TreeSet<String> treeCapitais = new TreeSet<>();

        System.out.println("Monta a árvore com as Capitais: ");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Curitiba");
        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Belo Horizonte");
        treeCapitais.add("Florianópolis");
        treeCapitais.add("Rio De Janeiro");
            System.out.println(treeCapitais);

        System.out.println("Retorna a capital do topo da árvore: ");
            System.out.println(treeCapitais.first());

        System.out.println("Retorna a última capital no final da árvore:");
            System.out.println(treeCapitais.last());

        System.out.println("Retorna a primeira capital abaixo da árvore da capital parametrizada:");
            System.out.println(treeCapitais.lower("Curitiba"));

        System.out.println("Retorna a primeira capital acima da árvore da capital parametrizada");
        System.out.println(treeCapitais.higher("Curitiba"));

        System.out.println("Retorna a primeira capital no topo da árvore, removendo do set");
            System.out.println(treeCapitais.pollFirst());
            System.out.println(treeCapitais);

        System.out.println("Retorna a primeira capital no final da árvore, removendo do set");
            System.out.println(treeCapitais.pollLast());
            System.out.println(treeCapitais);

        System.out.println("Navega os itens do iterator:");
        Iterator<String> iterator = treeCapitais.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("Adiciona Capital: ");
        treeCapitais.add("Vitória");

        System.out.println("Percorre itens:");
        for (String nav: treeCapitais){
            System.out.println(nav);
        }

        System.out.println("Verifica se o set está vazio:");
            System.out.println(treeCapitais.isEmpty());
    }
}
