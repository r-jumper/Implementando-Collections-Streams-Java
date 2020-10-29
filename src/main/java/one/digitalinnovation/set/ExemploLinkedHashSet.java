package one.digitalinnovation.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {

    public static void main(String[] args) {

        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

        System.out.println("Adiciona os numeros no set: ");
        sequenciaNumerica.add(15);
        sequenciaNumerica.add(12);
        sequenciaNumerica.add(31);
        sequenciaNumerica.add(41);
        sequenciaNumerica.add(1);
            System.out.println(sequenciaNumerica);

        System.out.println("Remove um numero do set: ");
        sequenciaNumerica.remove(15);
            System.out.println(sequenciaNumerica);

        System.out.println("Retorna o tamanho do set: ");
            System.out.println(sequenciaNumerica.size());

        System.out.println("Navega em todos os itens do iterator:");
        Iterator<Integer> iterator = sequenciaNumerica.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Percorre todos os itens do iterator: ");
        for (Integer numero: sequenciaNumerica){
            System.out.println(numero);
        }
        System.out.println("Retorna se o set esta vazio:");
        System.out.println(sequenciaNumerica.isEmpty());
    }
}
