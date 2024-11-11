package main.booklibrary;

public abstract class Publicacao {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Publicacao(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public boolean equals(Object publicacao) {
        if (this == publicacao) return true;
        if (!(publicacao instanceof Publicacao)) return false;
        Publicacao outraPublicacao = (Publicacao)publicacao;
        return ((outraPublicacao.getTitulo().equals(this.getTitulo())) && (outraPublicacao.getAutor()).equals(this.getAutor()));
    }

    public abstract String obterResumo();
}
