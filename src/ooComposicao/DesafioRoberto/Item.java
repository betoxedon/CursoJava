package ooComposicao.DesafioRoberto;

public class Item {
    
    Produto produto;
    int quantidade;
    double total;
    Compra compra;
    
    Item(Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
        total=produto.preco*quantidade;
    }
}
