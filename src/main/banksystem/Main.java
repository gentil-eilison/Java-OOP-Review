package main.banksystem;

public class Main {
    public static void main(String[] args) {
        var contaCorrente = new ContaCorrente("123456", "Alyson", 5000);
        var contaPoupanca = new ContaPoupanca("987126", "Kadson", 3000);
        var transacao = new Transacao();
        try {
            transacao.sacar(contaCorrente, 2000);
            transacao.depositar(contaCorrente, 500);
            System.out.println("Saldo final da Conta Corrente: ");
            System.out.println(contaCorrente.getSaldo());

            transacao.sacar(contaPoupanca, 500);
            System.out.println(contaPoupanca.getSaldo());
            transacao.sacar(contaPoupanca, 2500);
            System.out.println("Saldo final da Conta Poupança: ");
            System.out.println(contaPoupanca.getSaldo());
        } catch(SaldoInsuficienteException exception) {
            System.out.println(exception.getMessage());
        } catch (ValorInvalidoException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
