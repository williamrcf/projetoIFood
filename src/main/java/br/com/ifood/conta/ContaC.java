package br.com.ifood.conta;

import br.com.ifood.funcionario.Funcionario;

public class ContaC extends ContaE {
    private static final double CHEQUE_ESPECIAL =500;

    public ContaC(String titular, long numeroConta, int agencia, Funcionario funcionario, double saldo) {
        super(titular, numeroConta, agencia, funcionario, saldo, CHEQUE_ESPECIAL);
    }

    @Override
    protected double calculaSaldoDisponivel() {
        return getSaldo() + CHEQUE_ESPECIAL;
    }

    @Override
    protected double getTaxaDebito() {
        return 0.02D;
    }

    @Override
    protected double getBonus(double valor) {

        return new Bonus().getBonus(valor);
    }
}
