package main.staffmanagement;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Analista extends Funcionario implements Bonus {
    public Analista(int id, String nome, BigDecimal salarioBase) {
        super(id, nome, salarioBase);
    }

    @Override
    public BigDecimal calcularBonus(double percentual) {
        var percentualBigDecimal = new BigDecimal(String.valueOf(percentual));
        return this.getSalarioBase().multiply(percentualBigDecimal).setScale(2, RoundingMode.HALF_UP);
    }

    @Override
    public BigDecimal calcularSalario() {
        return this.calcularBonus(1.05);
    }
}
