package fundamentos;



import java.util.Scanner;

public class desafioConversao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o 1º salário: ");
        String valor1 = entrada.next().replace(",", ".");
        double salario1 = Double.parseDouble(valor1);

        System.out.print("Digite o 2º salario: ");
        String valor2 = entrada.next().replace(",", ".");
        double salario2 = Double.parseDouble(valor2);

        System.out.print("Digite o 3º salario: ");
        String valor3 = entrada.next().replace(",", ".");
        double salario3 = Double.parseDouble(valor3);
        entrada.close();



        double media = (salario1+salario2+salario3)/3;

        System.out.printf("A média dos salários é de: %.2f", media);
    }
}
