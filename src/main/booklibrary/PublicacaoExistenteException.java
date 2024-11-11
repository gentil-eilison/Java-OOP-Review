package main.booklibrary;

public class PublicacaoExistenteException extends Exception {
    public PublicacaoExistenteException(String errorMessage) {
        super(errorMessage);
    }
}
