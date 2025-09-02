import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //Objetivo: Saber a média de idade dos alunos
        int id1, id2, id3, id4, id5;
        int soma = 0, media;
        System.out.println("Digite a idade do 1º aluno: ");
        id1 =  leitor.nextInt();
        System.out.println("Digite a idade do 2º aluno: ");
        id2 =  leitor.nextInt();
        System.out.println("Digite a idade do 3º aluno: ");
        id3 =  leitor.nextInt();
        System.out.println("Digite a idade do 4º aluno: ");
        id4=  leitor.nextInt();
        System.out.println("Digite a idade do 5º aluno: ");
        id5= leitor.nextInt();
        media = (id1 + id2 + id3+id4+id5) / 5;
        System.out.println("A média de idade dos alunos da escola é: " + media);

    }
}
