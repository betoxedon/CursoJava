package Coleções;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class conjuntoComportado {
    public static void main(String[] args) {
        SortedSet<String> listaAprovados = new TreeSet<>();
        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Luca");
        listaAprovados.add("Pedro");

        for (String item: listaAprovados) {
            System.out.println(item);
        }

        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        for (Integer item: nums) {
            System.out.println(item);
        }

    } 
}
