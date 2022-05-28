package classe;

public class valorVersusReferencia {
    public static void main(String[] args) {
        double a = 2;
        double b = a;

        a--;
        b++;

        System.out.println(a +"   "+ b);

        Data d1 = new Data(25, 01, 1994);
        Data d2 = d1; //Atribuição por referência

        d2.ano=2022;

        System.out.println(d1.obterData());

        mudarValor(a);
        System.out.println(a);


    }
    static void VoltarDataParaValorPadrao(Data d){
        d.dia = 1;
        d.mes = 1;
        d.ano = 1970;
    }

    static void mudarValor(double a){
        a++;
    }
}
