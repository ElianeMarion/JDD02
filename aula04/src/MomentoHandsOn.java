import java.util.Scanner;

public class MomentoHandsOn {
    public static void main(String[] args) {
        /*
        Exercício 1: Preencha um vetor com 5 números.
        a) Exiba o maior valor.
        b) Some os elementos do vetor.
        c) Exiba a média dos elementos inseridos.
        d) Exiba o índice do primeiro positivo inserido.
        e) Exiba o índice do último negativo.
        * */
        Scanner leitor = new Scanner(System.in);
        int[] numeros = new int[5];
        //1: Preencha um vetor com 5 números.
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um número: ");
            numeros[i] = leitor.nextInt();
        }
        //a) Exiba o maior valor.
        int maior = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] > maior){
                maior = numeros[i];
            }
        }
        System.out.println("O maior valor do vetor é " + maior);

        // b) Some os elementos do vetor.
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        System.out.println("A soma dos elementos do vetor é " + soma);
        //c) Exiba a média dos elementos inseridos.
        //int media = soma / numeros.length; //resultado inteiro
        double media = soma / 5.0;
        System.out.println("Média dos elementos é " + media);

        //d) Exiba o índice do primeiro positivo inserido.
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] > 0){
                System.out.println("Indice do primeiro positivo é " + i);
                break;
            }
        }
        //e) Exiba o índice do último negativo.
        int indiceNegativo = -1;
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] < 0 ){
                indiceNegativo = i;
            }
        }
        if(indiceNegativo == -1)
            System.out.println("Não existem valores negativos no vetor");
        else
            System.out.println("Índice do último negativo é " + indiceNegativo);
    }
}
