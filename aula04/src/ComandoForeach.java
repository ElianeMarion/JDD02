public class ComandoForeach {
    public static void main(String[] args) {
        String[] alunos = new String[]{"Ana", "Eliane", "Maria", "José"};
        //Percorrer o vetor exibindo os nomes
        //for(inicialização; condição; incremento) => numérica
        for(int i = 0; i<4; i++){
            System.out.println(alunos[i]);
        }

        //for (declarar uma variavel de mesmo tipo do vetor/lista : vetor/lista
        //para cada aluno da lista/vetor  alunos faça
        for(String aluno : alunos){
            System.out.println(aluno);
        }
        //Declarando numeros é um conjunto de 8 elementos inteiros
        int[] numeros = new int[]{1,5,8,9,10,57,98,85};
        int dobro;
        for(int x : numeros){
            System.out.println(x);
            dobro = x * 2;
            System.out.println(dobro);
        }

        for(int i = 0; i <8; i++){
            System.out.println(numeros[i]);
            dobro = numeros[i] * 2;
            System.out.println(dobro);
        }
    }
}
