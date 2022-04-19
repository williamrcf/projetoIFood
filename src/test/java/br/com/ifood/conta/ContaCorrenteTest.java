package br.com.ifood.conta;

import br.com.ifood.funcionario.Funcionario;
import br.com.ifood.funcionario.Gerente;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ContaCorrenteTest {

    @Test
    public void criacaoDeConta() {
        // Dado
        final String titular = "Joao";
        final long numero = 123194L;
        final int agencia = 1;
        final Funcionario gerente = new Gerente("Pedro");
        final double saldo = 1000D;

        // Quando
        ContaC contaCorrente = new ContaC(titular, numero, agencia, gerente, saldo);

        // Entao
        assertEquals(titular, contaCorrente.getCliente().getNome());
        assertEquals(numero, contaCorrente.getNumeroConta(), 1D);
        assertEquals(agencia, contaCorrente.getAgencia());
        assertEquals(gerente.getName(), contaCorrente.getFuncionario().getName());
        assertEquals(saldo, contaCorrente.getSaldo(), 0.0D);
    }
}
