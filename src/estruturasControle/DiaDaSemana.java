package estruturasControle;

import java.util.Scanner;

public class DiaDaSemana {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um dia da semana: ");
        String diaDaSemana = entrada.next().toLowerCase().strip();
        int valor = 0;
        System.out.println(diaDaSemana);
        
        if ("domingo".equals(diaDaSemana)){
            valor = 1;
        }else if ("segunda".equals(diaDaSemana)){
            valor = 2;
        }else if ("terça".equals(diaDaSemana) || "terca".equalsIgnoreCase(diaDaSemana)){
            valor = 3;
        }else if ("quarta".equals(diaDaSemana)){
            valor = 4;
        }else if ("quinta".equals(diaDaSemana)){
            valor = 5;
        }else if ("sexta".equals(diaDaSemana)){
            valor = 6;
        }else if ("sábado".equals(diaDaSemana) || "sabado".equalsIgnoreCase(diaDaSemana)){
            valor = 7;
        }else {
            valor = 0;
        }

        if (valor==0){
            System.out.println("O dia inserido é inválido.");
        }else {
            System.out.println("O número do dia é : "+ valor);
        }

        entrada.close();
    }
}
