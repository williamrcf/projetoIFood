package br.com.ifood.funcionario;

import br.com.ifood.conta.Conta;
import br.com.ifood.conta.ContaC;
import org.junit.Test;

public class GerenteTest {

    @Test
    public void imprimeDados() {
        // Dado
        Gerente gerente = new Gerente("Pedro");
        Conta contaCorrente = new ContaC("Joao", 10100001, 1, gerente, 1000D);
        Conta contaCorrente2 = new ContaC("Joao", 10100002, 1, gerente, 1000D);
        gerente.adicionarConta(contaCorrente);
        gerente.adicionarConta(contaCorrente2);
        gerente.addFuncionario(new Gerente("Marcos"));

        // Quando
        gerente.lista();

        // Então
    }
}
