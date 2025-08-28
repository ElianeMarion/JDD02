import java.util.Scanner;

public class NumeroParImpar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //Leitura de um número inteiro
        //Exibir mensagem se o número é par (condição de um número)
        //se numero for divisivel por 2 e não ter resto

        int numero;
        System.out.println("Digite um número: ");
        numero = leitor.nextInt();  //ED
        //int resto = numero % 2; PD
        if(numero % 2 == 0){ //Bloco verdadeiro
            System.out.println(numero + " é um número par.");
        }else{ //senão -> bloco falso, o resultado da condição foi falso
            System.out.println(numero + " é um número ímpar.");
        }
    }
}
