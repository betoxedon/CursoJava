package estruturasControle;

import java.util.Scanner;

public class exercicios {
    public static void main(String[] args) {
        
        //1
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


        //2
        Scanner entrada = new Scanner(System.in);

        int ano = entrada.nextInt();
        boolean bissexto = false;

        if (ano%4==0) {
            
        }

        entrada.close();
        }

    }   

