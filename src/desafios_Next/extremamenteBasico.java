package desafios_Next;

import java.util.Scanner;

public class extremamenteBasico {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int x = a + b;

        System.out.println("X = " + x);

        entrada.close();
    }
}
