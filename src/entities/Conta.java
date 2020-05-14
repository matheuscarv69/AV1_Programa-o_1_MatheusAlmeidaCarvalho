package entities;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
// classe abstrata de conta
public abstract class Conta {

    protected Integer numero;
    protected String agencia;
    protected Double saldo;
    protected Date dataAbertura;
    protected Pessoa titular;

    public Conta(Integer numero, String agencia, Double saldo, Date dataAbertura, Pessoa titular) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
        this.titular = titular;
    }
    // metodos abstratos
    public abstract boolean sacar(Double valor);

    public abstract boolean depositar(Double valor);

    public abstract boolean tranferirDinheiro(Double valor, Conta conta);

    @Override
    public String toString() {
        return "Conta Nº " + numero + "\n" +
                "Agência " + agencia + "\n" +
                "Saldo R$ " + new DecimalFormat("#.00").format(saldo) + "\n" +
                "Abertura " + new SimpleDateFormat("dd/MM/yyyy 'às' HH:mm").format(dataAbertura) + "\n" +
                "Titular " + titular.getNome() + "\n";
    }
}
