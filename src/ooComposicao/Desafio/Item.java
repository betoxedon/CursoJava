package ooComposicao.Desafio;
public class Item {
    
    Produto produto;
    int quantidade;
    double total = produto.preco*quantidade;
    Compra compra;
    
    Item(Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }
}
