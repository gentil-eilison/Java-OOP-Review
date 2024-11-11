package main.coursesmanagement;

import java.util.ArrayList;

public class Curso {
    private int id;
    private String nome;
    private int duracaoHoras;

    public Curso(int id, String nome, int duracaoHoras) {
        this.id = id;
        this.nome = nome;
        this.duracaoHoras = duracaoHoras;
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

    public int getDuracaoHoras() {
        return this.duracaoHoras;
    }

    public void setDuracaoHoras(int duracaoHoras) {
        this.duracaoHoras = duracaoHoras;
    }

    @Override
    public boolean equals(Object curso) {
        if (this == curso) return true;
        if (!(curso instanceof Curso)) return false;
        Curso outroCurso = (Curso)curso;
        return this.id == outroCurso.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    public static void exibirAlunosMatriculados(Curso curso, ArrayList<Aluno> alunos) {
        System.out.println(String.format("======= Matriculados em %s ======", curso.getNome()));

        for(Aluno aluno: alunos) {
            if (aluno.getCursosMatriculados().contains(curso)) {
                System.out.println("Aluno matriculado: " + aluno.getNome());
            }
        }
    }

    public static void exibirCursosProfessor(Professor professor) {
        System.out.println(String.format("======= %s leciona os cursos ======", professor.getNome()));

        for(Curso curso: professor.getCursosMinistrados()) {
            System.out.println("Curso ministrado: " + curso.getNome());
        }
    }
}
