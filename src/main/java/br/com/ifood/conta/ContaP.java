package br.com.ifood.conta;

public class ContaP extends Conta {
    public Double chequeEspecial;

    public ContaP(String titular, Float numeroConta, Float agencia, String gerente, Double saldo, Double chequeEspecial) {
        super(titular, numeroConta, agencia, gerente, saldo);
        this.chequeEspecial = chequeEspecial;
    }

    public Double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(Double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public void depositar(Double valor) {
        if (valor > 0) {
            setSaldo(getSaldo() + valor * 0.098);
            System.out.println("Deposito realizado");
        } else {
            System.out.println("Valor indisponível para deposito");
        }
    }
}