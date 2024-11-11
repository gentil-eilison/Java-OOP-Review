package main.booklibrary;

public class Revista extends Publicacao {
    public Revista(String titulo, String autor, int anoPublicacao) {
        super(titulo, autor, anoPublicacao);
    }

    @Override
    public String obterResumo() {
        return String.format(
            "Revista: %s - %d",
            this.getAutor(),
            this.getAnoPublicacao()
        );
    }
}
