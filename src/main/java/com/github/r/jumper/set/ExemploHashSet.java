package com.github.r.jumper.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHashSet {

    public static void main(String[] args) {

        Set<Double> notaAlunos = new HashSet<>();


            System.out.println("Adiciona notas no set: ");
        notaAlunos.add(5.8);
        notaAlunos.add(9.5);
        notaAlunos.add(6.7);
        notaAlunos.add(9.9);
        notaAlunos.add(8.6);
        notaAlunos.add(7.8);
        notaAlunos.add(4.5);
        notaAlunos.add(3.9);
            System.out.println(notaAlunos);

        System.out.println("Remove nota do set: ");
        notaAlunos.remove(4.5);
            System.out.println(notaAlunos);

        System.out.println("Quatidade itens do set: ");
        System.out.println(notaAlunos.size());

        System.out.println("Retorna a quantidade dos intens do interator");
        Iterator<Double> iterator = notaAlunos.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("Percorre notas: ");
        for (Double nota: notaAlunos){
            System.out.println(nota);
        }

        System.out.println("Limpa notas -> ");
        notaAlunos.clear();
        System.out.println("Notas limpas: " + notaAlunos.isEmpty());

    }
}
