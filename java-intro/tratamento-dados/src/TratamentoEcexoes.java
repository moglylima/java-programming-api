import java.util.Scanner;

public class TratamentoEcexoes {
    public static void main(String[] args) {
        
        // Variáveis
        Scanner scanner = new Scanner(System.in);
        
        int x = 10/0;
        // 10/0 gera uma exceção
        
        String nome = null;
        // null gera uma exceção
        


        //Tudo dentro do try é monitorado
        try {
            int numero = scanner.nextInt();
            System.out.println("Você digitou o número: " + numero);
        } 
        // Se houver um erro, o catch é executado(Aqui é possível informar o erro)
        catch  (StringIndexOutOfBoundsException e) {
            System.out.println("Msg: " + e.getMessage());
            System.out.println("Erro: " + e);
        }
        //Aqui se trata de um erro genérico
        catch (Exception e) {
            System.out.println("Erro: " + e);
        }
        //O finally é executado independente de erro
        finally {
            System.out.println("Fim do programa");
        }
    } 



}
