package main.booklibrary;

public class Livro extends Publicacao {
    public Livro(String titulo, String autor, int anoPublicacao) {
        super(titulo, autor, anoPublicacao);
    }

    @Override
    public String obterResumo() {
        return String.format(
            "Livro: %s - %s",
            this.getTitulo(),
            this.getAutor()
        );
    }
}
