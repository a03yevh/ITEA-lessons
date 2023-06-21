package Homeworks.HW_Lesson9_sp.HW7;

import java.util.ArrayList;

public class MyList<T> {
    private ArrayList<T> list;

    public MyList() {
        list = new ArrayList<>();
    }

    public void add(T element) {
        list.add(element);
    }

    public T get(int index) {
        return list.get(index);
    }

    public int size() {
        return list.size();
    }
}