package fundamentos.Desafios;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o seu peso: ");
        double peso = entrada.nextDouble();
        System.out.print("Digite a sua altura: ");
        double altura = entrada.nextDouble();

        double IMC = peso/(altura*altura);

        System.out.printf("Seu IMC é de %.2f.", IMC);

        entrada.close();


    }
}
