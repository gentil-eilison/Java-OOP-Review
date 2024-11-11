package main.orderystem;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Vestuario extends Produto {
    public Vestuario(int id, String nome, BigDecimal preco) {
        super(id, nome, preco);
    }

    @Override
    public BigDecimal calcularDesconto() {
        BigDecimal discount = new BigDecimal("0.80");
        BigDecimal discountedPrice = this.getPreco().multiply(discount).setScale(2, RoundingMode.HALF_EVEN);
        return discountedPrice;
    }
}
