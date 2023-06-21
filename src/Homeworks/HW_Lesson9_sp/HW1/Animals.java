package Homeworks.HW_Lesson9_sp.HW1;

enum Animals {
    DOG("Dog"), CAT("Cat"), BIRD("Bird");

    private String name;
    private int age;

    Animals(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " - " + age + " years old";
    }
}