package br.com.ifood.conta;

import br.com.ifood.ComunicadorCorporativo;
import br.com.ifood.cliente.Cliente;
import br.com.ifood.domain.ContaCorporativa;

import java.math.BigDecimal;


public abstract class Conta implements ContaCorporativa {
    private Cliente cliente;
    private long numeroConta;
    private int agencia;
    private String gerente;
    private double saldo; // a um funcionário (gerente ou operador)
    private ComunicadorCorporativo comunicador;

    public Conta(String titular, long numeroConta, int agencia, String gerente, double saldo) {
        this.cliente = new Cliente(titular);
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.gerente = gerente;
        this.saldo = saldo;
        this.comunicador = new ComunicadorCorporativo();
    }

    public void debito(Double valor) {
        double valorcomtaxa = valor * (1 + getTaxaDebito());

        if (valorcomtaxa <= getSaldo()) {
            setSaldo(getSaldo() - valorcomtaxa);
            comunicador.atualizaSaldo(this);
            System.out.println("Saque realizado");
        } else {
            System.out.println("");
        }
    }

    public void credito(Double valor) {
        double valorBonos = valor * (1 + getBonus(valor));
    if (valor > 0) {
        setSaldo(getSaldo() + valorBonos);
            comunicador.atualizaSaldo(this);
            System.out.println("Depóstio realizado ");
        } else {
            System.out.println("Não é possível depositar esse valor");
        }
    }

    public void transfere(Conta contaDestino, double valor) {
        if (valor <= this.getSaldo()){
            this.debito(valor);
            contaDestino.credito(valor);
            System.out.println ("Transferencia realizada");
            comunicador.atualizaSaldo(this);
            comunicador.atualizaSaldo(contaDestino);
        } else {
            System.out.println ("Não foi possível realizar por falta de saldo");
        }
    }

    public void saqueCheque (double valor) {
    }

    protected abstract double getBonus(double valor);

    protected abstract double getTaxaDebito();


    @Override
    public BigDecimal getSaldoAtual() {
        return new BigDecimal(getSaldo());
    }

    @Override
    public String getNumeroDaConta() {
        return String.valueOf(getAgencia()).concat(String.valueOf(getNumeroConta()));
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
}
