package main.coursesmanagement;

import java.util.ArrayList;

public class Aluno {
    private int id;
    private String nome;
    private ArrayList<Curso> cursosMatriculados;

    public Aluno(int id, String nome, ArrayList<Curso> cursosMatriculados) {
        this.id = id;
        this.nome = nome;
        this.cursosMatriculados = cursosMatriculados;
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

    public ArrayList<Curso> getCursosMatriculados() {
        return this.cursosMatriculados;
    }

    public void setCursosMatriculados(ArrayList<Curso> cursosMatriculados) {
        this.cursosMatriculados = cursosMatriculados;
    }

    public boolean matricular(Curso curso) {
        if (!this.cursosMatriculados.contains(curso)) {
            this.cursosMatriculados.add(curso);
            return true;
        }
        return false;
    }

    public boolean desmatricular(Curso curso) {
        if (this.cursosMatriculados.contains(curso)) {
            this.cursosMatriculados.remove(curso);
            return true;
        }
        return false;
    }
}
