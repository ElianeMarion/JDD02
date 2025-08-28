import java.util.Scanner;

public class DecisaoSimples {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int idade;
        System.out.println("Digite sua idade: ");
        idade = leitor.nextInt();
        //Se a idade for maior ou igual a 18 faça
        if(idade >= 18) //se a resposta for verdadeiro ele entra na decisao
        {
            System.out.println("Você pode tirar a habilitação");
            System.out.println("Obrigada por utilizar nosso sistema");
        }



    }

}
