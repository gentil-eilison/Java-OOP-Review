package main.orderystem;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Eletronico extends Produto {
    public Eletronico(int id, String nome, BigDecimal preco) {
        super(id, nome, preco);
    }

    @Override
    public BigDecimal calcularDesconto() {
        BigDecimal discount = new BigDecimal("0.90");
        BigDecimal discountedValue = this.getPreco().multiply(discount).setScale(2, RoundingMode.HALF_EVEN);
        return discountedValue;
    }
}
