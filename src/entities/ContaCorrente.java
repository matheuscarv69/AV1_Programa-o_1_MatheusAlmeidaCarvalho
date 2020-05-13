package entities;

import interfaceTribut.Tributavel;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaCorrente extends Conta implements Tributavel {
    private Double taxaAdministracao;
    private Double limite;

    public ContaCorrente(Integer numero, String agencia, Double saldo, Date abertura, Pessoa titular, Double taxaAdministracao, Double limite) {
        super(numero, agencia, saldo, abertura, titular);
        this.taxaAdministracao = taxaAdministracao;
        this.limite = limite;
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
    public boolean tranferirDinheiro(Double valor, Conta conta) {
        if (valor < 0 || valor > saldo || this == conta) {
            return false;
        }
        saldo -= valor;
        conta.depositar(valor);

        return true;
    }

    @Override
    public Double getValorImposto() {
        return this.saldo *= 0.01;
    }

    @Override
    public String toString() {
        return "Conta Corrente Nº " + numero + "\n" +
                "Agência " + agencia + "\n" +
                "Saldo R$ " + new DecimalFormat("#.00").format(saldo) + "\n" +
                "Abertura " + new SimpleDateFormat("dd/MM/yyyy 'às' HH:mm").format(dataAbertura) + "\n" +
                "Titular " + titular.getNome() + "\n" +
                "Taxa de Administração " + taxaAdministracao + "\n" +
                "Limite " + limite + "\n\n";
    }

}
