import java.util.Scanner;

public class Calculos {
    public static void main(String[] args) {
        //Atribuição
        int x = 10; //atribuindo o valor 10 na variável x
        String nome, telefone, email;

        //Cálculos / processamento
        //soma = x * 2;
        System.out.println(x + 20);

        //Operadores aritméticos
        /*
        Ordem de precedência
        *  divisão: / (inteira ou normal) | multiplicação: * | Resto da divisão: % (módulo)
        *  soma: +, subtração: -
        * () mudam a precedência
        * */

        //Realizar a leitura de 2 notas, tirar a média e exibí-la
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe a primeira nota do aluno: ");
        double nota = leitor.nextDouble();
        System.out.println("Informe a segunda nota do aluno: ");
        double nota2 = leitor.nextDouble();
        //double soma = nota + nota2;
        double media = (nota + nota2) / 2;
        System.out.println("A média do aluno é " + media);





    }
}
