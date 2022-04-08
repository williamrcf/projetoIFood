package br.com.ifood.cliente;

public class ClientePJ extends Cliente {
    private long cnpj;
    private String nomeEmpresa;

    public ClientePJ(String nome,long cnpj, String nomeEmpresa) {
        super(nome);
        this.cnpj = cnpj;
        this.nomeEmpresa = nomeEmpresa;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
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


