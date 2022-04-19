package br.com.ifood.conta;

import br.com.ifood.funcionario.Funcionario;

public class ContaP extends ContaE {
    private static final double CHEQUE_ESPECIAL = 700;

    public ContaP(String titular, long numeroConta, int agencia, Funcionario gerente, double saldo) {
        super(titular, numeroConta, agencia, gerente, saldo, CHEQUE_ESPECIAL);
    }

    @Override
    protected double calculaSaldoDisponivel() {
        return getSaldo() + CHEQUE_ESPECIAL;
    }

    @Override
    protected double getTaxaDebito() {
        return 0.05D;
    }

    @Override
    protected double getBonus(double valor) {
        return new Bonus().getBonus(valor);
    }

}
