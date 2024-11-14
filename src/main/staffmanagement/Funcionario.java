package main.staffmanagement;

import java.math.BigDecimal;

public abstract class Funcionario {
    private int id;
    private String nome;
    private BigDecimal salario;

    public Funcionario(int id, String nome, BigDecimal salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public abstract BigDecimal calcularSalario();

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    
}
