package Homeworks.HW_Lesson9_sp.HW8;

/*Створіть проект за допомогою IntelliJ IDEA. Створіть клас MyDictionary. Реалізуйте у найпростішому наближенні можливість
використання його екземпляра. Мінімально необхідний інтерфейс взаємодії з екземпляром повинен включати метод додавання пар
елементів, індексатор для отримання значення елемента за вказаним індексом і властивість тільки для читання для отримання
загальної кількості пар елементів.*/

public class Main {
    public static void main(String[] args) {
        MyDictionary<String, Integer> myDictionary = new MyDictionary<>();

        myDictionary.add("Key 1", 100);
        myDictionary.add("Key 2", 200);
        myDictionary.add("Key 3", 300);

        System.out.println("Total entries: " + myDictionary.size());

        System.out.println("Value for Key 2: " + myDictionary.get("Key 2"));
    }
}
