package main.booklibrary;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var serHumano = new Livro("Ser Humano: Manual do Usuário - As Origens...", "André Rabelo", 2022);
        var acaoGames = new Revista("Ação Games", "João Alberto", 1995);
        var almasMarmore = new Livro("Almas de Mármore", "Seymour Glass", 2023);

        var biblioteca = new Biblioteca<Publicacao>(new ArrayList<Publicacao>());
        try {
            biblioteca.adicionarPublicacao(almasMarmore);
            biblioteca.adicionarPublicacao(serHumano);
            biblioteca.adicionarPublicacao(acaoGames);
        } catch (PublicacaoExistenteException exception) {
            System.out.println(exception.getMessage());
        }

        biblioteca.listarPublicacoes();
    }
}
