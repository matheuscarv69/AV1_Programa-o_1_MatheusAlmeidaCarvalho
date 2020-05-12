package entities;

public class Conta {
    private String titular;
    private Integer numero;
    private String agencia;
    private Double saldo;
    private String dataAbertura;

    public Conta() {

    }

    public Conta(String titular, Integer numero, String agencia, Double saldo, String dataAbertura) {
        this.titular = titular;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public Double getSaldo() {
        return saldo;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public void sacar(Double valor) {
        this.saldo -= valor;
    }

    public void depositar(Double valor) {
        this.saldo += valor;
    }

    public String transferir(Conta conta, Double valor) {
        this.saldo -= valor;
        conta.depositar(valor);

        return "Transferência feita";
    }

    @Override
    public String toString() {
        return "Conta:" +
                "\n" +
                "Titular: " + titular +
                "\n" +
                "Numero: " + numero +
                "\n" +
                "Agencia: " + agencia +
                "\n"+
                "Saldo: " + saldo +
                "\n"+
                "Data de abertura: " + dataAbertura +
                "\n"
                ;
    }
}
