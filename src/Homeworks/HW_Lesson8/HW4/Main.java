package Homeworks.HW_Lesson8.HW4;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> teacherList = new ArrayList<String>();
        teacherList.add("Samoilenko Galina Eduardovna");
        teacherList.add("Bely Igor Vladimirovich");
        teacherList.add("Kovalenko Antonina Stepanovna");
        teacherList.add("Tomchak Andrey Viktorovich");
        teacherList.add("Tolmachova Irina Leonidovna");

        int bestTeacherIndex = teacherList.indexOf("Samoilenko Galina Eduardovna");
        int notSoGoodTeacherIndex = teacherList.indexOf("Tomchak Andrey Viktorovich");

        System.out.println("\n" + teacherList);

        System.out.println("\nBest teacher index: " + bestTeacherIndex);
        System.out.println("Not a very good teacher index: " + notSoGoodTeacherIndex);
    }
}
