public class PrecedenciaOp {
    public static void main(String[] args) {
        /*
        * Precedência de operadores
        * - Divisão
        * - Multiplicação
        * - Resto da divisão
        * - Adição e Subtração
         */

        int x = 10/2*(3+4)*3; // 10/2*7*3 // 5*7*3 = 35*3 = 105

        System.out.println("Valor em X = "+ x);

        //OBS... Usando parenteses podemos alterar as regras de precedências

        int a=10, b=30, c=40;
        System.out.println(c/(a+b));
    }
}
