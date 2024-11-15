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
        if (this.funcionarios.contains(funcionario)) {
            throw new FuncionarioExisteException("O funcionário " + funcionario.getNome() + " já está na empresa");
        }
        this.funcionarios.add(funcionario);
    }

    public void removerFuncionario(T funcionario) throws FuncionarioNaoExisteException {
        if (!this.funcionarios.contains(funcionario)) {
            throw new FuncionarioNaoExisteException("O funcionário " + funcionario.getNome() + " não está na empresa");
        }
        this.funcionarios.remove(funcionario);
    }

    public void listarFuncionarios() {
        for(T funcionario: this.funcionarios) {
            var dadosFuncionario = String.format("Funcionário: %s\n Salário: %g\n", funcionario.getNome(), funcionario.calcularSalario().doubleValue());
            System.out.println(dadosFuncionario);
        }
    }
}
