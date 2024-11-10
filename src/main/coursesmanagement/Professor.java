package main.coursesmanagement;

import java.util.ArrayList;

public class Professor {
    private int id;
    private String nome;
    private ArrayList<Curso> cursosMinistrados;

    public Professor(int id, String nome, ArrayList<Curso> cursosMinistrados) {
        this.id = id;
        this.nome = nome;
        this.cursosMinistrados = cursosMinistrados;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Curso> getCursosMinistrados() {
        return this.cursosMinistrados;
    }

    public void setCursosMinistrados(ArrayList<Curso> cursosMinistrados) {
        this.cursosMinistrados = cursosMinistrados;
    }

    public boolean ministrar(Curso curso) {
        if (!this.cursosMinistrados.contains(curso)) {
            this.cursosMinistrados.add(curso);
            return true;
        }
        return false;
    }

    public boolean cancelar(Curso curso) {
        if (this.cursosMinistrados.contains(curso)) {
            this.cursosMinistrados.remove(curso);
            return true;
        }
        return false;
    }
}
