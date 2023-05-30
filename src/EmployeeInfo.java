class Employee {
    String name;
    int yearOfJoining;
    double salary;
    String address;

    Employee(String name, int yearOfJoining, double salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }

    void displayInfo() {
        System.out.printf("%-10s %-20d %-20.2f %-20s%n", name, yearOfJoining, salary, address);
    }
}

public class EmployeeInfo {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Robert", 1994, 5000.0, "64C- WallsStreet");
        Employee employee2 = new Employee("Sam", 2000, 6000.0, "68D- WallsStreet");
        Employee employee3 = new Employee("John", 1999, 5500.0, "26B- WallsStreet");

        System.out.println("Name       Year of Joining    Salary              Address");
        employee1.displayInfo();
        employee2.displayInfo();
        employee3.displayInfo();
    }
}
