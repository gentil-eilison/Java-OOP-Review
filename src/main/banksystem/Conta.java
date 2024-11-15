package main.banksystem;

public class Conta {
    private String numeroConta;
    private String titular;
    private double saldo;

    public Conta(String numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean podeSacar(double valor) {
        return valor < this.getSaldo();
    };
    
    public void sacar(double valor) {
        this.setSaldo(this.getSaldo() - valor);
    };

    public void depositar(double valor) {
        this.setSaldo(this.getSaldo() + valor);
    }
}
