package fundamentos;

public class desafioAritmeticos {
    public static void main(String[] args) {
        
        int resultado = (int) (Math.pow(Math.pow((6*(3+2)),2)/(3*2)-Math.pow((((1-5)*(2-7))/2), 2),3)/Math.pow(10,3));
        
        int a, b, c, d;
        a = 3+2;
        b = 3*2;
        c = 1-5;
        d = 2-7;

        int primeiraParcela = (int) Math.pow(6*a,2)/b;
        int segundaParcela = (int) Math.pow(c*d/2,2);
        int dividendo = (int) Math.pow(primeiraParcela-segundaParcela,3);
        int divisor = (int) Math.pow(10,3);
        int resultado2 = dividendo/divisor;
        System.out.println(resultado);
        System.out.println(resultado2);

        /*
        int a = 2;
        int b = (int) Math.pow(a, 3);
        double c = Math.pow(a , 10);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        */
    }
}
