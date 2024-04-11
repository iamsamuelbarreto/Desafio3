package org.example;

public class Employee {
    private String nome;
    private double salarioBruto;
    private double taxa;

    public Employee() {
    }

    public Employee(String nome, double salarioBruto, double taxa) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.taxa = taxa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public double obterSalarioLiquido() {
        return salarioBruto - taxa;
    }

    public void aumentoSalario(double percentage) {
        salarioBruto *= ((100 + percentage) / 100);
    }

    @Override
    public String toString() {
        return "Nome = " + nome + ", Salário Bruto = " + String.format("%.2f", salarioBruto) + ", Taxa = "
                + String.format("%.2f", taxa);
    }

}