package Coleções;

class Aplicacao {
    public static void main(String[] args) {
        System.out.println(new Carro("a"));
        System.out.println(new Carro("x"));
    }
    static class Carro {
        public Carro(String marca) {
        }
        
        public int hashCode() {
            return 1;
        }
    }
}
