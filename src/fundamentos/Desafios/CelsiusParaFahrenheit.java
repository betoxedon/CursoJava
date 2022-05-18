package fundamentos.Desafios;

import java.util.Scanner;

public class CelsiusParaFahrenheit {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Converter Celsius para Fahrenheit: ");
        double temperatura = entrada.nextDouble();

        double resultado = temperatura*1.8+32;

        System.out.printf("A temperatura em fahrenheit- é : %.2f", resultado);

        entrada.close();

    }
}
