package main.coursesmanagement;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var ads = new Curso(1, "ADS", 3500);
        var psicologia = new Curso(2, "Psicologia", 5000);
        var letrasIngles = new Curso(3, "Letras Inglês", 3000);
        var letrasLibras = new Curso(4, "Letras Libras", 3500);
        var informatica = new Curso(5, "Informática", 2000);
        var cursos = new ArrayList<Curso>(Arrays.asList(
            ads,
            psicologia,
            letrasIngles,
            letrasLibras,
            informatica
        ));

        System.out.println("====== Cursos Disponíveis =======");
        for(Curso curso: cursos) {
            System.out.println(curso.getNome());
        }

        var thiagoHenrique = new Professor(1, "Thiago Henrique", new ArrayList<Curso>());
        var raphaelMuniz = new Professor(2, "Raphael Muniz", new ArrayList<Curso>());
        var jeronimoNeto = new Professor(3, "Jerônimo Neto", new ArrayList<Curso>());
        var pedroLobo = new Professor(4, "Pedro Lobo", new ArrayList<Curso>());
        var marcosMarquioto = new Professor(5, "Marcos Marquioto", new ArrayList<Curso>());
        var bonfimAquino = new Professor(6, "Bonfim Aquino", new ArrayList<Curso>());
        var jefersonQueiroga = new Professor(7, "Jeferson Quieroga", new ArrayList<Curso>());
        var andreRabelo = new Professor(8, "André Rabelo", new ArrayList<Curso>());
        var professores = new ArrayList<Professor>(Arrays.asList(
            thiagoHenrique,
            raphaelMuniz,
            jeronimoNeto,
            pedroLobo,
            marcosMarquioto,
            bonfimAquino,
            jefersonQueiroga,
            andreRabelo
        ));

        System.out.println("====== Professores Disponíveis =======");
        for(Professor professor: professores) {
            System.out.println(professor.getNome());
        }

        var gentilAlyson = new Aluno(1, "Gentil Ályson", new ArrayList<Curso>());
        var gentilKadson = new Aluno(2, "Gentil Kadson", new ArrayList<Curso>());
        var karlaNunes = new Aluno(3, "Karla Nunes", new ArrayList<Curso>());
        var joseMatheus = new Aluno(4, "José Matheus", new ArrayList<Curso>());
        var lucasRafael = new Aluno(5, "Lucas Rafael", new ArrayList<Curso>());
        var alunos = new ArrayList<Aluno>(Arrays.asList(
            gentilAlyson,
            gentilKadson,
            karlaNunes,
            joseMatheus,
            lucasRafael
        ));

        System.out.println("====== Alunos Disponíveis =======");
        for(Aluno aluno: alunos) {
            System.out.println(aluno.getNome());
        }

        thiagoHenrique.ministrar(ads);
        raphaelMuniz.ministrar(ads);
        raphaelMuniz.ministrar(informatica);
        jeronimoNeto.ministrar(letrasLibras);
        pedroLobo.ministrar(letrasIngles);
        marcosMarquioto.ministrar(letrasLibras);
        bonfimAquino.ministrar(ads);
        bonfimAquino.ministrar(informatica);
        jefersonQueiroga.ministrar(ads);
        andreRabelo.ministrar(psicologia);

        gentilAlyson.matricular(ads);
        gentilAlyson.matricular(letrasLibras);
        gentilAlyson.matricular(letrasIngles);
        gentilKadson.matricular(ads);
        gentilKadson.matricular(letrasIngles);
        karlaNunes.matricular(letrasIngles);
        karlaNunes.matricular(ads);
        joseMatheus.matricular(ads);
        joseMatheus.matricular(letrasIngles);
        lucasRafael.matricular(ads);

        Curso.exibirAlunosMatriculados(ads, alunos);
        Curso.exibirAlunosMatriculados(letrasLibras, alunos);
        Curso.exibirCursosProfessor(bonfimAquino);
        Curso.exibirCursosProfessor(raphaelMuniz);

        raphaelMuniz.cancelar(informatica);
        Curso.exibirCursosProfessor(raphaelMuniz);

        gentilAlyson.desmatricular(ads);
        Curso.exibirAlunosMatriculados(ads, alunos);
    }
}