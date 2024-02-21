package org.example;

public class Cliente {
    public String nome;

    private String dataDeNascimento;

    protected float consumo;

    //Get e Set(Modificador e acesso há atributos)

}

// Private -> Sem restrições de acesso a variáveis e/ou a métodos.
// Private -> Atributo ou método fica disponível somente a classe a que pertence.
// Protected -> Está disponível ao pacote a que pertence.
// final -> Não é possível herdar a classe com esse modificador. Restrição de Herança(N é possível herdar métodos e atributos em outras classes).
//Final serve para constantes;