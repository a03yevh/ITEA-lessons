package Homeworks.HW_Lesson3;

/*Створіть програму таблиці множення для числа 7, використовуючи цикли. Приклад виведення в консоль:
        7 * 1 = 7;
        7 * 2 = 14;
        …;
        7 * 10 = 70.*/

public class HW7 {
    public static void main(String[] args) {
        int result = 0;
        for (int i=1; i<=10; i++) {
            result = 7 * i;
            System.out.println("7 * " + i + " = " + result);
        }
    }
}
