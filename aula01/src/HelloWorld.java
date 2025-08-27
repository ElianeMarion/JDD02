import java.util.Scanner;

//Padrão para nome de classe UpperCamelCase
public class HelloWorld {
    public static void main(String[] args) {
        //Entrada - Saída - Processamento
        //Saída -> programa interagir/enviar dados/textos para o usuário
        //Exibir algo

        System.out.println("Hello world!"); //Atalho no IntelliJ sout | Eclipse - syso
        System.out.println("Boa noite");
        System.out.println("Digite seu nome: ");

        /* Variável de memória: Um espaço na memória RAM para armazenar
         uma informação.
           nome de variável por convenção: começa com letra minúscula
           e usa padrão camelCase
         tipo nomeVariavel;

         Tipos:
         int
         double
         char
         boolean
         String - textos
         */
        //Declarando uma variável
        String nomeAluno;

        //Processamento - não há interação
        int idadeDoAluno = 47;
        double notaAluno = 8.5;
        boolean casado = true;

        //Entrada de dados -> interação do usuário com o sistema
        //atribuir em uma variável o conteúdo digitado pelo usuário
        Scanner leitor = new Scanner(System.in);
        nomeAluno = leitor.nextLine();
        System.out.println("Bem vindo(a) ao curso " + nomeAluno);

        /*nomeAluno = leitor.next();
        System.out.println("Bem vindo(a) ao curso " + nomeAluno);*/
        System.out.println("Digite sua idade: ");
        idadeDoAluno = leitor.nextInt();
        System.out.println(nomeAluno + " você tem " + idadeDoAluno + " anos");

    }
}
