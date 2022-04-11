package br.com.ifood.conta;

import java.math.BigDecimal;

public class ContaS extends Conta {
    public ContaS(String titular, long numeroConta, int agencia, String gerente, double saldo) {
        super(titular, numeroConta, agencia, gerente, saldo);
    }

    @Override
    protected double getTaxaDebito() {
        return 0;
    }

    @Override
    protected double getBonus(double valor) {
        return 0;
    }

}
