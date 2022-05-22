package estruturasControle;

import java.util.Scanner;

public class aulaif {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("informe a media: ");
        double media = entrada.nextDouble();

        //o IF executa a próxima expressão ou bloco de código, caso a condição seja verdadeira.
        /*
        * caso não seja indicado um bloco "{}" o Java interpreta que a próxima linha (expressão) de código
        se trata da ação dentro do if, não executando as demais. 
        */
        if (media>7){
            System.out.println("Parabéns! Você foi aprovado!");
        }

        entrada.close();
    }
}
