import java.util.Scanner;

public class NumeroPar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //Leitura de um número inteiro
        //Exibir mensagem se o número é par (condição de um número)
        //se numero for divisivel por 2 e não ter resto

        int numero;
        System.out.println("Digite um número: ");
        numero = leitor.nextInt();
        //int resto = numero % 2;
        if(numero % 2 == 0){
            System.out.println(numero + " é um número par.");
        }
    }
}
