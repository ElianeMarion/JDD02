public class Exemplos {
    public static void main(String[] args) {
        System.out.println("Números pares");
        for(int i = 0; i <= 20; i=i+2){ //i+=2
            System.out.println(i);
        }
        System.out.println("Números ímpares");
        for(int i = 1; i <= 20; i=i+2){ //i+=2
            System.out.println(i);
        }
        System.out.println("Números pares");
        for(int i = 20; i > 0; i=i-2){ //i+=2
            System.out.println(i);
        }

        int i = 20;
        while (i > 0){
            System.out.println(i);
            i = i-2;
        }
    }
}
