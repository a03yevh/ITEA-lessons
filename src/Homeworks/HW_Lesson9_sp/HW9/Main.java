package Homeworks.HW_Lesson9_sp.HW9;

/*Створіть проект за допомогою IntelliJ IDEA. Створіть клас MyClass, що містить статичний фабричний метод - T factoryMethod(),
який породжуватиме екземпляри типу, зазначеного як параметр типу (покажчика місця заповнення типом – Т).*/

public class Main {
    public static void main(String[] args) {
        try {
            MyClass myClassInstance = MyClass.factoryMethod(MyClass.class);
            System.out.println("Successfully created instance of " + myClassInstance.getClass().getSimpleName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}