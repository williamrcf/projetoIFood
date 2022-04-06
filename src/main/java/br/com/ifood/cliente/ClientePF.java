package br.com.ifood.cliente;

public class ClientePF extends Cliente {
    public String cpf;

    public ClientePF(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "ClientePF{" +
                "cpf='" + cpf + '\'' +
                '}';
    }
}
