package Coleções;

import java.util.ArrayDeque;
import java.util.Deque;

public class pilha {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<>();
        livros.add("O pequeno principe");
        livros.push("Don Quixote");
        livros.push("O hobbit");
        
        System.out.println(livros.peek());

        System.out.println(livros.element());

        System.out.println(livros.poll());
        System.out.println(livros.poll());
        //System.out.println(livros.poll());
        //System.out.println(livros.poll());

        System.out.println(livros.pop());

        System.out.println(livros.size());
        //livros.contains();
        //livros.clear();
        
    }
}
