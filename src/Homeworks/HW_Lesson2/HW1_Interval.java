package Homeworks.HW_Lesson2;
import java.util.Scanner;

public class HW1_Interval {
    public static void main(String[] args) {
        int number = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter number: ");
        number = scanner.nextInt();

        if (number >= 0 && number < 15) {
            System.out.print(number + " in [0; 14]");
        }

        else if (number >= 15 && number < 36) {
            System.out.print(number + " in [15; 35]");
        }

        else if (number >= 36 && number < 51) {
            System.out.print(number + " in [36; 50]");
        }

        else if (number >= 51 && number < 101) {
            System.out.print(number + " in [51; 100]");
        }

        else {
            System.out.print(number + " is not in any of the condition ranges.");
        }
    }
}
