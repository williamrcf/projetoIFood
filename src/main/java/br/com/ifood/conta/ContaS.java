package br.com.ifood.conta;

public class ContaS extends Conta {
    public ContaS(String titular, long numeroConta, int agencia, String gerente, double saldo) {
        super(titular, numeroConta, agencia, gerente, saldo);
    }

    @Override
    protected double getTaxaDebito() {
        return 0;
    }

    @Override
    protected double getBonos(double valor) {
        return 0;
    }

}




