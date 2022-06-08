package ooComposicao.DesafioRoberto;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    
    List<Item> itens = new ArrayList<>();
    
    double obterTotal(){
        double totalCompra=0;
        for (Item item : itens) {
            totalCompra+=item.total;
        }
        return totalCompra;
    }

    void adItem(String nome, double preco, int quantidade){
        var produto = new Produto(nome, preco);
        this.itens.add(new Item(produto, quantidade));
    }


}
