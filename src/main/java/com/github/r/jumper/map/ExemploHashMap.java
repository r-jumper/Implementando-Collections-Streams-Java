package com.github.r.jumper.map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {

    public static void main(String[] args) {

        System.out.println("Adiciona os campeões mundiais fifa no mapa: ");
        Map<String, Integer> campeoesMundiaisFifa = new HashMap<>();

        campeoesMundiaisFifa.put("Brasil", 5);
        campeoesMundiaisFifa.put("Alemanha", 4);
        campeoesMundiaisFifa.put("Itália", 4);
        campeoesMundiaisFifa.put("Uruguai", 2);
        campeoesMundiaisFifa.put("Argentina", 2);
        campeoesMundiaisFifa.put("França", 2);
        campeoesMundiaisFifa.put("Inglaterra", 1);
        campeoesMundiaisFifa.put("Espanha", 1);

            System.out.println(campeoesMundiaisFifa);

        System.out.println("Atualiza o valor para a chave Brasil:");
        campeoesMundiaisFifa.put("Brasil", 6);
            System.out.println(campeoesMundiaisFifa);

        System.out.println("Retorna valor da chave Argentina:");
            System.out.println(campeoesMundiaisFifa.get("Argentina"));

        System.out.println("Retorna se existe o item França:");
            System.out.println(campeoesMundiaisFifa.containsKey("França"));

        System.out.println("Remove o item França");
        campeoesMundiaisFifa.remove("França");
            System.out.println(campeoesMundiaisFifa);

        System.out.println("Retorna se existe o item França:");
            System.out.println(campeoesMundiaisFifa.containsKey("França"));

        System.out.println("Retorna se existe seleção hexa campeão");
            System.out.println(campeoesMundiaisFifa.containsValue(6));

        System.out.println("Retorna o tamanho do mapa:");
            System.out.println(campeoesMundiaisFifa.size());

        System.out.println("Navegando registros do mapa com método keyset");
            for(String key: campeoesMundiaisFifa.keySet()){
                System.out.println(key + "--" + campeoesMundiaisFifa.get(key));
            }
        System.out.println("Navegando registros do mapa com o método entryset");
            for(Map.Entry<String, Integer> entry: campeoesMundiaisFifa.entrySet()){
                System.out.println(entry.getKey() + "--" + entry.getValue());
            }

        System.out.println("Verifica se o mapa contém a chave Estados Unidos:");
            System.out.println(campeoesMundiaisFifa.containsKey("Estados Unidos"));

        System.out.println("Verifica se o mapa contém o valor 5: ");
            System.out.println(campeoesMundiaisFifa.containsValue(5));

        System.out.println("Verifica o tamanho do mapa em seguida limpa:");
            System.out.println(campeoesMundiaisFifa.size());
            campeoesMundiaisFifa.clear();
            System.out.println(campeoesMundiaisFifa.size());
    }


}
