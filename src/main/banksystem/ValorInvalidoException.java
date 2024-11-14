package main.banksystem;

public class ValorInvalidoException extends Exception {
    public ValorInvalidoException(String errorMessage) {
        super(errorMessage);
    }
}
