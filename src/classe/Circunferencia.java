package classe;

public class Circunferencia {
    double raio;
    static final double PI = 3.14;

    Circunferencia (double raioInicial) {
        raio = raioInicial;
    }

    double area() {
        return raio*raio*PI;
    }

    double perimetro(){
        return 2*PI*raio;
    }
}
