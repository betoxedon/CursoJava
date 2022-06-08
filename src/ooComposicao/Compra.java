package ooComposicao;

import java.util.ArrayList;

public class Compra {
    
    String nomeCliente;
    ArrayList <Item> itens = new ArrayList<Item>();
    double total=0;

    void adicionarItem(String nome, int quantidade, double preco){
        this.adicionarItem(new Item(nome, quantidade, preco));
    }

    void adicionarItem(Item item){
        itens.add(item);
        item.compra=this;
    }

    int size(){
        return itens.size();
    }

    double ObterTotal(){
        for (Item item : itens) {
            this.total+=item.preco*item.quantidade;           
        }
        return total;
    }

}
