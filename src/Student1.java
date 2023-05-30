import java.util.Scanner;

class Student1 {
    String name;
    int id;
    int age;
    String mobileNo;

    void getData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name: ");
        name = scanner.nextLine();

        System.out.print("Enter the ID: ");
        id = scanner.nextInt();

        System.out.print("Enter the age: ");
        age = scanner.nextInt();

        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter the mobile number: ");
        mobileNo = scanner.nextLine();
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Age: " + age);
        System.out.println("Mobile Number: " + mobileNo);
    }
}

class Student {
    public static void main(String[] args) {
        Student1 student1 = new Student1();
        student1.getData();
        student1.display();
    }
}
