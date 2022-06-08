package Coleções;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        
        //Offer e add adicionam elementos a fila.
        //o add retorna falso, caso a fila esteja cheia
        //o offer lança uma exceção caso a fila esteja cheia
        fila.add("Ana");
        fila.offer("Bia");
        fila.offer("Carlos");
        fila.offer("Daniel");
        fila.offer("Rafaela");
        fila.offer("Gui");

        //Tanto o peek quanto o element não removem o elemento chamado da fila
        //se a fila estiver vazia o peek retorna null
        System.out.println(fila.peek());
        System.out.println(fila.peek());
        
        //se a fila estiver vazia o element retorna um erro
        System.out.println(fila.element());
        System.out.println(fila.element());

        
        System.out.println(fila.isEmpty());
        //fila.clear();
        //System.out.println(fila.isEmpty());

        System.out.println();
        System.out.println(fila.contains("Ana"));
        System.out.println();


        //poll e remove obtem o próximo elemento da fila
        //removendo-o em seguida.
        System.out.println(fila.poll()); //retorna null quando vazio
        System.out.println(fila.remove()); //retorna uma exceção
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
    }
}
