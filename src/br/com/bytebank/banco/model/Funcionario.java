package br.com.bytebank.banco.model;

public abstract class Funcionario {
    
    private String nome;
    private String cpf;
    private double salario;
    protected String cargo;
    
    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double getBonificacao(int multiplier) {
        return this.salario * (0.1 * multiplier);
    }
    
    public String getCargo() {
        return cargo;
    }
    
}