package estruturasControle;

public class for3 {
    public static void main(String[] args) {
        
        /*
        //definindo a variável fora do laço
        int i = 0;
        for (; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("Saiu do laço");
        System.out.println(i);

        //definindo mais uma vez a variável;
        i = 0;
        System.out.println(i);
        */

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("[%d%d]",i,j);
                
                
            }
            System.out.println();
        }
    }
}
