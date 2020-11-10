package com.github.r.jumper.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorsExampleList {

    public static void main(String[] args) {

        List<Estudante> estudantes = new ArrayList<>();

        estudantes.add(new Estudante("Fernando", 41));
        estudantes.add(new Estudante("Augusto", 12));
        estudantes.add(new Estudante("Talita", 31));
        estudantes.add(new Estudante("Cesar", 14));
        estudantes.add(new Estudante("Antunes", 13));
        estudantes.add(new Estudante("Ramos", 26));
        estudantes.add(new Estudante("Maria", 21));

        System.out.println("--- ordem de inserção ---");
        System.out.println(estudantes);

        estudantes.sort((first, second) -> first.getIdade() - second.getIdade());

        System.out.println("--- ordem natural dos números - idade ---");
        System.out.println(estudantes);

        estudantes.sort((first, second) -> second.getIdade() - first.getIdade());

        System.out.println("--- ordem reversa dos números - idade ---");
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));

        System.out.println("--- ordem natural dos números - idade (method reference) ---");
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());

        //estudantes.sort((first, second) -> first.getIdade() - second.getIdade().reversed();

        System.out.println("--- ordem reversa dos números - idade (method reference) ---");
        System.out.println(estudantes);

        Collections.sort(estudantes);

        System.out.println("--- ordem natural dos números - idade (interface Comparable) ---");
        System.out.println(estudantes);

        Collections.sort(estudantes, new EstudanteOrdemIdadeReversaComparator());

        System.out.println("--- ordem reversa dos números - idade (interface Comparator) ---");
        System.out.println(estudantes);

    }
}

