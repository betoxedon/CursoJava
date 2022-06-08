package ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numAlunos, numNotas;

        System.out.println("Digite o número de alunos que deseja inserir as notas: ");
        numAlunos = entrada.nextInt();
        System.out.println("Digite o número de notas de cada aluno: ");
        numNotas = entrada.nextInt();

        double [][] notasAlunos = new double[numAlunos][numNotas];

        double [] mediaAlunos = new double[numNotas];

        for (int i = 0; i<numAlunos;i++){
            System.out.printf("Aluno %d:%n",i+1);
            
            for (int j = 0; j<numNotas; j++){
                System.out.printf("----Digite a nota %d: ",j+1);
                notasAlunos[i][j] = entrada.nextDouble();
            }
        }

        for (double[] ds : notasAlunos) {
            System.out.println(Arrays.toString(ds));
        }

        for (int i = 0; i<numAlunos; i++){
            double soma = 0;
            for (int j = 0; j<numNotas; j++){
                soma += notasAlunos[i][j];
            }
            mediaAlunos[i]=soma/numNotas;
        }

        double mediaTurma = 0;

        for (double d : mediaAlunos) {
            mediaTurma+=d;
        }
        mediaTurma/=numAlunos;

        System.out.println("A média de cada aluno é: ");
        for (int i = 0; i<numAlunos; i++){
            System.out.printf("Aluno %d: media = %.2f%n",i+1, mediaAlunos[i]);
        }

        System.out.printf("A média da turma é de: %.2f%n", mediaTurma);
        
        entrada.close();
    }
}
