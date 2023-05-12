package Homeworks.HW_Lesson5;

public class HW1_Person {
    private String fullName;
    private int age;

    HW1_Person() { }

    HW1_Person(String x, int y) {
        this.fullName = x;
        this.age = y;
    }
    public void move() {
        System.out.println(fullName + " is moving...");
    }

    public void talk() {
        System.out.println(fullName + " is talking...");
    }

    public static void main(String[] args) {
        HW1_Person olga = new HW1_Person();
        HW1_Person oleg = new HW1_Person("Tarasov Oleg Nikolaevich", 33);
        oleg.move();
        olga.talk();

        olga.move();
        oleg.talk();
    }
}
