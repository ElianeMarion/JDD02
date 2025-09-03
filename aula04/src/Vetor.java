import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double nota, soma = 0;
        //Declaração de array / vetor / var. indexada
        double[] notas = new double[4];
        //Inicializando um vetor
        String[] alunoss = new String[]{"Ana", "Eliane", "Maria", "José"};
        String[] alunos = {"Ana", "Eliane", "Maria", "José"};

        //Leitura de vetor
        for(int i = 0; i < 4; i++){
            System.out.println("Digite a " + (i+1) + "ªnota: ");
            notas[i] = leitor.nextDouble();
        }
        for(int i = 0; i <= 3; i++){
            soma += notas[i];
        }
        double media = soma /4;

        //Saída
        System.out.println(notas[0] + " - " + notas[1] + " - "
                + notas[2] + " - " + notas[3]);
        System.out.println("Média do aluno: " + media);
    }
}
