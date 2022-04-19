package br.com.ifood.conta;

import br.com.ifood.funcionario.Funcionario;

import java.math.BigDecimal;

public class ContaS extends Conta {
    public ContaS(String titular, long numeroConta, int agencia, Funcionario gerente, double saldo) {
        super(titular, numeroConta, agencia, gerente, saldo);
    }

    @Override
    protected double calculaSaldoDisponivel() {
        return getSaldo();
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
