package Coleções;

import java.util.ArrayList;


public class lista {
    public static void main(String[] args) {
        ArrayList<usuario> lista = new ArrayList<>();

        lista.add(new usuario("Carlos"));
        lista.add(new usuario("Pedro"));
        lista.add(new usuario("Lia"));
        lista.add(new usuario("Ana"));
        lista.add(new usuario("Ravi"));
        System.out.println();
        System.out.println(lista.get(3));
        System.out.println();

        for (usuario usuario : lista) {
            System.out.println(usuario.toString());
        }
        
        lista.remove(3);
        System.out.println(lista.remove(new usuario("Lia")));

        System.out.println(lista.toString());
    
    }

}
