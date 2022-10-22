package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Nome: ");
        employee.name = sc.nextLine();
        System.out.print("Salário bruto: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Imposto: ");
        employee.tax = sc.nextDouble();

        System.out.print(employee.name);
        System.out.printf(", $ %.2f%n", employee.netSalary());

        System.out.print("Qual a porcentagem para aumentar o salário? ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println("Dados atualizados: " + employee);

        //System.out.printf(", $ %.2f%n", employee.grossSalary);

        sc.close();

    }
}
