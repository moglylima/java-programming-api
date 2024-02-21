import java.util.Scanner;

public class entradaMatrizes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o numero de linhas: ");
        int linhas =scanner.nextInt();

        System.out.print("Digite o numero de clonas: ");
        int colunas = scanner.nextInt();

        int [][] matriz = new int[linhas][colunas];

        System.out.println("Digite os  elementos da matriz: ");
        for (int i=0; i<linhas; i++){
            for (int j=0; j<colunas; j++){
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Matriz lida, vamos exibila!!!");

        for(int i =0; i < linhas; i++){
            for (int j = 0; j < colunas; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }
}
