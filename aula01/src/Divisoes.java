public class Divisoes {
    public static void main(String[] args) {
        //3 tipos de divisões: divisão, divisão inteira, resto da divisão
        int a = 5, b = 2, res;
        res = a / b;
        System.out.println("Resultado = " + res);

        double c = 5.0, result;
        result = c / b;
        System.out.println("Resultado = " + result);
        //% é o operador para calcular resto de divisão inteira
        int resto = a % b;
        System.out.println("Resto = " + resto);

        int x = 5;
        x++; //Somando 1 ao x => x =  x + 1
        System.out.println(x);
        x--; //x = x -1;
        System.out.println(x);

        System.out.println(x + " - ");//5
        System.out.println(x++ + " - ");//5
        System.out.println(++x);//6 7

        //Forma simplificada de escrever operações
        //Toda vez que tiver a mesma variável dos dois lados
        x = x + 2; //Pega o valor de x, soma 2 e atribui no x
        x += 2;

        //Operadores simplificados: +=  -=  *=  /=  %=
    }
}
