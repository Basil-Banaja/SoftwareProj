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
        userAccount.createAccount();

        if (userAccount.login()) {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Menu:");
                System.out.println("1. Show Driver History");
                System.out.println("2. Exit");
                System.out.print("Enter your choice (1 or 2): ");
                int choice = scanner.nextInt();

                if (choice == 1) {
                    // Creating an array of driver histories
                    DriverHistory[] histories = {
                        new DriverHistory("Ahmed", 150.0, 2.5),
                        new DriverHistory("Fatima", 60.0, 1.0),
                        new DriverHistory("Youssef", 85.3, 1.75),
                        new DriverHistory("Aisha", 45.7, 0.8),
                        new DriverHistory("Khalid", 120.0, 2.0)
                    };

                    // Displaying each driver's history
                    System.out.println("Driver Histories:");
                    for (DriverHistory history : histories) {
                        System.out.println(history);
                    }
                } else if (choice == 2) {
                    System.out.println("Exiting the application.");
                    break;
                } else {
                    System.out.println("Invalid choice. Please enter 1 or 2.");
                }
            }
        }
    }
}
