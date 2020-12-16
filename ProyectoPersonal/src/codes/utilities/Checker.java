package codes.utilities;

import java.util.Scanner;

public class Checker {
    Scanner sc = new Scanner(System.in);

    public long checkLong() {
        do {
            try {
                return Long.parseLong(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("It seems like you didn't enter a correct number.");
                System.out.print("Please try again: ");
            }
        } while(true);
    }   // End checkLong

    public int checkInt() {
        do {
            try {
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("It seems like you didn't enter a correct number.");
                System.out.print("Please try again: ");
            }
        } while(true);
    }   // End checkInt
}
