import java.util.Scanner;

public class OrdemInversa {
    public static void main(String[] args) {
        //Ler um vetor com 10 elementos
        //Construir um segundo vetor com mesma dimensão
        //colocando os elementos do vetor1 em ordem inversa
        //vetor1 = 1,2,3,4,5
        //vetor2 = 5,4,3,2,1
        Scanner leitor = new Scanner(System.in);
        int[] vetA = new int[10];
        int[] vetB = new int[10];
        int i;
        for(i =0; i <10; i++){
            System.out.println("Digite o " + (i+1) + " º número: ");
            vetA[i] = leitor.nextInt();
        }

        for(i = 0; i <10; i++){
            vetB[i] = vetA[9-i];
        }
        /*vetb[0] = veta[9]
          vetb[1] = veta[8]
          vetb[2] = veta[7]
        */
        int x = vetA.length - 1;  // x = 9
        for(i = 0; i <10; i++){
            vetB[i] = vetA[x];
            x--;
        }
        for(i = 0; i <10; i++){
            System.out.println(vetB[i]);
        }


    }
}
