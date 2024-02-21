public class MaisExecoes {
        

    //Método que retorna a média de um array de notas
        float notasF ( float[] notas) throws IllegalArgumentException {
            
            float media = 0;
            
            for (int i = 0; i < notas.length; i++) {
                //Se a nota for maior que 10 ou menor que 0, lança uma exceção personalizada
                if(notas[i] > 10 || notas[i] < 0){
                    throw new IllegalArgumentException(
                    );
                }
                media += notas[i];
            }
            return media/notas.length;
        }

    public static void main(String[] args) {
        
        float notas[] = {12f, 7f, 9f, 10f};

        
        try {

            float mediaNotas = new MaisExecoes().notasF(notas);

            System.out.println("Média -> " + mediaNotas);

        } catch (IllegalArgumentException e) {
            System.err.println("Nota Inválida");
        }
    }

}
