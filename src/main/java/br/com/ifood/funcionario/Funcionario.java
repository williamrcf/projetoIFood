package br.com.ifood.funcionario;

import br.com.ifood.conta.Conta;

import java.util.ArrayList;
import java.util.List;

public abstract class Funcionario {

    private String name;
    private List<Conta> contas;

    public Funcionario(String name) {
        this.name = name;
        this.contas = new ArrayList<>();
    }

    public abstract void lista();

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "name='" + name + '\'' +
                ", contas=" + contas +
                '}';
    }
}
