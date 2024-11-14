package main.staffmanagement;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Gerente extends Funcionario implements Bonus {
    public Gerente(int id, String nome, BigDecimal salario) {
        super(id, nome, salario);
    }

    @Override
    public BigDecimal calcularBonus(double percentual) {
        var percentualBigDecimal = new BigDecimal(percentual);
        return this.getSalario().multiply(percentualBigDecimal).setScale(2, RoundingMode.HALF_UP);
    }

    @Override
    public BigDecimal calcularSalario() {
        return this.calcularBonus(1.10);
    }
}
