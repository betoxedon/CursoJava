package fundamentos;

import java.util.Scanner;

public class desafioFundamentos {
    public static void main(String[] args) {
        //Ler num1;
        //Ler num2; 
        //Ler o sinal da operação +, -, *, /, %

        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Insira o 1º valor: ");
        double num1 = entrada.nextDouble();
        System.out.print("Insira o 2º valor: ");
        double num2 = entrada.nextDouble();
        System.out.print("Insira o sinal da operação: ");
        String sinal = entrada.next().trim();
        
        double resultado = "+".equals(sinal) ? num1+num2:0;
        resultado = "-".equals(sinal) ? num1-num2:resultado;
        resultado = "*".equals(sinal) ? num1*num2:resultado;
        resultado = "%".equals(sinal) ? num1%num2:resultado;
        resultado = ("/".equals(sinal) && num2!=0) ? num1/num2:resultado;


        /*
        if ("+".equals(sinal.trim())){
            resultado = num1+num2;
        }else if ("-".equals(sinal.trim())){
            resultado = num1-num2;
        }else if ("*".equals(sinal.trim())){
            resultado = num1*num2;
        }else if ("/".equals(sinal.trim()) && num2!=0) {
            resultado = num1/num2;
        }else if ("/".equals(sinal.trim()) && num2==0) {
            System.out.println("O denominador (num2) deve ser diferente de '0'.");
        }else if ("%".equals(sinal.trim())){
            resultado = num1%num2;
        }else {
            System.out.println("Valor inserido incorretamente.");
        }
        */
        System.out.println(resultado);

        entrada.close();
    }
}
