package br.com.ifood.conta;

import br.com.ifood.funcionario.Funcionario;

public abstract class ContaE extends Conta {
    private Double chequeEspecial;

    public ContaE(String titular, long numeroConta, int agencia, Funcionario funcionario, double saldo, Double chequeEspecial) {
        super(titular, numeroConta, agencia, funcionario, saldo);
        this.chequeEspecial = chequeEspecial;
    }

    public Double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(Double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
}
