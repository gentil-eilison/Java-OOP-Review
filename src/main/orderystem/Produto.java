package main.orderystem;

import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class Produto {
    private int id;
    private String nome;
    private BigDecimal preco;

    public Produto(int id, String nome, BigDecimal preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco.setScale(2, RoundingMode.HALF_EVEN);
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

    public BigDecimal getPreco() {
        return this.preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public abstract BigDecimal calcularDesconto();
}
