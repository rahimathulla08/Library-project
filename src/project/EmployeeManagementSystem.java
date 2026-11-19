package project;

class Employee {

    int employeeId;
    String employeeName;
    double salary;

    Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    void displayEmployeeDetails() {
        System.out.println("Employee ID   : " + employeeId);
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Salary        : " + salary);
    }
}

class Developer extends Employee {

    String programmingLanguage;

    Developer(int employeeId, String employeeName, double salary,
              String programmingLanguage) {

        super(employeeId, employeeName, salary);
        this.programmingLanguage = programmingLanguage;
    }

    void displayDeveloperDetails() {
        displayEmployeeDetails();
        System.out.println("Programming Language : " + programmingLanguage);
    }
}

class Manager extends Employee {

    int teamSize;

    Manager(int employeeId, String employeeName, double salary,
            int teamSize) {

        super(employeeId, employeeName, salary);
        this.teamSize = teamSize;
    }

    void displayManagerDetails() {
        displayEmployeeDetails();
        System.out.println("Team Size : " + teamSize);
    }
}

public class EmployeeManagementSystem {

    public static void main(String[] args) {

        Developer developer = new Developer(
                101,
                "Rahim",
                60000,
                "Java"
        );

        Manager manager = new Manager(
                102,
                "Arun",
                80000,
                8
        );

        System.out.println("----- Developer Details -----");
        developer.displayDeveloperDetails();

        System.out.println();

        System.out.println("----- Manager Details -----");
        manager.displayManagerDetails();
    }
}
