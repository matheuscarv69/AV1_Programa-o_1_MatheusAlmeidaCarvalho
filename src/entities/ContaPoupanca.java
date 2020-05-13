package entities;

public class ContaPoupanca extends Conta{
    private Double porcentagemRendimento;
    private Integer diaRendimento;

    public ContaPoupanca(String titular, Integer numero, String agencia, Double saldo, String dataAbertura, Double porcentagemRendimento, Integer diaRendimento) {
        super(titular, numero, agencia, saldo, dataAbertura);
        this.porcentagemRendimento = porcentagemRendimento;
        this.diaRendimento = diaRendimento;
    }

    public Double getPorcentagemRendimento() {
        return porcentagemRendimento;
    }

    public void setPorcentagemRendimento(Double porcentagemRendimento) {
        this.porcentagemRendimento = porcentagemRendimento;
    }

    public Integer getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(Integer diaRendimento) {
        this.diaRendimento = diaRendimento;
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
        return "ContaPoupanca:" +
                "\n"+
                "porcentagemRendimento: " + porcentagemRendimento +
                "\n"+
                "diaRendimento: " + diaRendimento +
                "\n";
    }
}
