package main.banksystem;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(String numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    @Override
    public boolean podeSacar(double valor) {
        final double limiteSaque = 3000;
        return valor <= limiteSaque && valor < this.getSaldo();
    }
}
