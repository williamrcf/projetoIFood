package br.com.ifood.conta;

public class ContaC extends ContaE {
    public ContaC(String titular, long numeroConta, int agencia, String gerente, double saldo, Double chequeEspecial) {
        super(titular, numeroConta, agencia, gerente, saldo, chequeEspecial);
    }

    @Override
    protected double getTaxaDebito() {
        return 0.02D;
    }

    @Override
    protected double getBonos(double valor) {
        if (valor < 1000) {
            return 0.05D;
        } else if (valor <= 1000 && valor <= 100000) {
            return 0.04D;
        } else
            return 0.01D;
    }
}


