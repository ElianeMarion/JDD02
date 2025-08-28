import java.util.Scanner;

public class MediaExame {
    public static void main(String[] args) {
        /*
        1. Efetuar a leitura de 3 notas de um aluno
        2. Tirar a média
        3. E exibir a mensagem: Aprovado quando a média for maior que 6 e frequencia >= 75
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
        System.out.println("Digite a frequencia do aluno: ");
        double frequencia = leitor.nextDouble();

        //Tirar a média
        media = (nota1 + nota2 + nota3)/3;

        //E exibir a mensagem: Aprovado quando a média for maior que 6
        //        e Reprovado caso media seja menor que 3
        //        e exame caso contrário.
        if(media > 6 && frequencia >= 75){
            System.out.println("Aluno aprovado!");
        }else if(media < 3 || frequencia < 40){
            System.out.println("Aluno reprovado");
        }else {
            System.out.println("Aluno em exame");
            System.out.println("Informe a nota do exame: ");
            double notaExame = leitor.nextDouble();
            double novaMedia = (media + notaExame)/2;
            if(novaMedia >=5 ){
                System.out.println("Aluno aprovado em exame com média " + novaMedia);
            }
            else{
                System.out.println("Aluno reprovado após exame com média "+ novaMedia);
            }
        }
        //        Exibir a média
        System.out.println("Média: " + media);
    }
}
