package classe;

public class DataTeste {
    public static void main(String[] args) {
        Data data1 = new Data();
        data1.ano = 1994;
        data1.mes = 01;
        data1.dia = 25;

        Data data2 = new Data();
        data2.ano = 1996;
        data2.mes = 8;
        data2.dia = 27;

        System.out.println(data1.obterData());

        Data data3 = new Data();
        System.out.println(data3.obterData());

        Data data4 = new Data(04, 06, 2021);
        System.out.println(data4.obterData());



    }
}
