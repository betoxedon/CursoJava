package fundamentos;

public class operadorTernario {
    public static void main(String[] args) {
        /*
        é possível fazer atribuições relacionais em uma variável com o 
        operador ternário da seguinte forma:
        variavel = (condição) ? (valorSeVerdadeiro) : (valorSeFalso)
        */

        //Exemplo

        String referencia = "Teste";

        String valor = (referencia=="Teste") ? "True" : "False";
        
        System.out.println(valor);
    }
}
