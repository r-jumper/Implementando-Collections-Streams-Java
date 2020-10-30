package one.digitalinnovation.map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ExemploTreeMap {

    public static void main(String[] args) {

        TreeMap<String, String> treeCapitais = new TreeMap<>();

        System.out.println("Monta a árvore com as Capitais: ");
        treeCapitais.put("SP", "São Paulo");
        treeCapitais.put("PR","Curitiba");
        treeCapitais.put("RS", "Porto Alegre");
        treeCapitais.put("MG", "Belo Horizonte");
        treeCapitais.put("SC", "Florianópolis");
        treeCapitais.put("RJ", "Rio De Janeiro");
            System.out.println(treeCapitais);

        System.out.println("Retorna a capital do topo da árvore: ");
            System.out.println(treeCapitais.firstKey());

        System.out.println("Retorna a última capital no final da árvore:");
            System.out.println(treeCapitais.lastKey());

        System.out.println("Retorna a primeira capital abaixo da árvore da capital parametrizada:");
            System.out.println(treeCapitais.lowerKey("PR"));

        System.out.println("Retorna a primeira capital acima da árvore da capital parametrizada");
        System.out.println(treeCapitais.higherKey("PR"));

        System.out.println("Retorna a primeira capital no topo da árvore");
            System.out.println(treeCapitais.firstEntry().getKey() + "--" + treeCapitais.firstEntry().getValue());

        System.out.println("Retorna a ultima capital no final da árvore");
            System.out.println(treeCapitais.lastEntry().getKey() + "--" + treeCapitais.lastEntry().getValue());

        System.out.println("Exibe todos os itens do mapa:");
            System.out.println(treeCapitais);
            Map.Entry<String, String> firstEntry = treeCapitais.pollFirstEntry();
            Map.Entry<String, String> lastEntry = treeCapitais.pollLastEntry();

        System.out.println("Retorna a capital do topo da árvore. removendo do mapa:");
            System.out.println(firstEntry.getKey() + "--" + firstEntry.getValue());

        System.out.println("Retorna a última capital no final da árvore, removendo do mapa:");
            System.out.println(lastEntry.getKey() + "--" + lastEntry.getValue());

        System.out.println("Exibe todas itens do mapa:");
            System.out.println(treeCapitais);

        System.out.println("Navega os itens do iterator:");
        Iterator<String> iterator = treeCapitais.keySet().iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            System.out.println(key + " - " + treeCapitais.get(key));
        }

        System.out.println("Percorre itens com keyset:");
        for (String capital: treeCapitais.keySet()){
            System.out.println(capital + " - " + treeCapitais.get(capital));
        }

        System.out.println("Percorre itens com entryset:");
        for (Map.Entry<String, String> capital: treeCapitais.entrySet()){
            System.out.println(capital.getKey() + " - " + capital.getValue());
        }
    }
}
