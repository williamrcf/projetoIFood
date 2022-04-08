package br.com.ifood.cliente;

public class ClientePF extends Cliente {
    public long cpf;

    public ClientePF(String nome, long cpf) {
        super(nome);
        this.cpf = cpf;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "ClientePF{" +
                "cpf=" + cpf +
                '}';
    }
}
