import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        //Notas 50, 20, 10
        //Solicitar o valor do saque 270
        //Mostre quantas notas de 50, 20, 10
        Scanner leitor = new Scanner(System.in);
        //Cédulas 50,20,10
        int valor, notas50, notas20, notas10;
        System.out.println("Digite valor do saque: R$ ");
        valor = leitor.nextInt();
        notas50 = valor / 50;
        System.out.println("Notas de R$ 50,00 : " + notas50);
        valor = valor % 50;
        notas20 = valor / 20;
        System.out.println("Notas de R$ 20,00 : " + notas20);
        valor %= 20;  //valor = valor % 20;
        notas10 = valor / 10;
        System.out.println("Notas de R$ 10,00 : " + notas10);

    }
}
