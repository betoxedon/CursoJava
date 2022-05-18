package fundamentos.Desafios;

import java.util.Scanner;

public class fahrenheitParaCelsius {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Converter Fahrenheit para Celsius: ");
        double temperatura = entrada.nextDouble();

        double resultado = (temperatura-32)/1.8;

        System.out.printf("A temperatura em Célsius é : %.2f", resultado);

        entrada.close();

    }
}
