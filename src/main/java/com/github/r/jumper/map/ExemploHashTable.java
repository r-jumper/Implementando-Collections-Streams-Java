package com.github.r.jumper.map;

import java.util.Hashtable;
import java.util.Map;

public class ExemploHashTable {

    public static void main(String[] args) {

        Hashtable<String, Integer> estudantes = new Hashtable<>();

        estudantes.put("Augusto", 12);
        estudantes.put("Talita", 31);
        estudantes.put("Cesar", 14);
        estudantes.put("Fernando", 41);

        System.out.println(estudantes);

        System.out.println("Adicionando item: ");
        estudantes.put("Antunes", 26);
            System.out.println(estudantes);

        System.out.println("Remove o item de índice 2:");
        estudantes.remove("Antunes");
            System.out.println(estudantes);

        System.out.println("Exibe o valor do item de índice 0");
        int idadeEstudante = estudantes.get("Augusto");
            System.out.println(idadeEstudante);

        System.out.println("Exibe o tamanho mapa:");
            System.out.println(estudantes.size());

        System.out.println("Navega pelos registros do mapa com entryset");
        for(Map.Entry<String, Integer> entry: estudantes.entrySet()){
            System.out.println(entry.getKey() + "--" + entry.getValue());
        }

        System.out.println("Navega pelos registros do pama com keyset");
        for (String key: estudantes.keySet()){
            System.out.println(key + "--" + estudantes.get(key));
        }

        System.out.println("Exibe itens do mapa:");
            System.out.println(estudantes);
    }
}
