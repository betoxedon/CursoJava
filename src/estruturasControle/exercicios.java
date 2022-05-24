package estruturasControle;

import java.util.Random;
import java.util.Scanner;

public class exercicios {
    public static void main(String[] args) {
        
        //1 entre dez e par
        /*
        {
            Scanner entrada = new Scanner(System.in);
            int num = entrada.nextInt();
            entrada.close();
            boolean par=false, range=false;
            
            if (num<10 && num>1){
                range = true;
            }
            
            if (num%2==0){
                par=true;
            }
    
            if (par && range){
                System.out.println("O número está entre 0 e 10 e é par");
            }else if (par && !range){
                System.out.println("O número não está entre 0 e 10, porém é par.");
            }else if (!par && range){
                System.out.println("O número está entre 0 e 10, porém é ímpar.");
            }else {
                System.out.println("O número não está entre 0 e 10 e é ímpar");
            }
            */

        //2 Bissexto
        /*
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o ano: ");
        int ano = entrada.nextInt();
        boolean bissexto = false;

        if (ano%4==0) {

            if (ano%100==0 && ano%400==0){
                bissexto=true;

            }else if (!(ano%100==0)){
                bissexto=true;
            }
            
        }else {
            bissexto = false;
        }
        System.out.printf("O ano %d é bissexto = %b",ano, bissexto);
        

        entrada.close();
        */
    
        //3 Situação aluno
        /*

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a nota 1: ");
        double nota1 = entrada.nextDouble();

        System.out.print("Digite a nota 2: ");
        double nota2 = entrada.nextDouble();

        double media = (nota1 + nota2)/2;

        if (media>=7){
            System.out.println("Aprovado!");
        }else if(media>=4 && media<7) {
            System.out.println("Recuperação!");
        }else {
            System.out.println("Reprovado!");
        }

        entrada.close();
        */

        //4 Números primos
        /*
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        boolean flag = true;

        for (int i = num-1; i>1; i--){
            if (num%i==0){
                flag=false;
                break;
            }
        }
        if (flag){
            System.out.printf("O número %d é primo", num);
        }else {
            System.out.printf("O número %d não é primo.", num);
        }
        

        entrada.close();
        */
    
        //5 Números primos
        /*
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        String flag = "é primo";

        for (int i = num-1; i>1; i--){
            if (num%i==0){
                flag="Não é primo";
                break;
            }
        }

        switch (flag) {
            case "é primo":
            System.out.printf("O número %d é primo", num);
                break;
            default:
                System.out.printf("O número %d não é primo.", num);
                break;
        }
        
        entrada.close();
        */
        
        //6 jogo da adivinhação
        /*
        Scanner entrada = new Scanner(System.in);
        Random rand = new Random();
        int limiteSuperior = 101;
        int num_rand = rand.nextInt(limiteSuperior);
        int num;
        System.out.print("Tente adivinhar o número entre 1 e 100! ");
        
        for (int i=10; i>0; --i){
            System.out.print("\nDigite um número: ");
            num = entrada.nextInt();
            
            if (num==num_rand){
                System.out.print("Parabéns, você acertou!!!");
                break;

            }else if (num>num_rand){
                System.out.print("O número secreto é menor!");
                System.out.printf("você tem %d tentativas.",i);
                
            }else if (num<num_rand) {
                System.out.print("O número secreto é maior!");
                System.out.printf("você tem %d tentativas.",i);
            }

        }
        
        entrada.close();
        */
        
        //7 Num positivos
        /*
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um num positivo, para parar um num negativo.");
        int num = entrada.nextInt();
        int soma = 0;

        while (num>0){
            soma+=num;
            System.out.println("Digite um num positivo, para parar um num negativo.");
            num = entrada.nextInt();

        }    
        System.out.println("A soma é: " + soma);

        entrada.close();
        */


        //8 Letras 
        /*
        Scanner entrada = new Scanner(System.in);

        String palavra = entrada.next();
        int tamanho = palavra.length();
        
        for (int i = 0; i<tamanho ; i++){
            System.out.println(palavra.charAt(i));
        }
        

        entrada.close();
        */

        //9 maior
        /*
        Scanner entrada = new Scanner(System.in);
        boolean flag = true;
        int maior = 0;

        int num;

        for (int i = 10; i>0;i--){
            num = entrada.nextInt();

            if (flag){
                maior = num;
                flag = false;
            }
            if (num>maior){
                maior=num;
            }
        }
        System.out.println("O maior é: " + maior);

        entrada.close();
        */
    }


}   

