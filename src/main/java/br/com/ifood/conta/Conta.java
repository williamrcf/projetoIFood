package br.com.ifood.conta;

import br.com.ifood.ComunicadorCorporativo;
import br.com.ifood.cliente.Cliente;
import br.com.ifood.domain.ContaCorporativa;
import br.com.ifood.funcionario.Funcionario;

import java.math.BigDecimal;


public abstract class Conta implements ContaCorporativa {
    private Cliente cliente;
    private long numeroConta;
    private int agencia;
    private Funcionario funcionario;
    private double saldo;
    private ComunicadorCorporativo comunicador;

    public Conta(String titular, long numeroConta, int agencia, Funcionario funcionario, double saldo) {
        this.cliente = new Cliente(titular);
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.funcionario = funcionario;
        this.saldo = saldo;
        this.comunicador = new ComunicadorCorporativo();
    }

    public void debito(Double valor) {
        double valorcomtaxa = valor * (1 + getTaxaDebito());
        double saldoDisponivel = calculaSaldoDisponivel();

        if (valorcomtaxa <= calculaSaldoDisponivel()) {
            setSaldo(saldoDisponivel - valorcomtaxa);
            comunicador.atualizaSaldo(this);
            System.out.println("Saque realizado");
        } else {
            System.out.println("");
        }
    }
    protected abstract double calculaSaldoDisponivel();

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

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numeroConta=" + numeroConta +
                '}';
    }
}
