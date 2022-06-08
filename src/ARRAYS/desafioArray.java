package ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class desafioArray {
    public static void main(String[] args) {
        int numEntradas;
        double somaNotas=0, media;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o número de notas que deseja inserir: ");
        numEntradas = entrada.nextInt();
        
        double [] notasAlunos = new double[numEntradas];
        
        for (int i = 0; i<numEntradas;i++){
            System.out.printf("Digite a nota do aluno %d: ",i+1);
            notasAlunos[i]=entrada.nextDouble();
        }
        System.out.println(Arrays.toString(notasAlunos));
        entrada.close();

        for (double d : notasAlunos){
            somaNotas+=d;
        }
        
        media = somaNotas/numEntradas;

        System.out.printf("A média do aluno é: %.2f",media);
        
    }
}
