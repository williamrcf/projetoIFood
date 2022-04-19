package br.com.ifood.conta;

public abstract class ContaE extends Conta {
    private Double chequeEspecial;

    public ContaE(String titular, long numeroConta, int agencia, String gerente, double saldo, Double chequeEspecial) {
        super(titular, numeroConta, agencia, gerente, saldo);
        this.chequeEspecial = chequeEspecial;
    }

    public Double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(Double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
}
