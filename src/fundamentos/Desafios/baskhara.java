package fundamentos.Desafios;

import java.util.Scanner;

public class baskhara {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Calcular raizes de equações do 2º grau.");
        System.out.print("Digite o valor de 'a': ");
        double a = entrada.nextDouble();

        System.out.print("Digite o valor de 'b': ");
        double b = entrada.nextDouble();

        System.out.print("Digite o valor de 'c': ");
        double c = entrada.nextDouble();

        double delta = b*b-4*a*c;

        
        if (delta<0){
            System.out.println("Não há raízes reais.");
        } else if (delta==0){
            System.out.println("Há apenas uma raiz real");
            double x = -b/(2*a);
            System.out.println("A raiz é " + x);
        }else {
            System.out.println("Existem duas raízes reais. ");
            double x1 = (-b+Math.sqrt(delta))/(2*a);
            double x2 = (-b-Math.sqrt(delta))/(2*a);
            System.out.printf("As raízes são %.2f e %.2f.", x1, x2);
        } 
        entrada.close();
    }
}
