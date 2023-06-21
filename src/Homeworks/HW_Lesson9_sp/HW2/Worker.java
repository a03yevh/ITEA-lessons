package Homeworks.HW_Lesson9_sp.HW2;

import java.util.Arrays;
import java.util.Scanner;

/*Створіть проект за допомогою IntelliJ IDEA. Потрібно: Описати клас з ім'ям Worker, що містить такі поля:
         прізвище та ініціали працівника;
         назва посади;
         рік надходження на роботу.

        Написати програму, яка виконує такі дії:
         введення з клавіатури даних до масиву, що складається з п'яти елементів типу Worker (записи мають бути впорядковані за абеткою);
         якщо значення року введено не у відповідному форматі, видає виняток.
         виведення на екран прізвища працівника, стаж роботи якого перевищує введене значення.*/

public class Worker {
    private String name;
    private String position;
    private int yearOfEmployment;

    public Worker(String name, String position, int yearOfEmployment) {
        this.name = name;
        this.position = position;
        this.yearOfEmployment = yearOfEmployment;
    }

    public String getName() {
        return name;
    }

    public int getYearOfEmployment() {
        return yearOfEmployment;
    }

    public static void main(String[] args) {
        Worker[] workers = new Worker[5];

        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < workers.length; i++) {
                System.out.println("Enter details for worker " + (i + 1) + ":");
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Position: ");
                String position = scanner.nextLine();
                System.out.print("Year of employment: ");
                int yearOfEmployment = scanner.nextInt();
                scanner.nextLine();

                workers[i] = new Worker(name, position, yearOfEmployment);
            }

            Arrays.sort(workers, (w1, w2) -> w1.getName().compareToIgnoreCase(w2.getName()));

            System.out.print("Enter the year to filter workers: ");
            int filterYear = scanner.nextInt();

            System.out.println("Workers with experience greater than " + filterYear + ":");

            for (Worker worker : workers) {
                if (worker.getYearOfEmployment() > filterYear) {
                    System.out.println(worker.getName());
                }
            }
        } catch (Exception e) {
            System.out.println("Invalid input format. Please try again.");
        }
    }
}
