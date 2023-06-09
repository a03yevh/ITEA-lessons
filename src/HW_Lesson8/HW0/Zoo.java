package HW_Lesson8.HW0;
import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add(0, "Lion");
        list.add(1, "Tiger");
        list.add(2, "Elephant");
        list.add(3, "Giraffe");
        list.add(4, "Monkey");
        list.add(5, "Dolphin");
        list.add(6, "Penguin");
        list.add(7, "Kangaroo");

        for(String s : list) {
            System.out.println(s);
        }
    }
}
