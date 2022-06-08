package ooComposicao.DesafioRoberto;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    
    final String nome;
    List<Compra> compras = new ArrayList<>();

    Cliente(String nome){
        this.nome = nome;
    }
    
    
    double obterValorTotal(){
        double totalGeral=0;
        for (Compra compra:compras){
            compra.obterTotal();
            totalGeral+=compra.obterTotal();
        }
        return totalGeral;   

    }

    void addCompra(Compra compra){
        this.compras.add(compra);
    }
    
}
