package br.com.ifood.cliente;

public class Cliente {
    private String nome;


    //criar uma outra classe gerente ou operador.
    // implementar gerente tbm na classe cliente e relacionar.

    public Cliente(String nome) {
        this.nome = nome;
    }

    public Cliente() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void gerenciar(String nome, String gerente){

    }
}


