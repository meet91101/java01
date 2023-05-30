import java.util.Scanner;

public class ATM {
    private static double balance = 1000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("ATM Menu:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    withdrawMoney(scanner);
                    break;
                case 2:
                    depositMoney(scanner);
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }

            System.out.println();
        }
    }

    private static void withdrawMoney(Scanner scanner) {
        System.out.print("Enter the amount to withdraw: ");
        double amount = scanner.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid amount! Please enter a positive value.");
        } else if (amount > balance - 1000) {
            System.out.println("Insufficient balance! Minimum balance should be maintained.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Updated balance: " + balance);
        }
    }

    private static void depositMoney(Scanner scanner) {
        System.out.print("Enter the amount to deposit: ");
        double amount = scanner.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid amount! Please enter a positive value.");
        } else {
            balance += amount;
            System.out.println("Deposit successful. Updated balance: " + balance);
        }
    }

    private static void checkBalance() {
        System.out.println("Current balance: " + balance);
    }
}
