package estruturasControle;

import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        //if (condição) {sentença}
        //while (condição) {sentença}
        //for (variável;condição;incremento){sentença}
        //do {sentença} while (condição)
        Scanner entrada = new Scanner(System.in);
        Boolean condicao = true;
        do {
            String valor = entrada.next();
            if ("sair".equalsIgnoreCase(valor)) {
                condicao = false;
            }
            System.out.printf("Inserido: %s%n",valor);
            
        }while(condicao);

        entrada.close();

    }
}
