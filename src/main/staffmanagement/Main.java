package main.staffmanagement;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {
    public static void main(String [] args) {
        var empresa = new Empresa<Funcionario>(new ArrayList<Funcionario>());
        var kadson = new Analista(1, "Gentil Kadson", new BigDecimal("4500"));
        var alyson = new Analista(2, "Gentil Kadson", new BigDecimal("4500"));
        var damiao = new Gerente(3, "Damião Teodósio", new BigDecimal("10000"));

        try {
            empresa.adicionarFuncionario(kadson);
            empresa.adicionarFuncionario(alyson);
            empresa.adicionarFuncionario(damiao);
        } catch (FuncionarioExisteException exception) {
            System.out.println(exception.getMessage());
        }

        empresa.listarFuncionarios();
    }
}
