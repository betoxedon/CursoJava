package estruturasControle;


public class AulaSwitchSemBreak {
    public static void main(String[] args) {
        
        String faixa = "branca";

        switch(faixa.toLowerCase()){
            case "preta":
                System.out.println("Sei o Bassai-dan...");
            case "marrom":
                System.out.println("Sei o Tekki Shodan...");
            case "roxa":
                System.out.println("Sei o Heian Godan...");
            case "verde":
                System.out.println("Sei o Heian yodan...");
            case "vermelha":
                System.out.println("Sei o heidan shodan");
                break;
            default:
                System.out.println("não sei nada. ");
        }
        System.out.println("Fim!");

    }
}
