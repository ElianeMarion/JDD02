import java.util.Arrays;

public class OrdenacaoVetor {
    public static void main(String[] args) {
        String[] alunos = new String[]{"Ana", "Vitoria", "Eliane", "Maria", "José"};
        //Ordenar o vetor
        Arrays.sort(alunos);
        System.out.println("Vetor ordenado");
        for(int i = 0; i < alunos.length; i++)
            System.out.println(alunos[i]);



    }
}
