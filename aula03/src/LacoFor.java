import java.util.Scanner;

public class LacoFor {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //Objetivo: Saber a média de idade dos alunos
        int soma = 0, media;
        System.out.println("Quantos alunos serão inseridos? ");
        int quantidadeAlunos = leitor.nextInt();
        //para aluno de 1 ate 5 com incremento de 1 faça
        for(int aluno = 1; aluno <= quantidadeAlunos; aluno++){ //enquanto a condição for verdadeira eu entro no laço
            System.out.println("Digite a idade do " + aluno + "º aluno: ");
            int idade = leitor.nextInt();
            soma = soma + idade;
        }


//aluno++ = aluno = aluno +1
        media = soma / quantidadeAlunos;
        System.out.println("A média de idade dos alunos da escola é: " + media);

    }
}
