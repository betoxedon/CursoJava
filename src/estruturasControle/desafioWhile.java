package estruturasControle;

import java.util.Scanner;

public class desafioWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota=0, soma=0, media;
        int contador=0;
        

        while (nota != -1) {
            
            System.out.println("Digite a nota do aluno ou 'sair' para ver os resultados: ");
            nota = entrada.nextDouble();
             
            if (nota<=10 && nota>=0){
                soma+=nota;
                contador++;
            }else{
                System.out.println("Valor inválido!");
            }
        }

        media = soma/contador;
        System.out.printf("A média das notas dos %d alunos é: %.2f", contador, media);
        
        entrada.close();
    }
}
