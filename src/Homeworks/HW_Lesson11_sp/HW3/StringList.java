package Homeworks.HW_Lesson11_sp.HW3;

/*Вводити з клавіатури рядки, доки користувач не введе рядок 'end':
        1. Створити перелік рядків.
        2. Ввести рядки з клавіатури та додати їх до списку.
        3. Вводити з клавіатури рядки, доки користувач не введе рядок "end". "end" не враховувати.
        4. Вивести рядки на екран, кожен з нового рядка.*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringList {
    public static void main(String[] args) {
        List<String> lines = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter lines from the keyboard (enter 'end' to finish):");
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("end")) {
                break;
            }
            lines.add(line);
        }

        System.out.println("Lines entered:");
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
