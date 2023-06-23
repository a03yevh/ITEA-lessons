package Homeworks.HW_Lesson9_sp.HW8;

/*Створіть проект за допомогою IntelliJ IDEA. Створіть клас MyDictionary. Реалізуйте у найпростішому наближенні можливість
використання його екземпляра. Мінімально необхідний інтерфейс взаємодії з екземпляром повинен включати метод додавання пар
елементів, індексатор для отримання значення елемента за вказаним індексом і властивість тільки для читання для отримання
загальної кількості пар елементів.*/

public class Main {
    public static void main(String[] args) {
        MyDictionary dictionary = new MyDictionary();
        dictionary.add("apple", "яблоко");
        dictionary.add("car", "машина");
        dictionary.add("house", "дом");

        System.out.println("Кол-во элементов в словаре: " + dictionary.getCount());

        String value = dictionary.getValue(1);
        System.out.println("Значение по индексу 1: " + value);
    }
}