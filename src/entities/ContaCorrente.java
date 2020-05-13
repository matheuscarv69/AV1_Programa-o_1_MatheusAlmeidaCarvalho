package entities;

import interfaceTribut.Tributavel;

public class ContaCorrente extends Conta implements Tributavel {
    private Double taxaAdministracao;
    private Double limite;

    public ContaCorrente(String titular, Integer numero, String agencia, Double saldo, String dataAbertura, Double taxaAdministracao, Double limite) {
        super(titular, numero, agencia, saldo, dataAbertura);
        this.taxaAdministracao = taxaAdministracao;
        this.limite = limite;
    }

    public Double getTaxaAdministracao() {
        return taxaAdministracao;
    }

    public Double getLimite() {
        return limite;
    }

    @Override
    public boolean sacar(Double valor) {
        if (valor < 0 || valor > this.saldo) {
            return false;
        }

        saldo -= valor;

        return true;
    }

    @Override
    public boolean depositar(Double valor) {
        if (valor < 0) {
            return false;
        }

        saldo += valor;

        return true;
    }

    @Override
    public boolean transferir(Conta conta, Double valor) {
        if (valor < 0 || valor > saldo || this == conta) {
            return false;
        }
        saldo -= valor;
        conta.depositar(valor);

        return true;
    }
    @Override
    public Double getValorImposto(){
        return this.saldo *= 0.01;
    }

    @Override
    public String toString() {
        return "Conta:" + numero +
                "\n" +
                "Titular: " + titular +
                "\n" +
                "Agencia: " + agencia +
                "\n" +
                "Saldo: " + saldo +
                "\n" +
                "Data de abertura: " + dataAbertura +
                "\n" +
                "taxaAdministracao: " + taxaAdministracao +
                "\n" +
                "limite:" + limite +
                "\n";
    }

}
