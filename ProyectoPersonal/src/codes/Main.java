package codes;

import codes.utilities.*;

public class Main {
    public static void main(String[] args) {
        Checker ch = new Checker();
        Menu waiter = new Menu();
        Directive handler = new Directive();

        System.out.println("Let's start");

        /*
        TODO: Enhance printing all information
        TODO: Check the way to print and read from files
         */

        int exit=1;

        waiter.generalMenu();
        System.out.print("Type in your choice: ");
        int choice = ch.checkInt();

        do {

            switch (choice) {
                case 1: // Create something
                    handler.creator();
                    break;
                case 2: // Show something
                    handler.showCase();
                    break;
                case 3: // Assign something
                    handler.assignation();
                    break;
                case 4: // End program
                    exit=2;
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }

            waiter.generalMenu();
            System.out.print("Type in your choice: ");
            choice = ch.checkInt();
            if (choice==4)
                exit = 2;

        } while (exit != 2);

        System.out.println("\nWe hope this program fulfilled your expectations, see you next time. Have a nice day.");

    }   // End main
}
