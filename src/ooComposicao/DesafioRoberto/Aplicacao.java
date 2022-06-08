package ooComposicao.DesafioRoberto;

public class Aplicacao {
    public static void main(String[] args) {
        
       Cliente cliente1 = new Cliente("Roberto Melo");
       
       Compra compra1 = new Compra();
       
       compra1.adItem("Caneta", 9.67, 100);
       compra1.adItem("Notebook", 1897.88, 2);
       
       Compra compra2 = new Compra();
        compra2.adItem("Caderno", 10, 10);
        compra2.adItem("impressora", 998.9, 1);

        cliente1.compras.add(compra1);
        cliente1.addCompra(compra2);
        
        System.out.println(cliente1.obterValorTotal());
        
    }
}
