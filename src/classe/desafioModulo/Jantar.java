package classe.desafioModulo;


public class Jantar {
    public static void main(String[] args) {
        Comida c1 = new Comida("Macarrão", 0.2);
        Pessoa p1 = new Pessoa("Roberto", 70);
        Comida arroz = new Comida("arroz", 0.5);

        System.out.println(p1.peso);
        p1.comer(c1);
        p1.comer(arroz);
        System.out.println(p1.peso);

        p1.pesar();

    }
}
