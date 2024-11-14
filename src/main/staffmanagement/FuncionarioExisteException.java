package main.staffmanagement;

public class FuncionarioExisteException extends Exception {
    public FuncionarioExisteException(String errorMessage) {
        super(errorMessage);
    }
}
