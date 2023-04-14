package Homeworks.HW_Lesson2;
import java.util.Scanner;

public class HW0 {
    public static void main(String[] args) {
        int operand1 = 5;
        int operand2 = 0;
        double result;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter sign: ");
        String sign = "";
        sign = scanner.next();

        switch (sign) {
            case "+":
                result = operand1 + operand2;
                System.out.println("'+' => " + result);
                break;
            case "-":
                result = operand1 - operand2;
                System.out.println("'-' => " + result);
                break;
            case "*":
                result = operand1 * operand2;
                System.out.println("'*' => " + result);
                break;
            case "/":
                result = operand1 / operand2;
                System.out.println("'/' => " + result);
                break;
            default:
                break;
        }
    }
}