package salary;

import java.util.Scanner;

package salary;

public class employee {
    private String name;
    private double grossSalary;

    public employee(String name, double grossSalary) {
        this.name = name;
        this.grossSalary = grossSalary;
    }

    public double getStateTaxes() {
        return grossSalary * 0.284;
    }

    public double getPersonalTax() {
        double taxableIncome = grossSalary - getStateTaxes() - 7000;
        if (taxableIncome > 0) {
            return taxableIncome * 0.1;
        } else {
            return 0;
        }
    }

    public double getNetSalary() {
        return grossSalary - getStateTaxes() - getPersonalTax();
    }
}

public class salary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the employee's name: ");
        String name = input.nextLine();
        System.out.print("Enter the employee's gross salary: ");
        double grossSalary = input.nextDouble();

        employee employee = new employee(name, grossSalary);
        double stateTaxes = Math.round(employee.getStateTaxes());
        double personalTax = Math.round(employee.getPersonalTax());
        double netSalary = Math.round(employee.getNetSalary());

        System.out.println("The employee: " + name + ", with a gross salary of " + Math.round(grossSalary) + ", will get a net salary of " + netSalary);
        System.out.println("State Taxes are " + stateTaxes + ".");
        System.out.println("Personal Tax is " + personalTax + ".");
    }
}
