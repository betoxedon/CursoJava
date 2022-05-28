package classe.desafioModulo;

public class Pessoa {
    String nome;
    double peso;
    
    Pessoa(String nome, double peso){
        this.nome=nome;
        this.peso=peso;
    }

    void comer(Comida comida){
        if (comida != null){
            this.peso += comida.peso;
        }
    }
    void pesar(){
        System.out.printf("Meu peso é %.2f kg", this.peso);
    }
}
