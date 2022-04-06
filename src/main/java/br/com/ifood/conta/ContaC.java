package br.com.ifood.conta;

public class ContaC extends Conta {
    private Double chequeEspecial; // TODO: criar uma outra abstração para conta especial

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

    public void debito(Double valor) { // TODO: esse metodo nao será necesario se for utilizado corretamente os conceitos de OO
        if (valor > 0) {
            setSaldo(getSaldo() + valor * 0.095);
            System.out.println("Deposito realizado");
        } else {
            System.out.println("Valor indisponível para deposito");
        }
    }
}
