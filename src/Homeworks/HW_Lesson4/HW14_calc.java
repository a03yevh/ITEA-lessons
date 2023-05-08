package Homeworks.HW_Lesson4;

/*Використовуючи IntelliJ IDEA, створіть клас Calculator. Створіть метод з ім'ям calculate, який приймає як параметри три цілочислові значення та
повертає значення кожного аргументу, поділеного на 5.*/

public class HW14_calc {
    public static int calculate(int x) {
        return x / 5;
    }

    public static void main(String[] args) {
        int a = 15;
        int b = 25;
        int c = 35;
        int resultA = calculate(a);
        int resultB = calculate(b);
        int resultC = calculate(c);
        System.out.println("Result for a: " + resultA);
        System.out.println("Result for b: " + resultB);
        System.out.println("Result for c: " + resultC);
    }
}
