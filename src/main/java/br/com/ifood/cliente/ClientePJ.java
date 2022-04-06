package br.com.ifood.cliente;

public class ClientePJ extends Cliente {
    private String cnpj;
    private String nomeEmpresa;

    public ClientePJ(String nome, String cpf, String cnpj, String nomeEmpresa) {
        super(nome);
        this.cnpj = cnpj;
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    @Override
    public String toString() {
        return "ClientePJ{" +
                "cnpj='" + cnpj + '\'' +
                ", nomeEmpresa='" + nomeEmpresa + '\'' +
                '}';
    }
}


