package main.booklibrary;

public class PublicacaoNaoExistenteException extends Exception {
    public PublicacaoNaoExistenteException(String errorMessage) {
        super(errorMessage);
    }
}
