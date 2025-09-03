import java.util.Arrays;
import java.util.Collections;

public class ManipulandoVetor {
    public static void main(String[] args) {
        String[] alunos = new String[]{"Ana", "Vitoria", "Eliane", "Maria", "José"};
        //Ordenar o vetor
        Arrays.sort(alunos);
        System.out.println("Vetor ordenado");
        for(int i = 0; i < alunos.length; i++)
            System.out.println(alunos[i]);
        System.out.println("\n------------------------------\n");
        System.out.println("Exibindo o Vetor invertido");
        for(int i = alunos.length -1; i >= 0; i--){
            System.out.println(alunos[i]);
        }

        System.out.println("\n------------------------------\n");
        System.out.println("Vetor invertido - usando método");
        Arrays.sort(alunos, Collections.reverseOrder());
        for(int i = 0; i < alunos.length; i++){
            System.out.println(alunos[i]);
        }
        System.out.println("\n------------------------------\n");
        System.out.println("Buscar um nome no vetor");
        String busca = "Maria";
        boolean encontrou = false;

        for(int i = 0; i < alunos.length; i++){
            if(alunos[i].equalsIgnoreCase(busca)){
                System.out.println(busca + " foi encontrado no vetor");
                encontrou = true;
                break;
            }
        }
        if(!encontrou)
            System.out.println(busca + " não foi encontrado no vetor");

        System.out.println("\n------------------------------\n");
        System.out.println("Buscar um nome no vetor usando método");
        Arrays.sort(alunos);
        int achou = Arrays.binarySearch(alunos, busca);
        if(achou >= 0)
            System.out.println(busca + " foi encontrado no vetor");
        else
            System.out.println(busca + " não foi encontrado no vetor");
    }
}
