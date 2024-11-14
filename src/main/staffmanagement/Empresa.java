package main.staffmanagement;

import java.util.ArrayList;

public class Empresa<T extends Funcionario> {
    private ArrayList<T> funcionarios;

    public Empresa(ArrayList<T> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public ArrayList<T> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<T> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void adicionarFuncionario(T funcionario) throws FuncionarioExisteException {
        if (!this.funcionarios.contains(funcionario)) {
            this.funcionarios.add(funcionario);
        }
        throw new FuncionarioExisteException("O funcionário já está na empresa");
    }

    public void listarFuncionarios() {
        for(T funcionario: this.funcionarios) {
            var dadosFuncionario = String.format("Funcionário: %s\n Salário: %d\n", funcionario.getNome(), funcionario.calcularSalario());
            System.out.println(dadosFuncionario);
        }
    }
}
