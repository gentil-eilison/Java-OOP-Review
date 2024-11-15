package main.banksystem;

public class ContaCorrente extends Conta {
    private final double taxaSaque = 6.50;

    public ContaCorrente(String numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    @Override
    public boolean podeSacar(double valor) {
        return valor + this.taxaSaque < this.getSaldo();
    }

    @Override
    public void sacar(double valor) {
        this.setSaldo(this.getSaldo() - valor - this.taxaSaque);
    }
}
