import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        /*
        * Estamos desenvolvendo um sistema para a nossa ONG
        *  “Solidariedade sem Fronteiras” e precisamos
        * definir um usuário administrador que faça o
        * login inicial ao nosso sistema.
        * Precisamos fazer um programa que verifique se
        * o usuário digitado é igual a “administrador” e
        * se a senha digitada é igual a “123”.*/
        Scanner leitor = new Scanner(System.in);
        String login, senha;
        System.out.println("Usuário: ");
        login = leitor.next();
        System.out.println("Senha: ");
        senha = leitor.next();
        if(login.equalsIgnoreCase("Administrador") && senha.equals("123") ){
            System.out.println("Acesso autorizado");
        }else{
            System.out.println("Acesso negado, usuário ou senha inválidos.");
        }
    }
}
