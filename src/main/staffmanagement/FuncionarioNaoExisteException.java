package main.staffmanagement;

public class FuncionarioNaoExisteException extends Exception {
    public FuncionarioNaoExisteException(String errorMessage) {
        super(errorMessage);
    }
}
