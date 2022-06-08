package Coleções;

import java.util.HashSet;

public class hash {
    public static void main(String[] args) {
        HashSet<usuario> usuarios = new HashSet<usuario>();
        
        usuarios.add(new usuario("Pedro"));
        usuarios.add(new usuario("Ana"));
        usuarios.add(new usuario("Guilherme"));

        System.out.println(usuarios.toString());

        Boolean resultado = usuarios.contains(new usuario("Guilherme"));
        System.out.println((resultado));
        

    }
}
