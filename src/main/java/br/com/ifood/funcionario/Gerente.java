package br.com.ifood.funcionario;

import java.util.ArrayList;
import java.util.List;

public class Gerente extends Funcionario {

    private List<Funcionario> funcionarios = new ArrayList<>();

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void addFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }

    public Gerente(String nome){
        super(nome);
    }

    @Override
    public void lista() {
        System.out.println(getName());
        System.out.println(getContas());

        System.out.println(funcionarios);
    }
}
