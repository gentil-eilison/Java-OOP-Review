package main.banksystem;

public class Transacao {
    public void sacar(Conta conta, double valor) throws SaldoInsuficienteException, ValorInvalidoException {
        var errorMessage = "";
        if (!conta.podeSacar(valor)) {
            errorMessage = String.format("O saldo de %g é insuficiente para sacar %g ou o saque excede o limite", conta.getSaldo(), valor); 
            throw new SaldoInsuficienteException(errorMessage);
        }
        
        if (valor < 0) {
            errorMessage = String.format("O valor %g é inválido", valor);
            throw new ValorInvalidoException(errorMessage);
        }

        conta.sacar(valor);
    }

    public void depositar(Conta conta, double valor) throws ValorInvalidoException {
        if (valor < 0) {
            var errorMessage = String.format("O valor %g é inválido", valor);
            throw new ValorInvalidoException(errorMessage);
        }

        conta.depositar(valor);
    }
}
