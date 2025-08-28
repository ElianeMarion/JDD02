import java.util.Scanner;

public class DecisaoCompleta {
    public static void main(String[] args) {
        /*
        1. Efetuar a leitura de 3 notas de um aluno
        2. Tirar a média
        3. E exibir a mensagem: Aprovado quando a média for maior que 6
        e Reprovado caso contrário.
        4. Exibir a média
        * */

        Scanner leitor = new Scanner(System.in);
        double nota1, nota2, nota3, media;

        //Efetuar a leitura de 3 notas de um aluno
        System.out.println("Digite a 1ª nota: ");
        nota1 = leitor.nextDouble();
        System.out.println("Digite a 2ª nota: ");
        nota2 = leitor.nextDouble();
        System.out.println("Digite a 3ª nota: ");
        nota3 = leitor.nextDouble();

        //Tirar a média
        media = (nota1 + nota2 + nota3)/3;

        //E exibir a mensagem: Aprovado quando a média for maior que 6
        //Condição => media > 6
        //        e Reprovado caso contrário.
        if(media > 6){
            System.out.println("Aluno aprovado!");
        }else{
            System.out.println("Aluno reprovado");
        }
        //        Exibir a média
        System.out.println("Média: " + media);
    }
}
