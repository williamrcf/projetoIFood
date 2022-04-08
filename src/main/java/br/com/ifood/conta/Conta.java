package br.com.ifood.conta;

import br.com.ifood.cliente.Cliente;

public abstract class Conta {
    private Cliente cliente = new Cliente();
    private long numeroConta;
    private int agencia;
    private String gerente;
    private double saldo; // a um funcionário (gerente ou operador)

    public Conta(String titular, long numeroConta, int agencia, String gerente, double saldo) {
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

    public long getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(long numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
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


    public void debito(Double valor) {
        double valorcomtaxa = valor * (1 + getTaxaDebito());

        if (valorcomtaxa <= getSaldo()) {
            setSaldo(getSaldo() - valorcomtaxa);
            System.out.println("Saque realizado");
        } else {
            System.out.println("Saque não disponivel por falta de saldo");
        }
    }

    protected abstract double getTaxaDebito();

    public void credito(Double valor) {
        double valorBonos = valor * (1 + getBonos(valor));
    if (valor > 0) {
        setSaldo(getSaldo() + valorBonos);
        System.out.println("Depóstio realizado ");
        } else {
        System.out.println("Não é possível depositar esse valor");
        }

    }

    protected abstract double getBonos(double valor);

    public void trasfere (Conta contaDestino, double valor) {
        if (valor <= this.getSaldo()){
            setSaldo(getSaldo() - valor);
            contaDestino.saldo= contaDestino.saldo + valor;
            System.out.println ("Transferencia realizada");
        } else {
            System.out.println ("Não foi possível realizar por falta de saldo");
        }

    }

}