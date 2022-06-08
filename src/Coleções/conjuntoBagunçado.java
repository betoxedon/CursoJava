package Coleções;

import java.util.HashSet;
import java.util.Set;

public class conjuntoBagunçado {
    
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();

        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('c');

        System.out.println(conjunto.size());

        conjunto.remove("teste");
        System.out.println(conjunto);

        conjunto.add("Teste");
        conjunto.add("X");

        System.out.println(conjunto.size());

        conjunto.remove(1);
        conjunto.remove("X");

        System.out.println(conjunto.contains("X"));
        System.out.println(conjunto.contains("Teste"));

        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);
        
        conjunto.addAll(nums);
        
        System.out.println(conjunto);
        
    }
}


