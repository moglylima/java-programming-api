public class CondicoesIfElse {

    void verificaMmedia(int media){
        if (media >=7){
            System.out.println("Aluno aprovado!!!");
                    }else {
            System.out.println("Aluno reprovado!!!");
        }
    }
    public static void main(String[] args) {

        CondicoesIfElse cond = new CondicoesIfElse();

        cond.verificaMmedia(7);
        cond.verificaMmedia(5);
    }
}
