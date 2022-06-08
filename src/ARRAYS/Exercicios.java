package ARRAYS;

import java.util.Arrays;

public class Exercicios {
    
    static double media(double aluno[]){
        double total=0;
        for (int i=0; i<aluno.length;i++ ){    
            System.out.printf("A nota do aluno %d é %.2f%n",i+1, aluno[i]);
            total+=aluno[i];
        }
        return total/aluno.length;
    }
    public static void main(String[] args) {
        
        double[] notasAlunos = new double[3];
        notasAlunos[0]=7.9;
        notasAlunos[1]=8;
        notasAlunos[2]=6.7;

        System.out.println(Arrays.toString(notasAlunos));

        int tamanho=notasAlunos.length;
        double total = 0;
        System.out.printf("A média das notas dos alunos é %.2f",total/tamanho);
        
        double[] notasAlunosB = {6.7, 8.9, 5.5, 10};
        System.out.println(media(notasAlunosB));

        for (double d : notasAlunosB) {
            System.out.println(d);
        }
    }
}
