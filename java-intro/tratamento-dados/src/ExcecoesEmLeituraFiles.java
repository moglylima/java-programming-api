import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExcecoesEmLeituraFiles {

    public static void main(String[] args) {

        var fileDir = "/home/mogleson/Code/java-programming-api/tratamento-dados/src/test.txt";

        try {

            FileReader fileReader = new FileReader(fileDir);
            BufferedReader reader = new BufferedReader(fileReader);

            String linha;
            while ((linha = reader.readLine()) != null){
                System.out.println(linha);
            }
            reader.close();
        } catch (IOException e){
            System.err.println("Ocorreu um erro na leitura do arquivo...");
        }

    }
}
