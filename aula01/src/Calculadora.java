import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Calculadora");
        System.out.println("============================");
        int n1, n2, resultado;
        //double soma, sub, mult, divisao;
        System.out.println("Digite o primeiro número");
        n1 = leitor.nextInt();
        System.out.println("Digite o segundo número");
        n2 = leitor.nextInt();
        resultado = n1 + n2;
        System.out.println(n1 + " + " + n2 + " = " + resultado);
        resultado = n1 - n2;
        System.out.println("Subtração = " + resultado);
        resultado = n1 * n2;
        System.out.println("Multiplicação = " + resultado);
        resultado = n1 / n2;
        System.out.println("Divisão = " + resultado);

    }
}
