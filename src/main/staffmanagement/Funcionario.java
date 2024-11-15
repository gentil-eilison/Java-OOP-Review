package main.staffmanagement;

import java.math.BigDecimal;

public abstract class Funcionario {
    private int id;
    private String nome;
    private BigDecimal salarioBase;

    public Funcionario(int id, String nome, BigDecimal salarioBase) {
        this.id = id;
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public abstract BigDecimal calcularSalario();

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getSalarioBase() {
        return salarioBase;
    }

    @Override
    public boolean equals(Object funcionario) {
        if (this == funcionario) return true;
        if (!(this instanceof Funcionario)) return false;
        var outroFuncionario = (Funcionario) funcionario;
        return this.getId() == outroFuncionario.getId();
    }
}
