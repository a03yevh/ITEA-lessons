package Homeworks.HW_Lesson3;
import java.util.Scanner;

public class HW9_Fibonacci {
    public static void main(String[] args) {
        int first, second, max, next;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        first = scanner.nextInt();

        System.out.print("Enter the second number: ");
        second = scanner.nextInt();

        System.out.print("Enter the maximum number in the sequence: ");
        max = scanner.nextInt();

        System.out.print(first + " " + second + " ");

        next = first + second;

        while (next <= max) {
            System.out.print(next + " ");
            first = second;
            second = next;
            next = first + second;
        }
    }
}
