package estruturasControle;

import java.util.Scanner;

public class aulaWhileIndeterminado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean controle = true;
        while (controle){
            System.out.print("Digite o texto a ser exibido ou 'sair' para encerrar: ");
            String valor = entrada.next().strip().toLowerCase();
            
            if ("sair".equals(valor)){
                controle=false;
                System.out.println("Até logo!");
            }else{
                System.out.println(valor);
            }            
        }


        entrada.close();
    }
}
