import java.util.Scanner;

public class BancoFiap {
    public static void main(String[] args) {
        /*Exercício 1: Caixa eletrônico
        Utilizando a estrutura switch case, elabore um programa que leia um valor referente a uma transação bancária de acordo com as opções abaixo:
        1 – Depósito
        2 – Saque
        3 – Ver saldo
        4 - Sair
        Lembre-se: o saldo começa com 0 (zero).
        O programa deve controlar o valor do saldo a cada depósito ou saque.
        A conta pode ficar negativa.
        O usuário permanecerá no programa até digitar a opção 4 – sair.
        */

        Scanner leitor = new Scanner(System.in);
        int op;
        double saldo = 0, valor;
        System.out.println("Bem vindo ao Banco Fiap!\n");
        do {
            System.out.println("Digite:\n" +
                    "1 - Depósito\t2 - Saque\t3 - Consultar Saldo\t4 - Sair");
            op = leitor.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Depósito");
                    System.out.println("Informe o valor a ser depositado: ");
                    valor = leitor.nextDouble();
                    saldo += valor;
                    break;
                case 2:
                    System.out.println("Saque");
                    System.out.println("Informe o valor a ser sacado: ");
                    valor = leitor.nextDouble();
                    //Verificar se tem saldo
                    if(valor > saldo)
                        System.out.println("Saldo insuficiente");
                    else
                        saldo -= valor;
                    break;
                case 3:
                    System.out.println("Consultar saldo");
                    System.out.println("Saldo: R$ " + saldo);
                    break;
                case 4:
                    System.out.println("Obrigada por utilizar nosso sistema");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while (op != 4);
    }
}
