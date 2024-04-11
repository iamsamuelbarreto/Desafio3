package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        List<Employee> funcionarios = new ArrayList<>();

        funcionarios.add(new Employee("Samuel", 2000.00, 100.0));
        funcionarios.add(new Employee("João", 3000.00, 200.0));
        funcionarios.add(new Employee("Alex", 5000.00, 400.0));

        funcionarios.forEach(System.out::println);

        Random random = new Random();
        int indiceFuncionarioAleatorio = random.nextInt((funcionarios.size()));
        funcionarios.get(indiceFuncionarioAleatorio).aumentoSalario(10.0);

        System.out.println("\nDetalhe dos funcionários após aumento salarial de 10% para o funcionário "
                + (indiceFuncionarioAleatorio + 1) + ":");
        funcionarios.forEach(System.out::println);

        System.out.println("\nSalário líquido dos funcionários: ");
        for (Employee func : funcionarios) {
            System.out.println(
                    "Funcionário " + func.getNome() + " : " + String.format("%.2f", func.obterSalarioLiquido()));
        }
    }
}