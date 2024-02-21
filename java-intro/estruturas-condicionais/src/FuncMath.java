public class FuncMath {
    public static void main(String[] args) {

        System.out.println(Math.max(10, 20)); //Identifica o maior
        System.out.println(Math.min(10, 20));
        System.out.println(Math.sqrt(200.0));
        System.out.println(Math.log10(100));
        System.out.println(Math.pow(2,3));


        //Indo aleḿ, comentando
        // Arredondamento
        System.out.println("Arredondamento de 7.25: " + Math.round(7.25));

        // Número aleatório entre 0 e 1
        System.out.println("Número aleatório: " + Math.random());

        // Valor absoluto
        System.out.println("Valor absoluto de -15: " + Math.abs(-15));

        // Seno e Cosseno
        double angleInDegrees = 45;
        double angleInRadians = Math.toRadians(angleInDegrees);
        System.out.println("Seno de 45 graus: " + Math.sin(angleInRadians));
        System.out.println("Cosseno de 45 graus: " + Math.cos(angleInRadians));

        // Potência
        System.out.println("2 elevado à potência de 3: " + Math.pow(2, 3));

        // Raiz quadrada
        System.out.println("Raiz quadrada de 25: " + Math.sqrt(25));

        // Mínimo e Máximo
        System.out.println("Menor entre 10 e 20: " + Math.min(10, 20));
        System.out.println("Maior entre 10 e 20: " + Math.max(10, 20));

    }
}
