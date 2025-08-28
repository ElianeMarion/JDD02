public class ExemploSwitch {
    public static void main(String[] args) {
        int mes = 4;
        switch (mes){
            case 1: System.out.println("Janeiro"); break;
            case 2: System.out.println("Fevereiro");break;
            case 3: System.out.println("Março");break;
            case 4:  System.out.println("Abril");break;
            case 5:  System.out.println("Maio");break;
            default:
                System.out.println("Mês inválido");break;
        }

        String dia = "ter";
        switch (dia){
            case "seg":
            case "ter":
            case "qua":
            case "qui":
            case "sex":
                System.out.println("Dia útil");
                break;
            case "sab":
            case "dom":
                System.out.println("Final de semana - folga"); break;
            default:
                System.out.println("dia inválido"); break;
        }

        char sinal = '+';
        switch (sinal){
            case '+':
                System.out.println("soma"); break;
            case '-':
                System.out.println("subtração");break;
            case '*':
            case 'x':
            case '.':
                System.out.println("Multiplicação");break;
            default:
                System.out.println("sinal inválido");
        }
        /*
        if(mes == 1)
            System.out.println("Janeiro");
        else if(mes == 2)
            System.out.println("Fevereiro");
        else if (mes == 3) {
            System.out.println("Março");
        } else if (mes == 4) {
            System.out.println("Abril");
        }*/
    }
}
