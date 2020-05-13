package entities;

public abstract class Conta {
    protected String titular;
    protected Integer numero;
    protected String agencia;
    protected Double saldo;
    protected String dataAbertura;

    public Conta(String titular, Integer numero, String agencia, Double saldo, String dataAbertura) {
        this.titular = titular;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
    }

    public abstract boolean sacar(Double valor);

    public abstract boolean depositar(Double valor);

    public abstract boolean transferir(Conta conta, Double valor);

    @Override
    public String toString() {
        return "Conta:" +
                "\n" +
                "Titular: " + titular +
                "\n" +
                "Numero: " + numero +
                "\n" +
                "Agencia: " + agencia +
                "\n" +
                "Saldo: " + saldo +
                "\n" +
                "Data de abertura: " + dataAbertura +
                "\n"
                ;
    }
}
