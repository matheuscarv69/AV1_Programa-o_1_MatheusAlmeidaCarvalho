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

    public boolean sacar(Double valor) {
        if (valor < 0) return false;

        if (valor > this.saldo) return false;

        this.saldo -= valor;

        return true;
    }

    public boolean depositar(Double valor) {
        if (valor != 0) {
            this.saldo += valor;
            return true;
        }
        return false;

    }

    public boolean transferir(Conta conta, Double valor) {
        if (valor < 0) return false;

        if (valor > this.saldo) return false;

        if (conta == null) return false;

        this.saldo -= valor;
        conta.depositar(valor);

        return true;
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
                "\n" +
                "Saldo: " + saldo +
                "\n" +
                "Data de abertura: " + dataAbertura +
                "\n"
                ;
    }
}
