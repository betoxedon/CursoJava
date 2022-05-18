package fundamentos;

import javax.swing.JOptionPane;

public class string2Num {
    public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog(
            "Digite o primeiro numero: ");

        String valor2 = JOptionPane.showInputDialog(
            "Digite o segundo numero: ");
        
        double num1 = Double.parseDouble(valor1);
        double num2 = Double.parseDouble(valor2);
        double total = num1 + num2;
        double media = total / 2;
        System.out.printf("A soma das notas é: %.2f%n", total);
        System.out.printf("A média das notas é: %.2f%n", media);
    }
}
