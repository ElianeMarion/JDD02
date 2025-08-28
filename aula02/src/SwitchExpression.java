public class SwitchExpression {
    public static void main(String[] args) {
        int dia = 5;
        String nomeDia = switch (dia){
            case 1 -> "Domingo";
            case 2 -> "Segunda";
            case 3 -> "Quarta";
            default -> "Dia inválido";
        };
        System.out.println(nomeDia);
    }
}
