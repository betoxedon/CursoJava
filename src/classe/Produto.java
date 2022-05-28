package classe;

public class Produto {

    static double desconto = 0.25;

    Produto(String nomeInicial){
        nome = nomeInicial;
        
    }
    
    String nome;
    double preco;

    double precoFinal (){
        return preco*(1-desconto);
    }
    
}
