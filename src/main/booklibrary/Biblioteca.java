package main.booklibrary;

import java.util.ArrayList;

public class Biblioteca<T extends Publicacao> {
    private ArrayList<T> publicacoes;

    public Biblioteca(ArrayList<T> publicacoes) {
        this.publicacoes = publicacoes;
    }

    public ArrayList<T> getPublicacoes() {
        return this.publicacoes;
    }

    public void setPublicacoes(ArrayList<T> publicacoes) {
        this.publicacoes = publicacoes;
    }

    public void adicionarPublicacao(T publicacao) throws PublicacaoExistenteException {
        if (this.publicacoes.contains(publicacao)) {
            throw new PublicacaoExistenteException("Essa publicação já está no catálogo");
        }
        this.publicacoes.add(publicacao);
    }

    public void removerPublicacao(T publicacao) throws PublicacaoNaoExistenteException {
        if (!this.publicacoes.contains(publicacao)) {
            throw new PublicacaoNaoExistenteException("Essa publicação não está no catálogo");
        }
        this.publicacoes.remove(publicacao);
    }

    public void listarPublicacoes() {
        for(T publicacao: this.publicacoes) {
            System.out.println(publicacao.obterResumo());
        }
    }
}
