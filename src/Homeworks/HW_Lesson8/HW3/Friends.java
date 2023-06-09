package Homeworks.HW_Lesson8.HW3;
import java.util.ArrayList;
import java.util.Collections;

public class Friends {
    public static void main(String[] args) {
        ArrayList<String> friendList = new ArrayList<String>();
        friendList.add("Ruslan");
        friendList.add("Alex");
        friendList.add("Andrii");
        friendList.add("Mary");
        friendList.add("Julia");
        friendList.add("Anastasiia");

        System.out.println("Not Sorted: " + friendList);

        Collections.sort(friendList);
        System.out.println("Sorted: " + friendList);
    }
}
