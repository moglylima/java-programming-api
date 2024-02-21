public class OperadoresMath {
    public static void main(String[] args) {
        System.out.println("5 + 2 = " + (5+2));
        System.out.println("5 - 2 = " + (5-2));

        //Sem o f depois do número, entendi-se que é uma divisão inteira, passando o f é considerado com float
        System.out.println("5 / 2 = " + (5f/2f));
        System.out.println("5 * 2 = " + (5*2));
        System.out.println("5 % 2 = " + (5%2));

        int x = 10;
        int y = 20;
        // x = y + x;
        x +=y;
        System.out.println("Valor x = " + x);

        x++;
        System.out.println("Valor x = " + x);

    }
}
