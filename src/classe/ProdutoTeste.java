package classe;

public class ProdutoTeste {
    public static void main(String[] args) {
        
        
        Produto p1 = new Produto("Notebook");
        //p1.nome = "Notebook";
        p1.preco = 2999.99;
        //p1.desconto = 0.1;

        
        Produto p2 = new Produto("Caneta Azul");
        //p2.nome="caneta";
        p2.preco = 1.99;
        //p2.desconto = 0;

        Produto.desconto = 0.3;

        System.out.println(p2.nome);
        System.out.println(p1.nome);

        System.out.println(p1.precoFinal());

    }
}
