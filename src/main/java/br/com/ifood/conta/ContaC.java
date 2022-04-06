package br.com.ifood.conta;

public class ContaC extends Conta {
    private Double chequeEspecial;

    public ContaC(String titular, Float numeroConta, Float agencia, String gerente, Double saldo, Double chequeEspecial) {
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
            setSaldo(getSaldo() + valor * 0.095);
            System.out.println("Deposito realizado");
        } else {
            System.out.println("Valor indisponível para deposito");
        }
    }
}
