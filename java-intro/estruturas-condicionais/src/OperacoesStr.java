public class OperacoesStr {
    public static void main(String[] args) {
        String str = "Curso de Java";
        System.out.println("Tamanho da String: "+ str.length());
        System.out.println("Acesando posição de str: " + str.charAt(0));
        System.out.println("Comparando string: " + str.equals("Curso de Java"));
        System.out.println(str.startsWith("Curso")); //True - Compara inicio da str
        System.out.println(str.endsWith("Java")); //True - Compara final da str
        System.out.println(str.substring(5)); //Pegar intervalo
        System.out.println(str.substring(0, 5)); //Pegar intervalo
        System.out.println(str.replace("Curso", "Treinamento"));
        System.out.println(str.replace("a", "x"));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        String str2 = "                   Curso           de                 Java";

        System.out.println(str2.trim());




    }
}
