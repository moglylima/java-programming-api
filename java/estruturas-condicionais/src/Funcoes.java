public class Funcoes {

    /*
    * Aqui vimos um pouco de polimorfismo, por meio do conceito de sobrecarga de métodos!
     */


    //Func com retorno - Com e sem parametros
    void hello(){     //Func sem parâmetros, sem retorno
        System.out.println("Hello");
    }

    void hello(String name){
        System.out.println("Hello "+name);
    }

    String saudacao(){ //Func sem parâmetros, com retorno
        return "Seja bem vindo";
    }

    String saudacaoUser(String name){ //Func com parâmetros, com retorno
        return "Seja bem vindo " + name;
    }


    //Func sem retorno  - Com e sem parametros

    public static void main(String[] args) {

        //Criando Obj - apenas para chamadas
        Funcoes instFunc = new Funcoes();

        //Func sem parâmetros, sem retorno - CHAMADA
        instFunc.hello();

        //Func com parâmetros, sem retorno
        instFunc.hello("Mogly");

        //Func sem parâmetros, com retorno
        System.out.println(instFunc.saudacao());

        //Func com parâmetros, com retorno
        System.out.println(instFunc.saudacaoUser("Mogly"));





    }
}
