package br.com.ifood.conta;

public class ContaC extends ContaE {
    private static final double CHEQUE_ESPECIAL =500;

    public ContaC(String titular, long numeroConta, int agencia, String gerente, double saldo) {
        super(titular, numeroConta, agencia, gerente, saldo, CHEQUE_ESPECIAL);
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

        return Bonus.getBonus(valor);
    }
}
