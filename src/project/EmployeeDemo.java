package project;

class Employee {

    // Data members
    private int employeeId;
    private String employeeName;
    private double basicSalary;

    // Constructor
    Employee(int employeeId, String employeeName,
             double basicSalary) {

        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
    }

    // Display employee details
    void displayEmployeeDetails() {

        System.out.println("\n--- Employee Details ---");
        System.out.println("Employee ID   : " + employeeId);
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Basic Salary  : ₹" + basicSalary);
    }

    // Calculate HRA
    double calculateHRA() {

        return basicSalary * 20 / 100;
    }

    // Calculate DA
    double calculateDA() {

        return basicSalary * 10 / 100;
    }

    // Calculate Gross Salary
    double calculateGrossSalary() {

        return basicSalary + calculateHRA() + calculateDA();
    }

    // Update basic salary
    void updateBasicSalary(double newSalary) {

        if (newSalary > 0) {
            basicSalary = newSalary;
            System.out.println("\nBasic salary updated successfully.");
        } else {
            System.out.println("\nInvalid salary.");
        }
    }

    // Display complete salary information
    void displaySalaryDetails() {

        System.out.println("\n--- Salary Details ---");
        System.out.println("Basic Salary : ₹" + basicSalary);
        System.out.println("HRA          : ₹" + calculateHRA());
        System.out.println("DA           : ₹" + calculateDA());
        System.out.println("Gross Salary : ₹" + calculateGrossSalary());
    }
}

public class EmployeeDemo {

    public static void main(String[] args) {

        // Creating employee object
        Employee employee =
                new Employee(501, "Anil", 50000);

        // Display employee information
        employee.displayEmployeeDetails();

        // Display salary information
        employee.displaySalaryDetails();

        // Update basic salary
        employee.updateBasicSalary(60000);

        // Display updated salary
        employee.displayEmployeeDetails();
        employee.displaySalaryDetails();
    }
}
