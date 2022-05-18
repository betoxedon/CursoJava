package fundamentos;

import java.util.Scanner;

public class desafioLogico {
    public static void main(String[] args) {
        //Trabalho na terça (V ou F);
        //Trabalho na quinta (V ou F);

        Scanner entrada = new Scanner(System.in);
        Boolean trabalhoQuinta, trabalhoTerca;

        System.out.println("Você trabalhou na terça? (True ou False)");
        trabalhoTerca = entrada.nextBoolean();

        System.out.println("Você trabalhou na quinta? (True ou False");
        trabalhoQuinta = entrada.nextBoolean();
        
        Boolean tv50 = true ? (trabalhoQuinta==true && trabalhoTerca==true) : false;
        Boolean tv32 = true ? (trabalhoQuinta==false && trabalhoTerca==true || trabalhoQuinta==true && trabalhoTerca==false ):false;
        Boolean saudavel = true ? (tv50==false && tv32==false):true;

        if (tv50) {
            System.out.println("Comprar uma televisão de 50'' e comprar sorvete.");
        }else if (tv32) {
            System.out.println("Comprar uma televisão de 30''");
        }else {
            System.out.println("Ninguém consumiu açucar, logo todos estão saudáveis");
        }

        entrada.close();
    }
}
