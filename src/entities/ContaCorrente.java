package entities;

public class ContaCorrente extends Conta {
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

    public void setTaxaAdministracao(Double taxaAdministracao) {
        this.taxaAdministracao = taxaAdministracao;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    @Override
    public boolean sacar(Double valor) {

        return false;
    }

    @Override
    public boolean depositar(Double valor) {

        return false;
    }

    @Override
    public boolean transferir(Conta conta, Double valor) {

        return false;
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
                "\n"+
                "taxaAdministracao: " + taxaAdministracao +
                "\n" +
                "limite:" + limite +
                "\n";
    }

}
