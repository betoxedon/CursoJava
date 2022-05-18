package desafios_Next;

import java.util.Scanner;

public class areaDoCirculo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double raio = entrada.nextDouble();
        double area = 3.14159*raio*raio;
        System.out.printf("A=%.4f", area);
        entrada.close();
    }
}
