package entities;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
// ContaPoupanca herda da classe abstrata Conta
public class ContaPoupanca extends Conta {
    private Double porcentagemRendimento;
    private Integer diaRendimento;

    public ContaPoupanca(Integer numero, String agencia, Double saldo, Date abertura, Pessoa titular, Double porcentagemRendimento, Integer diaRedimento) {
        super(numero, agencia, saldo, abertura, titular);
        this.porcentagemRendimento = porcentagemRendimento;
        this.diaRendimento = diaRendimento;
    }
    // Sobrescrita dos metodos da classe abstrata Conta
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
    public boolean tranferirDinheiro(Double valor, Conta conta) {
        if (valor <= 0 || valor > saldo || this == conta) {
            return false;
        }
        saldo -= valor;
        conta.depositar(valor);

        return true;
    }

    @Override
    public String toString() {
        String sal  = saldo > 0.0 ? new DecimalFormat("#.00").format(saldo) : "0.00";
        //"Saldo R$ " + saldo > 0.0 ? new DecimalFormat("#.00").format(saldo) : "0.0" + "\n" +
        return "Conta Poupança Nº " + numero + "\n" +
                "Agência " + agencia + "\n" +
                "Saldo R$ " + sal + "\n" +
                "Abertura " + new SimpleDateFormat("dd/MM/yyyy 'às' HH:mm").format(dataAbertura) + "\n" +
                "Titular " + titular.getNome() + "\n" +
                "Porcentagem de Rendimento " + porcentagemRendimento + "\n" +
                "Dia do Rendimento " + diaRendimento + "\n\n";
    }
}
