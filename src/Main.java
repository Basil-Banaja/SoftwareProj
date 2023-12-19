/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserAccount userAccount = new UserAccount();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to the PmuRide App");
            System.out.println("1. Create a New Account");
            System.out.println("2. Login to Existing Account");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1, 2, or 3): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    userAccount.createAccount();
                    break;
                case 2:
                    if (userAccount.login()) {
                        boolean loggedIn = true;
                        while (loggedIn) {
                            System.out.println("1. View Driver History");
                            System.out.println("2. Exit");
                            System.out.print("Enter your choice (1 or 2): ");
                            int postLoginChoice = scanner.nextInt();

                            switch (postLoginChoice) {
                                case 1:
                                    DriverHistory[] histories = {
                                        new DriverHistory("Ahmed", 150.0, 2.5),
                                        new DriverHistory("Fatima", 60.0, 1.0),
                                        new DriverHistory("Youssef", 85.3, 1.75),
                                        new DriverHistory("Aisha", 45.7, 0.8),
                                        new DriverHistory("Khalid", 120.0, 2.0)
                                    };

                                    System.out.println("Driver Histories:");
                                    for (DriverHistory history : histories) {
                                        System.out.println(history);
                                    }
                                    break;
                                case 2:
                                    System.out.println("Logging out...");
                                    loggedIn = false;
                                    break;
                                default:
                                    System.out.println("Invalid choice. Please enter 1 or 2.");
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Thank you for using the PmuRide App.");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }
    }
}
