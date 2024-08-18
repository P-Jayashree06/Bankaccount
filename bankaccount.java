import java.util.Scanner;

public class bankaccount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your current balance: ");
        double balance = scanner.nextDouble();

        System.out.print("Enter the amount you wish to withdraw: ");
        double withdrawalAmount = scanner.nextDouble();

        if (withdrawalAmount > balance) {
            System.out.println("Error: Withdrawal amount exceeds current balance.");
        } else {
            balance -= withdrawalAmount;
            System.out.printf("Withdrawal successful. Your new balance is: %.2f\n", balance);
        }

        scanner.close();
    }
}

