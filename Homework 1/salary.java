package salary;

import java.util.Scanner;

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
