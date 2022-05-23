package estruturasControle;

public class aulaSwitchComBreak {
    public static void main(String[] args) {
        String conceito = "";
        int nota = 7;

        switch (nota) {
            case 10:
                conceito = "A";
                break;
            case 9:
                conceito = "A-";
                break;
            case 8:
                conceito = "B";
                break;
            case 7:
                conceito = "B-";
                break;
            case 6:
                conceito = "C";
                break;
            case 5:
                conceito = "C-";
                break;
            case 4:
                conceito = "D";
                break;
            case 3:
                conceito = "D-";
                break;
            case 2:
                conceito = "E";
                break;
            case 1:
                conceito = "E-";
            case 0: 
                conceito = "F";
                break;
            default:
                System.out.println("Nota inválida!");
                break;
        }
        System.out.printf("Conceito é %s",conceito);
        
    }
}
