import java.util.Scanner;

public class LacoDoWhile {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //Objetivo: Saber a média de idade dos alunos
        int soma = 0, media;
        int aluno=1; //inicialização => valor inicial da variável de controle
        //Definir a condição de repetição
        do { //enquanto a condição for verdadeira eu entro no laço
            System.out.println("Digite a idade do " + aluno + "º aluno: ");
            int idade = leitor.nextInt();
            soma = soma + idade;
            aluno++;//incremento => ter um ponto no laço em que a variável de controle mudará de valor
        }while(aluno <= 2);
//aluno++ = aluno = aluno +1
        media = soma / 2;
        System.out.println("A média de idade dos alunos da escola é: " + media);

    }
}
