package fundamentos.Desafios;

import java.util.Scanner;

public class quadradoCubo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        double valor = entrada.nextInt();

        System.out.printf("O dobro de %.0f é %.0f.%n", valor, Math.pow(valor, 2));
        System.out.printf("O triplo de %.0f é %.0f.", valor, Math.pow(valor, 3));
        entrada.close();
    }
}
