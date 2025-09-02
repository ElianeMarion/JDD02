import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        /*
        4! = 4*3*2*1
        5! = 5*4*3*2*1
        * */
        int fat = 1;
        System.out.println("Informe um número ");
        Scanner leitor = new Scanner(System.in);
        int n = leitor.nextInt();
        for(int i = n; i > 1; i--){
            fat = fat * i;
        }
        System.out.println(n + "! = " + fat);
    }
}
