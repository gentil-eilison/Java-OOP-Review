package main.coursesmanagement;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso(1, "ADS", 3500));
        cursos.add(new Curso(2, "Psicologia", 5000));
        cursos.add(new Curso(3, "Letras Inglês", 3000));
        cursos.add(new Curso(4, "Letras Libras", 3500));

        ArrayList<Professor> professores = new ArrayList<>();
        professores.add(new Professor(1, "Thiago Henrique", new ArrayList<Curso>()));
        professores.add(new Professor(2, "Raphael Muniz", new ArrayList<Curso>()));
        professores.add(new Professor(3, "Jerônimo Neto", new ArrayList<Curso>()));
        professores.add(new Professor(4, "Pedro Lobo", new ArrayList<Curso>()));
        professores.add(new Professor(5, "Marcos Marquioto", new ArrayList<Curso>()));

        ArrayList<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno(1, "Gentil Ályson", new ArrayList<Curso>()));
        alunos.add(new Aluno(2, "Gentil Kadson", new ArrayList<Curso>()));
        alunos.add(new Aluno(3, "Karla Nunes", new ArrayList<Curso>()));
        alunos.add(new Aluno(4, "José Matheus", new ArrayList<Curso>()));
        alunos.add(new Aluno(5, "Lucas Rafael", new ArrayList<Curso>()));
    }
}