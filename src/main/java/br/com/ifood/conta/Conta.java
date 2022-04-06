package br.com.ifood.conta;

import br.com.ifood.cliente.Cliente;

public class Conta {
    private Cliente cliente;
    private Float numeroConta;                    // TODO: mudar para tipo long
    private Float agencia;                         // TODO: mudar para tipo int
    private String gerente;
    private Double saldo; // a um funcionário (gerente ou operador)

    public Conta(String titular, Float numeroConta, Float agencia, String gerente, Double saldo) {
        this.cliente = cliente;
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.gerente = gerente;
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Float getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Float numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Float getAgencia() {
        return agencia;
    }

    public void setAgencia(Float agencia) {
        this.agencia = agencia;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    // TODO: pensar no OO
public void debito (Double valor) {
        if (valor <= getSaldo()) ;
    setSaldo(getSaldo() - valor);
    System.out.println("Saque realizado");
    } else {
        System.out.println("Não foi possível realizar o saque");
    }
}
